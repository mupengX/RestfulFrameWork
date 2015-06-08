package com.tk.framework.constant;


/**
 * <pre> 
 *  
 *  File: ErrorCode.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 业务错误代码。 目前已废弃。
 *  TODO
 * 
 *  Notes:
 *  $Id: ErrorCode.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:24:51>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Deprecated
public enum ErrorCode
{
	/** The App success code. */
	APP_SUCCESS(0),

	/** App Error Code. */
	APP_ERROR_CODE(1005),

	/** The data validation error. */
	DATA_VALIDATION_ERROR(-1),

	/** The emse error. */
	EMSE_ERROR(-2),

	/** The configuration error */
	CONFIG_ERROR(-3);

	/**
	 * Instantiates a new error code.
	 * 
	 * @param errorCode the error code
	 */
	ErrorCode(Integer code)
	{
		this.code = code;
	}

	/** The error code. */
	private Integer code;

	/**
	 * Gets the error code.
	 * 
	 * @return the error code
	 */
	public Integer getCode()
	{
		return code;
	}

	/**
	 * Sets the error code.
	 * 
	 * @param errorCode the new error code
	 */
	public void setCode(Integer code)
	{
		this.code = code;
	}

}

/*
 * $Log: av-env.bat,v $
 */
