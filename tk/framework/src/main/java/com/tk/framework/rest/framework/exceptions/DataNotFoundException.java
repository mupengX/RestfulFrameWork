package com.tk.framework.rest.framework.exceptions;

/**
 * <pre>
 *  
 *  File: DataNotFoundException.java
 *  
 *  Copyright (C): 2014
 *  Description: 数据未找到异常
 *  TODO
 * 
 *  Notes:
 *  $Id: DataNotFoundException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:24:39>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DataNotFoundException extends RuntimeException
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -957474349389838447L;

	public DataNotFoundException()
	{
		super();
	}

	public DataNotFoundException(String msg)
	{
		super(msg);
	}
}

/*
 * $Log: av-env.bat,v $
 */