package com.tk.framework.exceptions;


/**
 * <pre> 
 *  
 *  File: BusinessException.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 业务异常基类
 *  TODO
 * 
 *  Notes:
 *  $Id: BusinessException.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:52:27>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class BusinessException extends RuntimeException 
{
	private String code;
	public BusinessException(String msg) {
        super(msg);
        this.code = "500";
	}
	public BusinessException(String msg,String code) {
	        super(msg);
	        this.code = code;
	}
	
	/**
	 * @return the code
	 */
	
	public String getCode()
	{
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code)
	{
		this.code = code;
	}
	 
}

/*
*$Log: av-env.bat,v $
*/