package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysDepartmentWithUserInDto;
import com.tk.orm.user.model.SysDepartmentPo;
import com.tk.orm.user.model.SysRolePo;
import com.tk.orm.user.model.SysUserDetailPo;
import com.tk.orm.user.model.SysUserPo;

/**
 * <pre>
 *  
 *  File: SysDepartmentService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  部门Service层接口
 * 
 *  Notes:
 *  $Id: SysDepartmentService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月7日上午10:02:49>>, <<Who>>, <<what>>  
 *  2015年1月7日		TK		Initial.
 * </pre>
 */
public interface SysDepartmentService extends BaseService<SysDepartmentPo, Object>
{
	/**
	 * 添加一个部门。
	 * 
	 * @param agencyCode
	 * @param sysDepartmentPo
	 * @throws Exception
	 */
	void createSysDepartment(String agencyCode, SysDepartmentPo sysDepartmentPo) throws Exception;

	/**
	 * 更新一个部门。
	 * 
	 * @param agencyCode
	 * @param sysDepartmentPo
	 * @throws Exception
	 */
	void updateSysDepartment(String agencyCode, SysDepartmentPo sysDepartmentPo) throws Exception;

	/**
	 * 删除一个部门。
	 * 
	 * @param agencyCode
	 * @param sysDepartmentPo
	 * @throws Exception
	 */
	void deleteSysDepartment(String agencyCode, SysDepartmentPo sysDepartmentPo) throws Exception;

	/**
	 * 根据ID删除一个部门。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysDepartmentById(String agencyCode, String id) throws Exception;

	/**
	 * 根据多个ID批量删除部门。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysDepartmentBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号和部门名称查询部门信息.
	 * 
	 * @param agencyCode
	 * @param name
	 * @return
	 * @throws Exception
	 */
	SysDepartmentPo getSysDepartmentByName(String agencyCode, String name) throws Exception;

	/**
	 * 根据机构编号和部门编号查询部门信息.
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysDepartmentPo getSysDepartmentByCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据机构编号和部门编号模糊查询部门信息.
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	List<SysDepartmentPo> getSysDepartmentLikeCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据ID获取部门。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysDepartmentPo getSysDepartmentById(String agencyCode, String id) throws Exception;

	/**
	 * 获取所有部门。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysDepartmentPo> getAllSysDepartments(String agencyCode) throws Exception;

	/**
	 * 根据指定部门的子部门。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<SysDepartmentPo> getChildDepartments(String agencyCode, String id) throws Exception;

	/**
	 * 分页获取部门。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetDepartments(String agencyCode, PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 创建部门并为该部门添加一个管理员.
	 * 
	 * @param agencyCode
	 * @param deptPo
	 * @param userPo
	 * @param userDetailPo
	 * @param roles
	 * @throws Exception
	 */
	void createSysDepartmentWithUser(String agencyCode, SysDepartmentPo deptPo, SysUserPo userPo,
			SysUserDetailPo userDetailPo, List<SysRolePo> roles) throws Exception;

	/**
	 * 删除部门及该部门下所有用户.
	 * 
	 * @param agencyCode
	 * @param deptID
	 * @throws Exception
	 */
	void deleteSysDepartmentWithUser(String agencyCode, String deptID) throws Exception;

	/**
	 * 根据地区编号查询管辖地区信息.
	 * 
	 * @param agencyCode
	 * @param districtCode
	 * @throws Exception
	 */
	String getJurisdictionsByDistrictCode(String agencyCode, String districtCode) throws Exception;

	/**
	 * 分页获取部门(针对SOIS)。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetDepartments4SOIS(String agencyCode, PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 根据ID获取部门(针对SOIS)。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysDepartmentWithUserInDto getSysDepartmentById4SOIS(String agencyCode, String id) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */