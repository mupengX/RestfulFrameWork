package com.tk.framework.rest.framework.model;

import java.io.Serializable;

/**
 * <pre> 
 *  
 *  File: ResponseModel.java
 *  
 *  Copyright (C): 2014
 *  Description: rest返回值基础类
 *  TODO
 * 
 *  Notes:
 *  $Id: ResponseModel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:31:30>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ResponseModel implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -1241360949457314497L;

	private int status;

	private Object result;
	
	private String traceId;
	
	private String message;
	
	private String code;

	
	
	public String getMessage()
	{
		return message;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getTraceId()
	{
		return traceId;
	}

	public void setTraceId(String traceId)
	{
		this.traceId = traceId;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public Object getResult()
	{
		return result;
	}

	public void setResult(Object result)
	{
		this.result = result;
	}
}

/*
*$Log: av-env.bat,v $
*/