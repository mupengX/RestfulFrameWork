package com.tk.service.publicplatform;

import com.tk.framework.service.BaseService;
import com.tk.orm.publicplatform.model.PlatformDetailgovNetModel;


/**
 * <pre>
 *  
 *  File: PlatformDetailgovNetService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  公共平台网络统一  service层接口 
 * 
 *  Notes:
 *  $Id: PlatformDetailgovNetService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年5月21日下午3:04:08>>, <<Who>>, <<what>>  
 *  2015年5月21日		TK		Initial.
 * </pre>
 */
public interface PlatformDetailgovNetService extends BaseService<PlatformDetailgovNetModel, Object>
{
	/**
	 * @param ReportDeptId 根据部门ID获取网络数据
	 * @return
	 * @throws Exception
	 */
	public Object getPlatformDetailgovNetByReportDeptId(String reportDeptId, String netType) throws Exception;

	/**
	 * @param platformDetailgovNetDto 修改网络信息
	 * @return
	 * @throws Exception
	 */
	public void updatePlatformDetailgovNet(PlatformDetailgovNetModel detailgovNetModel) throws Exception;

	/**
	 * @param platformDetailgovNetDto 增加网络信息
	 * @return
	 * @throws Exception
	 */
	public void addPlatformDetailgovNet(PlatformDetailgovNetModel detailgovNetModel) throws Exception;

	/**
	 * @param id 删除某条网络信息
	 * @return
	 * @throws Exception
	 */
	public void deletePlatformDetailgovNet(String id) throws Exception;

}

/*
 * $Log: av-env.bat,v $
 */