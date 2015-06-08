package com.tk.framework.model;

import java.util.Date;


/**
 * <pre> 
 *  
 *  File: BaseModel.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 基础实体类
 *  TODO
 * 
 *  Notes:
 *  $Id: BaseModel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:19:31>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class BaseModel
{
	private Date recDate;

	private String recUserId;

	private String recStatus;

	public Date getRecDate()
	{
		return recDate;
	}

	public void setRecDate(final Date recDate)
	{
		this.recDate = recDate;
	}

	public String getRecUserId()
	{
		return recUserId;
	}

	public void setRecUserId(String recUserId)
	{
		this.recUserId = recUserId;
	}

	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(final String recStatus)
	{
		this.recStatus = recStatus;
	}

}

/*
 * $Log: av-env.bat,v $
 */