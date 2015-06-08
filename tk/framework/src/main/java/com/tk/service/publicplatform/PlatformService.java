package com.tk.service.publicplatform;

import com.tk.orm.publicplatform.dto.PlatformBaseInfoDto;

/**
 * <pre> 
 *  
 *  File: PlatformService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformService.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日上午11:49:04>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
public interface PlatformService
{
	/**
	 * 
	 * 添加公共平台基本信息.
	 *
	 * @param baseInfoDto
	 * @param deptId
	 * @return
	 */
	public boolean addPlatformBaseInfo(PlatformBaseInfoDto baseInfoDto) throws Exception;
	
	/**
	 * 更新公共平台基本信息
	 *
	 * @param baseInfoDto
	 * @return
	 */
	public boolean updatePlatformBaseInfo(PlatformBaseInfoDto baseInfoDto) throws Exception;
	
	/**
	 * 
	 * 是否是一个存在的公共平台基本信息ID.
	 *
	 * @param deptId
	 * @return
	 */
	public boolean isExistsPlatformBaseInfo(String deptId) throws Exception;
	
	/**
	 * 
	 * 查看是否有指定年份的数据.
	 *
	 * @param year
	 * @param deptId
	 * @return
	 * @throws Exception
	 */
	public boolean isExistsPlatformBaseInfoByYear(int year, String deptId) throws Exception;
	
	/**
	 * 
	 * 获取公共平台基本信息.
	 *
	 * @param id
	 * @return
	 */
	public PlatformBaseInfoDto getPlatformBaseInfoDtoByDept(String deptId) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/