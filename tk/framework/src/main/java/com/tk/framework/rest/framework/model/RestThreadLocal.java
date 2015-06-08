package com.tk.framework.rest.framework.model;

/**
 * <pre>
 *  
 *  File: RestThreadLocal.java
 *  
 *  Copyright (C): 2014
 *  Description: REST线程工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: RestThreadLocal.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:32:20>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class RestThreadLocal
{
	private static ThreadLocal<RestThreadLocalModel> threadLocal = new ThreadLocal<RestThreadLocalModel>();

	public static RestThreadLocalModel getThreadLocal()
	{
		return threadLocal.get();
	}

	public static void setThreadLocal(RestThreadLocalModel threadLocalModel)
	{
		threadLocal.set(threadLocalModel);
	}

	public static String getTraceId()
	{
		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getTraceId();
	}

	public static void setAgecyCode(String agencyCode)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setAgencyCode(agencyCode);
		threadLocal.set(model);
	}

	public static String getAgencyCode()
	{
		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getAgencyCode();
	}

	public static String getIp()
	{

		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getIp();
	}

	public static void setIp(String ip)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setIp(ip);
		threadLocal.set(model);
	}

	public static String getUserID()
	{

		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getUserID();
	}

	public static void setUserID(String userID)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setUserUUID(userID);
		threadLocal.set(model);
	}

	public static String getUserName()
	{

		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getUserName();
	}

	public static void setUserName(String userName)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setUserName(userName);
		threadLocal.set(model);
	}
	
	public static void setExeUserId(String userId)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setExcutedUserId(userId);
		threadLocal.set(model);
	}

	public static String getExeUserId()
	{
		if (threadLocal == null)
		{
			return null;
		}
		return threadLocal.get().getExcutedUserId();
	}

	public static int getVersion()
	{
		if (threadLocal == null)
		{
			return 0;
		}
		return threadLocal.get().getVersion();
	}

	public static void setVersion(int version)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setVersion(version);
		threadLocal.set(model);
	}

	public static void setTraceId(String traceId)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setTraceId(traceId);
		threadLocal.set(model);
	}

	/**
	 * Reset all value.
	 */
	public static void clean()
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model != null)
		{
			model.clean();
		}
	}

	public static void setAttribute(RestENVtEntityType key, Object value)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model == null)
		{
			model = new RestThreadLocalModel();
		}
		model.setAttribute(key, value);
		threadLocal.set(model);
	}

	public static Object getAttribute(RestENVtEntityType key)
	{
		RestThreadLocalModel model = threadLocal.get();
		if (model != null)
		{
			return model.getAttribute(key);
		}
		else
		{
			return null;
		}
	}

}

/*
 * $Log: av-env.bat,v $
 */