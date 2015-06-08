package com.tk.service.govplatform;

import com.tk.orm.govplaform.dto.GovInfoDto;
import com.tk.orm.govplaform.model.GovInfoBasePo;


/**
 * <pre> 
 *  
 *  File: GovInfoService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: GovInfoService.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日上午11:49:04>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
public interface GovInfoService
{
	
	/**
	 * 
	 * 获取公共平台基本信息.
	 *
	 * @param id
	 * @return
	 */
	public GovInfoDto getGovInfoDtoByDept(String deptId) throws Exception;
	/**
	 * 
	 * 添加公共平台基本信息.
	 *
	 * @param baseInfoDto
	 * @param deptId
	 * @return
	 */
	public boolean addGovInfoByDept(GovInfoDto govInfoDto) throws Exception;
	/**
	 * 更新公共平台基本信息
	 *
	 * @param baseInfoDto
	 * @return
	 */
	public boolean updateGovInfo(GovInfoBasePo govInfoBasePo) throws Exception;
	
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
	public GovInfoBasePo getPlatformBaseInfoDtoByDept(String deptId) throws Exception;
	/**
	 * 
	 * 查看是否有指定年份的数据.
	 *
	 * @param year
	 * @param deptId
	 * @return
	 * @throws Exception
	 */
	public boolean deleteInvest(String id) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/