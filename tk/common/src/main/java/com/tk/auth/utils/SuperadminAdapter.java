package com.tk.auth.utils;

import org.springframework.beans.factory.annotation.Autowired;

import com.tk.framework.util.UserType;
import com.tk.framework.util.superadmin.SuperAdminUtil;
import com.tk.orm.auth.model.UserSession;
import com.tk.orm.user.model.SysUserPo;
import com.tk.service.user.SysUserService;

/**
 * <pre>
 *  File: SuperadminAdapter.java
 *  Copyright (C): 2014
 *  Description: 管理员身份认证适配器
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午2:18:38>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class SuperadminAdapter extends AuthAdapter
{
	//@Autowired 实现SysUserService后将此注释放开
	private SysUserService sysUserService;

	@Override
	public UserSession getSSOUser(String agencyCode, UserType userType, String userId, String product) throws Exception
	{
		boolean isSuperAdmin = SuperAdminUtil.isSuperAdmin(userId);

		UserSession session = null;

		if (isSuperAdmin)
		{
			session = new UserSession();

			SysUserPo admin = SuperAdminUtil.getSuperAdmin(userId);

			session.setRecUserId(admin.getUserID());
			session.setUserId(admin.getUserID());
			session.setSsoUserName(admin.getName());
			session.setPassword(admin.getUserPwd());
			session.setActionByProduct(product);
		}

		return session;
	}

}

/*
 * $Log: av-env.bat,v $
 */