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
 *  File: SysPrivilegePo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  权限PO,描述权限主体和资源操作之间的关系，其中permission的值只有三个：F、N、R，F全称Full，N全称NO，R全称Readonly
 * 
 *  Notes:
 *  $Id: SysPrivilegePo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:19:44>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_privilege_relation")
public class SysPrivilegePo implements java.io.Serializable
{

	private static final long serialVersionUID = -6429204775271466769L;

	// Fields
	private String id; // '主键'

	private String pmType; // '权限主体类型'

	private String pmID; // '权限主体ID(fk)'

	private String resOpType; // '资源操作类型'

	private String resOpID; // '资源操作ID(fk)'

	private String permission; // '权限：F/N/R'

	private String agencyCode; // '机构编码(fk)'

	private String recStatus; // '数据状态'

	private String createBy; // '创建者(fk)'

	private Date createDate; // '创建时间'

	private String lastEditBy; // '修改者(fk)'

	private Date lastEditDate; // '修改时间'

	private String remarks; // '备注'

	private String extend1; // '扩展字段1'

	private String extend2; // '扩展字段2'

	private String extend3; // '扩展字段3'

	/**
	 * SysPrivilegePo Constructor.
	 * 
	 */
	public SysPrivilegePo()
	{
	}

	/**
	 * SysPrivilegePo Constructor.
	 * 
	 * @param id
	 * @param pmType
	 * @param pmID
	 * @param resOpType
	 * @param resOpID
	 * @param permission
	 * @param agencyCode
	 * @param recStatus
	 * @param createBy
	 * @param createDate
	 * @param lastEditBy
	 * @param lastEditDate
	 * @param remarks
	 * @param extend1
	 * @param extend2
	 * @param extend3
	 */
	public SysPrivilegePo(String id, String pmType, String pmID, String resOpType, String resOpID, String permission,
			String agencyCode, String recStatus, String createBy, Date createDate, String lastEditBy,
			Date lastEditDate, String remarks, String extend1, String extend2, String extend3)
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

	@Column(name = "SP_PmType", length = 64)
	public String getPmType()
	{
		return pmType;
	}

	public void setPmType(String pmType)
	{
		this.pmType = pmType;
	}

	@Column(name = "SP_PmID", length = 64)
	public String getPmID()
	{
		return pmID;
	}

	public void setPmID(String pmID)
	{
		this.pmID = pmID;
	}

	@Column(name = "SP_ResOpType", length = 64)
	public String getResOpType()
	{
		return resOpType;
	}

	public void setResOpType(String resOpType)
	{
		this.resOpType = resOpType;
	}

	@Column(name = "SP_ResOpID", length = 64)
	public String getResOpID()
	{
		return resOpID;
	}

	public void setResOpID(String resOpID)
	{
		this.resOpID = resOpID;
	}

	@Column(name = "SP_Permission", length = 64)
	public String getPermission()
	{
		return permission;
	}

	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	@Column(name = "SP_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SP_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SP_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SP_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SP_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SP_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SP_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SP_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SP_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SP_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}