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
 *  File: PlatformTotalInOutApp.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformTotalInOutApp.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月27日下午3:22:48>>, <<Who>>, <<what>>  
 *  2015年5月27日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformTotalInOutApp")
public class PlatformTotalInOutAppPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -1616637808565663716L;
	
	private String id;	//主键
	
	private String netType;	//网络平台类型
	
	private Integer govServiceCount;	//服务的单位个数
	
	private Integer govBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer govVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer govWebSiteCount;	//网站个数
	
	private Integer govDatabaseCount;	//数据库个数
	
	private Integer govDeviceCount;	//托管的设备个数
	
	private Integer govVirtualMachCount;	//虚拟机个数
	
	private Integer otherServiceCount;	//服务的单位个数
	
	private Integer otherBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer otherVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer otherWebSiteCount;	//网站个数
	
	private Integer otherDatabaseCount;	//数据库个数
	
	private Integer otherDeviceCount;	//托管的设备个数
	
	private Integer otherVirtualMachCount;	//虚拟机个数
	
	private Integer totalServiceCount;	//服务的单位个数
	
	private Integer totalBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer totalVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer totalWebSiteCount;	//网站个数
	
	private Integer totalDatabaseCount;	//数据库个数
	
	private Integer totalDeviceCount;	//托管的设备个数
	
	private Integer totalVirtualMachCount;	//虚拟机个数
	
	private Integer year;	//年份
	
	private String reportDept;	//填报机构
	
	private String sumObj;	//汇总对象
	
	private String inOutNetFlg;	//内外网标志位
	
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
	
	public PlatformTotalInOutAppPo()
	{
	}
	
	
	
	public PlatformTotalInOutAppPo(String id, String netType, Integer govServiceCount, Integer govBusSysCount,
			Integer govVirtualBusSysCount, Integer govWebSiteCount, Integer govDatabaseCount, Integer govDeviceCount,
			Integer govVirtualMachCount, Integer otherServiceCount, Integer otherBusSysCount,
			Integer otherVirtualBusSysCount, Integer otherWebSiteCount, Integer otherDatabaseCount,
			Integer otherDeviceCount, Integer otherVirtualMachCount, Integer totalServiceCount,
			Integer totalBusSysCount, Integer totalVirtualBusSysCount, Integer totalWebSiteCount,
			Integer totalDatabaseCount, Integer totalDeviceCount, Integer totalVirtualMachCount, Integer year,
			String reportDept, String sumObj, String inOutNetFlg, String agencyCode, String recStatus, String order,
			String lockStatus, Date lockDate, String lockUserID, String createBy, Date createDate, String lastEditBy,
			Date lastEditDate, String remarks, String extends1, String extends2, String extends3)
	{
		super();
		this.id = id;
		this.netType = netType;
		this.govServiceCount = govServiceCount;
		this.govBusSysCount = govBusSysCount;
		this.govVirtualBusSysCount = govVirtualBusSysCount;
		this.govWebSiteCount = govWebSiteCount;
		this.govDatabaseCount = govDatabaseCount;
		this.govDeviceCount = govDeviceCount;
		this.govVirtualMachCount = govVirtualMachCount;
		this.otherServiceCount = otherServiceCount;
		this.otherBusSysCount = otherBusSysCount;
		this.otherVirtualBusSysCount = otherVirtualBusSysCount;
		this.otherWebSiteCount = otherWebSiteCount;
		this.otherDatabaseCount = otherDatabaseCount;
		this.otherDeviceCount = otherDeviceCount;
		this.otherVirtualMachCount = otherVirtualMachCount;
		this.totalServiceCount = totalServiceCount;
		this.totalBusSysCount = totalBusSysCount;
		this.totalVirtualBusSysCount = totalVirtualBusSysCount;
		this.totalWebSiteCount = totalWebSiteCount;
		this.totalDatabaseCount = totalDatabaseCount;
		this.totalDeviceCount = totalDeviceCount;
		this.totalVirtualMachCount = totalVirtualMachCount;
		this.year = year;
		this.reportDept = reportDept;
		this.sumObj = sumObj;
		this.inOutNetFlg = inOutNetFlg;
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
	
	@Column(name = "SPTIOA_NetType")
	public String getNetType()
	{
		return netType;
	}

	public void setNetType(String netType)
	{
		this.netType = netType;
	}
	
	@Column(name = "SPTIOA_GovServiceCount")
	public Integer getGovServiceCount()
	{
		return govServiceCount;
	}

	public void setGovServiceCount(Integer govServiceCount)
	{
		this.govServiceCount = govServiceCount;
	}

	@Column(name = "SPTIOA_GovBusSysCount")
	public Integer getGovBusSysCount()
	{
		return govBusSysCount;
	}



	public void setGovBusSysCount(Integer govBusSysCount)
	{
		this.govBusSysCount = govBusSysCount;
	}


	@Column(name = "SPTIOA_GovVirtualBusSysCount")
	public Integer getGovVirtualBusSysCount()
	{
		return govVirtualBusSysCount;
	}

	public void setGovVirtualBusSysCount(Integer govVirtualBusSysCount)
	{
		this.govVirtualBusSysCount = govVirtualBusSysCount;
	}

	@Column(name = "SPTIOA_GovWebsiteCount")
	public Integer getGovWebSiteCount()
	{
		return govWebSiteCount;
	}

	public void setGovWebSiteCount(Integer govWebSiteCount)
	{
		this.govWebSiteCount = govWebSiteCount;
	}
	
	@Column(name = "SPTIOA_GovDatabaseCount")
	public Integer getGovDatabaseCount()
	{
		return govDatabaseCount;
	}

	public void setGovDatabaseCount(Integer govDatabaseCount)
	{
		this.govDatabaseCount = govDatabaseCount;
	}

	@Column(name = "SPTIOA_GovDeviceCount")
	public Integer getGovDeviceCount()
	{
		return govDeviceCount;
	}

	public void setGovDeviceCount(Integer govDeviceCount)
	{
		this.govDeviceCount = govDeviceCount;
	}

	@Column(name = "SPTIOA_GovVirtualMachCount")
	public Integer getGovVirtualMachCount()
	{
		return govVirtualMachCount;
	}

	public void setGovVirtualMachCount(Integer govVirtualMachCount)
	{
		this.govVirtualMachCount = govVirtualMachCount;
	}

	@Column(name = "SPTIOA_OtherServiceCount")
	public Integer getOtherServiceCount()
	{
		return otherServiceCount;
	}

	public void setOtherServiceCount(Integer otherServiceCount)
	{
		this.otherServiceCount = otherServiceCount;
	}

	@Column(name = "SPTIOA_OtherBusSysCount")
	public Integer getOtherBusSysCount()
	{
		return otherBusSysCount;
	}

	public void setOtherBusSysCount(Integer otherBusSysCount)
	{
		this.otherBusSysCount = otherBusSysCount;
	}

	@Column(name = "SPTIOA_OtherVirtualBusSysCount")
	public Integer getOtherVirtualBusSysCount()
	{
		return otherVirtualBusSysCount;
	}

	public void setOtherVirtualBusSysCount(Integer otherVirtualBusSysCount)
	{
		this.otherVirtualBusSysCount = otherVirtualBusSysCount;
	}
	
	@Column(name = "SPTIOA_OtherWebsiteCount")
	public Integer getOtherWebSiteCount()
	{
		return otherWebSiteCount;
	}

	public void setOtherWebSiteCount(Integer otherWebSiteCount)
	{
		this.otherWebSiteCount = otherWebSiteCount;
	}
	
	@Column(name = "SPTIOA_OtherDatabaseCount")
	public Integer getOtherDatabaseCount()
	{
		return otherDatabaseCount;
	}

	public void setOtherDatabaseCount(Integer otherDatabaseCount)
	{
		this.otherDatabaseCount = otherDatabaseCount;
	}

	@Column(name = "SPTIOA_OtherDeviceCount")
	public Integer getOtherDeviceCount()
	{
		return otherDeviceCount;
	}

	public void setOtherDeviceCount(Integer otherDeviceCount)
	{
		this.otherDeviceCount = otherDeviceCount;
	}
	
	@Column(name = "SPTIOA_OtherVirtualMachCount")
	public Integer getOtherVirtualMachCount()
	{
		return otherVirtualMachCount;
	}



	public void setOtherVirtualMachCount(Integer otherVirtualMachCount)
	{
		this.otherVirtualMachCount = otherVirtualMachCount;
	}


	@Column(name = "SPTIOA_TotalServiceCount")
	public Integer getTotalServiceCount()
	{
		return totalServiceCount;
	}



	public void setTotalServiceCount(Integer totalServiceCount)
	{
		this.totalServiceCount = totalServiceCount;
	}


	@Column(name = "SPTIOA_TotalBusSysCount")
	public Integer getTotalBusSysCount()
	{
		return totalBusSysCount;
	}



	public void setTotalBusSysCount(Integer totalBusSysCount)
	{
		this.totalBusSysCount = totalBusSysCount;
	}


	@Column(name = "SPTIOA_TotalVirtualBusSysCount")
	public Integer getTotalVirtualBusSysCount()
	{
		return totalVirtualBusSysCount;
	}



	public void setTotalVirtualBusSysCount(Integer totalVirtualBusSysCount)
	{
		this.totalVirtualBusSysCount = totalVirtualBusSysCount;
	}


	@Column(name = "SPTIOA_TotalWebsiteCount")
	public Integer getTotalWebSiteCount()
	{
		return totalWebSiteCount;
	}



	public void setTotalWebSiteCount(Integer totalWebSiteCount)
	{
		this.totalWebSiteCount = totalWebSiteCount;
	}


	@Column(name = "SPTIOA_TotalDatabaseCount")
	public Integer getTotalDatabaseCount()
	{
		return totalDatabaseCount;
	}



	public void setTotalDatabaseCount(Integer totalDatabaseCount)
	{
		this.totalDatabaseCount = totalDatabaseCount;
	}


	@Column(name = "SPTIOA_TotalDeviceCount")
	public Integer getTotalDeviceCount()
	{
		return totalDeviceCount;
	}



	public void setTotalDeviceCount(Integer totalDeviceCount)
	{
		this.totalDeviceCount = totalDeviceCount;
	}


	@Column(name = "SPTIOA_TotalVirtualMachCount")
	public Integer getTotalVirtualMachCount()
	{
		return totalVirtualMachCount;
	}



	public void setTotalVirtualMachCount(Integer totalVirtualMachCount)
	{
		this.totalVirtualMachCount = totalVirtualMachCount;
	}



	@Column(name = "SPTIOA_Year")
	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SPTIOA_ReportDept")
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SPTIOA_SumObj")
	public String getSumObj()
	{
		return sumObj;
	}

	public void setSumObj(String sumObj)
	{
		this.sumObj = sumObj;
	}
	
	@Column(name = "SPTIOA_InOutNetFlag")
	public String getInOutNetFlg()
	{
		return inOutNetFlg;
	}

	public void setInOutNetFlg(String inOutNetFlg)
	{
		this.inOutNetFlg = inOutNetFlg;
	}
	
	@Column(name = "SPTIOA_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SPTIOA_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}
	
	@Column(name = "SPTIOA_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SPTIOA_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTIOA_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SPTIOA_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SPTIOA_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTIOA_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Column(name = "SPTIOA_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTIOA_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SPTIOA_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SPTIOA_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SPTIOA_Extend2")
	public String getExtends2()
	{
		return extends2;
	}

	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SPTIOA_Extend3")
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