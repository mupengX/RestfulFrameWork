package com.tk.orm.user.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysUserPo;

/**
 * <pre>
 *  
 *  File: SysUserVo.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  用户DTO
 * 
 *  Notes:
 *  $Id: SysUserVo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:37:38>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public class SysUserDto extends BaseDto
{

	private static final long serialVersionUID = 8520371720888690305L;

	// Fields
	private String id; // '主键'

	private String userID;// '用户ID'

	private String userPwd;// '用户密码'

	private String code;// '用户编码'

	private String name;// '用户名称'

	private List<SysRoleDto> roles; // 角色

	private SysDepartmentDto department;// 部门

	private SysUserDetailDto detail;// 用户详情

	private Date regDate;// '注册日期'

	private String agencyCode;// '机构编码(fk)'

	private String agencyName; // 机构名称

	private String agencyAlias; // 机构别名

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

	public SysUserDto()
	{
		super();
	}

	public SysUserDto(SysUserPo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	public SysUserPo SysUserDto2Po(SysUserDto dto)
	{
		SysUserPo po = new SysUserPo();
		BeanUtils.copyProperties(dto, po);
		if (null != dto.getDepartment())
		{
			po.setDeptID(dto.getDepartment().getId());

		}
		if (null != dto.getDetail())
		{
			po.setUserDetail(dto.getDetail().getId());
		}
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
	 * @return the userPwd
	 */

	public String getUserPwd()
	{
		return userPwd;
	}

	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	/**
	 * @return the code
	 */

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
	 * @return the name
	 */

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
	 * @return the roles
	 */

	public List<SysRoleDto> getRoles()
	{
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<SysRoleDto> roles)
	{
		this.roles = roles;
	}

	/**
	 * @return the department
	 */

	public SysDepartmentDto getDepartment()
	{
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(SysDepartmentDto department)
	{
		this.department = department;
	}

	/**
	 * @return the detail
	 */

	public SysUserDetailDto getDetail()
	{
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(SysUserDetailDto detail)
	{
		this.detail = detail;
	}

	/**
	 * @return the regDate
	 */

	public Date getRegDate()
	{
		return regDate;
	}

	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(Date regDate)
	{
		this.regDate = regDate;
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
