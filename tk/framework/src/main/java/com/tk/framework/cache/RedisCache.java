package com.tk.framework.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * <pre> 
 *  
 *  File: RedisCache.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: RedisCache.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月26日下午2:57:52>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */

@Component("redisCache")
public class RedisCache implements Cache<String, Object>{
	
	@Autowired
	private RedisTemplate redisTemplate;
	private static final TimeUnit timeUnit = TimeUnit.MINUTES;
	
	@Override
	public void set(String key, Object value) throws Exception {

		redisTemplate.opsForValue().set(key, value);
	}

	@Override
	public void expire(String key, Long exprieTime) throws Exception {
		
		redisTemplate.expire(key, exprieTime.longValue(), timeUnit);
	}

	@Override
	public void setWithExpire(String key, Object value, Long exprieTime)
			throws Exception {
			redisTemplate.opsForValue().set(key, value);
			redisTemplate.expire(key, exprieTime.longValue(), timeUnit);
		
	}

	@Override
	public Object get(String key) throws Exception {
		
		return redisTemplate.opsForValue().get(key);
	}

	@Override
	public void remove(String key) throws Exception {
		
		redisTemplate.delete(key);
	}

	
	
}

/*
*$Log: av-env.bat,v $
*/