package com.tk.orm.publicplatform.dto;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.dto.SysDepartmentDto;


/**
 * <pre> 
 *  
 *  File: PlatformDetailAppSystemDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailAppSystemDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月20日下午3:44:26>>, <<Who>>, <<what>>  
 *  2015年5月20日		cy		Initial.
 * </pre>
 */
public class PlatformDetailAppSystemDto extends BaseDto
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -7842851048496834964L;
	
	private String id;	//ID
	
	private SysDepartmentDto userDept;	//用户单位
	
	private String websiteName;	//网站名称
	
	private String domain;	//域名
	
	private String extranetIp;	//公网IP地址
	
	private String icp;	//icp备案
	
	private String dbName;	//数据库名称
	
	private String use;	//主要用途
	
	private String deployWary;	//部署方式
	
	private String protectionLevel;	//等保级别

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public SysDepartmentDto getUserDept()
	{
		return userDept;
	}

	public void setUserDept(SysDepartmentDto userDept)
	{
		this.userDept = userDept;
	}

	public String getWebsiteName()
	{
		return websiteName;
	}

	public void setWebsiteName(String websiteName)
	{
		this.websiteName = websiteName;
	}

	public String getDomain()
	{
		return domain;
	}

	public void setDomain(String domain)
	{
		this.domain = domain;
	}

	public String getExtranetIp()
	{
		return extranetIp;
	}

	public void setExtranetIp(String extranetIp)
	{
		this.extranetIp = extranetIp;
	}

	public String getIcp()
	{
		return icp;
	}

	public void setIcp(String icp)
	{
		this.icp = icp;
	}

	public String getDbName()
	{
		return dbName;
	}

	public void setDbName(String dbName)
	{
		this.dbName = dbName;
	}

	public String getUse()
	{
		return use;
	}

	public void setUse(String use)
	{
		this.use = use;
	}

	public String getDeployWary()
	{
		return deployWary;
	}

	public void setDeployWary(String deployWary)
	{
		this.deployWary = deployWary;
	}

	public String getProtectionLevel()
	{
		return protectionLevel;
	}

	public void setProtectionLevel(String protectionLevel)
	{
		this.protectionLevel = protectionLevel;
	}
	
}

/*
*$Log: av-env.bat,v $
*/