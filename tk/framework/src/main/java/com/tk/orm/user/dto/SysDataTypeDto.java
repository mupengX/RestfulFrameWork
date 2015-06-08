package com.tk.orm.user.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.tk.orm.user.model.SysDataTypePo;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * <pre> 
 *  
 *  File: SysDataType.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: SysDataType.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月25日上午10:35:46>>, <<Who>>, <<what>>  
 *  2015年5月25日		cy		Initial.
 * </pre>
 */
@ApiModel
public class SysDataTypeDto implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -5979139069045071013L;
	
	private String id;	//主键
	
	private String parentId;	//父节点ID
	
	private String name;	//名称
	
	private String code;	//编码
	
	private Integer weight;	//权重
	
	private String description;	//描述

	public SysDataTypeDto()
	{
		super();
	}

	public SysDataTypeDto(String id, String parentId, String name, String code, Integer weight, String description)
	{
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.code = code;
		this.weight = weight;
		this.description = description;
	}

	public SysDataTypeDto(SysDataTypePo dataTypePo)
	{
		super();
		BeanUtils.copyProperties(dataTypePo, this);
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getParentId()
	{
		return parentId;
	}

	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public Integer getWeight()
	{
		return weight;
	}

	public void setWeight(Integer weight)
	{
		this.weight = weight;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public SysDataTypePo SysDataTypeDto2Po(SysDataTypeDto dto)
	{
		SysDataTypePo po = new SysDataTypePo();
		BeanUtils.copyProperties(this, po);
		return po;
	}
	
}

/*
*$Log: av-env.bat,v $
*/