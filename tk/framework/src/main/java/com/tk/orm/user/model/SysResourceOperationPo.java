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
 *  File: SysResourceOperationPo.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  资源操作PO
 * 
 *  Notes:
 *  $Id: SysResourceOperationPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:28:03>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_resourceOperation")
public class SysResourceOperationPo implements java.io.Serializable
{

	private static final long serialVersionUID = 4915699512431949460L;

	// Fields
	private String id; // '主键'

	private String moduleCode; // '模块代码，程序中的注解'

	private String moduleName; // '模块名称'

	private String resourceCode; // '资源代码，程序中的注解'

	private String resourceName; // '资源名称'

	private String operateCode; // '操作代码，程序中的注解'

	private String operateName; // '操作名称'

	private String operateLevelCode; // '操作级别代码，程序中的注解'

	private String operateLevel; // '操作级别'

	private String agencyCode; // '机构编码(fk)'

	private String recStatus; // '数据状态'

	private String orders; // '排序'

	private String lockStatus; // '锁定状态'

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
	 * SysResourceOperationPo Constructor.
	 * 
	 */
	public SysResourceOperationPo()
	{
	}

	/**
	 * SysResourceOperationPo Constructor.
	 * 
	 * @param id
	 * @param moduleCode
	 * @param moduleName
	 * @param resourceCode
	 * @param resourceName
	 * @param operateCode
	 * @param operateName
	 * @param operateLevelCode
	 * @param operateLevel
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
	public SysResourceOperationPo(String id, String moduleCode, String moduleName, String resourceCode,
			String resourceName, String operateCode, String operateName, String operateLevelCode, String operateLevel,
			String agencyCode, String recStatus, String orders, String lockStatus, Date lockDate, String lockUserID,
			String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks, String extend1,
			String extend2, String extend3)
	{
		super();
		this.id = id;
		this.moduleCode = moduleCode;
		this.moduleName = moduleName;
		this.resourceCode = resourceCode;
		this.resourceName = resourceName;
		this.operateCode = operateCode;
		this.operateName = operateName;
		this.operateLevelCode = operateLevelCode;
		this.operateLevel = operateLevel;
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

	@Column(name = "SRO_ModuleCode", length = 64)
	public String getModuleCode()
	{
		return moduleCode;
	}

	public void setModuleCode(String moduleCode)
	{
		this.moduleCode = moduleCode;
	}

	@Column(name = "SRO_ModuleName", length = 64)
	public String getModuleName()
	{
		return moduleName;
	}

	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}

	@Column(name = "SRO_ResourceCode", length = 64)
	public String getResourceCode()
	{
		return resourceCode;
	}

	public void setResourceCode(String resourceCode)
	{
		this.resourceCode = resourceCode;
	}

	@Column(name = "SRO_ResourceName", length = 64)
	public String getResourceName()
	{
		return resourceName;
	}

	public void setResourceName(String resourceName)
	{
		this.resourceName = resourceName;
	}

	@Column(name = "SRO_OperateCode", length = 64)
	public String getOperateCode()
	{
		return operateCode;
	}

	public void setOperateCode(String operateCode)
	{
		this.operateCode = operateCode;
	}

	@Column(name = "SRO_OperateName", length = 64)
	public String getOperateName()
	{
		return operateName;
	}

	public void setOperateName(String operateName)
	{
		this.operateName = operateName;
	}

	@Column(name = "SRO_OperateLevelCode", length = 64)
	public String getOperateLevelCode()
	{
		return operateLevelCode;
	}

	public void setOperateLevelCode(String operateLevelCode)
	{
		this.operateLevelCode = operateLevelCode;
	}

	@Column(name = "SRO_OperateLevel", length = 64)
	public String getOperateLevel()
	{
		return operateLevel;
	}

	public void setOperateLevel(String operateLevel)
	{
		this.operateLevel = operateLevel;
	}

	@Column(name = "SRO_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SRO_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SRO_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SRO_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SRO_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SRO_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SRO_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SRO_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SRO_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SRO_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SRO_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SRO_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SRO_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SRO_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (null == obj)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		if (this.id != null && this.id.equals(((SysResourceOperationPo) obj).getId()))
		{
			return true;
		}
		if (this.resourceCode != null && this.operateCode != null && this.operateLevelCode != null
				&& this.agencyCode != null
				&& this.resourceCode.equals(((SysResourceOperationPo) obj).getResourceCode())
				&& this.operateCode.equals(((SysResourceOperationPo) obj).getOperateCode())
				&& this.operateLevelCode.equals(((SysResourceOperationPo) obj).getOperateLevelCode())
				&& this.agencyCode.equals(((SysResourceOperationPo) obj).getAgencyCode()))
		{
			return true;
		}
		return this == obj;
	}
}