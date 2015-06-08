package com.tk.orm.publicplatform.dto;

import java.io.Serializable;

import com.tk.orm.user.dto.SysDataTypeDto;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * <pre> 
 *  
 *  File: PlatformTotalHardwareDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 * 
 *  Notes:
 *  $Id: PlatformTotalHardwareDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月29日上午8:55:20>>, <<Who>>, <<what>>  
 *  2015年5月29日		cy		Initial.
 * </pre>
 */
@ApiModel
public class PlatformTotalHardwareDto implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 6389210000255064552L;

	private String id;	//主键
	
	private String code;	//设备分类
	
	private String className;	//设备分类名称
	
	private Integer chinaBrandCount;	//实际国产品牌数
	
	private Integer foreignBrandCount;	//实际非国产品牌数
	
	private Integer machineTotalCount;	//实际合计台数
	
	private Integer yearChinaCount;	//本年购置的国产品牌数
	
	private String yearChinaMoney;	//本年购置国产品牌金额
	
	private Integer yearForeignCount;	//本年购置的非国产品牌数
	
	private String yearForeignMoney;	//本年购置的非国产品牌金额
	
	public PlatformTotalHardwareDto()
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

	public Integer getChinaBrandCount()
	{
		return chinaBrandCount;
	}

	public void setChinaBrandCount(Integer chinaBrandCount)
	{
		this.chinaBrandCount = chinaBrandCount;
	}

	public Integer getForeignBrandCount()
	{
		return foreignBrandCount;
	}

	public void setForeignBrandCount(Integer foreignBrandCount)
	{
		this.foreignBrandCount = foreignBrandCount;
	}

	public Integer getMachineTotalCount()
	{
		return machineTotalCount;
	}

	public void setMachineTotalCount(Integer machineTotalCount)
	{
		this.machineTotalCount = machineTotalCount;
	}

	public Integer getYearChinaCount()
	{
		return yearChinaCount;
	}

	public void setYearChinaCount(Integer yearChinaCount)
	{
		this.yearChinaCount = yearChinaCount;
	}

	public String getYearChinaMoney()
	{
		return yearChinaMoney;
	}

	public void setYearChinaMoney(String yearChinaMoney)
	{
		this.yearChinaMoney = yearChinaMoney;
	}

	public Integer getYearForeignCount()
	{
		return yearForeignCount;
	}

	public void setYearForeignCount(Integer yearForeignCount)
	{
		this.yearForeignCount = yearForeignCount;
	}

	public String getYearForeignMoney()
	{
		return yearForeignMoney;
	}

	public void setYearForeignMoney(String yearForeignMoney)
	{
		this.yearForeignMoney = yearForeignMoney;
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