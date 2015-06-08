package com.tk.auth.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.framework.service.impl.BaseServiceImpl;
import com.tk.orm.auth.dao.LoginHistoryDao;
import com.tk.orm.auth.model.LoginHistoryPo;
import com.tk.orm.auth.model.UserSession;
import com.tk.service.auth.LoginHistoryService;

/**
 * <pre>
 *  File: LoginHistroyServiceImpl.java
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2015年5月26日下午4:35:00>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */
@Service("loginHistoryService")
public class LoginHistoryServiceImpl extends
		BaseServiceImpl<LoginHistoryPo, Object> implements LoginHistoryService {

	@Autowired
	LoginHistoryDao loginHistoryDao;

	@Override
	public LoginHistoryPo getLastLoginFromHistory(String userId,
			String agencyCode) throws Exception {
		
			Map<String, String> params = new HashMap<String, String>();
			params.put("userId", userId);
			params.put("agencyCode", agencyCode);
			LoginHistoryPo loginHistoryPo = (LoginHistoryPo)this.loginHistoryDao.uniqueResultByCustomSQLName(
					"getNewestSessionByUserId", params, LoginHistoryPo.class);
			return loginHistoryPo;
		
	}

}

/*
 * $Log: av-env.bat,v $
 */