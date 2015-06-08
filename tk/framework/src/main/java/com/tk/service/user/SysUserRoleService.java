package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.service.BaseService;
import com.tk.orm.user.model.SysRolePo;
import com.tk.orm.user.model.SysUserPo;
import com.tk.orm.user.model.SysUserRolePo;

/**
 * <pre>
 *  
 *  File: SysUserRoleService.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  用户角色关系Service层接口
 * 
 *  Notes:
 *  $Id: SysUserRoleService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:35:40>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public interface SysUserRoleService extends BaseService<SysUserRolePo, Object>
{
	/**
	 * 添加一个用户角色关系
	 * 
	 * @param agencyCode
	 * @param sysUserRolePo
	 * @throws Exception
	 */
	void createSysUserRolePo(String agencyCode, SysUserRolePo sysUserRolePo) throws Exception;

	/**
	 * 更新一个用户角色关系
	 * 
	 * @param agencyCode
	 * @param sysUserRolePo
	 * @throws Exception
	 */
	void updateSysUserRolePo(String agencyCode, SysUserRolePo sysUserRolePo) throws Exception;

	/**
	 * 删除一个用户角色关系
	 * 
	 * @param agencyCode
	 * @param sysUserRolePo
	 * @throws Exception
	 */
	void deleteSysUserRolePo(String agencyCode, SysUserRolePo sysUserRolePo) throws Exception;

	/**
	 * 根据ID删除一个用户角色关系
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysUserRolePoById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除多个用户关系，参数为ID数组
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysUserRolePoBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据ID查询用户角色关系
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysUserRolePo getSysUserRoleById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编号查询所有用户角色关系
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysUserRolePo> getAllSysUserRoles(String agencyCode) throws Exception;

	/**
	 * 根据机构编号和用户ID查询用户所有的角色，这里的用户ID对应用户表中的物理主键
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysRolePo> getSysRolesByUserId(String agencyCode, String userID) throws Exception;

	/**
	 * 根据角色ID查询角色下的所有用户，这里的角色ID对应角色表中的物理主键
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<SysUserPo> getSysUsersByRoleId(String agencyCode, String roleID) throws Exception;

	/**
	 * 根据用户ID删除用户角色关系。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @throws Exception
	 */
	void deleteSysUserRolesByUserId(String agencyCode, String userID) throws Exception;

	/**
	 * 根据角色ID删除用户角色关系。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @throws Exception
	 */
	void deleteSysUserRolesByRoleId(String agencyCode, String roleID) throws Exception;
}
