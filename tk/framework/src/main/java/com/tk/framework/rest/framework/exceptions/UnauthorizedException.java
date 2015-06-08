package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: UnauthorizedException.java
 *  
 *  Copyright (C): 2014
 *  Description: 身份未认证异常
 *  TODO
 * 
 *  Notes:
 *  $Id: UnauthorizedException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:29:30>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class UnauthorizedException extends RestException
{
 
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -4281167218514222151L;

	public UnauthorizedException()
	{
		super();
	}

	public UnauthorizedException(String msg)
	{
		super(msg);
	}
}

/*
 * $Log: av-env.bat,v $
 */