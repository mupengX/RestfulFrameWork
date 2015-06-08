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
 *  File: PlatformTotalSoftware.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformTotalSoftware.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月27日下午3:22:24>>, <<Who>>, <<what>>  
 *  2015年5月27日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformTotalSoftware")
public class PlatformTotalSoftwarePo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 6287749594453370081L;
	
	private String id;	//主键
	
	private String classID;	//分类ID
	
	private String className;	//分类名称
	
	private Integer buyCount;	//实际购置套数
	
	private Integer newBuyCount;	//新购置套数
	
	private BigDecimal newBuyMoney;	//新购置金额
	
	private Integer businessSystemCount;	//支撑的业务系统个数
	
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
	
	public PlatformTotalSoftwarePo()
	{
	}

	public PlatformTotalSoftwarePo(String id, String classID, String className, Integer buyCount, Integer newBuyCount,
			BigDecimal newBuyMoney, Integer businessSystemCount, Integer year, String reportDept, String sumObj,
			String inOutNetFlg, String agencyCode, String recStatus, String order, String lockStatus, Date lockDate,
			String lockUserID, String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks,
			String extends1, String extends2, String extends3)
	{
		super();
		this.id = id;
		this.classID = classID;
		this.className = className;
		this.buyCount = buyCount;
		this.newBuyCount = newBuyCount;
		this.newBuyMoney = newBuyMoney;
		this.businessSystemCount = businessSystemCount;
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
	
	@Column(name = "SPTS_ClassID")
	public String getClassID()
	{
		return classID;
	}

	public void setClassID(String classID)
	{
		this.classID = classID;
	}
	
	@Column(name = "SPTS_ClassName")
	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}
	
	@Column(name = "SPTS_BuyCount")
	public Integer getBuyCount()
	{
		return buyCount;
	}

	public void setBuyCount(Integer buyCount)
	{
		this.buyCount = buyCount;
	}
	
	@Column(name = "SPTS_NewBuyCount")
	public Integer getNewBuyCount()
	{
		return newBuyCount;
	}

	public void setNewBuyCount(Integer newBuyCount)
	{
		this.newBuyCount = newBuyCount;
	}
	
	@Column(name = "SPTS_NewBuyMoney")
	public BigDecimal getNewBuyMoney()
	{
		return newBuyMoney;
	}

	public void setNewBuyMoney(BigDecimal newBuyMoney)
	{
		this.newBuyMoney = newBuyMoney;
	}
	
	@Column(name = "SPTS_BusinessSystemCount")
	public Integer getBusinessSystemCount()
	{
		return businessSystemCount;
	}

	public void setBusinessSystemCount(Integer businessSystemCount)
	{
		this.businessSystemCount = businessSystemCount;
	}
	
	@Column(name = "SPTS_Year")
	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SPTS_ReportDept")
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SPTS_SumObj")
	public String getSumObj()
	{
		return sumObj;
	}

	public void setSumObj(String sumObj)
	{
		this.sumObj = sumObj;
	}
	
	@Column(name = "SPTS_InOutNetFlag")
	public String getInOutNetFlg()
	{
		return inOutNetFlg;
	}

	public void setInOutNetFlg(String inOutNetFlg)
	{
		this.inOutNetFlg = inOutNetFlg;
	}
	
	@Column(name = "SPTS_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SPTS_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SPTS_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SPTS_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTS_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SPTS_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SPTS_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTS_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SPTS_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTS_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}
	
	@Column(name = "SPTS_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SPTS_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SPTS_Extend2")
	public String getExtends2()
	{
		return extends2;
	}

	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SPTS_Extend3")
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