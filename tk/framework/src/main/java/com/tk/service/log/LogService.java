package com.tk.service.log;

import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.orm.log.model.LogPo;

/**
 * <pre>
 *  
 *  File: LogService.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  日志Service层接口
 * 
 *  Notes:
 *  $Id: LogService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月16日下午3:01:06>>, <<Who>>, <<what>>  
 *  2015年1月16日		nie.yl		Initial.
 * </pre>
 */
public interface LogService extends BaseService<LogPo, Object>
{
	/**
	 * 添加一条日志.
	 * 
	 * @param logPo
	 * @throws Exception
	 */
	void addLog(LogPo logPo) throws Exception;

	/**
	 * 根据ID删除一条日志。
	 * 
	 * @param agencyCode
	 * @param id
	 * @throws Exception
	 */
	void deleteLogById(String agencyCode, String id) throws Exception;

	/**
	 * 根据ID查询日志。
	 * 
	 * @param agencyCode
	 * @param id
	 * @return
	 * @throws Exception
	 */
	LogPo getLogById(String agencyCode, String id) throws Exception;

	/**
	 * 分页查询日志.
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	PageBeanDto pageGetLog(String agencyCode, PageBeanDto pageBeanDto) throws Exception;

	/**
	 * 详细信息新旧值对比
	 * 
	 * @param logId
	 * @param agencyCode
	 * @return
	 * @throws Exception
	 */
	String compareValue(String logId, String agencyCode) throws Exception;
}

/*
 * $Log: av-env.bat,v $
 */