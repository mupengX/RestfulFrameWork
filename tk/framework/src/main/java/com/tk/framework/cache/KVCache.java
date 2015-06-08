package com.tk.framework.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tk.framework.exceptions.BusinessException;
import com.tk.framework.util.SpringContextHelper;
import com.tk.framework.util.ValidationUtil;


/**
 * <pre> 
 *  
 *  File: KVCache.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: KVCache.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月26日下午2:31:49>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */
@Component("kvCache")
public class KVCache {
	
	private static String cacheName;
	
	private static final String DEFAULT_CACHE_NAME = "redisCache";
	
	private static final String SEPARATOR= ":"; 
	
	@Autowired
	private static SpringContextHelper springContextHelper;
	
	private static Cache<String, Object> cache;
	
	@SuppressWarnings("unchecked")
	public static Cache<String, Object> getCache() {
		if(!ValidationUtil.isEmpty(cache)){
			return cache;
		} else {
			if(ValidationUtil.isEmpty(cacheName)) {
				return (Cache<String, Object>)springContextHelper.getBean(DEFAULT_CACHE_NAME);
			}
			
			return (Cache<String, Object>) springContextHelper.getBean(cacheName);
		}
	}
	
	public void set(CacheType type, String key, Object V) throws Exception {
		
		if(ValidationUtil.isEmpty(key) || ValidationUtil.isEmpty(type)) {
			throw new BusinessException("设置缓存的type或者key不能为空");
		}
		getCache().set(type.toString()+SEPARATOR+key, V);
		
	}
	
	public void setWithExpire(CacheType type, String key, Object V, long expireTime) throws Exception {
		
		if(ValidationUtil.isEmpty(key) || ValidationUtil.isEmpty(type)) {
			throw new BusinessException("设置缓存的type或者key不能为空");
		}
		
		if(ValidationUtil.isEmpty(expireTime)) {
			throw new BusinessException("请设置缓存过期时间!");
		}
		
		getCache().setWithExpire(type.toString()+SEPARATOR+key, V, expireTime);
	}
	
	public void expire(CacheType type, String key, long expireTime) throws Exception {
		
		if(ValidationUtil.isEmpty(key) || ValidationUtil.isEmpty(type)) {
			throw new BusinessException("设置缓存的type或者key不能为空");
		}
		
		if(ValidationUtil.isEmpty(expireTime)) {
			throw new BusinessException("请设置缓存过期时间!");
		}
		
		getCache().expire(type.toString().toString()+SEPARATOR+key, expireTime);
	}
	
	public Object get(CacheType type, String key) throws Exception {
		
		if(ValidationUtil.isEmpty(key) || ValidationUtil.isEmpty(type)) {
			throw new BusinessException("从缓存中取值  type或者key不能为空");
		}
		
		return getCache().get(type.toString()+SEPARATOR+key);
	}
	
	public void remove(CacheType type, String key) throws Exception {
		
		if(ValidationUtil.isEmpty(key) || ValidationUtil.isEmpty(type)) {
			throw new BusinessException("从缓存中删除  type或者key不能为空");
		}
		
		getCache().remove(type.toString()+SEPARATOR+key);
		
	}
}
