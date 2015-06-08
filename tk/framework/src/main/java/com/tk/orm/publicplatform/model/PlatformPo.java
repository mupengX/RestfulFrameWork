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
 *  File: Platform.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  公共平台基本信息表
 * 
 *  Notes:
 *  $Id: Platform.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platform")
public class PlatformPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	
	private String id;	//主键
	
	private Integer year;	//年份
	
	private String reportDept;	//填报机构
	
	private String name;	//名称
	
	private String buildStatus;	//建设情况
	
	private String manageDeptFullName;	//管理机构全称
	
	private String manageDeptType;	//管理机构性质
	
	private String manageDeptAddress;	//管理机构详细地址
	
	private String manageDeptPhone;	//管理机构联系电话
	
	private String manageDeptFax;	//管理机构传真
	
	private String manageDeptMail;	///管理机构邮件
	
	private String operationalDeptFullName;	//运维机构全称
	
	private String operationalDeptType;	//运维机构性质
	
	private Integer operationalDeptPersons;	//运维机构人数
	
	private String operationalDeptManner;	//运维机构方式
	
	private String operationalDeptPhone;	//运维机构电话
	
	private String operationalDeptFax;	//运维机构传真
	
	private String operationalDeptMail;	//运维机构电子邮件
	
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
	
	public PlatformPo() 
	{
		super();
	}

	public PlatformPo(String id, Integer year, String reportDept, String name, String buildStatus,
			String manageDeptFullName, String manageDeptType, String manageDeptAddress, String manageDeptPhone,
			String manageDeptFax, String manageDeptMail, String operationalDeptFullName, String operationalDeptType,
			Integer operationalDeptPersons, String operationalDeptManner, String operationalDeptPhone,
			String operationalDeptFax, String operationalDeptMail, String agencyCode, String recStatus, String order,
			String lockStatus, Date lockDate, String lockUserID, String createBy, Date createDate, String lastEditBy,
			Date lastEditDate, String remarks, String extends1, String extends2, String extends3)
	{
		super();
		this.id = id;
		this.year = year;
		this.reportDept = reportDept;
		this.name = name;
		this.buildStatus = buildStatus;
		this.manageDeptFullName = manageDeptFullName;
		this.manageDeptType = manageDeptType;
		this.manageDeptAddress = manageDeptAddress;
		this.manageDeptPhone = manageDeptPhone;
		this.manageDeptFax = manageDeptFax;
		this.manageDeptMail = manageDeptMail;
		this.operationalDeptFullName = operationalDeptFullName;
		this.operationalDeptType = operationalDeptType;
		this.operationalDeptPersons = operationalDeptPersons;
		this.operationalDeptManner = operationalDeptManner;
		this.operationalDeptPhone = operationalDeptPhone;
		this.operationalDeptFax = operationalDeptFax;
		this.operationalDeptMail = operationalDeptMail;
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
	
	@Column(name = "SP_Year")
	public Integer getYear()
	{
		return year;
	}
	
	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SP_ReportDept", length = 64)
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SP_Name", length = 255)
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "SP_BuildStatus", length = 1)
	public String getBuildStatus()
	{
		return buildStatus;
	}

	public void setBuildStatus(String buildStatus)
	{
		this.buildStatus = buildStatus;
	}

	@Column(name = "SP_ManageDeptFullName", length = 255)
	public String getManageDeptFullName()
	{
		return manageDeptFullName;
	}

	public void setManageDeptFullName(String manageDeptFullName)
	{
		this.manageDeptFullName = manageDeptFullName;
	}
	
	@Column(name = "SP_ManageDeptType", length = 1)
	public String getManageDeptType()
	{
		return manageDeptType;
	}

	public void setManageDeptType(String manageDeptType)
	{
		this.manageDeptType = manageDeptType;
	}
	
	@Column(name = "SP_ManageDeptAddress", length = 255)
	public String getManageDeptAddress()
	{
		return manageDeptAddress;
	}

	public void setManageDeptAddress(String manageDeptAddress)
	{
		this.manageDeptAddress = manageDeptAddress;
	}
	
	@Column(name = "SP_ManageDeptPhone", length = 255)
	public String getManageDeptPhone()
	{
		return manageDeptPhone;
	}

	public void setManageDeptPhone(String manageDeptPhone)
	{
		this.manageDeptPhone = manageDeptPhone;
	}
	
	@Column(name = "SP_ManageDeptFax", length = 255)
	public String getManageDeptFax()
	{
		return manageDeptFax;
	}

	public void setManageDeptFax(String manageDeptFax)
	{
		this.manageDeptFax = manageDeptFax;
	}
	
	@Column(name = "SP_ManageDeptMail", length = 255)
	public String getManageDeptMail()
	{
		return manageDeptMail;
	}

	public void setManageDeptMail(String manageDeptMail)
	{
		this.manageDeptMail = manageDeptMail;
	}
	
	@Column(name = "SP_OperationalDeptFullName", length = 255)
	public String getOperationalDeptFullName()
	{
		return operationalDeptFullName;
	}

	public void setOperationalDeptFullName(String operationalDeptFullName)
	{
		this.operationalDeptFullName = operationalDeptFullName;
	}
	
	@Column(name = "SP_OperationalDeptType", length = 1)
	public String getOperationalDeptType()
	{
		return operationalDeptType;
	}

	public void setOperationalDeptType(String operationalDeptType)
	{
		this.operationalDeptType = operationalDeptType;
	}
	
	@Column(name = "SP_OperationalDeptPersons")
	public Integer getOperationalDeptPersons()
	{
		return operationalDeptPersons;
	}

	public void setOperationalDeptPersons(Integer operationalDeptPersons)
	{
		this.operationalDeptPersons = operationalDeptPersons;
	}

	@Column(name = "SP_OperationalDeptManner", length = 1)
	public String getOperationalDeptManner()
	{
		return operationalDeptManner;
	}

	public void setOperationalDeptManner(String operationalDeptManner)
	{
		this.operationalDeptManner = operationalDeptManner;
	}
	
	@Column(name = "SP_OperationalDeptPhone", length = 255)
	public String getOperationalDeptPhone()
	{
		return operationalDeptPhone;
	}

	public void setOperationalDeptPhone(String operationalDeptPhone)
	{
		this.operationalDeptPhone = operationalDeptPhone;
	}
	
	@Column(name = "SP_OperationalDeptFax", length = 255)
	public String getOperationalDeptFax()
	{
		return operationalDeptFax;
	}

	public void setOperationalDeptFax(String operationalDeptFax)
	{
		this.operationalDeptFax = operationalDeptFax;
	}
	
	@Column(name = "SP_OperationalDeptMail", length = 255)
	public String getOperationalDeptMail()
	{
		return operationalDeptMail;
	}

	public void setOperationalDeptMail(String operationalDeptMail)
	{
		this.operationalDeptMail = operationalDeptMail;
	}

	@Column(name = "SP_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SP_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}
	
	@Column(name = "SP_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SP_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SP_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SP_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SP_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SP_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Column(name = "SP_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SP_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}
	
	@Column(name = "SP_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SP_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SP_Extend2")
	public String getExtends2()
	{
		return extends2;
	}
	
	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SP_Extend3")
	public String getExtends3()
	{
		return extends3;
	}

	public void setExtends3(String extends3)
	{
		this.extends3 = extends3;
	}
}

/*
*$Log: av-env.bat,v $
*/