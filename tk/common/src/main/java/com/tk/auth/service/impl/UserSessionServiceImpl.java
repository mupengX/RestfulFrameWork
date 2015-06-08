package com.tk.auth.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.auth.utils.AuthAdapter;
import com.tk.framework.constant.AppConstats;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.rest.framework.exceptions.UnauthorizedException;
import com.tk.framework.service.impl.BaseServiceImpl;
import com.tk.framework.util.DateTimeUtil;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.auth.dao.UserSessionDao;
import com.tk.orm.auth.model.UserSession;
import com.tk.service.auth.UserSessionService;

/**
 * <pre>
 *  File: UserSessionServiceImpl.java
 *  Copyright (C): 2014
 *  Description:
 *  查找、更新Session
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午1:58:46>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */

public class UserSessionServiceImpl extends BaseServiceImpl<UserSession, Object> implements UserSessionService
{
	@Autowired
	private UserSessionDao userSessionDao;

	public UserSession checkSessionBySessionId(String sessionId) throws Exception
	{
		UserSession session = (UserSession) this.userSessionDao.queryObjectByID(UserSession.class, sessionId);
		if (ValidationUtil.isEmpty(session))
		{
			throw new UnauthorizedException(MessageConstants.TOKEN_NOT_FOUND);
		}

		if (!DateTimeUtil.compareDate(DateTimeUtil.getCurrentDate(), DateTimeUtil.addMinutes(
			session.getSsoSessionCreation(), AuthAdapter.defaultSessionExpirationDurationInMinutes)))
		{

			// this.userSessionDao.deleteById(sessionId);

			// log history
			throw new UnauthorizedException(MessageConstants.TOKEN_EXPIRED);

		}

		userSessionDao.queryObjectsByHQLStr("select ssoSessionId from UserSession where ssoSessionId='" + sessionId
				+ "'", null); // 这里用来解决配置了事务回滚机制的单元测试在执行SQLQuery时无法同步数据的问题，因此执行HQLQuery来同步数据，详情参见org.hibernate.impl.SessionImpl类中的autoFlushIfRequired方法

		return session;
	}

	public UserSession touchSession(String sessionId) throws Exception
	{
		UserSession session = (UserSession) this.userSessionDao.queryObjectByID(UserSession.class, sessionId);
		session.setSsoSessionCreation(new Date());
		session.setSsoSessionCreationMillis(System.currentTimeMillis());
		session.setSsoSessionStatus(AppConstats.COMMON_A);
		this.userSessionDao.updateObject(session);

		return session;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tk.service.auth.UserSessionService#checkNewestSessionByUserId(java.lang.String)
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public UserSession checkNewestSessionByUserId(String userId) throws Exception
	{
		Map params = new HashMap();
		params.put("userId", userId);
		UserSession session = (UserSession) this.userSessionDao.uniqueResultByCustomSQLName("getNewestSessionByUserId",
			params, UserSession.class);
		return session;
	}

	@Override
	public void toAddSessionToCache(UserSession userSession) throws Exception {
		// TODO Auto-generated method stub
		super.add(userSession);
	}


	@Override
	public boolean validSession(String userId, String agencyCode, String token)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void fromCacheDeleteBySessionId(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserSession fromCacheGetSessionById(String sessionId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
