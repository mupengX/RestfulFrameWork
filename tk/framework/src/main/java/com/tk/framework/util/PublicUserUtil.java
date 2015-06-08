package com.tk.framework.util;

import com.tk.framework.constant.AppConstats;

 
/**
 * <pre> 
 *  
 *  File: PublicUserUtil.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 验证公网用户的工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: PublicUserUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:49:59>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class PublicUserUtil
{
	/**
	 * Checks if is public user.
	 * 
	 * @param callerID the caller id
	 * 
	 * @return true, if is public user
	 */
	public static boolean isPublicUser(String callerID)
	{
		boolean isPublicUser = false;

		if (callerID != null && callerID.startsWith(AppConstats.PUBLICUSER_PREFIX))
		{
			isPublicUser = true;
		}

		return isPublicUser;
	}
}

/*
*$Log: av-env.bat,v $
*/