package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysRoleDto;
import com.tk.orm.user.model.SysRolePo;

/**
 * <pre>
 *  
 *  File: SysRoleSerice.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  角色Service层接口
 * 
 *  Notes:
 *  $Id: SysRoleSerice.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:35:25>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public interface SysRoleService extends BaseService<SysRolePo, Object>
{
	/**
	 * 添加一个角色
	 * 
	 * @param agencyCode
	 * @param sysRolePo
	 * @throws Exception
	 */
	void createSysRole(String agencyCode, SysRolePo sysRolePo) throws Exception;

	/**
	 * 更新一个角色
	 * 
	 * @param agencyCode
	 * @param sysRolePo
	 * @throws Exception
	 */
	void updateSysRole(String agencyCode, SysRolePo sysRolePo) throws Exception;

	/**
	 * 删除一个角色
	 * 
	 * @param agencyCode
	 * @param sysRolePo
	 * @throws Exception
	 */
	void deleteSysRole(String agencyCode, SysRolePo sysRolePo) throws Exception;

	/**
	 * 根据ID删除一个角色
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysRoleById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除多个角色，参数为ID数组
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysRoleBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号和角色名称查询角色。
	 * 
	 * @param agencyCode
	 * @param name
	 * @return
	 * @throws Exception
	 */
	SysRolePo getSysRoleByName(String agencyCode, String name) throws Exception;

	/**
	 * 根据机构编号和角色编号查询角色。
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysRolePo getSysRoleByCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据ID查询角色
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysRolePo getSysRoleById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编号查询所有角色, 传递userID解决缓存问题，因为管理员和普通用户看到的是不一样的.
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysRolePo> getAllSysRoles(String agencyCode, String userID) throws Exception;

	/**
	 * 根据机构编号查询所有角色DTO, 传递userID解决缓存问题，因为管理员和普通用户看到的是不一样的.
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysRoleDto> getAllSysRoleDtos(String agencyCode, String userID) throws Exception;

	/**
	 * 分页查询角色, 传递userID解决缓存问题，因为管理员和普通用户看到的是不一样的。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetRoles(String agencyCode, PageBeanDto pageBeanDto, String userID) throws Exception;

	/**
	 * 将PO对象转换为DTO对象。
	 * 
	 * @param agencyCode
	 * @param po
	 * @return
	 * @throws Exception
	 */
	SysRoleDto transformPo2Dto(String agencyCode, SysRolePo po) throws Exception;

	/**
	 * 将PO对象集合转换为DTO对象集合。
	 * 
	 * @param agencyCode
	 * @param pos
	 * @return
	 * @throws Exception
	 */
	List<SysRoleDto> transformPos2Dtos(String agencyCode, List<SysRolePo> pos) throws Exception;

}
