package com.tk.framework.rest.framework.model;

/**
 * <pre> 
 *  
 *  File: MultipleObjectResultModel.java
 *  
 *  Copyright (C): 2014
 *  Description: 
 *  TODO
 * 
 *  Notes:
 *  $Id: MultipleObjectResultModel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:30:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class MultipleObjectResultModel implements java.io.Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 7920105597816391003L;

	
	
	private String code;
	
	private Object id;
	
	private String message;
	
	private Boolean isSuccess;

	public MultipleObjectResultModel()
	{
		super();
	}
	
	public MultipleObjectResultModel(Object id,  String code,String message, Boolean isSuccess)
	{
		super();
		this.code = code;
		this.id=id;
		this.message = message;
		this.isSuccess = isSuccess;
	}

	

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Boolean getIsSuccess()
	{
		return isSuccess;
	}

	public void setSuccess(Boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}
	
	public static MultipleObjectResultModel getFailedResultModel(String code, String message)
	{
		MultipleObjectResultModel multipleObjectResultModel=getResultModel(null, code, message, false);
		return multipleObjectResultModel;
	}
	
	public static MultipleObjectResultModel getFailedResultModel(Object id,String code, String message)
	{
		MultipleObjectResultModel multipleObjectResultModel=getResultModel(id, code, message, false);
		
		
		return multipleObjectResultModel;
	}
	
	public static MultipleObjectResultModel getSuccessResultModel(Object id)
	{
		MultipleObjectResultModel multipleObjectResultModel=getResultModel(id, "200","success",true);		
		return multipleObjectResultModel;
	}
	public static MultipleObjectResultModel getSuccessResultModelMore(Object id, String code, String message)
	{
		return getResultModel(id, code, message, true);
	}
	
	public static MultipleObjectResultModel getResultModel(Object id,String code, String message, Boolean isSuccess)
	{
		return new MultipleObjectResultModel(id, code, message, isSuccess);
	}

	public Object getId()
	{
		return id;
	}

	public void setId(Object id)
	{
		this.id = id;
	}
	
	
	

	
}

/*
*$Log: av-env.bat,v $
*/