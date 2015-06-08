package com.tk.service.publicplatform;

import java.util.List;

import com.tk.framework.rest.framework.model.MultipleObjectResultModel;
import com.tk.orm.publicplatform.dto.PlatformDetailAppSystemDto;
import com.tk.orm.publicplatform.dto.PlatformDetailDto;
import com.tk.orm.publicplatform.dto.PlatformDetailAppSystemDto;

/**
 * <pre> 
 *  
 *  File: PlatformDetailAppSystemService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailAppSystemService.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月20日下午3:58:05>>, <<Who>>, <<what>>  
 *  2015年5月20日		cy		Initial.
 * </pre>
 */
public interface PlatformDetailAppSystemService
{
	/**
	 * 
	 * 保存数据.
	 *
	 * @param platformDetailAppSystemDto
	 * @param deptId
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public List<MultipleObjectResultModel> saveOrUpdatePlatformDetailAppSystem(PlatformDetailDto platformDetailAppSystemDto, String deptId, String uid) throws Exception;
	
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
	public List<PlatformDetailAppSystemDto> getPlatformDetailAppSystem(String typeCode, String networkTypeCode, String deptId) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/