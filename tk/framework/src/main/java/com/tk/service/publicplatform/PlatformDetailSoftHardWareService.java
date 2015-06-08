package com.tk.service.publicplatform;


import java.util.List;
import java.util.Map;

import com.tk.framework.rest.framework.model.MultipleObjectResultModel;
import com.tk.framework.service.BaseService;
import com.tk.orm.publicplatform.dto.PlatformDetailDto;
import com.tk.orm.publicplatform.dto.PlatformDetailSoftHardWareDto;

/**
 * <pre> 
 *  
 *  File: PlatformDetailHardWareService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailHardWareService.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月19日下午4:58:12>>, <<Who>>, <<what>>  
 *  2015年5月19日		mupeng		Initial.
 * </pre>
 */
public interface PlatformDetailSoftHardWareService extends BaseService<PlatformDetailSoftHardWareDto, Object> {
	
	
	/**
	 * TODO.
	 *新增、修改、删除数据统一入口
	 * @param platformDetailDto
	 * @throws Exception 
	 */
	public List<MultipleObjectResultModel> doService(PlatformDetailDto platformDetailDto) throws Exception;
	
	
	/**
	 * TODO.
	 * 新增软硬件信息
	 * @param listDtos
	 * @throws Exception 
	 */
	public void addInfo(List<Map> listDtos,List<MultipleObjectResultModel> multipleObjectResultModels, String networkType, String itemId) throws Exception;
	
	/**
	 * TODO.
	 * 更新信息
	 * @param listDtos
	 * @throws Exception 
	 */
	public void updateInfo(List<Map> listDtos,List<MultipleObjectResultModel> multipleObjectResultModels, String networkType, String itemId) throws Exception;
	
	/**
	 * TODO.
	 * 删除信息
	 * @param listDtos
	 * @throws Exception 
	 */
	public void deleteInfo(List<String> listDtos, List<MultipleObjectResultModel> multipleObjectResultModels) throws Exception;
	
	/**
	 * TODO.
	 *查询信息
	 * @param networkType
	 * @param itemId
	 * @throws Exception 
	 */
	public List<PlatformDetailSoftHardWareDto> getInfo(String networkType, String itemId) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/