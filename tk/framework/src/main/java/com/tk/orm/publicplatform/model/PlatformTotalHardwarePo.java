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
 *  File: PlatformTotalHardware.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformTotalHardware.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月27日下午3:22:05>>, <<Who>>, <<what>>  
 *  2015年5月27日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformTotalHardware")
public class PlatformTotalHardwarePo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 1389867160728496056L;
	
	private String id;	//主键
	
	private String classID;	//设备分类ID
	
	private String className;	//设备分类名称
	
	private Integer chinaBrandCount;	//实际国产品牌数
	
	private Integer foreignBrandCount;	//实际非国产品牌数
	
	private Integer machineTotalCount;	//实际合计台数
	
	private Integer yearChinaCount;	//本年购置的国产品牌数
	
	private BigDecimal yearChinaMoney;	//本年购置国产品牌金额
	
	private Integer yearForeignCount;	//本年购置的非国产品牌数
	
	private BigDecimal yearForeignMoney;	//本年购置的非国产品牌金额
	
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
	
	public PlatformTotalHardwarePo()
	{
	}

	public PlatformTotalHardwarePo(String id, String classID, String className, Integer chinaBrandCount,
			Integer foreignBrandCount, Integer machineTotalCount, Integer yearChinaCount, BigDecimal yearChinaMoney,
			Integer yearForeignCount, BigDecimal yearForeignMoney, Integer year, String reportDept, String sumObj,
			String inOutNetFlg, String agencyCode, String recStatus, String order, String lockStatus, Date lockDate,
			String lockUserID, String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks,
			String extends1, String extends2, String extends3)
	{
		super();
		this.id = id;
		this.classID = classID;
		this.className = className;
		this.chinaBrandCount = chinaBrandCount;
		this.foreignBrandCount = foreignBrandCount;
		this.machineTotalCount = machineTotalCount;
		this.yearChinaCount = yearChinaCount;
		this.yearChinaMoney = yearChinaMoney;
		this.yearForeignCount = yearForeignCount;
		this.yearForeignMoney = yearForeignMoney;
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

	@Column(name = "SPTH_ClassID")
	public String getClassID()
	{
		return classID;
	}

	public void setClassID(String classID)
	{
		this.classID = classID;
	}
	
	@Column(name = "SPTH_ClassName")
	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}
	
	@Column(name = "SPTH_ChinaBrandCount")
	public Integer getChinaBrandCount()
	{
		return chinaBrandCount;
	}

	public void setChinaBrandCount(Integer chinaBrandCount)
	{
		this.chinaBrandCount = chinaBrandCount;
	}
	
	@Column(name = "SPTH_ForeignBrandCount")
	public Integer getForeignBrandCount()
	{
		return foreignBrandCount;
	}

	public void setForeignBrandCount(Integer foreignBrandCount)
	{
		this.foreignBrandCount = foreignBrandCount;
	}
	
	@Column(name = "SPTH_MachineTotalCount")
	public Integer getMachineTotalCount()
	{
		return machineTotalCount;
	}

	public void setMachineTotalCount(Integer machineTotalCount)
	{
		this.machineTotalCount = machineTotalCount;
	}
	
	@Column(name = "SPTH_YearChinaCount")
	public Integer getYearChinaCount()
	{
		return yearChinaCount;
	}

	public void setYearChinaCount(Integer yearChinaCount)
	{
		this.yearChinaCount = yearChinaCount;
	}
	
	@Column(name = "SPTH_YearChinaMoney")
	public BigDecimal getYearChinaMoney()
	{
		return yearChinaMoney;
	}

	public void setYearChinaMoney(BigDecimal yearChinaMoney)
	{
		this.yearChinaMoney = yearChinaMoney;
	}
	
	@Column(name = "SPTH_YearForeignCount")
	public Integer getYearForeignCount()
	{
		return yearForeignCount;
	}

	public void setYearForeignCount(Integer yearForeignCount)
	{
		this.yearForeignCount = yearForeignCount;
	}
	
	@Column(name = "SPTH_YearForeignMoney")
	public BigDecimal getYearForeignMoney()
	{
		return yearForeignMoney;
	}

	public void setYearForeignMoney(BigDecimal yearForeignMoney)
	{
		this.yearForeignMoney = yearForeignMoney;
	}
	
	@Column(name = "SPTH_Year")
	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}
	
	@Column(name = "SPTH_ReportDept")
	public String getReportDept()
	{
		return reportDept;
	}

	public void setReportDept(String reportDept)
	{
		this.reportDept = reportDept;
	}
	
	@Column(name = "SPTH_SumObj")
	public String getSumObj()
	{
		return sumObj;
	}

	public void setSumObj(String sumObj)
	{
		this.sumObj = sumObj;
	}
	
	@Column(name = "SPTH_InOutNetFlag")
	public String getInOutNetFlg()
	{
		return inOutNetFlg;
	}

	public void setInOutNetFlg(String inOutNetFlg)
	{
		this.inOutNetFlg = inOutNetFlg;
	}
	
	@Column(name = "SPTH_AgencyCode")
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	@Column(name = "SPTH_RecStatus")
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}
	
	@Column(name = "SPTH_Order")
	public String getOrder()
	{
		return order;
	}

	public void setOrder(String order)
	{
		this.order = order;
	}
	
	@Column(name = "SPTH_LockStatus")
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTH_LockDate")
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}
	
	@Column(name = "SPTH_LockUserID")
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}
	
	@Column(name = "SPTH_CreateBy")
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTH_CreateDate")
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	
	@Column(name = "SPTH_LastEditBy")
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SPTH_LastEditDate")
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SPTH_Remarks")
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	@Column(name = "SPTH_Extend1")
	public String getExtends1()
	{
		return extends1;
	}

	public void setExtends1(String extends1)
	{
		this.extends1 = extends1;
	}
	
	@Column(name = "SPTH_Extend2")
	public String getExtends2()
	{
		return extends2;
	}

	public void setExtends2(String extends2)
	{
		this.extends2 = extends2;
	}
	
	@Column(name = "SPTH_Extend3")
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