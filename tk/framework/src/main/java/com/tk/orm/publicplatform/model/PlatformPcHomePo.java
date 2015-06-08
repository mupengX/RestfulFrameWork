package com.tk.orm.publicplatform.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: PlatformTotalPcHomePo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  公共平台_机房
 * 
 *  Notes:
 *  $Id: PlatformTotalPcHomePo.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午7:26:20>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformPcHome")
public class PlatformPcHomePo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -644305476836421740L;
	
	private String id;	//主键
	
	private String useArea;	//合计使用面积
	
	private String shieldArea;	//屏蔽机房使用面积
	
	private String sumCabinet;	//合计机柜
	
	private String outCabinet;	//外网机柜
	
	private String inCabinet;	//内网机柜
	
	private String shieldCabinet;	//屏蔽机柜
	
	private String platformID;	//汇总主表主键

	public PlatformPcHomePo()
	{
		super();
	}

	public PlatformPcHomePo(String id, String useArea, String shieldArea, String sumCabinet, String outCabinet,
			String inCabinet, String shieldCabinet, String platformID)
	{
		super();
		this.id = id;
		this.useArea = useArea;
		this.shieldArea = shieldArea;
		this.sumCabinet = sumCabinet;
		this.outCabinet = outCabinet;
		this.inCabinet = inCabinet;
		this.shieldCabinet = shieldCabinet;
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
	
	@Column(name = "SPPH_UseArea", length = 255)
	public String getUseArea()
	{
		return useArea;
	}

	public void setUseArea(String useArea)
	{
		this.useArea = useArea;
	}
	
	@Column(name = "SPPH_ShieldArea", length = 255)
	public String getShieldArea()
	{
		return shieldArea;
	}

	public void setShieldArea(String shieldArea)
	{
		this.shieldArea = shieldArea;
	}
	
	@Column(name = "SPPH_SumCabinet", length = 255)
	public String getSumCabinet()
	{
		return sumCabinet;
	}

	public void setSumCabinet(String sumCabinet)
	{
		this.sumCabinet = sumCabinet;
	}
	
	@Column(name = "SPPH_OutCabinet", length = 255)
	public String getOutCabinet()
	{
		return outCabinet;
	}

	public void setOutCabinet(String outCabinet)
	{
		this.outCabinet = outCabinet;
	}
	
	@Column(name = "SPPH_InCabinet", length = 255)
	public String getInCabinet()
	{
		return inCabinet;
	}

	public void setInCabinet(String inCabinet)
	{
		this.inCabinet = inCabinet;
	}
	
	@Column(name = "SPPH_ShieldCabinet", length = 255)
	public String getShieldCabinet()
	{
		return shieldCabinet;
	}

	public void setShieldCabinet(String shieldCabinet)
	{
		this.shieldCabinet = shieldCabinet;
	}
	
	@Column(name = "SPPH_PlatformID", length = 64)
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