package com.tk.framework.util.superadmin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.tk.orm.user.model.SysUserPo;

/**
 * <pre>
 *  
 *  File: SuperAdminUtil.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: SuperAdminUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年2月3日下午2:49:32>>, <<Who>>, <<what>>  
 *  2015年2月3日		TK		Initial.
 * </pre>
 */
public class SuperAdminUtil
{
	private static List<SysUserPo> admins = new ArrayList<SysUserPo>()
	{
		/**
		 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
		 */
		private static final long serialVersionUID = 8077821991245671133L;

		{

			add(createSysUserPo("tk", "坦克",
				"324:556b632483d4cb987569e558bb1bdd6149813d53726ab3c2:86d8c3433512f8c6104dab10096a2c2f0cff5db263ce5cc1"));
			add(createSysUserPo("snail", "蜗牛",
				"324:556b632483d4cb987569e558bb1bdd6149813d53726ab3c2:86d8c3433512f8c6104dab10096a2c2f0cff5db263ce5cc1"));
		}
	};

	/**
	 * 是否超级管理员.
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public static boolean isSuperAdmin(String account) throws Exception
	{
		for (SysUserPo user : admins)
		{
			if (user.getUserID().equals(account))
			{
				return true;
			}

		}
		return false;
	}

	/**
	 * 根据账号获取管理员信息.
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */
	public static SysUserPo getSuperAdmin(String account) throws Exception
	{
		for (SysUserPo admin : admins)
		{
			if (admin.getUserID().equals(account))
			{
				return admin;
			}
		}
		return null;
	}

	/**
	 * 构造超级管理员.
	 * 
	 * @param userID
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	private static SysUserPo createSysUserPo(String userID, String userName, String userPwd)
	{
		SysUserPo user = new SysUserPo();
		user.setId(UUID.randomUUID().toString().replace("-", ""));
		user.setUserID(userID);
		user.setName(userName);
		user.setUserPwd(userPwd);

		return user;
	}
}

/*
 * $Log: av-env.bat,v $
 */