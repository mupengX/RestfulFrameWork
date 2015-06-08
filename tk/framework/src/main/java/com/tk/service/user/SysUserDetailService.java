package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.service.BaseService;
import com.tk.orm.user.model.SysUserDetailPo;

/**
 * <pre>
 *  
 *  File: SysUserDetailService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  用户详情Service层接口
 * 
 *  Notes:
 *  $Id: SysUserDetailService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月7日上午10:01:33>>, <<Who>>, <<what>>  
 *  2015年1月7日		TK		Initial.
 * </pre>
 */
public interface SysUserDetailService extends BaseService<SysUserDetailPo, Object>
{
	/**
	 * 添加一个用户详情。
	 * 
	 * @param agencyCode
	 * @param sysUserDetailPo
	 * @throws Exception
	 */
	void createSysUserDetail(String agencyCode, SysUserDetailPo sysUserDetailPo) throws Exception;

	/**
	 * 更新一个用户详情。
	 * 
	 * @param agencyCode
	 * @param sysUserDetailPo
	 * @throws Exception
	 */
	void updateSysUserDetail(String agencyCode, SysUserDetailPo sysUserDetailPo) throws Exception;

	/**
	 * 删除一个用户详情。
	 * 
	 * @param agencyCode
	 * @param sysUserPo
	 * @throws Exception
	 */
	void deleteSysUserDetail(String agencyCode, SysUserDetailPo sysUserDetailPo) throws Exception;

	/**
	 * 根据ID删除一个用户详情。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysUserDetailById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除多个用户详情，参数为ID数组。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysUserDetailBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号查询所有的用户详情。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysUserDetailPo> getAllSysUserDetails(String agencyCode) throws Exception;

	/**
	 * 根据ID查询用户详情。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysUserDetailPo getSysUserDetailById(String agencyCode, String id) throws Exception;

}

/*
 * $Log: av-env.bat,v $
 */