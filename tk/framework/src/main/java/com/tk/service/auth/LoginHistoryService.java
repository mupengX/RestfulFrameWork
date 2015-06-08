package com.tk.service.auth;

import com.tk.framework.service.BaseService;
import com.tk.orm.auth.model.LoginHistoryPo;

/**
 * <pre> 
 *  
 *  File: LoginHistoryService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: LoginHistoryService.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月26日下午4:33:15>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */
public interface LoginHistoryService extends BaseService<LoginHistoryPo, Object>{
	
	public LoginHistoryPo getLastLoginFromHistory(String userId, String agencyCode) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/