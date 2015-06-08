package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysUserDto;
import com.tk.orm.user.model.SysDepartmentPo;
import com.tk.orm.user.model.SysRolePo;
import com.tk.orm.user.model.SysUserDetailPo;
import com.tk.orm.user.model.SysUserPo;

/**
 * <pre>
 *  
 *  File: SysUserService.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  用户Service层接口
 * 
 *  Notes:
 *  $Id: SysUserService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:35:52>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public interface SysUserService extends BaseService<SysUserPo, Object>
{
	/**
	 * 添加一个用户。
	 * 
	 * @param agencyCode
	 * @param sysUserPo
	 * @throws Exception
	 */
	void createSysUser(String agencyCode, SysUserPo sysUserPo) throws Exception;

	/**
	 * 添加一个用户, 并建立用户角色关系、用户部门关系、用户详情等。
	 * 
	 * @param agencyCode
	 * @param sysUser
	 * @param roles
	 * @param department
	 * @param userDetail
	 * @throws Exception
	 */
	void createSysUser(String agencyCode, SysUserPo sysUser, List<SysRolePo> roles, SysDepartmentPo department,
			SysUserDetailPo userDetail) throws Exception;

	/**
	 * 更新一个用户。
	 * 
	 * @param agencyCode
	 * @param sysUserPo
	 * @throws Exception
	 */
	void updateSysUser(String agencyCode, SysUserPo sysUserPo) throws Exception;

	/**
	 * 更新一个用户, 并建立用户角色关系、用户部门关系、用户详情等。
	 * 
	 * @param agencyCode
	 * @param sysUser
	 * @param roles
	 * @param department
	 * @param userDetail
	 * @throws Exception
	 */
	void updateSysUser(String agencyCode, SysUserPo sysUser, List<SysRolePo> roles, SysDepartmentPo department,
			SysUserDetailPo userDetail) throws Exception;

	/**
	 * 删除一个用户。
	 * 
	 * @param agencyCode
	 * @param sysUserPo
	 * @throws Exception
	 */
	void deleteSysUser(String agencyCode, SysUserPo sysUserPo) throws Exception;

	/**
	 * 根据ID删除一个用户。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysUserById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除多个用户，参数为ID数组。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysUserBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号和用户ID查询用户，其中用户ID是用户唯一标识，与物理主键不同。
	 * 
	 * @param agencyCode
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	SysUserPo getSysUserByUserId(String agencyCode, String userId) throws Exception;

	/**
	 * 根据编号查询用户。
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysUserPo getSysUserByCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据部门查询用户。
	 * 
	 * @param agencyCode
	 * @param deptID
	 * @return
	 * @throws Exception
	 */
	List<SysUserPo> getSysUserByDeptID(String agencyCode, String deptID) throws Exception;

	/**
	 * 根据ID查询用户。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysUserPo getSysUserById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编号查询所有的用户。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysUserPo> getAllSysUsers(String agencyCodeo, String userID) throws Exception;

	/**
	 * 根据机构编号查询所有的用户DTO。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysUserDto> getAllSysUserDtos(String agencyCodeo, String userID) throws Exception;

	/**
	 * 分页查询用户, 传递userID解决缓存问题，因为管理员和普通用户看到的是不一样的。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetUsers(String agencyCode, PageBeanDto pageBeanDto, String userID) throws Exception;

	/**
	 * 将用户PO对象转换为DTO对象，主要是处理DTO对象中的角色。
	 * 
	 * @param agencyCode
	 * @param userPo
	 * @return
	 * @throws Exception
	 */
	SysUserDto transformSysUserPo2Dto(String agencyCode, SysUserPo userPo) throws Exception;

	/**
	 * 将用户PO对象集合转换为DTO对象集合，主要是处理DTO对象中的角色、部门和详细信息。
	 * 
	 * @param agencyCode
	 * @param userPos
	 * @return
	 * @throws Exception
	 */
	List<SysUserDto> transformSysUserPoList2DtoList(String agencyCode, List<SysUserPo> userPos) throws Exception;

	/**
	 * 清除用户DTO部分属性，比如：angencyCode和userPwd.
	 * 
	 * @param sysUserDto
	 * @throws Exception
	 */
	void cleanOutUserDto(SysUserDto sysUserDto) throws Exception;

	/**
	 * 判断机构用户是否管理员.
	 * 
	 * @param agencyCode
	 * @param userID
	 * @return
	 * @throws Exception
	 */
	boolean getBoolIsAdmin(String agencyCode, String userID) throws Exception;
}
