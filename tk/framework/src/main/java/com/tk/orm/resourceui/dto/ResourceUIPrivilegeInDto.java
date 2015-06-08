package com.tk.orm.resourceui.dto;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.resourceui.model.ResourceUIPrivilegePo;

/**
 * <pre>
 *  
 *  File: ResourceUIPrivilegeInDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  UI资源权限DTO(应用于设定输入参数)
 * 
 *  Notes:
 *  $Id: ResourceUIPrivilegeInDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月24日上午9:33:06>>, <<Who>>, <<what>>  
 *  2015年3月24日		TK		Initial.
 * </pre>
 */
public class ResourceUIPrivilegeInDto extends BaseDto
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -9070501154668999748L;

	private String id;

	private String pmType;

	private String pmID;

	private String resOpType;

	private String resOpID;

	private String permission;

	private String recStatus;

	private String orders;

	private String remarks;

	private String extend1;

	private String extend2;

	private String extend3;

	/**
	 * ResourceUIPrivilegeInDto Constructor.
	 * 
	 */
	public ResourceUIPrivilegeInDto()
	{
		super();
	}

	public ResourceUIPrivilegeInDto(ResourceUIPrivilegePo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	/**
	 * DTO转PO.
	 * 
	 * @param dto
	 * @return
	 */
	public ResourceUIPrivilegePo Dto2Po(ResourceUIPrivilegeInDto dto, ResourceUIPrivilegePo po)
	{
		po = null != po ? po : new ResourceUIPrivilegePo();
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