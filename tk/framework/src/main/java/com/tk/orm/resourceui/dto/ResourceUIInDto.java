package com.tk.orm.resourceui.dto;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.resourceui.model.ResourceUIPo;

/**
 * <pre>
 *  
 *  File: ResourceUIInDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  UI资源DTO(应用于设定输入参数)
 * 
 *  Notes:
 *  $Id: ResourceUIInDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月24日上午9:24:39>>, <<Who>>, <<what>>  
 *  2015年3月24日		TK		Initial.
 * </pre>
 */
public class ResourceUIInDto extends BaseDto
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -2756347205568611829L;

	private String id;

	private String name;

	private String type;

	private String code;

	private String parentID;

	private String operate;

	private String icon;

	private String recStatus;

	private String orders;

	private String remarks;

	/**
	 * ResourceUIInDto Constructor.
	 * 
	 */
	public ResourceUIInDto()
	{
		super();
	}

	/**
	 * ResourceUIInDto Constructor.
	 * 
	 * @param po
	 */
	public ResourceUIInDto(ResourceUIPo po)
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
	public ResourceUIPo Dto2Po(ResourceUIInDto dto, ResourceUIPo po)
	{
		po = null != po ? po : new ResourceUIPo();
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
	 * @return the type
	 */

	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
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
	 * @return the parentID
	 */

	public String getParentID()
	{
		return parentID;
	}

	/**
	 * @param parentID the parentID to set
	 */
	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	/**
	 * @return the operate
	 */

	public String getOperate()
	{
		return operate;
	}

	/**
	 * @param operate the operate to set
	 */
	public void setOperate(String operate)
	{
		this.operate = operate;
	}

	/**
	 * @return the icon
	 */

	public String getIcon()
	{
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon)
	{
		this.icon = icon;
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
}

/*
 * $Log: av-env.bat,v $
 */