package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: BadRequestException.java
 *  
 *  Copyright (C): 2014
 *  Description: bad请求异常
 *  TODO
 * 
 *  Notes:
 *  $Id: BadRequestException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:24:07>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class BadRequestException extends RuntimeException
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -2510841900841400041L;

	public BadRequestException()
	{
		super();
	}

	public BadRequestException(String msg)
	{
		super(msg);
	}
}

/*
 * $Log: av-env.bat,v $
 */