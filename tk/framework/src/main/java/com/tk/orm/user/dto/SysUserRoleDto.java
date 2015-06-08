package com.tk.orm.user.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysUserRolePo;

/**
 * <pre>
 *  
 *  File: SysUserRoleVo.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  用户角色关系DTO
 * 
 *  Notes:
 *  $Id: SysUserRoleVo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:37:24>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public class SysUserRoleDto extends BaseDto
{

	private static final long serialVersionUID = 6272057172571932149L;

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

	public SysUserRoleDto()
	{
		super();
	}

	public SysUserRoleDto(SysUserRolePo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	public SysUserRolePo SysUserRoleDto2Po(SysUserRoleDto dto)
	{
		SysUserRolePo po = new SysUserRolePo();
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
	 * @return the userID
	 */

	public String getUserID()
	{
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	/**
	 * @return the roleID
	 */

	public String getRoleID()
	{
		return roleID;
	}

	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(String roleID)
	{
		this.roleID = roleID;
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
