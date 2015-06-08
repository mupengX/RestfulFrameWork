package com.tk.framework.ehcache;

import java.lang.reflect.Method;
import java.util.List;

import net.sf.ehcache.Cache;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.InitializingBean;

/**
 * <pre>
 *  
 *  File: MethodFlushCacheInterceptor.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: MethodFlushCacheInterceptor.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月27日下午3:35:24>>, <<Who>>, <<what>>  
 *  2015年1月27日		TK		Initial.
 * </pre>
 */
public class MethodFlushCacheInterceptor implements AfterReturningAdvice, InitializingBean
{

	private Cache cache;

	public void setCache(Cache cache)
	{
		this.cache = cache;
	}

	/**
	 * 刷新缓存（在目标方法执行之后，执行该方法）
	 */

	@SuppressWarnings("rawtypes")
	public void afterReturning(Object returnValue, Method method, Object[] arguments, Object target) throws Throwable
	{
		String targetName = target.getClass().getName();
		List list = cache.getKeys();
		for (int i = 0; i < list.size(); i++)
		{
			String cacheKey = String.valueOf(list.get(i));
			if (cacheKey.startsWith(targetName))
			{
				cache.remove(cacheKey);
				System.out.println("remove cache " + cacheKey);
			}
		}

	}

	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Need a cache,pleace use setCache(cache) create it." + cache);
	}
}

/*
 * $Log: av-env.bat,v $
 */