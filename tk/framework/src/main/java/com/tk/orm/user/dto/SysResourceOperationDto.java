package com.tk.orm.user.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysResourceOperationPo;

/**
 * <pre>
 *  
 *  File: SysResourceOperationVo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  资源操作DTO
 * 
 *  Notes:
 *  $Id: SysResourceOperationVo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:36:47>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public class SysResourceOperationDto extends BaseDto
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -8776796951244315342L;

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

	private String agencyName; // 机构名称

	private String agencyAlias; // 机构别名

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

	/**
	 * SysResourceOperationDto Constructor.
	 * 
	 */
	public SysResourceOperationDto()
	{
		super();
	}

	/**
	 * SysResourceOperationDto Constructor.
	 * 
	 * @param vo
	 */
	public SysResourceOperationDto(SysResourceOperationPo po)
	{
		BeanUtils.copyProperties(po, this);
	}

	/**
	 * TODO.
	 * 
	 * @param dto
	 * @return
	 */
	public SysResourceOperationPo SysResourceOperationDto2Po(SysResourceOperationDto dto)
	{
		SysResourceOperationPo po = new SysResourceOperationPo();
		BeanUtils.copyProperties(dto, po);
		return po;
	}

	/**
	 * @return the id
	 */

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
	 * @return the moduleCode
	 */

	public String getModuleCode()
	{
		return moduleCode;
	}

	/**
	 * @param moduleCode the moduleCode to set
	 */
	public void setModuleCode(String moduleCode)
	{
		this.moduleCode = moduleCode;
	}

	/**
	 * @return the moduleName
	 */

	public String getModuleName()
	{
		return moduleName;
	}

	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName)
	{
		this.moduleName = moduleName;
	}

	/**
	 * @return the resourceCode
	 */

	public String getResourceCode()
	{
		return resourceCode;
	}

	/**
	 * @param resourceCode the resourceCode to set
	 */
	public void setResourceCode(String resourceCode)
	{
		this.resourceCode = resourceCode;
	}

	/**
	 * @return the resourceName
	 */

	public String getResourceName()
	{
		return resourceName;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName)
	{
		this.resourceName = resourceName;
	}

	/**
	 * @return the operateCode
	 */

	public String getOperateCode()
	{
		return operateCode;
	}

	/**
	 * @param operateCode the operateCode to set
	 */
	public void setOperateCode(String operateCode)
	{
		this.operateCode = operateCode;
	}

	/**
	 * @return the operateName
	 */

	public String getOperateName()
	{
		return operateName;
	}

	/**
	 * @param operateName the operateName to set
	 */
	public void setOperateName(String operateName)
	{
		this.operateName = operateName;
	}

	/**
	 * @return the operateLevelCode
	 */

	public String getOperateLevelCode()
	{
		return operateLevelCode;
	}

	/**
	 * @param operateLevelCode the operateLevelCode to set
	 */
	public void setOperateLevelCode(String operateLevelCode)
	{
		this.operateLevelCode = operateLevelCode;
	}

	/**
	 * @return the operateLevel
	 */

	public String getOperateLevel()
	{
		return operateLevel;
	}

	/**
	 * @param operateLevel the operateLevel to set
	 */
	public void setOperateLevel(String operateLevel)
	{
		this.operateLevel = operateLevel;
	}

	/**
	 * @return the agencyCode
	 */

	public String getAgencyCode()
	{
		return agencyCode;
	}

	/**
	 * @param agencyCode the agencyCode to set
	 */
	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	/**
	 * @return the agencyName
	 */

	public String getAgencyName()
	{
		return agencyName;
	}

	/**
	 * @param agencyName the agencyName to set
	 */
	public void setAgencyName(String agencyName)
	{
		this.agencyName = agencyName;
	}

	/**
	 * @return the agencyAlias
	 */

	public String getAgencyAlias()
	{
		return agencyAlias;
	}

	/**
	 * @param agencyAlias the agencyAlias to set
	 */
	public void setAgencyAlias(String agencyAlias)
	{
		this.agencyAlias = agencyAlias;
	}

	/**
	 * @return the recStatus
	 */

	public String getRecStatus()
	{
		return recStatus;
	}

	/**
	 * @param recStatus the recStatus to set
	 */
	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	/**
	 * @return the orders
	 */

	public String getOrders()
	{
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	/**
	 * @return the lockStatus
	 */

	public String getLockStatus()
	{
		return lockStatus;
	}

	/**
	 * @param lockStatus the lockStatus to set
	 */
	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	/**
	 * @return the lockDate
	 */

	public Date getLockDate()
	{
		return lockDate;
	}

	/**
	 * @param lockDate the lockDate to set
	 */
	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	/**
	 * @return the lockUserID
	 */

	public String getLockUserID()
	{
		return lockUserID;
	}

	/**
	 * @param lockUserID the lockUserID to set
	 */
	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	/**
	 * @return the createBy
	 */

	public String getCreateBy()
	{
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	/**
	 * @return the createDate
	 */

	public Date getCreateDate()
	{
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	/**
	 * @return the lastEditBy
	 */

	public String getLastEditBy()
	{
		return lastEditBy;
	}

	/**
	 * @param lastEditBy the lastEditBy to set
	 */
	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	/**
	 * @return the lastEditDate
	 */

	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	/**
	 * @param lastEditDate the lastEditDate to set
	 */
	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	/**
	 * @return the remarks
	 */

	public String getRemarks()
	{
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	/**
	 * @return the extend1
	 */

	public String getExtend1()
	{
		return extend1;
	}

	/**
	 * @param extend1 the extend1 to set
	 */
	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	/**
	 * @return the extend2
	 */

	public String getExtend2()
	{
		return extend2;
	}

	/**
	 * @param extend2 the extend2 to set
	 */
	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	/**
	 * @return the extend3
	 */

	public String getExtend3()
	{
		return extend3;
	}

	/**
	 * @param extend3 the extend3 to set
	 */
	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}
