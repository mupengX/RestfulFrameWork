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
 *  File: SysDepartmentPo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  部门PO
 * 
 *  Notes:
 *  $Id: SysDepartmentPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:31:47>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_department")
public class SysDepartmentPo implements java.io.Serializable
{

	private static final long serialVersionUID = 981535677605175180L;

	// Fields
	private String id; // '主键'

	private String name;// '部门名称'

	private String code;// '部门编码'

	private String category; // 部门类别

	private String address; // 地址

	private String email; // email

	private String fax; // 传真

	private String tel; // 联系电话

	private String description;// 部门描述

	private String parentID;// 上级部门

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

	// Constructors

	/**
	 * SysDepartmentPo Constructor.
	 * 
	 */
	public SysDepartmentPo()
	{
	}

	/**
	 * SysDepartmentPo Constructor.
	 * 
	 * @param id
	 * @param name
	 * @param code
	 * @param category
	 * @param address
	 * @param email
	 * @param fax
	 * @param tel
	 * @param description
	 * @param parentID
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
	public SysDepartmentPo(String id, String name, String code, String category, String address, String email,
			String fax, String tel, String description, String parentID, String agencyCode, String recStatus,
			String orders, String lockStatus, Date lockDate, String lockUserID, String createBy, Date createDate,
			String lastEditBy, Date lastEditDate, String remarks, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.category = category;
		this.address = address;
		this.email = email;
		this.fax = fax;
		this.tel = tel;
		this.description = description;
		this.parentID = parentID;
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

	// Property accessors
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

	@Column(name = "SD_Name", length = 64)
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "SD_Code", length = 64)
	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Column(name = "SD_Category", length = 64)
	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	/**
	 * @return the address
	 */
	@Column(name = "SD_Address", length = 64)
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return the email
	 */
	@Column(name = "SD_Email", length = 64)
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the fax
	 */
	@Column(name = "SD_Fax", length = 64)
	public String getFax()
	{
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax)
	{
		this.fax = fax;
	}

	/**
	 * @return the tel
	 */
	@Column(name = "SD_Tel", length = 64)
	public String getTel()
	{
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Column(name = "SD_Description", length = 255)
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Column(name = "SD_ParentID", length = 64)
	public String getParentID()
	{
		return parentID;
	}

	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	@Column(name = "SD_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SD_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SD_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SD_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SD_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SD_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SD_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SD_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SD_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SD_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SD_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SD_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SD_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SD_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}