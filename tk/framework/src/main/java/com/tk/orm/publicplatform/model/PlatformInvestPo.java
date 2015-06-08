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
 *  File: PlatformInvest.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  公共平台_投资
 * 
 *  Notes:
 *  $Id: PlatformInvest.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月18日下午5:03:24>>, <<Who>>, <<what>>  
 *  2015年5月18日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformInvest")
public class PlatformInvestPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -4023908608264997082L;
	
	private String id;	//主键
	
	private String periodType;	//时期类型
	
	private String periodValue;	//时期
	
	private String sumType;	//统计类型
	
	private BigDecimal finanical;	//本级财务
	
	private BigDecimal parentFinanical;	//上级财务
	
	private BigDecimal societyInvest;	//社会投资
	
	private BigDecimal projectBuild;	//项目建设
	
	private BigDecimal operateSercie;	//运维服务
	
	private BigDecimal netOperateService;	//网络运维服务
	
	private BigDecimal investCount;	//投资合计
	
	private String platformID;	//公共平台主键
	
	public PlatformInvestPo()
	{
		super();
	}
	
	public PlatformInvestPo(String id, String periodType, String periodValue, String sumType, BigDecimal finanical,
			BigDecimal parentFinanical, BigDecimal societyInvest, BigDecimal projectBuild, BigDecimal operateSercie,
			BigDecimal netOperateService, BigDecimal investCount, String platformID)
	{
		super();
		this.id = id;
		this.periodType = periodType;
		this.periodValue = periodValue;
		this.sumType = sumType;
		this.finanical = finanical;
		this.parentFinanical = parentFinanical;
		this.societyInvest = societyInvest;
		this.projectBuild = projectBuild;
		this.operateSercie = operateSercie;
		this.netOperateService = netOperateService;
		this.investCount = investCount;
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

	@Column(name = "SPI_PeriodType")
	public String getPeriodType()
	{
		return periodType;
	}

	public void setPeriodType(String periodType)
	{
		this.periodType = periodType;
	}
	
	@Column(name = "SPI_PeriodValue")
	public String getPeriodValue()
	{
		return periodValue;
	}

	public void setPeriodValue(String periodValue)
	{
		this.periodValue = periodValue;
	}
	
	@Column(name = "SPI_SumType")
	public String getSumType()
	{
		return sumType;
	}

	public void setSumType(String sumType)
	{
		this.sumType = sumType;
	}
	
	@Column(name = "SPI_Finanical")
	public BigDecimal getFinanical()
	{
		return finanical;
	}

	public void setFinanical(BigDecimal finanical)
	{
		this.finanical = finanical;
	}
	
	@Column(name = "SPI_ParentFinanical")
	public BigDecimal getParentFinanical()
	{
		return parentFinanical;
	}

	public void setParentFinanical(BigDecimal parentFinanical)
	{
		this.parentFinanical = parentFinanical;
	}
	
	@Column(name = "SPI_SocietyInvest")
	public BigDecimal getSocietyInvest()
	{
		return societyInvest;
	}

	public void setSocietyInvest(BigDecimal societyInvest)
	{
		this.societyInvest = societyInvest;
	}
	
	@Column(name = "SPI_ProjectBuild")
	public BigDecimal getProjectBuild()
	{
		return projectBuild;
	}

	public void setProjectBuild(BigDecimal projectBuild)
	{
		this.projectBuild = projectBuild;
	}
	
	@Column(name = "SPI_OperateSercie")
	public BigDecimal getOperateSercie()
	{
		return operateSercie;
	}

	public void setOperateSercie(BigDecimal operateSercie)
	{
		this.operateSercie = operateSercie;
	}
	
	@Column(name = "SPI_NetOperateService")
	public BigDecimal getNetOperateService()
	{
		return netOperateService;
	}

	public void setNetOperateService(BigDecimal netOperateService)
	{
		this.netOperateService = netOperateService;
	}
	
	@Column(name = "SPI_InvestCount")
	public BigDecimal getInvestCount()
	{
		return investCount;
	}

	public void setInvestCount(BigDecimal investCount)
	{
		this.investCount = investCount;
	}
	
	@Column(name = "SPI_PlatformID")
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