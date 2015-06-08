package com.tk.framework.log;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tk.framework.annotations.ResourceDescription;
import com.tk.framework.rest.framework.model.MultipleObjectResultModel;
import com.tk.framework.rest.framework.model.ResponseModel;
import com.tk.framework.rest.framework.model.RestThreadLocal;
import com.tk.framework.util.IPAddrUtil;
import com.tk.framework.util.SpringContextHelper;
import com.tk.framework.util.format.DateUtil;
import com.tk.framework.util.json.JsonHelper;
import com.tk.orm.log.model.LogPo;

/**
 * <pre>
 *  
 *  File: LogInterceptor.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 系统日志拦截器
 *  TODO
 * 
 *  Notes:
 *  $Id: LogInterceptor.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:55:24>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Aspect
@Component
public class LogInterceptor
{

	private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
	
	
	@Resource
	public HttpServletRequest request;

	@Pointcut("execution(* com.tk.apis.*.*Resource*.*(..))")
	public void recordLog()
	{
	}

	@SuppressWarnings("unchecked")
	@Around("recordLog()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable
	{
		String agencyCode = RestThreadLocal.getAgencyCode();
		Date startTime = new Date();
		Object retVal = pjp.proceed();
		Date endTime = new Date();
		long spendTime = endTime.getTime() - startTime.getTime();
		String clazzName = pjp.getTarget().getClass().getName();
		String methodName = pjp.getSignature().getName();
		String argsString = "";

		try
		{ // 记录系统日志
			logger.info("**************************************************************");

			Object[] args = pjp.getArgs();

			for (int i = 0; i < args.length; i++)
			{
				argsString += JsonHelper.object2str(args[i]);

			}

			logger.info("执行时间: " + spendTime + "耗秒.");
			logger.info("执行人Id: " + RestThreadLocal.getExeUserId() + ".");

			logger.info("执行日期: " + DateUtil.getNow(DateUtil.ymd_HMS) + ".");
			logger.info("方法:" + clazzName + "." + methodName + " || 请求参数:" + argsString);
			logger.info("**************************************************************");

		}
		catch (Exception e)
		{
			logger.error("Log error:", e);
		}

		try
		{
			// 记录操作日志
			
			ResponseModel responseModel = (ResponseModel) retVal;
			if (responseModel.getStatus() != 200)
			{
				logger.error("出现异常：[" + responseModel.getMessage() + "] 无需记录日志");
				return retVal;
			}
			
			LogPo logPo = new LogPo();
			// 获取ResourceName
			String clazzShortName = clazzName.substring(clazzName.lastIndexOf(".") + 1);
			String resourceName = clazzShortName.substring(0, clazzShortName.lastIndexOf("ResourceV"));
			resourceName = resourceName.substring(0, 1).toLowerCase() + resourceName.substring(1);
			logPo.setResourceName(resourceName);

			// 根据多态获取具体的logger实现类 如：userLogService
			BaseLogService entityLogger = (BaseLogService) SpringContextHelper.getBean(resourceName + "LogService");

			// 获取操作类型
			String operationType = getOperationType(pjp);
			logPo.setAgencyCode(agencyCode);
			if ("other".equals(operationType))
			{// 如果不是添加、修改、删除资源及工作流操作则无需记录日志
				return retVal;
			}
			logPo.setOperationType(operationType);

			logPo.setUserId(RestThreadLocal.getExeUserId());
			logPo.setUserName(RestThreadLocal.getUserName());
			logPo.setTargetMethod(clazzName + "." + methodName);
			logPo.setArgs(argsString);
			String ip = IPAddrUtil.getIpAddr(request);
			logPo.setIp(ip);
			logPo.setUrl(request.getRequestURI());
			logPo.setStartTime(startTime);
			logPo.setEndTime(endTime);
			logPo.setSpendTime(spendTime);
			// 获取方法描述
			String comment = getComment(pjp.getTarget().getClass(), methodName);
			logPo.setComment(comment);
			// 设置Resource Id
			if (operationType.equals("delete") && !argsString.contains("{"))
			{
				argsString = argsString.replaceAll("\"", "");
				logPo.setResourceId(argsString);
				entityLogger.toModel(logPo);
			}
			else
			{
				if(responseModel.getResult() instanceof String) {
					logPo.setJsonText(null);
					logPo.setResourceId((String) responseModel.getResult());
					entityLogger.toModel(logPo);
				} else if(responseModel.getResult() instanceof List) {//针对批量增加、删除、修改返回id的List情况，循环插入Log
					
					List<MultipleObjectResultModel> responseList = (List<MultipleObjectResultModel>) responseModel.getResult();
					for(MultipleObjectResultModel multipleObjectResultModel : responseList){
						logPo.setJsonText(null);
						logPo.setResourceId((String) multipleObjectResultModel.getId());
						entityLogger.toModel(logPo);
					}
				}
			}
			
			
			

		}
		catch (NoSuchBeanDefinitionException e)
		{
			logger.error("该模块不需要记录操作日志");
		}

		return retVal;
	}

	// 获取操作类型
	private String getOperationType(JoinPoint jp)
	{
		String operationType = "";
		String shortMethodName = jp.getSignature().getName(); // 判断操作类型,包括登录 退出
		// 添加 修改 删除
		if ("login".equals(shortMethodName) || shortMethodName.startsWith("auth"))
		{
			operationType = "login";
		}
		else if (shortMethodName.startsWith("insert"))
		{
			operationType = "add";
		}
		else if (shortMethodName.startsWith("add"))
		{
			operationType = "add";
		}
		else if (shortMethodName.startsWith("create"))
		{
			operationType = "add";
		}
		else if (shortMethodName.startsWith("update"))
		{
			operationType = "update";
		}
		else if (shortMethodName.startsWith("modify"))
		{
			operationType = "update";
		}
		else if (shortMethodName.startsWith("save"))
		{
			operationType = "update";
		}
		else if (shortMethodName.startsWith("change"))
		{
			operationType = "update";
		}
		else if (shortMethodName.startsWith("restore"))
		{
			operationType = "update";
		}
		else if (shortMethodName.startsWith("delete"))
		{
			operationType = "delete";
		}
		else
		{
			operationType = "other";
		}
		return operationType;
	}

	// 获取ResourceDescription注解中对方法的描述
	@SuppressWarnings("rawtypes")
	private String getComment(Class clazz, String methodName)
	{
		Method[] methods = clazz.getMethods();
		String comment = "";
		for (Method method : methods)
		{
			if (methodName.equals(method.getName()))
			{
				if (method.isAnnotationPresent(ResourceDescription.class))
				{
					ResourceDescription resourceDescription = method.getAnnotation(ResourceDescription.class);
					comment = resourceDescription.Description();
				}
				break;
			}
		}
		return comment;
	}

}
/*
 * $Log: av-env.bat,v $
 */