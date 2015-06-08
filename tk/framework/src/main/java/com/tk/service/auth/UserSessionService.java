package com.tk.service.auth;


import com.tk.framework.service.BaseService;
import com.tk.orm.auth.model.UserSession;

/**
 *  TK Automation
 * 
 * @File:UserSessionService.java
 * @author TK
 * @Description: <关于这个类的基本作用>
 * @Notes: <一些特别的描述的信息>
 * @Revision History: <<2014年12月16日下午4:55:09>>, <<TK>>, <<Create>>
 */
public interface UserSessionService extends BaseService<UserSession, Object>
{
	/**
	 * 
	 * 通过session id 获得session对象.
	 * 
	 * @param sessionId
	 * @return
	 * @throws Exception
	 */
	public UserSession checkSessionBySessionId(String sessionId) throws Exception;

	/**
	 * 
	 * 刷新session.
	 * 
	 * @param sessionId
	 * @return
	 * @throws Exception
	 */
	public UserSession touchSession(String sessionId) throws Exception;

	/**
	 * 通过用户ID获得最新session对象
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public UserSession checkNewestSessionByUserId(String userId) throws Exception;
	
	/**
	 * 向KVCache中添加Session
	 *
	 * @param userSession
	 * @throws Exception 
	 */
	public void toAddSessionToCache(UserSession userSession) throws Exception;
	
	/**
	 * 从缓存中删除Session
	 *
	 * @param id 
	 */
	public void fromCacheDeleteBySessionId(String id) throws Exception;
	
	/**
	 * 根据id从cache中获取Session
	 *
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	public UserSession fromCacheGetSessionById(String sessionId) throws Exception;
	
	/**
	 * TODO.
	 * 根据用户id判断当前用户是否在异地登录
	 * @param id token
	 * @return true：帐号已在异地登录  false：帐号没有在异地登录
	 * @throws Exception 
	 */
	public boolean validSession(String userId, String agencyCode, String token) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */