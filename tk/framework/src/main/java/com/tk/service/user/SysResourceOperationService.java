package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysResourceOperationDto;
import com.tk.orm.user.model.SysResourceOperationPo;

/**
 * <pre>
 *  
 *  File: SysResourceOperationService.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  资源操作Service层接口
 * 
 *  Notes:
 *  $Id: SysResourceOperationService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:35:06>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public interface SysResourceOperationService extends BaseService<SysResourceOperationPo, Object>
{
	/**
	 * 添加一个资源操作
	 * 
	 * @param agencyCode
	 * @param sysResourceOperationPo
	 * @throws Exception
	 */
	void createSysResourceOperation(String agencyCode, SysResourceOperationPo sysResourceOperationPo) throws Exception;

	/**
	 * 更新一个资源操作
	 * 
	 * @param agencyCode
	 * @param sysResourceOperationPo
	 * @throws Exception
	 */
	void updateSysResourceOperation(String agencyCode, SysResourceOperationPo sysResourceOperationPo) throws Exception;

	/**
	 * 删除一个资源操作
	 * 
	 * @param agencyCode
	 * @param sysResourceOperationPo
	 * @throws Exception
	 */
	void deleteSysResourceOperation(String agencyCode, SysResourceOperationPo sysResourceOperationPo) throws Exception;

	/**
	 * 根据ID删除一个资源操作
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysResourceOperationById(String agencyCode, String id) throws Exception;

	/**
	 * 批量删除多个资源操作，参数为ID数组
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysResourceOperationBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据ID查询资源操作
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysResourceOperationPo getSysResourceOperationById(String agencyCode, String id) throws Exception;

	/**
	 * 根据机构编号查询所有的资源操作
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationPo> getAllSysResourceOperations(String agencyCode) throws Exception;

	/**
	 * 根据机构编号查询所有的资源操作DTO
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationDto> getAllSysResourceOperationDtos(String agencyCode) throws Exception;

	/**
	 * 分页查询用户
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetResourceOperations(String agencyCode, PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 从项目中获取所有的AgencyAPI.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationDto> getAgencyResourceOpsFromPro() throws Exception;

	/**
	 * 同步资源.
	 * 
	 * @param agencyCode
	 * @param pos
	 * @throws Exception
	 */
	void refreshResourceOp2Synchro(String agencyCode, List<SysResourceOperationPo> pos) throws Exception;

	/**
	 * 将PO对象转换为DTO对象。
	 * 
	 * @param agencyCode
	 * @param po
	 * @return
	 * @throws Exception
	 */
	SysResourceOperationDto transformPo2Dto(String agencyCode, SysResourceOperationPo po) throws Exception;

	/**
	 * 将PO对象集合转换为DTO对象集合。
	 * 
	 * @param agencyCode
	 * @param pos
	 * @return
	 * @throws Exception
	 */
	List<SysResourceOperationDto> transformPos2Dtos(String agencyCode, List<SysResourceOperationPo> pos)
			throws Exception;

}
