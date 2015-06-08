package com.tk.service.resourceui;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.service.BaseService;
import com.tk.orm.resourceui.model.ResourceUIPo;
import com.tk.orm.resourceui.model.ResourceUIPrivilegePo;

/**
 * <pre>
 *  
 *  File: ResourceUIPrivilegeService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  UI资源UI权限Service层接口
 * 
 *  Notes:
 *  $Id: ResourceUIPrivilegeService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月25日上午10:04:34>>, <<Who>>, <<what>>  
 *  2015年3月25日		TK		Initial.
 * </pre>
 */
public interface ResourceUIPrivilegeService extends BaseService<ResourceUIPrivilegePo, Object>
{
	/**
	 * 添加一条UI权限记录
	 * 
	 * @param agencyCode
	 * @param resourceUIPrivilegePo
	 * @throws Exception
	 */
	void createResourceUIPrivilege(String agencyCode, ResourceUIPrivilegePo resourceUIPrivilegePo) throws Exception;

	/**
	 * 更新一条UI权限记录
	 * 
	 * @param agencyCode
	 * @param resourceUIPrivilegePo
	 * @throws Exception
	 */
	void updateResourceUIPrivilege(String agencyCode, ResourceUIPrivilegePo resourceUIPrivilegePo) throws Exception;

	/**
	 * 删除一条UI权限记录
	 * 
	 * @param agencyCode
	 * @param resourceUIPrivilegePo
	 * @throws Exception
	 */
	void deleteResourceUIPrivilege(String agencyCode, ResourceUIPrivilegePo resourceUIPrivilegePo) throws Exception;

	/**
	 * 根据ID删除一条UI权限记录
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteResourceUIPrivilegeById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除UI权限记录，参数为ID数组
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteResourceUIPrivilegeBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据ID查询UI权限
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ResourceUIPrivilegePo getResourceUIPrivilegeById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编码查询所有UI权限
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPrivilegePo> getAllResourceUIPrivileges(String agencyCode) throws Exception;

	/**
	 * 根据角色ID查询所有的UI权限，这里的角色ID对应角色表中的物理主键
	 * 
	 * @param agencyCode
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPrivilegePo> getResourceUIPrivilegesByRoleId(String agencyCode, String roleId) throws Exception;

	/**
	 * 查询角色允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getFullResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询角色只读的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getReadOnlyResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询角色不允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getNotResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 根据角色ID删除允许的UI权限。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @throws Exception
	 */
	void deletePrivilegeFullByRoleId(String agencyCode, String roleID) throws Exception;

	/**
	 * 根据角色ID删除只读的UI权限。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @throws Exception
	 */
	void deletePrivilegeReadOnlyByRoleId(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询用户扮演的角色允许的UI权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPrivilegePo> getFullPrivilegesByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户扮演的角色只读的UI权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPrivilegePo> getReadOnlyPrivilegesByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 为UI权限主体分配资源操作.
	 * 
	 * @param pmType
	 * @param pmID
	 * @param permission
	 * @param resops
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPrivilegePo> saveResourceUIs4PM(String pmType, String pmID, String permission, String resops)
			throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */