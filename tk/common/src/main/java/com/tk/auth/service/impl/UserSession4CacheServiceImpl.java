package com.tk.auth.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.auth.utils.AuthAdapter;
import com.tk.framework.cache.CacheType;
import com.tk.framework.cache.KVCache;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.page.PageBeanDto;
import com.tk.framework.rest.framework.exceptions.UnauthorizedException;
import com.tk.framework.service.impl.BaseServiceImpl;
import com.tk.framework.util.DateTimeUtil;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.auth.dao.LoginHistoryDao;
import com.tk.orm.auth.model.LoginHistoryPo;
import com.tk.orm.auth.model.UserSession;
import com.tk.service.auth.UserSessionService;

/**
 * <pre> 
 *  File: UserSession4CacheServiceImpl.java
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2015年5月26日下午4:09:32>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */

@Service(value = "userSessionService")
public class UserSession4CacheServiceImpl extends BaseServiceImpl<UserSession, Object> implements UserSessionService {
	
	@Autowired
	private KVCache kvCache;
	
	@Autowired
	private LoginHistoryDao loginHistoryDao;
	
	@Override
	public UserSession checkSessionBySessionId(String sessionId)
			throws Exception {
		
		
		
		UserSession session = fromCacheGetSessionById(sessionId);
		
		if (ValidationUtil.isEmpty(session))
		{
			throw new UnauthorizedException(MessageConstants.TOKEN_EXPIRED);
		}

		if (!DateTimeUtil.compareDate(DateTimeUtil.getCurrentDate(), DateTimeUtil.addMinutes(
			session.getSsoSessionCreation(), Long.parseLong(session.getSsoSessionExpiration()))))
		{

			fromCacheDeleteBySessionId(sessionId);
			throw new UnauthorizedException(MessageConstants.TOKEN_EXPIRED);

		}
		
		loginHistoryDao.queryObjectsByHQLStr("select id from SysUserPo where id='111'", null); // 这里用来解决配置了事务回滚机制的单元测试在执行SQLQuery时无法同步数据的问题，因此执行HQLQuery来同步数据，详情参见org.hibernate.impl.SessionImpl类中的autoFlushIfRequired方法
		return session;
	}

	@Override
	public UserSession touchSession(String sessionId) throws Exception {
		
		UserSession session = (UserSession)kvCache.get(CacheType.SESSION, sessionId);
	    session.setSsoSessionCreation(new Date());
	    kvCache.setWithExpire(CacheType.SESSION, session.getSsoSessionId(), session, Long.parseLong(session.getSsoSessionExpiration()));
		return session;
	}

	@Override
	public UserSession checkNewestSessionByUserId(String userId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void toAddSessionToCache(UserSession userSession) throws Exception {
		
		kvCache.setWithExpire(CacheType.SESSION, userSession.getSsoSessionId(), userSession, Long.parseLong(userSession.getSsoSessionExpiration()));
		
		loginHistoryDao.queryObjectsByHQLStr("select ssoSessionId from UserSession where ssoSessionId='" + userSession.getSsoSessionId()
				+ "'", null); // 这里用来解决配置了事务回滚机制的单元测试在执行SQLQuery时无法同步数据的问题，因此执行HQLQuery来同步数据，详情参见org.hibernate.impl.SessionImpl类中的autoFlushIfRequired方法
	}

	@Override
	public void fromCacheDeleteBySessionId(String id) throws Exception {

		kvCache.remove(CacheType.SESSION, id);
	}

	

	@Override
	public boolean validSession(String userId, String agencyCode, String token) throws Exception {
		
		//#1.跟据userid 查询loginHistory中最新记录
		Map<String, String> params = new HashMap<String, String>();
		params.put("userId", userId);
		params.put("agencyCode", agencyCode);
		LoginHistoryPo loginHistoryPo = (LoginHistoryPo)this.loginHistoryDao.uniqueResultByCustomSQLName(
				"getNewestSessionByUserId", params, LoginHistoryPo.class);
		
		//#2. 判断最新记录跟当前token是否为同一个。
		
		//若是同一个则返回true
		if(ValidationUtil.isEmpty(loginHistoryPo)) {
			return true;
		} else if(token.equals(loginHistoryPo.getSsoSessionId())) {
			return true;
		}
		
		//若不是则删除缓存中当前的Session，并返回false
		kvCache.remove(CacheType.SESSION, token);
		
		return false;
	}

	@Override
	public UserSession fromCacheGetSessionById(String sessionId) throws Exception {
		
		return (UserSession)kvCache.get(CacheType.SESSION, sessionId);
	}
	
	

}

/*
*$Log: av-env.bat,v $
*/