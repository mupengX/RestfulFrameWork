package com.tk.framework.rest.framework.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.tk.framework.annotations.IgnoreAuthentication;
import com.tk.framework.annotations.ResourceDescription;
import com.tk.framework.constant.AppConstats;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.rest.framework.exceptions.ResourceForbiddenException;
import com.tk.framework.rest.framework.exceptions.Unauthorized4LoginedException;
import com.tk.framework.rest.framework.exceptions.UnauthorizedException;
import com.tk.framework.rest.framework.exceptions.UnknownResourceException;
import com.tk.framework.rest.framework.model.RestThreadLocal;
import com.tk.framework.util.APILevel;
import com.tk.framework.util.CommonUtil;
import com.tk.framework.util.IPAddrUtil;
import com.tk.framework.util.PublicUserUtil;
import com.tk.framework.util.ValidationUtil;
import com.tk.framework.util.superadmin.SuperAdminUtil;
import com.tk.orm.auth.model.UserSession;
import com.tk.service.auth.UserSessionService;
import com.tk.service.user.SysPrivilegeService;

/**
 * <pre>
 *  
 *  File: AuthInterceptor.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 权限拦截器
 *  
 * 
 *  Notes:
 *  $Id: AuthInterceptor.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:33:36>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class AuthInterceptor extends HandlerInterceptorAdapter
{
	private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

	@Autowired
	private UserSessionService userSessionService;

	@Autowired
	private SysPrivilegeService sysPrivilegeService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		RestThreadLocal.clean(); // 清空线程中的数据

		String token = request.getHeader(AppConstats.TOKEN); // 从请求头中获取token

		String ip = IPAddrUtil.getIpAddr(request);

		RestThreadLocal.setIp(ip);

		String traceId = request.getHeader(AppConstats.TRACEID); // 从请求头中获取跟踪ID

		setTraceId(traceId); // 设置跟踪ID

		setVersion(request); // 设置版本号

		return doAuth(request, response, handler, token); // 权限验证

	}

	/**
	 * 权限验证。
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @param token
	 * @return
	 * @throws Exception
	 */
	private boolean doAuth(HttpServletRequest request, HttpServletResponse response, Object handler, String token)
			throws Exception
	{
		HandlerMethod handlerMethod = (HandlerMethod) handler;

		// #1 权限标识，true有权限，false无权限
		boolean authed = false;

		IgnoreAuthentication ignoreAuthentication = handlerMethod.getMethodAnnotation(IgnoreAuthentication.class); // 获取@IgnoreAuthentication，该注解标识是否忽略验证

		// #2 如果没有忽略验证的注解，证明这个资源需要验证.
		if (ValidationUtil.isEmpty(ignoreAuthentication))
		{
			// #2.1如果未传递token，扔出异常
			if (ValidationUtil.isEmpty(token))
			{
				throw new UnauthorizedException(MessageConstants.TOKEN_REQUIRED);
			}

			// #2.2 获取资源描述
			ResourceDescription resourceDescription = handlerMethod.getMethodAnnotation(ResourceDescription.class);

			if (ValidationUtil.isEmpty(resourceDescription))
			{
				throw new UnknownResourceException();
			}

			String resource = resourceDescription.Resource();// 调用的方法所操作的资源
			String operation = resourceDescription.Operation();// 调用的方法对资源的操作
			APILevel apiLevel = resourceDescription.ApiLevel();// 获得API 级别

			// #2.3 根据token从查询用户session信息
			UserSession session = userSessionService.checkSessionBySessionId(token);

			// #2.4 如果查询用户存在
			if (!ValidationUtil.isEmpty(session) && !ValidationUtil.isEmpty(session.getUserId()))
			{

				String userId = session.getUserId(); // 用户ID
				String userName = session.getSsoUserName(); // 用户名

				// 根据用户ID查询最新的token信息，如果传递的token与最新的token不同抛出异常
				//UserSession newSession = userSessionService.checkNewestSessionByUserId(userId);
				boolean flag = userSessionService.validSession(userId, session.getAgencyCode(), token);
				
				if ( !flag )
				{
					throw new Unauthorized4LoginedException();
				}

				RestThreadLocal.setUserID(userId); // 把userId添加到线程中
				RestThreadLocal.setExeUserId(userId); // 把userId添加到线程中
				RestThreadLocal.setUserName(userName); // 把userName添加到线程中

				userSessionService.touchSession(token); // 更新session信息

				// #2.4.1 对于共有API或公共用户是没有机构权限等验证的，只有API level的验证。
				if (APILevel.ALL.getValue() == apiLevel.getValue()
						|| (PublicUserUtil.isPublicUser(userId) && APILevel.PUBLIC.getValue() == apiLevel.getValue()))
				{
					if (PublicUserUtil.isPublicUser(userId))
					{
						RestThreadLocal.setAgecyCode(null);
					}
					else
					{
						RestThreadLocal.setAgecyCode(session.getAgencyCode());
					}
					authed = true;
				}
				// #2.4.2 对于机构API或机构用户需要验证具体权限。
				else if (!PublicUserUtil.isPublicUser(userId) && !SuperAdminUtil.isSuperAdmin(userId)
						&& APILevel.AGENCY.getValue() == apiLevel.getValue())
				{
					// #2.4.2.1 判断是否有权限调用该方法。 目前暂时每次判断都到数据库中查询之后的版本期望做成静态存储的形式。
					authed = sysPrivilegeService.isPermission(session.getAgencyCode(), userId, resource, operation);

					authed = true;

					if (!authed)
					{ // 如果没有权限
						logger.error("**************************************************************");
						logger.error("Message：" + MessageConstants.RESOURCE_FOBBIDEN);
						logger.error("UserId：" + userId);
						logger.error("Resource：" + resource);
						logger.error("Operation：" + operation);
						logger.error("APILevel：" + apiLevel);
						logger.error("**************************************************************");
						throw new UnauthorizedException(MessageConstants.RESOURCE_FOBBIDEN);
					}
					else
					{
						RestThreadLocal.setAgecyCode(session.getAgencyCode());
					}
				}
				// #2.4.3 对于超管API和超管不需要验证权限。
				else if (SuperAdminUtil.isSuperAdmin(userId) && APILevel.SUPERADMIN.getValue() == apiLevel.getValue())
				{
					authed = true;
				}
				// #2.4.4 其它情况。
				else
				{
					logger.error("**************************************************************");
					logger.error("Message：" + MessageConstants.RESOURCE_FOBBIDEN);
					logger.error("UserId：" + userId);
					logger.error("Resource：" + resource);
					logger.error("Operation：" + operation);
					logger.error("APILevel：" + apiLevel);
					logger.error("**************************************************************");
					throw new UnauthorizedException(MessageConstants.RESOURCE_FOBBIDEN);
				}
			}
			// #2.5 如果查询用户不存在
			else
			{
				logger.error("**************************************************************");
				logger.error("Message：" + MessageConstants.USER_NOT_FOUND);
				logger.error("Token：" + token);
				logger.error("Resource：" + resource);
				logger.error("Operation：" + operation);
				logger.error("APILevel：" + apiLevel);
				logger.error("**************************************************************");
				throw new ResourceForbiddenException(MessageConstants.USER_NOT_FOUND);
			}

		}
		// #3 如果有忽略验证的注解，证明这个资源不需要验证.
		else
		{
			authed = true;// 根据方法定义 忽略校验.
		}
		return authed;
	}

	/**
	 * 
	 * 设置请求的版本号.
	 * 
	 * @param request
	 */
	private void setVersion(HttpServletRequest request) throws Exception
	{

		// String rawPath = request.getRequestURI();
		//
		// String[] pathResources = rawPath.split("/");
		//
		// int version = 0;
		//
		// if(ValidationUtil.isEmpty(pathResources) || pathResources.length <= 1 || (pathResources[1].startsWith("v") ||
		// pathResources[1].startsWith("V")) )
		// {
		// throw new UnauthorizedException("资源定义不符合应用规定.");
		//
		// }
		// else
		// {
		// try
		// {
		// version = Integer.parseInt(pathResources[1].substring(0));
		// }
		// catch (Exception e)
		// {
		// logger.error(e.getMessage());
		// throw new UnauthorizedException("请求版本号获取失败.");
		// }
		//
		// }

		RestThreadLocal.setVersion(1);
	}

	/**
	 * 
	 * 设置请求的跟踪ID
	 * 
	 * @param traceId
	 */
	private void setTraceId(String traceId) throws Exception
	{
		if (ValidationUtil.isEmpty(traceId))
		{
			traceId = CommonUtil.getUUID();
		}

		RestThreadLocal.setTraceId(traceId);
	}
}
