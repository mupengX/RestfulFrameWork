package com.tk.orm.publicplatform.model;

import java.io.Serializable;
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
 *  File: PlatformDetailAppSystemPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailAppSystemPo.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月20日下午3:44:26>>, <<Who>>, <<what>>  
 *  2015年5月20日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformDetailAppSystem")
public class PlatformDetailAppSystemPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -7842851048496834964L;
	
	private String id;	//主键
	
	private String type;	//类型
	
	private String userDept;	//用户单位
	
	private String websiteName;	//网站名称
	
	private String domain;	//域名
	
	private String extranetIp;	//公网IP地址
	
	private String icp;	//icp备案
	
	private String dbName;	//数据库名称
	
	private String use;	//主要用途
	
	private String deployWary;	//部署方式
	
	private String protectionLevel;	//等保级别
	
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

	public PlatformDetailAppSystemPo()
	{
		super();
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
	
	@Column(name = "SPDAS_Type")
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Column(name = "SPDAS_UserDept")
	public String getUserDept()
	{
		return userDept;
	}

	public void setUserDept(String userDept)
	{
		this.userDept = userDept;
	}
	
	@Column(name = "SPDAS_WebsiteName")
	public String getWebsiteName()
	{
		return websiteName;
	}

	public void setWebsiteName(String websiteName)
	{
		this.websiteName = websiteName;
	}
	
	@Column(name = "SPDAS_Domain")
	public String getDomain()
	{
		return domain;
	}

	public void setDomain(String domain)
	{
		this.domain = domain;
	}
	
	@Column(name = "SPDAS_ExtranetIP")
	public String getExtranetIp()
	{
		return extranetIp;
	}

	public void setExtranetIp(String extranetIp)
	{
		this.extranetIp = extranetIp;
	}
	
	@Column(name = "SPDAS_ICP")
	public String getIcp()
	{
		return icp;
	}

	public void setIcp(String icp)
	{
		this.icp = icp;
	}
	
	@Column(name = "SPDAS_DBName")
	public String getDbName()
	{
		return dbName;
	}

	public void setDbName(String dbName)
	{
		this.dbName = dbName;
	}
	
	@Column(name = "SPDAS_Use")
	public String getUse()
	{
		return use;
	}

	public void setUse(String use)
	{
		this.use = use;
	}
	
	@Column(name = "SPDAS_DeployWay")
	public String getDeployWary()
	{
		return deployWary;
	}

	public void setDeployWary(String deployWary)
	{
		this.deployWary = deployWary;
	}
	
	@Column(name = "SPDAS_ProtectionLevel")
	public String getProtectionLevel()
	{
		return protectionLevel;
	}

	public void setProtectionLevel(String protectionLevel)
	{
		this.protectionLevel = protectionLevel;
	}

	@Column(name = "SPDAS_Year")
	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SPDAS_ReportDept")
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SPDAS_NetworkType")
	public String getNetworkType()
	{
		return networkType;
	}

	public void setNetworkType(String networkType)
	{
		this.networkType = networkType;
	}
	
	@Column(name = "SPDAS_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SPDAS_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}
	
	@Column(name = "SPDAS_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SPDAS_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDAS_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SPDAS_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SPDAS_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDAS_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Column(name = "SPDAS_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}
	
	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPDAS_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}
	
	@Column(name = "SPDAS_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SPDAS_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SPDAS_Extend2")
	public String getExtends2()
	{
		return extends2;
	}

	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SPDAS_Extend3")
	public String getExtends3()
	{
		return extends3;
	}

	public void setExtends3(String extends3)
	{
		this.extends3 = extends3;
	}
	
	@Column(name = "SPDAS_PlatformID")
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