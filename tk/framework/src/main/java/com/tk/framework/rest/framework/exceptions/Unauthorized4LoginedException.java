package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: Unauthorized4LoginedException.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: Unauthorized4LoginedException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年2月4日下午2:25:54>>, <<Who>>, <<what>>  
 *  2015年2月4日		TK		Initial.
 * </pre>
 */
public class Unauthorized4LoginedException extends RestException
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -5010412614261026892L;

	public Unauthorized4LoginedException()
	{
		super();
	}

	public Unauthorized4LoginedException(String msg)
	{
		super(msg);
	}
}

/*
 * $Log: av-env.bat,v $
 */