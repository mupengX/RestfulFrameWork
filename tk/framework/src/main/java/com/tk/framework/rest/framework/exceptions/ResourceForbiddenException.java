package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: ResourceForbiddenException.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 资源禁止访问异常
 *  TODO
 * 
 *  Notes:
 *  $Id: ResourceForbiddenException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:27:16>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ResourceForbiddenException extends RestException
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -4438722804344633770L;

	public ResourceForbiddenException()
	{
		super();
	}

	public ResourceForbiddenException(String msg)
	{
		super(msg);
	}
}

/*
 * $Log: av-env.bat,v $
 */