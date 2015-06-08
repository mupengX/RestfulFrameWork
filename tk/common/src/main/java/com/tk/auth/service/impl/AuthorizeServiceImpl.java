package com.tk.auth.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tk.orm.auth.dao.AuthorityDao;
import com.tk.service.auth.AuthorizeService;

/**
 * <pre> 
 *  
 *  File: AuthorizeServiceImpl.java
 *  
 *  Copyright (C): 2014
 *  Description:权限查询
 *  
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午1:55:13>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Service(value="authorizeService")
public class AuthorizeServiceImpl implements AuthorizeService{
	@Autowired
	private AuthorityDao authorityDao;
	
	
	private final static long defaultSessionExpirationDurationInMinutes = 30;

}
