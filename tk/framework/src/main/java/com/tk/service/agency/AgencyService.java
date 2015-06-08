package com.tk.service.agency;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.agency.dto.AgencyDto;
import com.tk.orm.agency.model.AgencyPo;

/**
 * <pre>
 *  
 *  File: AgencyService.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  机构信息Service层接口
 * 
 *  Notes:
 *  $Id: AgencyService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年2月10日下午1:57:46>>, <<Who>>, <<what>>  
 *  2015年2月10日		TK		Initial.
 * </pre>
 */
public interface AgencyService extends BaseService<AgencyPo, Object>
{
	/**
	 * 添加一个机构信息
	 * 
	 * @param agencyPo
	 * @throws Exception
	 */
	void createAgency(AgencyPo agencyPo) throws Exception;

	/**
	 * 更新一个机构信息
	 * 
	 * @param agencyPo
	 * @throws Exception
	 */
	void updateAgency(AgencyPo agencyPo) throws Exception;

	/**
	 * 删除一个机构信息
	 * 
	 * @param agencyPo
	 * @throws Exception
	 */
	void deleteAgency(AgencyPo agencyPo) throws Exception;

	/**
	 * 根据ID删除一个机构信息
	 * 
	 * @param id
	 * @throws Exception
	 */
	void deleteAgencyById(String id) throws Exception;

	/**
	 * 批量删除多个机构，参数为ID数组
	 * 
	 * @param ids
	 * @throws Exception
	 */
	void deleteAgencyBatch(Serializable[] ids) throws Exception;

	/**
	 * 根据ID查询机构信息
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	AgencyPo getAgencyById(String id) throws Exception;

	/**
	 * 查询所有机构信息
	 * 
	 * @return
	 * @throws Exception
	 */
	List<AgencyPo> getAllAgencys() throws Exception;

	/**
	 * 分页查询机构信息。
	 * 
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetAgencys(PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 将机构信息PO转化为DTO.
	 * 
	 * @param po
	 * @return
	 * @throws Exception
	 */
	AgencyDto transformAgencyPo2Dto(AgencyPo po) throws Exception;

	/**
	 * 将机构信息PO集合转化为DTO集合.
	 * 
	 * @param pos
	 * @return
	 * @throws Exception
	 */
	List<AgencyDto> transformAgencyPoList2DtoList(List<AgencyPo> pos) throws Exception;

	/**
	 * 根据令牌查询机构信息.
	 * 
	 * @param accessToken
	 * @return
	 * @throws Exception
	 */
	AgencyPo getAgencyByAccessToken(String accessToken) throws Exception;

	/**
	 * 根据机构名称查询机构信息.
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	AgencyPo getAgencyByName(String name) throws Exception;

	/**
	 * 根据accessToken删除一个机构信息
	 * 
	 * @param accessToken
	 * @throws Exception
	 */
	void deleteAgencyByAccessToken(String accessToken) throws Exception;

	/**
	 * 根据accessToken禁用机构信息.
	 * 
	 * @param accessTokens
	 * @throws Exception
	 */
	void updateAgencyForbid(String accessToken) throws Exception;

	/**
	 * 根据accessToken启用机构信息.
	 * 
	 * @param accessTokens
	 * @throws Exception
	 */
	void updateAgencyUse(String accessToken) throws Exception;

	/**
	 * 根据状态获取所有机构信息, 0代表已启用,1代表禁用.
	 * 
	 * @param recStatus
	 * @return
	 * @throws Exception
	 */
	List<AgencyPo> getAllAgencysByRecStatus(String recStatus) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */