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
 *  File: ResourceUIPrivilegePo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  UI资源权限PO
 * 
 *  Notes:
 *  $Id: ResourceUIPrivilegePo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月24日上午9:11:53>>, <<Who>>, <<what>>  
 *  2015年3月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sp_privilege_relation")
public class ResourceUIPrivilegePo implements java.io.Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -8805485959113353017L;

	private String id;

	private String pmType;

	private String pmID;

	private String resOpType;

	private String resOpID;

	private String permission;

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
	 * ResourceUIPrivilege Constructor.
	 * 
	 */
	public ResourceUIPrivilegePo()
	{
		super();
	}

	/**
	 * ResourceUIPrivilegePo Constructor.
	 * 
	 * @param id
	 * @param pmType
	 * @param pmID
	 * @param resOpType
	 * @param resOpID
	 * @param permission
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
	public ResourceUIPrivilegePo(String id, String pmType, String pmID, String resOpType, String resOpID,
			String permission, String agencyCode, String recStatus, String orders, String lockStatus, Date lockDate,
			String lockUserID, String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks,
			String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.pmType = pmType;
		this.pmID = pmID;
		this.resOpType = resOpType;
		this.resOpID = resOpID;
		this.permission = permission;
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
	 * @return the pmType
	 */
	@Column(name = "SPR_PmType", length = 64)
	public String getPmType()
	{
		return pmType;
	}

	/**
	 * @param pmType the pmType to set
	 */
	public void setPmType(String pmType)
	{
		this.pmType = pmType;
	}

	/**
	 * @return the pmID
	 */
	@Column(name = "SPR_PmID", length = 64)
	public String getPmID()
	{
		return pmID;
	}

	/**
	 * @param pmID the pmID to set
	 */
	public void setPmID(String pmID)
	{
		this.pmID = pmID;
	}

	/**
	 * @return the resOpType
	 */
	@Column(name = "SPR_ResOpType", length = 64)
	public String getResOpType()
	{
		return resOpType;
	}

	/**
	 * @param resOpType the resOpType to set
	 */
	public void setResOpType(String resOpType)
	{
		this.resOpType = resOpType;
	}

	/**
	 * @return the resOpID
	 */
	@Column(name = "SPR_ResOpID", length = 64)
	public String getResOpID()
	{
		return resOpID;
	}

	/**
	 * @param resOpID the resOpID to set
	 */
	public void setResOpID(String resOpID)
	{
		this.resOpID = resOpID;
	}

	/**
	 * @return the permission
	 */
	@Column(name = "SPR_Permission", length = 10)
	public String getPermission()
	{
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	@Column(name = "SPR_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SPR_RecStatus", length = 2)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SPR_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SPR_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Column(name = "SPR_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SPR_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SPR_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Column(name = "SPR_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SPR_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Column(name = "SPR_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SPR_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SPR_Extend1", length = 255)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SPR_Extend2", length = 255)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SPR_Extend3", length = 255)
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