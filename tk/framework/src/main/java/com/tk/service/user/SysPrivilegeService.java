package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysPrivilegeDto;
import com.tk.orm.user.model.SysPrivilegePo;
import com.tk.orm.user.model.SysResourceOperationPo;
import com.tk.orm.user.model.SysRolePo;

/**
 * <pre>
 *  
 *  File: SysPrivilegeService.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  权限Service层接口
 * 
 *  Notes:
 *  $Id: SysPrivilegeService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:34:53>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public interface SysPrivilegeService extends BaseService<SysPrivilegePo, Object>
{
	/**
	 * 添加一条权限记录
	 * 
	 * @param agencyCode
	 * @param sysPrivilegePo
	 * @throws Exception
	 */
	void createSysPrivilege(String agencyCode, SysPrivilegePo sysPrivilegePo) throws Exception;

	/**
	 * 更新一条权限记录
	 * 
	 * @param agencyCode
	 * @param sysPrivilegePo
	 * @throws Exception
	 */
	void updateSysPrivilege(String agencyCode, SysPrivilegePo sysPrivilegePo) throws Exception;

	/**
	 * 删除一条权限记录
	 * 
	 * @param agencyCode
	 * @param sysPrivilegePo
	 * @throws Exception
	 */
	void deleteSysPrivilege(String agencyCode, SysPrivilegePo sysPrivilegePo) throws Exception;

	/**
	 * 根据ID删除一条权限记录
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysPrivilegeById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除权限记录，参数为ID数组
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysPrivilegeBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据ID查询权限
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysPrivilegePo getSysPrivilegeById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编码查询所有权限
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getAllSysPrivileges(String agencyCode) throws Exception;

	/**
	 * 根据角色ID查询所有的权限，这里的角色ID对应角色表中的物理主键
	 * 
	 * @param agencyCode
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getSysPrivilegesByRoleId(String agencyCode, String roleId) throws Exception;

	/**
	 * 根据用户ID查询所有的权限，这里的用户ID对应用户表中的物理主键
	 * 
	 * @param agencyCode
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getSysPrivilegesByUserId(String agencyCode, String userId) throws Exception;

	/**
	 * 查询用户是否有操作该资源的权限
	 * 
	 * @param agencyCode
	 * @param userId
	 * @param resource
	 * @param operate
	 * @return
	 * @throws Exception
	 */
	boolean isPermission(String agencyCode, String userId, String resource, String operate) throws Exception;

	/**
	 * 查询角色允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getFullResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询角色只读的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getReadOnlyResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询角色不允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getNotResourceOpsByRole(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询用户允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getFullResourceOpsByUser(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户只读的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getReadOnlyResourceOpsByUser(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户不允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getNotResourceOpsByUser(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户扮演的角色允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getFullSysResourceOpsByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户扮演的角色只读的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getReadOnlySysResourceOpsByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户扮演的角色不允许的资源操作。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getNotSysResourceOpsByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 根据用户ID删除不允许的权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @throws Exception
	 */
	void deletePrivilegeNotByUserId(String agencyCode, String userID) throws Exception;

	/**
	 * 根据用户ID删除只读的权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @throws Exception
	 */
	void deletePrivilegeReadOnlyByUserId(String agencyCode, String userID) throws Exception;

	/**
	 * 根据角色ID删除允许的权限。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @throws Exception
	 */
	void deletePrivilegeFullByRoleId(String agencyCode, String roleID) throws Exception;

	/**
	 * 根据角色ID删除只读的权限。
	 * 
	 * @param agencyCode
	 * @param roleID
	 * @throws Exception
	 */
	void deletePrivilegeReadOnlyByRoleId(String agencyCode, String roleID) throws Exception;

	/**
	 * 查询对资源操作允许的角色。
	 * 
	 * @param agencyCode
	 * @param resOpID
	 * @return
	 * @throws Exception
	 */
	List<SysRolePo> getFullRolesByResourceOp(String agencyCode, String resOpID) throws Exception;

	/**
	 * 查询对资源操作为只读的角色。
	 * 
	 * @param agencyCode
	 * @param resOpID
	 * @return
	 * @throws Exception
	 */
	List<SysRolePo> getReadOnlyRolesByResourceOp(String agencyCode, String resOpID) throws Exception;

	/**
	 * 查询对资源操作为不允许的角色。
	 * 
	 * @param agencyCode
	 * @param resOpID
	 * @return
	 * @throws Exception
	 */
	List<SysRolePo> getNotRolesByResourceOp(String agencyCode, String resOpID) throws Exception;

	/**
	 * 查询用户扮演的角色允许的权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getFullPrivilegesByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 查询用户扮演的角色只读的权限。
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getReadOnlyPrivilegesByUserRole(String agencyCode, String userID) throws Exception;

	/**
	 * 将权限PO对象转换为DTO对象，主要是处理DTO对象中的权限主体和资源操作。
	 * 
	 * @param agencyCode
	 * @param sysPrivilegePo
	 * @return
	 * @throws Exception
	 */
	SysPrivilegeDto transformSysPrivilegePo2Dto(String agencyCode, SysPrivilegePo sysPrivilegePo) throws Exception;

	/**
	 * 为权限主体分配资源操作.
	 * 
	 * @param pmType
	 * @param pmID
	 * @param permission
	 * @param resops
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> saveResourceOps4PM(String pmType, String pmID, String permission, String resops)
			throws Exception;

	/**
	 * 根据资源操作ID获取相关权限数据.
	 * 
	 * @param agencyCode
	 * @param resOpID
	 * @return
	 * @throws Exception
	 */
	List<SysPrivilegePo> getPrivilegesByReourceOpId(String agencyCode, String resOpID) throws Exception;
}
