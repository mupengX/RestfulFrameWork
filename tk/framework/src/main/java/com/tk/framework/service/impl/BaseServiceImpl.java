package com.tk.framework.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tk.framework.dao.BaseDao;
import com.tk.framework.dto.OrderByDto;
import com.tk.framework.page.PageBean;
import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.BaseService;
import com.tk.framework.util.ValidationUtil;

/**
 * <pre>
 *  
 *  File: BaseServiceImpl.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: Service基础实现类
 * 
 *  Notes:
 *  $Id: BaseServiceImpl.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:39:47>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class BaseServiceImpl<T, QT> implements BaseService<T, QT>
{
	@Autowired
	private BaseDao baseDao;

	public void add(T t) throws Exception
	{
		baseDao.insertObject(t);
	}

	public void update(T t) throws Exception
	{
		baseDao.updateObject(t);
	}

	@SuppressWarnings("rawtypes")
	public void deleteById(Class cls, Serializable id) throws Exception
	{
		baseDao.deleteObjectByID(cls, id);
	}

	@SuppressWarnings({"unchecked", "rawtypes"})
	public T findById(Class cls, Serializable id) throws Exception
	{
		return (T) baseDao.queryObjectByID(cls, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(String entityName) throws Exception
	{
		return baseDao.findAll(entityName);
	}

	public Object executeQuery(String hql, HashMap<String, Object> params) throws Exception
	{
		return baseDao.queryObjectsByHQLStr(hql, params);
	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public PageBeanDto pageQueryByCustomSQLName(String totalSQLName, String querySQLName, String requestURI,
			PageBeanDto pageBeanDto, Map params, Class clazz) throws Exception
	{
		// #1.获取分页查询参数
		int startRecord = pageBeanDto.getStartRecord(); // 开始记录数
		int pageSize = pageBeanDto.getPageSize(); // 每页显示记录数
		String searchValue = pageBeanDto.getSearchValue();// 搜索关键字，该参数会匹配所有可查询的字段
		String sortColumn = pageBeanDto.getSortColumn();// 排序字段
		String sortDir = pageBeanDto.getSortDir();// 排序方式
		String where = pageBeanDto.getWhere();// 搜索参数 ，会按照可查询字段范围内的指定字段进行匹配,示例{"name":"tk"}

		params = null == params ? new HashMap<String, Object>() : params;

		// #2.处理查询参数
		// #2.1处理分页参数
		int pageNumber = startRecord / pageSize + 1;

		// #2.2处理搜索关键字
		searchValue = null == searchValue ? "" : searchValue;
		searchValue.replace("%", "\\%").replace("_", "\\_");
		params.put("search", "%" + searchValue + "%");

		// #2.3处理排序字段
		if (!ValidationUtil.isEmpty(sortColumn))
		{
			sortDir = ValidationUtil.isEmpty(sortDir) ? "ASC" : sortDir; // 默认升序

			List list = new ArrayList();
			OrderByDto order = new OrderByDto();
			order.setColumnName(sortColumn);
			order.setOrderby(sortDir);
			list.add(order);

			params.put("order", list);
		}

		// #2.4处理条件查询
		if (!ValidationUtil.isEmpty(where))
		{
			JSONObject jsonObject = JSONObject.parseObject(where);
			JSONArray rules = (JSONArray) jsonObject.get("rules");
			for (Iterator<Object> iterator = rules.iterator(); iterator.hasNext();)
			{
				JSONObject object = (JSONObject) iterator.next();
				String value = object.get("value").toString();
				if (!ValidationUtil.isEmpty(value))
				{
					// 去掉首尾空格
					value = value.trim().replace("%", "\\%").replace("_", "\\_");
					String field = object.getString("field");
					params.put(field, "%" + value + "%");
				}
			}
		}

		// 3.分页查询
		PageBean pageBean = baseDao.pageQueryByCustomSQLName(totalSQLName, querySQLName, null, pageNumber, pageSize,
			params, clazz);

		// 4.封装查询结果并返回
		int recordsFiltered = pageBean.getCount();
		int recordsTotal = 0;
		List resultList = pageBean.getResultList();
		if (null != resultList)
		{
			recordsTotal = resultList.size();
		}

		pageBeanDto.setRecordsTotal(recordsTotal); // 记录总数
		pageBeanDto.setRecordsFiltered(recordsFiltered); // （搜索过滤后的）记录总数
		pageBeanDto.setData(pageBean.getResultList());

		return pageBeanDto;
	}

}
