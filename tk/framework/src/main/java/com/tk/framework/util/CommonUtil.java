package com.tk.framework.util;

import java.util.UUID;

/**
 * <pre> 
 *  
 *  File: CommonUtil.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: CommonUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:46:45>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class CommonUtil
{
	public static String getUUID()
	{
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
}
