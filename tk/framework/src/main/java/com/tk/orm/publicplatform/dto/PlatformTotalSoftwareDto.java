package com.tk.orm.publicplatform.dto;

import java.io.Serializable;

import com.tk.orm.user.dto.SysDataTypeDto;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * <pre> 
 *  
 *  File: PlatformTotalSoftwareDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformTotalSoftwareDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月29日上午9:41:52>>, <<Who>>, <<what>>  
 *  2015年5月29日		cy		Initial.
 * </pre>
 */
@ApiModel
public class PlatformTotalSoftwareDto implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -5848488675048209910L;

	private String id;	//主键
	
	private String code;	//设备分类
	
	private String className;	//分类名称
	
	private Integer buyCount;	//实际购置套数
	
	private Integer newBuyCount;	//新购置套数
	
	private String newBuyMoney;	//新购置金额
	
	private Integer businessSystemCount;	//支撑的业务系统个数
	
	public PlatformTotalSoftwareDto()
	{
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public Integer getBuyCount()
	{
		return buyCount;
	}

	public void setBuyCount(Integer buyCount)
	{
		this.buyCount = buyCount;
	}

	public Integer getNewBuyCount()
	{
		return newBuyCount;
	}

	public void setNewBuyCount(Integer newBuyCount)
	{
		this.newBuyCount = newBuyCount;
	}

	public String getNewBuyMoney()
	{
		return newBuyMoney;
	}

	public void setNewBuyMoney(String newBuyMoney)
	{
		this.newBuyMoney = newBuyMoney;
	}

	public Integer getBusinessSystemCount()
	{
		return businessSystemCount;
	}

	public void setBusinessSystemCount(Integer businessSystemCount)
	{
		this.businessSystemCount = businessSystemCount;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}
	
}

/*
*$Log: av-env.bat,v $
*/