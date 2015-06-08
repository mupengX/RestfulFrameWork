package com.tk.service.publicplatform;

import java.util.List;

import com.tk.framework.rest.framework.model.MultipleObjectResultModel;
import com.tk.orm.publicplatform.dto.PlatformDetailDto;
import com.tk.orm.publicplatform.dto.PlatformDetailSoftwareDto;

/**
 * <pre> 
 *  
 *  File: PlatformDetailSoftwareService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  明细_软件
 * 
 *  Notes:
 *  $Id: PlatformDetailSoftwareService.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月19日下午3:48:45>>, <<Who>>, <<what>>  
 *  2015年5月19日		cy		Initial.
 * </pre>
 */
public interface PlatformDetailSoftwareService
{
	/**
	 * 
	 * 保存数据.
	 *
	 * @param platformDetailSoftwareDto
	 * @param deptId
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public List<MultipleObjectResultModel> saveOrUpdatePlatformDetailSoftware(PlatformDetailDto platformDetailSoftwareDto, String deptId, String uid) throws Exception;
	
	/**
	 * 
	 * 获取数据.
	 *
	 * @param typeCode	平台管理软件|公共应用系统
	 * @param networkTypeCode 内外网类型
	 * @param deptId 部门ID
	 * @return
	 * @throws Exception
	 */
	public List<PlatformDetailSoftwareDto> getPlatformDetailSoftware(String typeCode, String networkTypeCode, String deptId) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/