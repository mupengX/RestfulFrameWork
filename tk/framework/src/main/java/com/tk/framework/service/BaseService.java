package com.tk.framework.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tk.framework.page.PageBeanDto;

/**
 * <pre>
 *  
 *  File: BaseService.java
 *  
 *  Copyright (C): 2014
 *  Description: Service基础类
 *  TODO
 * 
 *  Notes:
 *  $Id: BaseService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:39:17>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface BaseService<T, QT>
{
	/**
	 * 根据对象添加
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void add(T t) throws Exception;

	/**
	 * 根据对象修改
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void update(T t) throws Exception;

	/**
	 * 按照id删除对象
	 * 
	 * @param id
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public void deleteById(Class cls, Serializable id) throws Exception;

	/**
	 * 按照id查询对象
	 * 
	 * @param id
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public T findById(Class cls, Serializable id) throws Exception;

	/**
	 * 查询全部
	 * 
	 * @param entityName 实体类名称
	 * @throws Exception
	 */
	public List<T> findAll(String entityName) throws Exception;

	/**
	 * 执行条件查询
	 * 
	 * @throws Exception
	 */
	public Object executeQuery(String hql, HashMap<String, Object> params) throws Exception;

	/**
	 * 根据自定义SQL进行分页查询。totalSQLName：查询结果总数的SQL对应的SQL名称；querySQLName：查询结果集的SQL对应的SQL名称；requestURI：用户请求地址；
	 * pageBeanDto：分页相关参数；params：查询参数MAP，用于放置自定义的查询参数；clazz：查询结果对应的实体类。
	 * 
	 * @param totalSQLName
	 * @param querySQLName
	 * @param requestURI
	 * @param pageBeanDto
	 * @param params
	 * @param clazz
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	public PageBeanDto pageQueryByCustomSQLName(String totalSQLName, String querySQLName, String requestURI,
			PageBeanDto pageBeanDto, Map params, Class clazz) throws Exception;
}
