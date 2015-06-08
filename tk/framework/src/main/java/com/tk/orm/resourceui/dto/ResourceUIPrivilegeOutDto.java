package com.tk.orm.resourceui.dto;

import java.util.Date;

import com.tk.framework.vo.BaseDto;

/**
 * <pre>
 *  
 *  File: ResourceUIPrivilegeOutDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  UI资源权限DTO(应用于查询返回结果)
 * 
 *  Notes:
 *  $Id: ResourceUIPrivilegeOutDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月24日上午9:33:22>>, <<Who>>, <<what>>  
 *  2015年3月24日		TK		Initial.
 * </pre>
 */
public class ResourceUIPrivilegeOutDto extends BaseDto
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5496452239605122888L;

	private String id;

	private String pmType;

	private String pmID;

	private String resOpType;

	private String resOpID;

	private String permission;

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
	 * @return the pmType
	 */

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

/*
 * $Log: av-env.bat,v $
 */