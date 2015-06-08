package com.tk.orm.publicplatform.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: PlatformTotalPropertyPo.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  公共平台_资产
 * 
 *  Notes:
 *  $Id: PlatformTotalPropertyPo.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午7:15:45>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformProperty")
public class PlatformPropertyPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -5595078700270996628L;
	
	private String id;	//主键
	
	private BigDecimal totalCount;	//目前总资产
	
	private BigDecimal hardwareProperty;	//目前硬件资产
	
	private BigDecimal softwareProperty;	//目前应用软件资产
	
	private BigDecimal systemProperty;	//目前系统软件资产
	
	private BigDecimal otherProperty;	//其他资产
	
	private String platformID;	//汇总主表主键
	
	public PlatformPropertyPo()
	{
		super();
	}

	public PlatformPropertyPo(String id, BigDecimal totalCount, BigDecimal hardwareProperty,
			BigDecimal softwareProperty, BigDecimal systemProperty, BigDecimal otherProperty, String platformID)
	{
		super();
		this.id = id;
		this.totalCount = totalCount;
		this.hardwareProperty = hardwareProperty;
		this.softwareProperty = softwareProperty;
		this.systemProperty = systemProperty;
		this.otherProperty = otherProperty;
		this.platformID = platformID;
	}
	
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
	
	@Column(name = "SPP_TotalCount")
	public BigDecimal getTotalCount()
	{
		return totalCount;
	}

	public void setTotalCount(BigDecimal totalCount)
	{
		this.totalCount = totalCount;
	}
	
	@Column(name = "SPP_HardwareProperty")
	public BigDecimal getHardwareProperty()
	{
		return hardwareProperty;
	}

	public void setHardwareProperty(BigDecimal hardwareProperty)
	{
		this.hardwareProperty = hardwareProperty;
	}
	
	@Column(name = "SPP_SoftwareProperty")
	public BigDecimal getSoftwareProperty()
	{
		return softwareProperty;
	}

	public void setSoftwareProperty(BigDecimal softwareProperty)
	{
		this.softwareProperty = softwareProperty;
	}
	
	@Column(name = "SPP_SystemProperty")
	public BigDecimal getSystemProperty()
	{
		return systemProperty;
	}

	public void setSystemProperty(BigDecimal systemProperty)
	{
		this.systemProperty = systemProperty;
	}
	
	@Column(name = "SPP_OtherProperty")
	public BigDecimal getOtherProperty()
	{
		return otherProperty;
	}

	public void setOtherProperty(BigDecimal otherProperty)
	{
		this.otherProperty = otherProperty;
	}
	
	@Column(name = "SPP_PlatformID", length = 64)
	public String getPlatformID()
	{
		return platformID;
	}

	public void setPlatformID(String platformID)
	{
		this.platformID = platformID;
	}
	
}

/*
*$Log: av-env.bat,v $
*/