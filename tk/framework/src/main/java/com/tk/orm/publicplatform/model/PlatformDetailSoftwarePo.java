package com.tk.orm.publicplatform.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: PlatformDetailSoftwarePo.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  明细_软件
 * 
 *  Notes:
 *  $Id: PlatformDetailSoftwarePo.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月19日下午1:56:15>>, <<Who>>, <<what>>  
 *  2015年5月19日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformDetailSoftware")
public class PlatformDetailSoftwarePo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -6760240531867373409L;
	
	private String id;	//主键
	
	private String type;	//类型
	
	private String systemName;	//系统名称
	
	private String use;	//主要用途
	
	private BigDecimal devDate;	//研发时间
	
	private String devDept;	//研发单位
	
	private BigDecimal devOutlay;	//研发费用
	
	private Integer year;	//年份
	
	private String reportDept;	//填报机构
	
	private String networkType;	//内外网标志位
	
	private String agencyCode;	//机构编码
	
	private String recStatus;	//数据状态
	
	private String order;	//排序
	
	private String lockStatus;	//锁定状态
	
	private Date lockDate;	//锁定时间
	
	private String lockUserID;	//锁定人
	
	private String createBy;	//创建人
	
	private Date createDate;	//创建时间
	
	private String lastEditBy;	//最后修改人
	
	private Date lastEditDate;	//最后修改时间
	
	private String remarks;	//备注
	
	private String extends1;	//扩展字段1
	
	private String extends2;	//扩展字段2
	
	private String extends3;	//扩展字段3
	
	private String platformID;	//公共平台主键
	
	public PlatformDetailSoftwarePo()
	{
		super();
	}

	public PlatformDetailSoftwarePo(String id, String type, String systemName, String use, BigDecimal devDate,
			String devDept, BigDecimal devOutlay, Integer year, String reportDept, String networkType,
			String agencyCode, String recStatus, String order, String lockStatus, Date lockDate, String lockUserID,
			String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks, String extends1,
			String extends2, String extends3, String platformID)
	{
		super();
		this.id = id;
		this.type = type;
		this.systemName = systemName;
		this.use = use;
		this.devDate = devDate;
		this.devDept = devDept;
		this.devOutlay = devOutlay;
		this.year = year;
		this.reportDept = reportDept;
		this.networkType = networkType;
		this.agencyCode = agencyCode;
		this.recStatus = recStatus;
		this.order = order;
		this.lockStatus = lockStatus;
		this.lockDate = lockDate;
		this.lockUserID = lockUserID;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastEditBy = lastEditBy;
		this.lastEditDate = lastEditDate;
		this.remarks = remarks;
		this.extends1 = extends1;
		this.extends2 = extends2;
		this.extends3 = extends3;
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
	
	@Column(name = "SPDS_Type")
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
	@Column(name = "SPDS_SystemName")
	public String getSystemName()
	{
		return systemName;
	}

	public void setSystemName(String systemName)
	{
		this.systemName = systemName;
	}
	
	@Column(name = "SPDS_Use")
	public String getUse()
	{
		return use;
	}

	public void setUse(String use)
	{
		this.use = use;
	}
	
	@Column(name = "SPDS_DevDate")
	public BigDecimal getDevDate()
	{
		return devDate;
	}

	public void setDevDate(BigDecimal devDate)
	{
		this.devDate = devDate;
	}
	
	@Column(name = "SPDS_DevDept")
	public String getDevDept()
	{
		return devDept;
	}

	public void setDevDept(String devDept)
	{
		this.devDept = devDept;
	}
	
	@Column(name = "SPDS_DevOutlay")
	public BigDecimal getDevOutlay()
	{
		return devOutlay;
	}

	public void setDevOutlay(BigDecimal devOutlay)
	{
		this.devOutlay = devOutlay;
	}
	
	@Column(name = "SPDS_Year")
	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SPDS_ReportDept")
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SPDS_NetworkType")
	public String getNetworkType()
	{
		return networkType;
	}

	public void setNetworkType(String networkType)
	{
		this.networkType = networkType;
	}
	
	@Column(name = "SPDS_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SPDS_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}
	
	@Column(name = "SPDS_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SPDS_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDS_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SPDS_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SPDS_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDS_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Column(name = "SPDS_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDS_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}
	
	@Column(name = "SPDS_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SPDS_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SPDS_Extend2")
	public String getExtends2()
	{
		return extends2;
	}

	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SPDS_Extend3")
	public String getExtends3()
	{
		return extends3;
	}

	public void setExtends3(String extends3)
	{
		this.extends3 = extends3;
	}
	
	@Column(name = "SPDS_PlatformID")
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