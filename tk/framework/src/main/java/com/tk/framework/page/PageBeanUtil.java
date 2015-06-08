package com.tk.framework.page;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * <pre>
 *  
 *  File: PageBeanUtil.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  分页工具类
 * 
 *  Notes:
 *  $Id: PageBeanUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月29日下午4:22:03>>, <<Who>>, <<what>>  
 *  2014年12月29日		TK		Initial.
 * </pre>
 */
public class PageBeanUtil
{
	/**
	 * 将分页查询参数转换成查询所需的分页类
	 * 
	 * @param paramsJSON
	 * @return
	 * @throws Exception
	 */
	public static PageBeanDto convertParams2PageBeanDto(JSONObject paramsJSON) throws Exception
	{
		PageBeanDto pageBeanDto = null;

		// 1.封装PageBeanDto
		if (null != paramsJSON)
		{
			try
			{
				pageBeanDto = new PageBeanDto();
				pageBeanDto.setPageSize(paramsJSON.getIntValue("pageSize"));
				pageBeanDto.setStartRecord(paramsJSON.getIntValue("startRecord"));
				pageBeanDto.setSortColumn(paramsJSON.getString("sortColumn"));
				pageBeanDto.setSortDir(paramsJSON.getString("sortDir"));
				pageBeanDto.setSearchValue(paramsJSON.getString("searchValue"));
				pageBeanDto.setWhere(paramsJSON.getString("where"));
			}
			catch (Exception e)
			{
				throw new Exception("解析分页参数出错！");
			}
		}

		// 2.返回处理结果
		return pageBeanDto;
	}

	/**
	 * 将分页查询参数转换成查询所需的分页类
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public static PageBeanDto convertParams2PageBeanDto(Map params) throws Exception
	{
		PageBeanDto pageBeanDto = null;

		// 1.封装PageBeanDto
		if (null != params)
		{
			try
			{
				int pageSize = null == params.get("pageSize") ? 1 : (Integer) params.get("pageSize");
				int startRecord = null == params.get("startRecord") ? 0 : (Integer) params.get("startRecord");
				String sortColumn = null == params.get("sortColumn") ? "" : (String) params.get("sortColumn");
				String sortDir = null == params.get("sortDir") ? "" : (String) params.get("sortDir");
				String searchValue = null == params.get("searchValue") ? "" : (String) params.get("searchValue");
				String where = null == params.get("where") ? "" : (String) params.get("where");

				pageBeanDto = new PageBeanDto();
				pageBeanDto.setPageSize(pageSize);
				pageBeanDto.setStartRecord(startRecord);
				pageBeanDto.setSortColumn(sortColumn);
				pageBeanDto.setSortDir(sortDir);
				pageBeanDto.setSearchValue(searchValue);
				pageBeanDto.setWhere(where);
			}
			catch (Exception e)
			{
				throw new Exception("解析分页参数出错！");
			}
		}

		// 2.返回处理结果
		return pageBeanDto;
	}
}

/*
 * $Log: av-env.bat,v $
 */