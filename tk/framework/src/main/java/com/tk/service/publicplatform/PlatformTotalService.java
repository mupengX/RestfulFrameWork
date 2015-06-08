package com.tk.service.publicplatform;

import java.util.List;

import com.tk.orm.publicplatform.dto.PlatformTotalHardwareDto;
import com.tk.orm.publicplatform.dto.PlatformTotalInOutAppDto;
import com.tk.orm.publicplatform.dto.PlatformTotalSoftwareDto;

/**
 * <pre> 
 *  
 *  File: PlatformTotalService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  汇总服务类
 * 
 *  Notes:
 *  $Id: PlatformTotalService.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月27日下午5:42:31>>, <<Who>>, <<what>>  
 *  2015年5月27日		cy		Initial.
 * </pre>
 */
public interface PlatformTotalService
{
	
	/**
	 * 
	 * 进行汇总，由软硬件明细修改触发。
	 *
	 */
	public void updatePlatformTotalInfoBySoftHardwareDetailChange()
			throws Exception;
	
	/**
	 * 进行汇总，由应用系统明细修改触发。
	 *
	 */
	public void updatePlatformTotalInfoByAppSystemDetailChange()
			throws Exception;
	
	/**
	 * 获取指定年份硬件汇总
	 */
	public List<PlatformTotalHardwareDto> getHardwareTotalInfo(int year,
		String uid, String deptId) throws Exception;
	
	/**
	 * 获取指定年份软件汇总
	 */
	public List<PlatformTotalSoftwareDto> getSoftwareTotalInfo(int year,
		String uid, String deptId) throws Exception;
	
	/**
	 * 获取指定年份应用系统汇总
	 */
	public PlatformTotalInOutAppDto getAppSysTotalInfo(int year,
		String uid, String deptId) throws Exception;
	
}

/*
*$Log: av-env.bat,v $
*/