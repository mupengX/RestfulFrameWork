package com.tk.framework.exceptions;

import com.tk.framework.constant.MessageConstants;


/**
 * <pre> 
 *  
 *  File: UserIdOrPasswordNotValidException.java
 *  
 *  Copyright (C): 2014
 *  Description: 用户名或密码错误 异常类
 *  TODO
 * 
 *  Notes:
 *  $Id: UserIdOrPasswordNotValidException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:54:14>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class UserIdOrPasswordNotValidException extends Exception
{
	public UserIdOrPasswordNotValidException()
	{
		super(MessageConstants.USERID_OR_PASSWORD_NOT_VALID);
	}
}

/*
 * $Log: av-env.bat,v $
 */