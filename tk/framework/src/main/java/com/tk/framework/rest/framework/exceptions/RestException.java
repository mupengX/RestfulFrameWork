package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: RestException.java
 *  
 *  Copyright (C): 2014
 *  Description: rest 异常基础类
 *  TODO
 * 
 *  Notes:
 *  $Id: RestException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:28:49>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class RestException extends RuntimeException
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -473161327611495695L;

	public RestException()
	{
		super();
	}

	public RestException(String message)
	{
		super(message);
	}
}

/*
 * $Log: av-env.bat,v $
 */