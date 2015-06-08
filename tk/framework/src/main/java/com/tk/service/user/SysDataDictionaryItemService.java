package com.tk.service.user;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.user.model.SysDataDictionaryItemPo;

/**
 * <pre>
 *  
 *  File: SysDataDictionaryItemService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  数据字典条目Service层接口
 * 
 *  Notes:
 *  $Id: SysDataDictionaryItemService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月12日下午5:18:16>>, <<Who>>, <<what>>  
 *  2015年3月12日		TK		Initial.
 * </pre>
 */
public interface SysDataDictionaryItemService extends BaseService<SysDataDictionaryItemPo, Object>
{
	/**
	 * 添加一个数据字典条目。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryItemPo
	 * @throws Exception
	 */
	void createSysDataDictionaryItem(String agencyCode, SysDataDictionaryItemPo sysDataDictionaryItemPo)
			throws Exception;

	/**
	 * 更新一个数据字典条目。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryItemPo
	 * @throws Exception
	 */
	void updateSysDataDictionaryItem(String agencyCode, SysDataDictionaryItemPo sysDataDictionaryItemPo)
			throws Exception;

	/**
	 * 删除一个数据字典条目。
	 * 
	 * @param agencyCode
	 * @param sysDataDictionaryItemPo
	 * @throws Exception
	 */
	void deleteSysDataDictionaryItem(String agencyCode, SysDataDictionaryItemPo sysDataDictionaryItemPo)
			throws Exception;

	/**
	 * 根据ID删除一个数据字典条目。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteSysDataDictionaryItemById(String agencyCode, String id) throws Exception;

	/**
	 * 根据多个ID批量删除数据字典条目。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteSysDataDictionaryItemBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据机构编号和数据字典类型ID查询数据字典条目信息.
	 * 
	 * @param agencyCode
	 * @param typeID
	 * @return
	 * @throws Exception
	 */
	List<SysDataDictionaryItemPo> getSysDataDictionaryItemsByTypeID(String agencyCode, String typeID) throws Exception;

	/**
	 * 根据机构编号和数据字典类型编号查询数据字典条目信息.
	 * 
	 * @param agencyCode
	 * @param typeCode
	 * @return
	 * @throws Exception
	 */
	List<SysDataDictionaryItemPo> getSysDataDictionaryItemsByTypeCode(String agencyCode, String typeCode)
			throws Exception;

	/**
	 * 根据ID获取数据字典条目。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	SysDataDictionaryItemPo getSysDataDictionaryItemById(String agencyCode, String id) throws Exception;

	/**
	 * 获取所有数据字典条目。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<SysDataDictionaryItemPo> getAllSysDataDictionaryItems(String agencyCode) throws Exception;

	/**
	 * 分页获取数据字典类型下的条目。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @param typeId
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetSysDataDictionaryItemsByTypeId(String agencyCode, PageBeanDto pageBeanDto, String typeId)
			throws Exception;

	/**
	 * 根据属性及值模糊查询.
	 * 
	 * @param agencyCode
	 * @param attr
	 * @param value
	 * @return
	 * @throws Exception
	 */
	List<SysDataDictionaryItemPo> getSysDataDictionaryItemsLikeAttr(String agencyCode, String attr, String value)
			throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */