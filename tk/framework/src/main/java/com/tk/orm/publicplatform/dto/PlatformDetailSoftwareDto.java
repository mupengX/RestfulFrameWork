package com.tk.orm.publicplatform.dto;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.vo.BaseDto;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * <pre> 
 *  
 *  File: PlatformDetailSoftwareDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  平台管理软件与公共应用系统明细
 * 
 *  Notes:
 *  $Id: PlatformDetailSoftwareDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月18日上午9:35:08>>, <<Who>>, <<what>>  
 *  2015年5月18日		cy		Initial.
 * </pre>
 */
@SuppressWarnings("unused")
@ApiModel
public class PlatformDetailSoftwareDto extends BaseDto
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 2715738386957387817L;
	
	private String id;	//ID
	
	private String systemName;	//系统名称
	
	private String use;	//主要用途
	
	private String devDate;	//开发时间
	
	private String devDept;	//研发单位
	
	private String devOutlay;	//研发费用

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getSystemName()
	{
		return systemName;
	}

	public void setSystemName(String systemName)
	{
		this.systemName = systemName;
	}

	public String getUse()
	{
		return use;
	}

	public void setUse(String use)
	{
		this.use = use;
	}

	public String getDevDate()
	{
		return devDate;
	}

	public void setDevDate(String devDate)
	{
		this.devDate = devDate;
	}

	public String getDevDept()
	{
		return devDept;
	}

	public void setDevDept(String devDept)
	{
		this.devDept = devDept;
	}

	public String getDevOutlay()
	{
		return devOutlay;
	}

	public void setDevOutlay(String devOutlay)
	{
		this.devOutlay = devOutlay;
	}
	
}

/*
*$Log: av-env.bat,v $
*/