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
 *  File: SysUserPo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  系统用户PO
 * 
 *  Notes:
 *  $Id: SysUserPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:31:47>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_user")
public class SysUserPo implements java.io.Serializable
{

	private static final long serialVersionUID = 981535677605175180L;

	// Fields
	private String id; // '主键'

	private String userID;// '用户ID'，必填且唯一

	private String userPwd;// '用户密码'，必填

	private String code;// '用户编码'，可选，如果填写则校验唯一性

	private String name;// '用户名称'，可选

	private String deptID;// 部门ID，必填且校验其合法性，即所填写的部门必须存在且有效

	private String userDetail;// 用户详情，可选，如果填写则校验其合法性，即用户详情和用户信息一一对应

	private Date regDate;// '注册日期'，API默认将用户注册日期设置为当前时间

	private String agencyCode;// '机构编码(fk)'，API会默认将agencyCode设置为请求时存放在Rest线程中的agencyCode

	private String recStatus;// '数据状态'，暂未使用

	private String orders;// '排序'，暂未使用

	private String lockStatus;// '锁定状态'，暂未使用

	private Date lockDate;// '锁定时间'，暂未使用

	private String lockUserID;// '锁定人ID(fk)'，暂未使用

	private String createBy;// '创建者(fk)'，创建数据时，API默认将createBy设置为当前登录用户

	private Date createDate;// '创建时间'，创建数据时，API默认将createDate设置为当前时间

	private String lastEditBy;// '修改者(fk)'，修改数据时，API默认将lastEditBy设置为当前登录用户

	private Date lastEditDate;// '修改时间'，修改数据时，API默认将lastEditDate设置为当前时间

	private String remarks;// '备注'，暂未使用

	private String extend1;// '扩展字段1'，暂未使用

	private String extend2;// '扩展字段2'，暂未使用

	private String extend3;// '扩展字段3'，暂未使用

	// Constructors

	/**
	 * SysUserPo Constructor.
	 * 
	 */
	public SysUserPo()
	{
	}

	/**
	 * SysUserPo Constructor.
	 * 
	 * @param id
	 * @param userID
	 * @param userPwd
	 * @param code
	 * @param name
	 * @param deptID
	 * @param userDetail
	 * @param regDate
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
	public SysUserPo(String id, String userID, String userPwd, String code, String name, String deptID,
			String userDetail, Date regDate, String agencyCode, String recStatus, String orders, String lockStatus,
			Date lockDate, String lockUserID, String createBy, Date createDate, String lastEditBy, Date lastEditDate,
			String remarks, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.userID = userID;
		this.userPwd = userPwd;
		this.code = code;
		this.name = name;
		this.deptID = deptID;
		this.userDetail = userDetail;
		this.regDate = regDate;
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

	@Column(name = "SU_UserID", length = 64)
	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	@Column(name = "SU_UserPwd", length = 64)
	public String getUserPwd()
	{
		return userPwd;
	}

	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	@Column(name = "SU_Code", length = 64)
	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	@Column(name = "SU_Name", length = 64)
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Column(name = "SU_deptID", length = 64)
	public String getDeptID()
	{
		return deptID;
	}

	public void setDeptID(String deptID)
	{
		this.deptID = deptID;
	}

	@Column(name = "SU_UserDetail", length = 64)
	public String getUserDetail()
	{
		return userDetail;
	}

	public void setUserDetail(String userDetail)
	{
		this.userDetail = userDetail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SU_RegDate", length = 10)
	public Date getRegDate()
	{
		return regDate;
	}

	public void setRegDate(Date regDate)
	{
		this.regDate = regDate;
	}

	@Column(name = "SU_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SU_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SU_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SU_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SU_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SU_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SU_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SU_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SU_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SU_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SU_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SU_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SU_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SU_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}