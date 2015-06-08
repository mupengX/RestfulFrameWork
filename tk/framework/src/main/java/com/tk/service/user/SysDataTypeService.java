package com.tk.service.user;

import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.dto.SysDataTypeDto;
import com.tk.orm.user.model.SysDataTypePo;

/**
 * <pre> 
 *  
 *  File: SysDataType.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: SysDataType.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月25日上午11:12:42>>, <<Who>>, <<what>>  
 *  2015年5月25日		cy		Initial.
 * </pre>
 */
public interface SysDataTypeService extends BaseService<SysDataTypePo, Object>
{
	
	/**
	 * 
	 * 获取所有的数据类型.
	 *
	 * @param agencyCode
	 * @return
	 */
	public List<SysDataTypePo> getAllSysDataTypes();
	
	/**
	 * 
	 * 获取所有的数据类型.
	 *
	 * @param agencyCode
	 * @return
	 */
	public List<SysDataTypePo> getAllSysDataTypesByParentId(String parentId) throws Exception;
	
	/**
	 * 通过ID获取数据类型
	 * TODO.
	 *
	 * @param id
	 * @return
	 */
	public SysDataTypePo getSysDataTypeById(String id);
	
	/**
	 * 根据名称获取数据类型
	 *
	 * @param dto
	 * @return
	 */
	public SysDataTypePo getSysDataTypeByName(SysDataTypeDto dto) throws Exception;

	/**
	 * 根据编码获取数据类型
	 *
	 * @param dto
	 * @return
	 */
	public SysDataTypePo getSysDataTypeByCode(String code) throws Exception;

	public PageBeanDto pageGetSysDataTypes(PageBeanDto pageBeanDto) throws Exception;
	
	public PageBeanDto pageGetSysDataTypesByParentId(String parentId, PageBeanDto pageBeanDto) throws Exception;
	
	/**
	 * 根据code获取下面的所有品牌.
	 *
	 * @return
	 * @throws Exception
	 */
	public List<SysDataTypePo> getSoftwareProductByCode(String code) throws Exception;
	
	/**
	 * 根据父code获取子节点
	 */
	public List<SysDataTypePo> getDataTypeByParentCode(String parentCode) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/