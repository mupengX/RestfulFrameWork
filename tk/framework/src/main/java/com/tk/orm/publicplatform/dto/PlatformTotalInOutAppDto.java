package com.tk.orm.publicplatform.dto;

import java.io.Serializable;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * <pre> 
 *  
 *  File: PlatformTotalInOutAppDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformTotalInOutAppDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月29日上午9:45:03>>, <<Who>>, <<what>>  
 *  2015年5月29日		cy		Initial.
 * </pre>
 */
@ApiModel
public class PlatformTotalInOutAppDto implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 2195527079322501351L;
	
	private String inId;	//内网数据主键
	
	private String outId;	//外网数据主键
	
	private Integer inGovServiceCount;	//服务的单位个数
	
	private Integer inGovBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer inGovVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer inGovWebSiteCount;	//网站个数
	
	private Integer inGovDatabaseCount;	//数据库个数
	
	private Integer inGovDeviceCount;	//托管的设备个数
	
	private Integer inGovVirtualMachCount;	//虚拟机个数
	
	private Integer inOtherServiceCount;	//服务的单位个数
	
	private Integer inOtherBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer inOtherVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer inOtherWebSiteCount;	//网站个数
	
	private Integer inOtherDatabaseCount;	//数据库个数
	
	private Integer inOtherDeviceCount;	//托管的设备个数
	
	private Integer inOtherVirtualMachCount;	//虚拟机个数
	
	private Integer inTotalServiceCount;	//服务的单位个数
	
	private Integer inTotalBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer inTotalVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer inTotalWebSiteCount;	//网站个数
	
	private Integer inTotalDatabaseCount;	//数据库个数
	
	private Integer inTotalDeviceCount;	//托管的设备个数
	
	private Integer inTotalVirtualMachCount;	//虚拟机个数
	
	private Integer outGovServiceCount;	//服务的单位个数
	
	private Integer outGovBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer outGovVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer outGovWebSiteCount;	//网站个数
	
	private Integer outGovDatabaseCount;	//数据库个数
	
	private Integer outGovDeviceCount;	//托管的设备个数
	
	private Integer outGovVirtualMachCount;	//虚拟机个数
	
	private Integer outOtherServiceCount;	//服务的单位个数
	
	private Integer outOtherBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer outOtherVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer outOtherWebSiteCount;	//网站个数
	
	private Integer outOtherDatabaseCount;	//数据库个数
	
	private Integer outOtherDeviceCount;	//托管的设备个数
	
	private Integer outOtherVirtualMachCount;	//虚拟机个数
	
	private Integer outTotalServiceCount;	//服务的单位个数
	
	private Integer outTotalBusSysCount;	//部署在公共平台的业务系统个数
	
	private Integer outTotalVirtualBusSysCount;	//虚拟化部署的业务系统的个数
	
	private Integer outTotalWebSiteCount;	//网站个数
	
	private Integer outTotalDatabaseCount;	//数据库个数
	
	private Integer outTotalDeviceCount;	//托管的设备个数
	
	private Integer outTotalVirtualMachCount;	//虚拟机个数
	
	public PlatformTotalInOutAppDto()
	{
	}
	
	public String getInId()
	{
		return inId;
	}

	public void setInId(String inId)
	{
		this.inId = inId;
	}

	public String getOutId()
	{
		return outId;
	}

	public void setOutId(String outId)
	{
		this.outId = outId;
	}

	public Integer getInGovServiceCount()
	{
		return inGovServiceCount;
	}

	public void setInGovServiceCount(Integer inGovServiceCount)
	{
		this.inGovServiceCount = inGovServiceCount;
	}

	public Integer getInGovBusSysCount()
	{
		return inGovBusSysCount;
	}

	public void setInGovBusSysCount(Integer inGovBusSysCount)
	{
		this.inGovBusSysCount = inGovBusSysCount;
	}

	public Integer getInGovVirtualBusSysCount()
	{
		return inGovVirtualBusSysCount;
	}

	public void setInGovVirtualBusSysCount(Integer inGovVirtualBusSysCount)
	{
		this.inGovVirtualBusSysCount = inGovVirtualBusSysCount;
	}

	public Integer getInGovWebSiteCount()
	{
		return inGovWebSiteCount;
	}

	public void setInGovWebSiteCount(Integer inGovWebSiteCount)
	{
		this.inGovWebSiteCount = inGovWebSiteCount;
	}

	public Integer getInGovDatabaseCount()
	{
		return inGovDatabaseCount;
	}

	public void setInGovDatabaseCount(Integer inGovDatabaseCount)
	{
		this.inGovDatabaseCount = inGovDatabaseCount;
	}

	public Integer getInGovDeviceCount()
	{
		return inGovDeviceCount;
	}

	public void setInGovDeviceCount(Integer inGovDeviceCount)
	{
		this.inGovDeviceCount = inGovDeviceCount;
	}

	public Integer getInGovVirtualMachCount()
	{
		return inGovVirtualMachCount;
	}

	public void setInGovVirtualMachCount(Integer inGovVirtualMachCount)
	{
		this.inGovVirtualMachCount = inGovVirtualMachCount;
	}

	public Integer getInOtherServiceCount()
	{
		return inOtherServiceCount;
	}

	public void setInOtherServiceCount(Integer inOtherServiceCount)
	{
		this.inOtherServiceCount = inOtherServiceCount;
	}

	public Integer getInOtherBusSysCount()
	{
		return inOtherBusSysCount;
	}

	public void setInOtherBusSysCount(Integer inOtherBusSysCount)
	{
		this.inOtherBusSysCount = inOtherBusSysCount;
	}

	public Integer getInOtherVirtualBusSysCount()
	{
		return inOtherVirtualBusSysCount;
	}

	public void setInOtherVirtualBusSysCount(Integer inOtherVirtualBusSysCount)
	{
		this.inOtherVirtualBusSysCount = inOtherVirtualBusSysCount;
	}

	public Integer getInOtherWebSiteCount()
	{
		return inOtherWebSiteCount;
	}

	public void setInOtherWebSiteCount(Integer inOtherWebSiteCount)
	{
		this.inOtherWebSiteCount = inOtherWebSiteCount;
	}

	public Integer getInOtherDatabaseCount()
	{
		return inOtherDatabaseCount;
	}

	public void setInOtherDatabaseCount(Integer inOtherDatabaseCount)
	{
		this.inOtherDatabaseCount = inOtherDatabaseCount;
	}

	public Integer getInOtherDeviceCount()
	{
		return inOtherDeviceCount;
	}

	public void setInOtherDeviceCount(Integer inOtherDeviceCount)
	{
		this.inOtherDeviceCount = inOtherDeviceCount;
	}

	public Integer getInOtherVirtualMachCount()
	{
		return inOtherVirtualMachCount;
	}

	public void setInOtherVirtualMachCount(Integer inOtherVirtualMachCount)
	{
		this.inOtherVirtualMachCount = inOtherVirtualMachCount;
	}

	public Integer getInTotalServiceCount()
	{
		return inTotalServiceCount;
	}

	public void setInTotalServiceCount(Integer inTotalServiceCount)
	{
		this.inTotalServiceCount = inTotalServiceCount;
	}

	public Integer getInTotalBusSysCount()
	{
		return inTotalBusSysCount;
	}

	public void setInTotalBusSysCount(Integer inTotalBusSysCount)
	{
		this.inTotalBusSysCount = inTotalBusSysCount;
	}

	public Integer getInTotalVirtualBusSysCount()
	{
		return inTotalVirtualBusSysCount;
	}

	public void setInTotalVirtualBusSysCount(Integer inTotalVirtualBusSysCount)
	{
		this.inTotalVirtualBusSysCount = inTotalVirtualBusSysCount;
	}

	public Integer getInTotalWebSiteCount()
	{
		return inTotalWebSiteCount;
	}

	public void setInTotalWebSiteCount(Integer inTotalWebSiteCount)
	{
		this.inTotalWebSiteCount = inTotalWebSiteCount;
	}

	public Integer getInTotalDatabaseCount()
	{
		return inTotalDatabaseCount;
	}

	public void setInTotalDatabaseCount(Integer inTotalDatabaseCount)
	{
		this.inTotalDatabaseCount = inTotalDatabaseCount;
	}

	public Integer getInTotalDeviceCount()
	{
		return inTotalDeviceCount;
	}

	public void setInTotalDeviceCount(Integer inTotalDeviceCount)
	{
		this.inTotalDeviceCount = inTotalDeviceCount;
	}

	public Integer getInTotalVirtualMachCount()
	{
		return inTotalVirtualMachCount;
	}

	public void setInTotalVirtualMachCount(Integer inTotalVirtualMachCount)
	{
		this.inTotalVirtualMachCount = inTotalVirtualMachCount;
	}

	public Integer getOutGovServiceCount()
	{
		return outGovServiceCount;
	}

	public void setOutGovServiceCount(Integer outGovServiceCount)
	{
		this.outGovServiceCount = outGovServiceCount;
	}

	public Integer getOutGovBusSysCount()
	{
		return outGovBusSysCount;
	}

	public void setOutGovBusSysCount(Integer outGovBusSysCount)
	{
		this.outGovBusSysCount = outGovBusSysCount;
	}

	public Integer getOutGovVirtualBusSysCount()
	{
		return outGovVirtualBusSysCount;
	}

	public void setOutGovVirtualBusSysCount(Integer outGovVirtualBusSysCount)
	{
		this.outGovVirtualBusSysCount = outGovVirtualBusSysCount;
	}

	public Integer getOutGovWebSiteCount()
	{
		return outGovWebSiteCount;
	}

	public void setOutGovWebSiteCount(Integer outGovWebSiteCount)
	{
		this.outGovWebSiteCount = outGovWebSiteCount;
	}

	public Integer getOutGovDatabaseCount()
	{
		return outGovDatabaseCount;
	}

	public void setOutGovDatabaseCount(Integer outGovDatabaseCount)
	{
		this.outGovDatabaseCount = outGovDatabaseCount;
	}

	public Integer getOutGovDeviceCount()
	{
		return outGovDeviceCount;
	}

	public void setOutGovDeviceCount(Integer outGovDeviceCount)
	{
		this.outGovDeviceCount = outGovDeviceCount;
	}

	public Integer getOutGovVirtualMachCount()
	{
		return outGovVirtualMachCount;
	}

	public void setOutGovVirtualMachCount(Integer outGovVirtualMachCount)
	{
		this.outGovVirtualMachCount = outGovVirtualMachCount;
	}

	public Integer getOutOtherServiceCount()
	{
		return outOtherServiceCount;
	}

	public void setOutOtherServiceCount(Integer outOtherServiceCount)
	{
		this.outOtherServiceCount = outOtherServiceCount;
	}

	public Integer getOutOtherBusSysCount()
	{
		return outOtherBusSysCount;
	}

	public void setOutOtherBusSysCount(Integer outOtherBusSysCount)
	{
		this.outOtherBusSysCount = outOtherBusSysCount;
	}

	public Integer getOutOtherVirtualBusSysCount()
	{
		return outOtherVirtualBusSysCount;
	}

	public void setOutOtherVirtualBusSysCount(Integer outOtherVirtualBusSysCount)
	{
		this.outOtherVirtualBusSysCount = outOtherVirtualBusSysCount;
	}

	public Integer getOutOtherWebSiteCount()
	{
		return outOtherWebSiteCount;
	}

	public void setOutOtherWebSiteCount(Integer outOtherWebSiteCount)
	{
		this.outOtherWebSiteCount = outOtherWebSiteCount;
	}

	public Integer getOutOtherDatabaseCount()
	{
		return outOtherDatabaseCount;
	}

	public void setOutOtherDatabaseCount(Integer outOtherDatabaseCount)
	{
		this.outOtherDatabaseCount = outOtherDatabaseCount;
	}

	public Integer getOutOtherDeviceCount()
	{
		return outOtherDeviceCount;
	}

	public void setOutOtherDeviceCount(Integer outOtherDeviceCount)
	{
		this.outOtherDeviceCount = outOtherDeviceCount;
	}

	public Integer getOutOtherVirtualMachCount()
	{
		return outOtherVirtualMachCount;
	}

	public void setOutOtherVirtualMachCount(Integer outOtherVirtualMachCount)
	{
		this.outOtherVirtualMachCount = outOtherVirtualMachCount;
	}

	public Integer getOutTotalServiceCount()
	{
		return outTotalServiceCount;
	}

	public void setOutTotalServiceCount(Integer outTotalServiceCount)
	{
		this.outTotalServiceCount = outTotalServiceCount;
	}

	public Integer getOutTotalBusSysCount()
	{
		return outTotalBusSysCount;
	}

	public void setOutTotalBusSysCount(Integer outTotalBusSysCount)
	{
		this.outTotalBusSysCount = outTotalBusSysCount;
	}

	public Integer getOutTotalVirtualBusSysCount()
	{
		return outTotalVirtualBusSysCount;
	}

	public void setOutTotalVirtualBusSysCount(Integer outTotalVirtualBusSysCount)
	{
		this.outTotalVirtualBusSysCount = outTotalVirtualBusSysCount;
	}

	public Integer getOutTotalWebSiteCount()
	{
		return outTotalWebSiteCount;
	}

	public void setOutTotalWebSiteCount(Integer outTotalWebSiteCount)
	{
		this.outTotalWebSiteCount = outTotalWebSiteCount;
	}

	public Integer getOutTotalDatabaseCount()
	{
		return outTotalDatabaseCount;
	}

	public void setOutTotalDatabaseCount(Integer outTotalDatabaseCount)
	{
		this.outTotalDatabaseCount = outTotalDatabaseCount;
	}

	public Integer getOutTotalDeviceCount()
	{
		return outTotalDeviceCount;
	}

	public void setOutTotalDeviceCount(Integer outTotalDeviceCount)
	{
		this.outTotalDeviceCount = outTotalDeviceCount;
	}

	public Integer getOutTotalVirtualMachCount()
	{
		return outTotalVirtualMachCount;
	}

	public void setOutTotalVirtualMachCount(Integer outTotalVirtualMachCount)
	{
		this.outTotalVirtualMachCount = outTotalVirtualMachCount;
	}
	
}

/*
*$Log: av-env.bat,v $
*/