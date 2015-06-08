package com.tk.orm.user.model;

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
 *  File: SysDataDictionaryItemPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  数据字典条目PO
 * 
 *  Notes:
 *  $Id: SysDataDictionaryItemPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月12日下午4:52:50>>, <<Who>>, <<what>>  
 *  2015年3月12日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_dataDictionaryItem")
public class SysDataDictionaryItemPo implements java.io.Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -1228977941741481986L;

	private String id; // 主键

	private String typeID; // 类型ID

	private String itemName; // 条目名称

	private int weight; // 权重

	private String description; // 描述

	private String agencyCode;// '机构编码(fk)'

	private String recStatus;// '数据状态'

	private String orders;// '排序'

	private String lockStatus;// '锁定状态'

	private Date lockDate;// '锁定时间'

	private String lockUserID;// '锁定人ID(fk)'

	private String createBy;// '创建者(fk)'

	private Date createDate;// '创建时间'

	private String lastEditBy;// '修改者(fk)'

	private Date lastEditDate;// '修改时间'

	private String remarks;// '备注'

	private String extend1;// '扩展字段1'

	private String extend2;// '扩展字段2'

	private String extend3;// '扩展字段3'

	/**
	 * SysDataDictionaryItemPo Constructor.
	 * 
	 */
	public SysDataDictionaryItemPo()
	{
		super();
	}

	/**
	 * SysDataDictionaryItemPo Constructor.
	 * 
	 * @param id
	 * @param typeID
	 * @param itemName
	 * @param weight
	 * @param description
	 * @param agencyCode
	 * @param recStatus
	 * @param orders
	 * @param lockStatus
	 * @param lockDate
	 * @param lockUserID
	 * @param createBy
	 * @param createDate
	 * @param lastEditBy
	 * @param lastEditDate
	 * @param remarks
	 * @param extend1
	 * @param extend2
	 * @param extend3
	 */
	public SysDataDictionaryItemPo(String id, String typeID, String itemName, int weight, String description,
			String agencyCode, String recStatus, String orders, String lockStatus, Date lockDate, String lockUserID,
			String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks, String extend1,
			String extend2, String extend3)
	{
		super();
		this.id = id;
		this.typeID = typeID;
		this.itemName = itemName;
		this.weight = weight;
		this.description = description;
		this.agencyCode = agencyCode;
		this.recStatus = recStatus;
		this.orders = orders;
		this.lockStatus = lockStatus;
		this.lockDate = lockDate;
		this.lockUserID = lockUserID;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastEditBy = lastEditBy;
		this.lastEditDate = lastEditDate;
		this.remarks = remarks;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
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

	@Column(name = "SDDI_TypeID", length = 64)
	public String getTypeID()
	{
		return typeID;
	}

	public void setTypeID(String typeID)
	{
		this.typeID = typeID;
	}

	@Column(name = "SDDI_ItemName", length = 255)
	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	@Column(name = "SDDI_Weight")
	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	@Column(name = "SDDI_Description", length = 255)
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Column(name = "SDDI_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SDDI_RecStatus", length = 2)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SDDI_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SDDI_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SDDI_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SDDI_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SDDI_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SDDI_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SDDI_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SDDI_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SDDI_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SDDI_Extend1", length = 255)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SDDI_Extend2", length = 255)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SDDI_Extend3", length = 255)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}

/*
 * $Log: av-env.bat,v $
 */