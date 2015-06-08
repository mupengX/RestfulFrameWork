package com.tk.auth.utils;

import org.springframework.beans.factory.annotation.Autowired;

import com.tk.framework.constant.AppConstats;
import com.tk.framework.util.UserType;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.auth.model.UserSession;
import com.tk.orm.publicuser.model.PublicUserPo;
import com.tk.service.publicuser.PuUserService;



/**
 * <pre> 
 *  File: PublicAdapter.java
 *  Copyright (C): 2014
 *  Description: 公网用户身份适配器
 *  
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午2:17:45>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class PublicAdapter extends AuthAdapter
{
	//publicUserService
	@Autowired
	PuUserService publicUserService;
	
	@Override
	public UserSession getSSOUser(String agencyCode ,UserType userType, String userId, String product) throws Exception
	{
		//PuUserService publicUserService = (PuUserService)super.springContextHelper.getBean("publicUserService"); 
		PublicUserPo publicuser =  publicUserService.getUserByUserId(agencyCode, userId);
		if(ValidationUtil.isEmpty(publicuser))
		{
			return null;
		}
		UserSession session = new UserSession();
		session.setRecUserId(publicuser.getUserId());
		session.setUserId(AppConstats.PUBLICUSER_PREFIX+publicuser.getUserId());
		session.setSsoUserName(publicuser.getFname());
		session.setAgencyCode(AppConstats.PUBLIC_AGENCY_CODE);
		session.setActionByProduct(product);
		session.setPassword(publicuser.getPassword());
		return session;
	}

}

/*
*$Log: av-env.bat,v $
*/