package com.tk.orm.resourceui.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre>
 *  
 *  File: ResourceUIPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  UI资源PO
 * 
 *  Notes:
 *  $Id: ResourceUIPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月24日上午9:04:05>>, <<Who>>, <<what>>  
 *  2015年3月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sp_resource_ui")
public class ResourceUIPo implements java.io.Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -2187773570715708977L;

	private String id;

	private String name;

	private String type;

	private String code;

	private String parentID;

	private String operate;

	private String icon;

	private String agencyCode;

	private String recStatus;

	private String orders;

	private String lockStatus;

	private Date lockDate;

	private String lockUserID;

	private String createBy;

	private Date createDate;

	private String lastEditBy;

	private Date lastEditDate;

	private String remarks;

	private String extend1;

	private String extend2;

	private String extend3;

	/**
	 * ResourceUIPo Constructor.
	 * 
	 */
	public ResourceUIPo()
	{
		super();
	}

	/**
	 * ResourceUIPo Constructor.
	 * 
	 * @param id
	 * @param name
	 * @param type
	 * @param code
	 * @param parentID
	 * @param operate
	 * @param icon
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
	public ResourceUIPo(String id, String name, String type, String code, String parentID, String operate, String icon,
			String agencyCode, String recStatus, String orders, String lockStatus, Date lockDate, String lockUserID,
			String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks, String extend1,
			String extend2, String extend3)
	{
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.code = code;
		this.parentID = parentID;
		this.operate = operate;
		this.icon = icon;
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

	/**
	 * @return the id
	 */
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "SRU_Name", length = 64)
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the type
	 */
	@Column(name = "SRU_Type", length = 64)
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @return the code
	 */
	@Column(name = "SRU_Code", length = 64)
	public String getCode()
	{
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * @return the parentID
	 */
	@Column(name = "SRU_ParentID", length = 64)
	public String getParentID()
	{
		return parentID;
	}

	/**
	 * @param parentID the parentID to set
	 */
	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	/**
	 * @return the operate
	 */
	@Column(name = "SRU_Operate", length = 64)
	public String getOperate()
	{
		return operate;
	}

	/**
	 * @param operate the operate to set
	 */
	public void setOperate(String operate)
	{
		this.operate = operate;
	}

	/**
	 * @return the icon
	 */
	@Column(name = "SRU_Icon", length = 64)
	public String getIcon()
	{
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon)
	{
		this.icon = icon;
	}

	@Column(name = "SRU_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SRU_RecStatus", length = 2)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SRU_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SRU_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Column(name = "SRU_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SRU_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SRU_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Column(name = "SRU_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SRU_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Column(name = "SRU_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SRU_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SRU_Extend1", length = 255)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SRU_Extend2", length = 255)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SRU_Extend3", length = 255)
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