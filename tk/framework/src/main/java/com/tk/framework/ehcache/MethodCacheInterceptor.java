package com.tk.framework.ehcache;

import java.io.Serializable;
import java.lang.reflect.Method;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * <pre>
 *  
 *  File: MethodCacheInterceptor.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  缓存拦截器
 * 
 *  Notes:
 *  $Id: MethodCacheInterceptor.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月27日下午3:16:26>>, <<Who>>, <<what>>  
 *  2015年1月27日		TK		Initial.
 * </pre>
 */
public class MethodCacheInterceptor implements MethodInterceptor, InitializingBean
{

	private static final Logger log = LoggerFactory.getLogger(MethodCacheInterceptor.class);

	private Cache cache;

	public void setCache(Cache cache)
	{
		this.cache = cache;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception
	{
		log.info(cache + " A cache is required. Use setCache(Cache) to provide one.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable
	{
		Object[] arguments = invocation.getArguments();
		Object result;

		String cacheKey = getCacheKey(invocation.getThis(), invocation.getMethod(), arguments);
		Element element = null;
		synchronized (this)
		{
			element = cache.get(cacheKey);
			if (element == null)
			{
				log.info(cacheKey + "加入到缓存： " + cache.getName());
				// 调用实际的方法
				result = invocation.proceed();
				element = new Element(cacheKey, (Serializable) result);
				cache.put(element);
			}
			else
			{
				log.info(cacheKey + "使用缓存： " + cache.getName());
			}
		}
		return element.getValue();
	}

	/**
	 * 返回CacheKey.
	 * 
	 * @param target
	 * @param method
	 * @param params
	 * @return
	 */
	private String getCacheKey(Object target, Method method, Object... params)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(target.getClass().getName()).append(".")
				.append(new MethodCacheKeyGenerator().generate(target, method, params).toString());

		return sb.toString();
	}
}

/*
 * $Log: av-env.bat,v $
 */