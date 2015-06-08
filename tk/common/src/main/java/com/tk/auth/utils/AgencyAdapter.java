package com.tk.auth.utils;

import org.springframework.beans.factory.annotation.Autowired;

import com.tk.framework.constant.AppConstats;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.exceptions.UserStatusException;
import com.tk.framework.rest.framework.exceptions.BadRequestException;
import com.tk.framework.util.UserType;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.auth.model.UserSession;
import com.tk.orm.user.model.SysUserPo;
import com.tk.service.user.SysUserService;

/**
 * <pre> 
 *  File: AgencyAdapter.java
 *  Copyright (C): 2014
 *  Description: 机构用户身份认证适配器
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月25日下午2:15:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class AgencyAdapter extends AuthAdapter
{
	// agUserService
	@Autowired
	private SysUserService sysUserService;

	@Override
	public UserSession getSSOUser(String agencyCode, UserType userType, String userId, String product) throws Exception
	{

		// AgUserService agUserService = (AgUserService)super.springContextHelper.getBean("agUserService");
		if (ValidationUtil.isEmpty(agencyCode))
		{
			throw new BadRequestException(MessageConstants.AGENCY_CODE_REQUIRED);
		}
		SysUserPo sysUser = sysUserService.getSysUserByUserId(agencyCode, userId);

		if (ValidationUtil.isEmpty(sysUser))
		{
			return null;
		}
		if (!ValidationUtil.isEmpty(sysUser.getLockStatus()) && AppConstats.COMMON_Y.equals(sysUser.getLockStatus()))
		{
			throw new UserStatusException(MessageConstants.USER_LOOKED);
		}

		UserSession session = new UserSession();
		session.setRecUserId(sysUser.getUserID());
		session.setUserId(sysUser.getUserID());
		session.setSsoUserName(sysUser.getName());
		session.setActionByProduct(product);
		session.setPassword(sysUser.getUserPwd());
		session.setAgencyCode(agencyCode);
		return session;
	}

}

/*
 * $Log: av-env.bat,v $
 */