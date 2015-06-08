package com.tk.framework.rest.framework.exceptions;

/**
 * <pre> 
 *  
 *  File: UnknownResourceException.java
 *  
 *  Copyright (C): 2014
 *  Description: 未知资源异常
 *  TODO
 * 
 *  Notes:
 *  $Id: UnknownResourceException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:29:49>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class UnknownResourceException extends RuntimeException {

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -7556532317733446725L;

	public UnknownResourceException() {
        super();
    }
	
    public UnknownResourceException(String msg) {
        super(msg);
    }
}

/*
*$Log: av-env.bat,v $
*/