package com.tk.framework.util.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * <pre>
 *  
 *  File: EhcacheUtil.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  Ehcache工具类
 * 
 *  Notes:
 *  $Id: EhcacheUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月26日下午2:07:01>>, <<Who>>, <<what>>  
 *  2015年1月26日		TK		Initial.
 * </pre>
 */
public class EhcacheUtil
{

	public static CacheManager manager = CacheManager.create();

	/**
	 * 获取名为cacheName的cache对象中对应键值为key的缓存
	 * 
	 * @param cacheName
	 * @param key
	 * @return
	 */
	public static Object get(String cacheName, Object key)
	{
		Cache cache = manager.getCache(cacheName);
		if (cache != null)
		{
			Element element = cache.get(key);
			if (element != null)
			{
				return element.getObjectValue();
			}
		}
		return null;
	}

	/**
	 * 将键值对为key和value的缓存添加到名为cacheName的cache对象中
	 * 
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	public static void put(String cacheName, Object key, Object value)
	{
		Cache cache = manager.getCache(cacheName);
		if (cache != null)
		{
			cache.put(new Element(key, value));
		}
	}

	/**
	 * 删除名为cacheName的cache对象中对应键值为key的缓存
	 * 
	 * @param cacheName
	 * @param key
	 * @return
	 */
	public static boolean remove(String cacheName, Object key)
	{
		Cache cache = manager.getCache(cacheName);
		if (cache != null)
		{
			return cache.remove(key);
		}
		return false;
	}

	/**
	 * 测试方法
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String key = "key";
		String value = "hello";
		EhcacheUtil.put("mytest", key, value);
		System.out.println(EhcacheUtil.get("mytest", key));
	}

}