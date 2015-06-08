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
 *  File: SysUserRolePo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  用户角色关系PO
 * 
 *  Notes:
 *  $Id: SysUserRolePo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:33:13>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_user_role_relation")
public class SysUserRolePo implements java.io.Serializable
{

	private static final long serialVersionUID = 1740403281288507723L;

	// Fields
	private String id;// '主键'

	private String userID;// '用户ID(fk)'

	private String roleID;// '角色ID(fk)'

	private String agencyCode;// '机构编码(fk)'

	private String recStatus;// '数据状态'

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
	 * SysUserRolePo Constructor.
	 * 
	 */
	public SysUserRolePo()
	{
	}

	/**
	 * SysUserRolePo Constructor.
	 * 
	 * @param id
	 * @param userID
	 * @param roleID
	 * @param agencyCode
	 * @param recStatus
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
	public SysUserRolePo(String id, String userID, String roleID, String agencyCode, String recStatus,
			String lockStatus, Date lockDate, String lockUserID, String createBy, Date createDate, String lastEditBy,
			Date lastEditDate, String remarks, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.userID = userID;
		this.roleID = roleID;
		this.agencyCode = agencyCode;
		this.recStatus = recStatus;
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
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Column(name = "SUR_UserID", length = 64)
	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	@Column(name = "SUR_RoleID", length = 64)
	public String getRoleID()
	{
		return roleID;
	}

	public void setRoleID(String roleID)
	{
		this.roleID = roleID;
	}

	@Column(name = "SUR_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SUR_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SUR_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUR_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SUR_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SUR_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUR_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SUR_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUR_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SUR_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SUR_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SUR_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SUR_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}