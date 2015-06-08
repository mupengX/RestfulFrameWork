package com.tk.auth.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.tk.framework.constant.AppConstats;
import com.tk.framework.exceptions.UserIdOrPasswordNotValidException;
import com.tk.framework.rest.framework.model.RestThreadLocal;
import com.tk.framework.util.PasswordHash;
import com.tk.framework.util.SpringContextHelper;
import com.tk.framework.util.UserType;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.auth.model.LoginHistoryPo;
import com.tk.orm.auth.model.UserSession;
import com.tk.service.auth.LoginHistoryService;
import com.tk.service.auth.UserSessionService;

/**
 * <pre>
 *  File: AuthAdapter.java
 *  Copyright (C): 2014
 *  Description:身份认证适配器，根据运行时的参数来动态决定使用哪种类型的用户适配器
 *  
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午2:10:30>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public abstract class AuthAdapter
{

	public final static long defaultSessionExpirationDurationInMinutes = 30;

	public static final int PUBLIC_USER = 0;

	public static final int AGENCY_USER = 1;

	public static final int SUPER_ADMIN = 2;

	@Autowired
	private UserSessionService userSessionService;

	
	@Autowired
	private LoginHistoryService loginHistoryService;

	/**
	 * 
	 * TODO.
	 * 
	 * @param userType
	 * @return
	 */
	public static AuthAdapter getAuthAdapter(UserType userType)
	{
		AuthAdapter adaptor = null;
		switch (userType.getValue())
		{
			case PUBLIC_USER:
				adaptor = (AuthAdapter) SpringContextHelper.getBean("publicAuthAdapter");
				break;
			case AGENCY_USER:
				adaptor = (AuthAdapter) SpringContextHelper.getBean("agencyAuthAdapter");
				break;
			case SUPER_ADMIN:
				adaptor = (AuthAdapter) SpringContextHelper.getBean("superAdminAuthAdapter");
				break;
			default:
				break;
		}

		return adaptor;
	}

	/**
	 * 
	 * TODO.
	 * 
	 * @param ssoUser
	 * @return
	 * @throws Exception
	 */
	public UserSession createSession(String agencyCode, String password, UserType userType, String userId,
			String product) throws Exception
	{
		UserSession ssoUser = getSSOUser(agencyCode, userType, userId, product);
		if (ValidationUtil.isEmpty(ssoUser) || !PasswordHash.validatePassword(password, ssoUser.getPassword()))
		{
			throw new UserIdOrPasswordNotValidException();
		}

		Date now = new Date();

		ssoUser.setSsoSessionCreation(now);
		ssoUser.setSsoSessionCreationMillis(System.currentTimeMillis());
		ssoUser.setSsoSessionExpiration("" + defaultSessionExpirationDurationInMinutes);
		ssoUser.setSsoSessionStatus(AppConstats.COMMON_A);

		String ip = RestThreadLocal.getIp();
		ssoUser.setActionByIp(ip);

		ssoUser.setRecStatus(AppConstats.COMMON_A);
		ssoUser.setRecDate(now);
		
		//userSessionService.add(ssoUser);
		
		//#1. 删除旧的Session
		//deleteOldSession( userId, agencyCode);
		
		//#2. 记录登录日志
		userSessionService.add(ssoUser);
		
		//#3. 向缓存中添加Session
		userSessionService.toAddSessionToCache(ssoUser);
		
		RestThreadLocal.setExeUserId(userId);
		RestThreadLocal.setAgecyCode(agencyCode);
		RestThreadLocal.setUserID(userId);
		RestThreadLocal.setUserName(ssoUser.getSsoUserName());
		
		// log history
		return ssoUser;
	}

	private void deleteOldSession(String userId, String agencyCode) throws Exception{
		
		LoginHistoryPo loginHistoryPo = loginHistoryService.getLastLoginFromHistory(userId, agencyCode);
		if(!ValidationUtil.isEmpty(loginHistoryPo)) {
			
			userSessionService.fromCacheDeleteBySessionId(loginHistoryPo.getSsoSessionId());
		}
	}

	public static boolean validatePassword(String request, String dbSource)
	{
		return dbSource.equals(request);
	}

	/**
	 * 
	 * TODO.
	 * 
	 * @param agencyCode
	 * @param userType
	 * @param userId
	 * @param product
	 * @return
	 * @throws Exception
	 */
	public abstract UserSession getSSOUser(String agencyCode, UserType userType, String userId, String product)
			throws Exception;

	/**
	 * 
	 * 获得有效session
	 * 
	 * @param sessionId
	 * @return
	 * @throws Exception
	 */
	public UserSession getSessionBySessionId(String sessionId) throws Exception
	{
		return this.userSessionService.checkSessionBySessionId(sessionId);
	}

	/**
	 * 
	 * 刷新session
	 * 
	 * @param sessionId
	 * @return
	 * @throws Exception
	 */
	public UserSession touchSession(String sessionId) throws Exception
	{
		return this.userSessionService.touchSession(sessionId);
	}
}

/*
 * $Log: av-env.bat,v $
 */