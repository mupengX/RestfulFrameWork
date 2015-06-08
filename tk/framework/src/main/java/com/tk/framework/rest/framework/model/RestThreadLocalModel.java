package com.tk.framework.rest.framework.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * <pre> 
 *  
 *  File: RestThreadLocalModel.java
 *  
 *  Copyright (C): 2014
 *  Description: REST线程数据基础类
 *  TODO
 * 
 *  Notes:
 *  $Id: RestThreadLocalModel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:32:52>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class RestThreadLocalModel implements Serializable
{
	/** Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;. */
	private static final long serialVersionUID = -6237296664652045754L;

	/** The version. */
	private int version;
	
	private String agencyCode;

	private String traceId;

	private String excutedUserId;
	
	private String ip;
	
	private Map<RestENVtEntityType, Object> paraMap = new HashMap<RestENVtEntityType, Object>();
	
	private String userName;
	
	private String userID;
	
	
	
	
	public String getIp()
	{
		return ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserID()
	{
		return userID;
	}

	public void setUserUUID(String userID)
	{
		this.userID = userID;
	}

	public String getExcutedUserId()
	{
		return excutedUserId;
	}

	public void setExcutedUserId(String excutedUserId)
	{
		this.excutedUserId = excutedUserId;
	}

	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	public String getTraceId()
	{
		return traceId;
	}

	public void setTraceId(String traceId)
	{
		this.traceId = traceId;
	}

	

	/**
	 * Gets the version.
	 * 
	 * @return the version
	 */
	public int getVersion()
	{
		return version;
	}

	/**
	 * 
	 * setAttribute.
	 *
	 * @param key
	 * @param value
	 */
	public void setAttribute(RestENVtEntityType key, Object value)
	{
		paraMap.put(key, value);
	}

	/**
	 * 
	 * getAttribute.
	 *
	 * @param key
	 * @return value
	 */
	public Object getAttribute(RestENVtEntityType key)
	{
		return paraMap.get(key);
	}

	/**
	 * Sets the version.
	 * 
	 * @param version the version to set
	 */
	public void setVersion(int version)
	{
		this.version = version;
	}

	/**
	 * Reset all value.
	 */
	public void clean()
	{
		this.version = 1;
		this.paraMap.clear();
		this.traceId = null;
		this.agencyCode = null;

	}
}
