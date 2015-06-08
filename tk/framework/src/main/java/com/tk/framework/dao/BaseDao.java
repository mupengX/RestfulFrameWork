package com.tk.framework.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Example;

import com.tk.framework.dynamicobject.impl.DynamicTable;
import com.tk.framework.page.PageBean;
import com.tk.framework.util.ColumnReturnType;

/**
 * <pre> 
 *  
 *  File: BaseDao.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 基础DAO，提供常用的数据库操作
 *  TODO
 * 
 *  Notes:
 *  $Id: BaseDao.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:26:35>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface BaseDao {
	/**
	 * 插入一条记录
	 * @param obj
	 */
	public void insertObject(Object obj);
	
	/**
	 * 删除一条记录
	 * @param obj
	 */
	public void deleteObject(Object obj);
	
	/**
	 * 依据ID删除一条记录
	 * @param cls
	 * @param id
	 */
	public void deleteObjectByID(Class cls,Serializable id);
	
	/**
	 * 依据一组ID删除一批记录
	 * @param cls
	 * @param ids
	 */
	public void deleteObjectBatch(Class cls,Serializable[] ids);
	
	/**
	 * 更新一条记录
	 * @param obj
	 */
	public void updateObject(Object obj);
	
	/**
	 * 保存或更新一条记录
	 * @param obj
	 */
	public void addOrUpdateProvince(Object obj);
	
	/**
	 * 保存或更新一条记录
	 * @param obj
	 */
	public void saveOrUpdateObject(Object obj);
	
	/**
	 * 依据ID查询一条记录
	 * @param cls
	 * @param id
	 * @return
	 */
	public Object queryObjectByID(Class cls,Serializable id);
	
	
	/**    
	 * @Title: findAll    
	 * @Description: 查找实体对应的数据库表中所有数据   
	 * @param @param entityName 实体名字
	 * @param @return        
	 * @return List      
	 * @throws     
	 */ 
	public List findAll(String entityName);
	
	
	/**
	 * 依据命名查询查询一组记录
	 * @param hql
	 * @param params 传入的参数Map
	 * @return
	 */
	public List queryObjectsByHQL(final String querySQLName,final Map params);
	public List queryObjectsByCustomSQLName(final String querySQLName,final Map params);
	public List queryObjectsByHQLStr(final String queryHQLStr,final Map params);
	public List queryObjectsBySQLStr(final String querySQLStr,final Map params);
	public List queryObjectsBySQLStr(final String querySQLStr,final Map params,final Class clazz);
	public List queryObjectsByHQL(final String querySQLName,final Map params, final Class clazz);
	public List queryObjectsByCustomSQLName(final String querySQLName,final Map params, final Class clazz);
	
	/**
	 * 分页hibernate命名查询
	 * @param totalSQL 汇总用的命名SQL/HQL
	 * @param querySQL 查询用的命名SQL/HQL
	 * @param request request对象,用于保留分页查询时的URL
	 * @param params sql中用的参数Map
	 * @return
	 */ 
	public PageBean pageQuery(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params);
	public PageBean pageQuery(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz);
	public PageBean pageQueryByCustomSQLName(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params);
	public PageBean pageQueryByCustomSQLName(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz);
	public PageBean pageQueryByCustomSQLName(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz, final String argument);

	public PageBean pageQueryByHqlStr(final String totalHQL,final String queryHQL,final String requestURI,final int pageNumber,final int pageSize,final Map params);
	public PageBean pageQueryByHqlStr(final String totalHQL,final String queryHQL,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz);
	public PageBean pageQueryBySqlStr(final String totalSQL,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,final Map params);
	public PageBean pageQueryBySqlStr(final String totalSQL,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz);
	public PageBean pageQueryBySqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,
			final Map params,final Class clazz, final List<ColumnReturnType> lsColumnReturnType);
	public Object uniqueResultByCustomSQLName(final String querySQLName,final Map params);
	public Object uniqueResultByCustomSQLName(final String querySQLName,final Map params,final Class clazz);
	/**
	 * 执行sql/hql,例如修改某列的值
	 */
	public void executeSQL(final String querySQLName);
	/**
	 * 执行sql/hql,例如修改某列的值
	 */
	public void executeSQL(final String querySQLName, final Map params);
	public void executeSQLByCustomSQLName(final String querySQLName, final Map params);
	
	
	/**
	 * 执行命名sql查询,返回数据的指定行数
	 * @param hql
	 * @param rows
	 * @param params
	 * @return
	 */
	public List queryRows(final String querySQLName,final int firstRowNumber,final int rows,final Map params);
	
	/**
	 * 使用自定义命名sql的查询,返回指定行数
	 * @param querySQLName
	 * @param firstRowNumber
	 * @param rows
	 * @param params
	 * @return
	 */
	public List queryRowsByCustomSQL(final String querySQLName,final int firstRowNumber,final int rows,final Map params,final Class clazz);
	
	/**
	 * 以动态表格方式查询一组数据
	 * @param tableDefinition 查询相关的定义
	 * @param params    传入的参数
	 * @return          DynamicTable封装数据集合
	 * @throws Exception
	 */
	public List queryDynamicTableObject(DynamicTable tableDefinition,Map params);
	
	/**
	 * 以动态表格方式查询Page数据
	 * @param tableDefinition 查询相关的定义
	 * @param params    传入的参数
	 * @return          DynamicTable封装数据集合
	 * @throws Exception
	 */
	public PageBean pageQueryDynamicTableObject(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz, final String argument);
	
	/**
	 * 代理转换为实体
	 * @param cls
	 * @param obj
	 * @return
	 */
	public Object getEntity(final Class cls, final Object obj);
	/**
	 * 执行简单sql 实现insert功能
	 * @param sql
	 * @param values
	 */
	public void insertBySql(final String sql,final Object[] values); 
	
	/**
	 * 
	 * 通过hibernate example查询.
	 *
	 * @param example
	 * @param t
	 * @return
	 */
	public <T> List<T> findByExample(Example example, T t);
	
	/**
	 * 
	 * 通过 example 查询一个对象.
	 *
	 * @param example
	 * @param clazz
	 * @return
	 */
	public <T> T findByExample(Example example, Class<T> clazz) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找  基本类型默认排除0.
	 *
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public <T> T findByExampleExcludeZeroes(T t) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找 ，建议有如果参数有基本类型不要使用该方法，因为基本类型有默认值.
	 *
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public <T> T findByExample(T t) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找  基本类型默认排除0.
	 *
	 * @param t
	 * @param firstResult
	 * @param maxResults
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> getListByExampleExcludeZeroes(T t, int firstResult, int maxResults) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找 ，建议有如果参数有基本类型不要使用该方法，因为基本类型有默认值.
	 *
	 * @param t
	 * @param firstResult
	 * @param maxResults
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> getListByExample(T t, int firstResult, int maxResults) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找  基本类型默认排除0.
	 *
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> getListByExampleExcludeZeroes(T t) throws Exception;
	
	/**
	 * 
	 * 通过参数的设置值进行查找 ，建议有如果参数有基本类型不要使用该方法，因为基本类型有默认值.
	 *
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> getListByExample(T t) throws Exception;
}
