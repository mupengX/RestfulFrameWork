package com.tk.service.resourceui;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.resourceui.dto.ResourceUIOutDto;
import com.tk.orm.resourceui.model.ResourceUIPo;

/**
 * <pre>
 *  
 *  File: ResourceUIService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  UI资源Service层接口
 * 
 *  Notes:
 *  $Id: ResourceUIService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月25日上午10:03:20>>, <<Who>>, <<what>>  
 *  2015年3月25日		TK		Initial.
 * </pre>
 */
public interface ResourceUIService extends BaseService<ResourceUIPo, Object>
{
	/**
	 * 添加一个UI资源。
	 * 
	 * @param agencyCode
	 * @param resourceUIPo
	 * @throws Exception
	 */
	void createResourceUI(String agencyCode, ResourceUIPo resourceUIPo) throws Exception;

	/**
	 * 更新一个UI资源。
	 * 
	 * @param agencyCode
	 * @param resourceUIPo
	 * @throws Exception
	 */
	void updateResourceUI(String agencyCode, ResourceUIPo resourceUIPo) throws Exception;

	/**
	 * 删除一个UI资源。
	 * 
	 * @param agencyCode
	 * @param resourceUIPo
	 * @throws Exception
	 */
	void deleteResourceUI(String agencyCode, ResourceUIPo resourceUIPo) throws Exception;

	/**
	 * 根据ID删除一个UI资源。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteResourceUIById(String agencyCode, String id) throws Exception;

	/**
	 * 根据多个ID批量删除UI资源。
	 * 
	 * @param agencyCode
	 * @param ids
	 * @throws Exception
	 */
	void deleteResourceUIBatch(String agencyCode, Serializable[] ids) throws Exception;

	/**
	 * 根据ID获取UI资源。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ResourceUIPo getResourceUIById(String agencyCode, String id) throws Exception;

	/**
	 * 获取所有UI资源。
	 * 
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getAllResourceUIs(String agencyCode) throws Exception;

	/**
	 * 分页获取UI资源。
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetResourceUIs(String agencyCode, PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 根据UI资源的相关属性查询UI资源.
	 * 
	 * @param agencyCode
	 * @param attr
	 * @param value
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getResourceUIsByAttr(String agencyCode, String attr, String value) throws Exception;

	/**
	 * 根据UI资源的编号查询UI资源.
	 * 
	 * @param agencyCode
	 * @param code
	 * @return
	 * @throws Exception
	 */
	ResourceUIPo getResourceUIByCode(String agencyCode, String code) throws Exception;

	/**
	 * 根据UI资源的名称和类型查询UI资源.
	 * 
	 * @param agencyCode
	 * @param name
	 * @param type
	 * @return
	 * @throws Exception
	 */
	ResourceUIPo getResourceUIByNameAndType(String agencyCode, String name, String type) throws Exception;

	/**
	 * 根据事项类型查询UI资源.
	 * 
	 * @param agencyCode
	 * @param type
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIPo> getResourceUIsByType(String agencyCode, String type) throws Exception;

	/**
	 * 将PO转化成查询返回结果DTO.
	 * 
	 * @param agencyCode
	 * @param po
	 * @return
	 * @throws Exception
	 */
	ResourceUIOutDto transformPo2OutDto(String agencyCode, ResourceUIPo po) throws Exception;

	/**
	 * 将PO集合转化成查询返回结果DTO集合.
	 * 
	 * @param agencyCode
	 * @param pos
	 * @return
	 * @throws Exception
	 */
	List<ResourceUIOutDto> transformListPo2OutDto(String agencyCode, List<ResourceUIPo> pos) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */