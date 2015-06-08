package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.model.SysDataDictionaryTypePo;

/**
 * <pre>
 *  
 *  File: SysDataDictionaryTypeService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  数据字典类型Service层接口
 * 
 *  Notes:
 *  $Id: SysDataDictionaryTypeService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月12日下午5:17:19>>, <<Who>>, <<what>>  
 *  2015年3月12日		TK		Initial.
 * </pre>
 */
public interface SysDataDictionaryTypeService extends BaseService<SysDataDictionaryTypePo, Object>
{
	/**
	 * 添加一个数据字典类型。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryTypePo
	 * @throws Exception
	 */
	void createSysDataDictionaryType(String agencyCode, SysDataDictionaryTypePo sysDataDictionaryTypePo)
			throws Exception;

	/**
	 * 更新一个数据字典类型。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryTypePo
	 * @throws Exception
	 */
	void updateSysDataDictionaryType(String agencyCode, SysDataDictionaryTypePo sysDataDictionaryTypePo)
			throws Exception;

	/**
	 * 删除一个数据字典类型。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryTypePo
	 * @throws Exception
	 */
	void deleteSysDataDictionaryType(String agencyCode, SysDataDictionaryTypePo sysDataDictionaryTypePo)
			throws Exception;

	/**
	 * 根据ID删除一个数据字典类型。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysDataDictionaryTypeById(String agencyCode, String id) throws Exception;

	/**
	 * 根据多个ID批量删除数据字典类型。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysDataDictionaryTypeBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号和数据字典类型编号查询数据字典类型信息.
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	SysDataDictionaryTypePo getSysDataDictionaryTypeByCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据ID获取数据字典类型。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysDataDictionaryTypePo getSysDataDictionaryTypeById(String agencyCode, String id) throws Exception;
    
	/**
	 * 根据typeName获取数据字典类型。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysDataDictionaryTypePo getSysDataDictionaryTypeByName(String agencyCode, String typeName) throws Exception;
	
	/**
	 * 获取所有数据字典类型。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysDataDictionaryTypePo> getAllSysDataDictionaryTypes(String agencyCode) throws Exception;

	/**
	 * 分页获取数据字典类型。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetSysDataDictionaryTypes(String agencyCode, PageBeanDto pageBeanDto) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */