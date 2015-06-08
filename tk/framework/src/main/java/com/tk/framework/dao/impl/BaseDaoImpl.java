package com.tk.framework.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.hibernate.impl.SessionImpl;
import org.hibernate.property.ChainedPropertyAccessor;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.PropertyAccessorFactory;
import org.hibernate.property.Setter;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.tk.framework.dao.BaseDao;
import com.tk.framework.dto.CustomViewDto;
import com.tk.framework.dynamicobject.impl.DynamicTable;
import com.tk.framework.page.PageBean;
import com.tk.framework.util.ColumnReturnType;
import com.tk.framework.util.ConfigQueryItem;
import com.tk.framework.util.ConfigQueryUtil;

/**
 * <pre> 
 *  
 *  File: BaseDaoImpl.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:基础DAO实现类，提供常用的数据库操作
 *  TODO
 * 
 *  Notes:
 *  $Id: BaseDaoImpl.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:27:12>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Component("baseDao")
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{

	@Autowired
	@Qualifier("sessionFactory")
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public void insertObject(Object obj) {
		getHibernateTemplate().save(obj);
	}
	
	public void deleteObject(Object obj) {
		getHibernateTemplate().delete(obj);
		
	}
	
	public void deleteObjectByID(Class cls,Serializable id) {
		getHibernateTemplate().delete(queryObjectByID(cls, id));
	}
	
	
	public void deleteObjectBatch(Class cls,Serializable[] ids) {
		for (int i = 0; i < ids.length; i++) {
			deleteObject(queryObjectByID(cls, ids[i]));
		}
	}
	
	public void updateObject(Object obj) {
		getHibernateTemplate().update(obj);
	}
	
	public void addOrUpdateProvince(Object obj){
		getHibernateTemplate().saveOrUpdate(obj);
	}
	
	public void saveOrUpdateObject(Object obj){
		getHibernateTemplate().saveOrUpdate(obj);
	}
	
	public Object queryObjectByID(Class cls,Serializable id) {
		Object obj = null;
		obj = getHibernateTemplate().get(cls, id);
		return obj;
	}

	
	public List queryObjectsByHQL(final String querySQLName,final Map params) {
		return queryObjectsByHQL(querySQLName, params, null);
	}
	
	public List findAll(String entityName){
		String hql = "from " + entityName;
		return queryObjectsByHQLStr(hql, null);
	}
	
	@SuppressWarnings("unchecked")
	public List queryObjectsByHQLStr(final String queryHQLStr,final Map params){
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(queryHQLStr);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else {
							query.setParameter(key, params.get(key));
						}
					}
				}
				List list = query.list();
				return list;
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List queryObjectsBySQLStr(final String querySQLStr,final Map params){
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createSQLQuery(querySQLStr);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				List list = query.list();
				return list;
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List queryObjectsBySQLStr(final String querySQLStr,final Map params,final Class clazz){
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createSQLQuery(querySQLStr);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				if(clazz != null){
					//query.setResultTransformer(Transformers.aliasToBean(clazz));
					setScalar(querySQLStr, (SQLQuery)query, clazz);
					query.setResultTransformer(new EscColumnToBean(clazz));
				}
				List list = query.list();
				return list;
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public List queryObjectsByHQL(final String querySQLName,final Map params, final Class clazz) {
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.getNamedQuery(querySQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				if(clazz != null){
					query.setResultTransformer(Transformers.aliasToBean(clazz));
				}
				List list = query.list();
				return list;
			}
		});
	}
	
	/**
	 * 分页Hibernate查询
	 */
	public PageBean pageQuery(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params) {
		return this.pageQuery(totalSQLName, querySQLName, requestURI, pageNumber, pageSize, params,null);
	}
	/**
	 * 分页Hibernate查询
	 */
	@SuppressWarnings("unchecked")
	public PageBean pageQuery(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz) {
		
		PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		pageBean.setPageSize(pageSize);
		pageBean.setTotalCountSQL(totalSQLName);
		pageBean.setListSQL(querySQLName);

		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.getNamedQuery(totalSQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						//query.setParameter(key, params.get(key));
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				//首先获得记录总数
				List list = query.list();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
				if (list.size() > 0) {
					count = ((Long) list.get(0)).intValue();
				}
				//算出总页数在PageBean的setCount方法中一并设置
				tmpPageBean.setCount(count);
				
				//得到分页查询的结果
				query = session.getNamedQuery(tmpPageBean.getListSQL());//session.createQuery(pageBean.getListSQL());
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						//query.setParameter(key, params.get(key));
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				if(clazz != null){
					query.setResultTransformer(Transformers.aliasToBean(clazz));
				}
				tmpPageBean.setResultList(query.list());
				return tmpPageBean;
			}
		});
	}
	
	/**
	 * 分页Hibernate查询
	 */
	public PageBean pageQueryByHqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,final Map params) {
		return pageQueryByHqlStr(totalSQLName, querySQL, requestURI, pageNumber, pageSize, params,null);
	}
	
	/**
	 * 分页Hibernate查询
	 */
	@SuppressWarnings("unchecked")
	public PageBean pageQueryByHqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz) {
		PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		pageBean.setPageSize(pageSize);
		//pageBean.setTotalCountSQL(totalSQLName);
		//pageBean.setListSQL(querySQLName);

		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.getNamedQuery(totalSQLName);
				Query query = session.createQuery(totalSQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				
				//首先获得记录总数
				List list = query.list();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
				if (list.size() > 0) {
					count = ((Long) list.get(0)).intValue();
				}
				
				//算出总页数在PageBean的setCount方法中一并设置
				tmpPageBean.setCount(count);

				//得到分页查询的结果
				//query = session.getNamedQuery(tmpPageBean.getListSQL());//session.createQuery(pageBean.getListSQL());
				query = session.createQuery(querySQL);
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				if(clazz != null){
					query.setResultTransformer(Transformers.aliasToBean(clazz));
				}
				tmpPageBean.setResultList(query.list());
				return tmpPageBean;
			}
		});
	}
	
	/**
	 * 分页Hibernate查询
	 */
	public PageBean pageQueryBySqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,final Map params) {
		return pageQueryBySqlStr(totalSQLName, querySQL, requestURI, pageNumber, pageSize, params,null);
	}
	
	/**
	 * 分页Hibernate查询
	 */
	@SuppressWarnings("unchecked")
	public PageBean pageQueryBySqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,
			final Map params,final Class clazz) {
		PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		if(pageSize > 0){
			pageBean.setPageSize(pageSize);
		}
		//pageBean.setTotalCountSQL(totalSQLName);
		//pageBean.setListSQL(querySQLName);

		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.getNamedQuery(totalSQLName);
				SQLQuery query = session.createSQLQuery(totalSQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				//((SQLQuery)query).addScalar("cnt", Hibernate.INTEGER);
				//首先获得记录总数
				Object o = query.uniqueResult();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
					if(o instanceof Long){
						count = ((Long)o).intValue();
					}else if(o instanceof BigDecimal){
						count = ((BigDecimal)o).intValue();
					}else{
						count = ((Integer)o).intValue();
					}
					
				//算出总页数在PageBean的setCount方法中一并设置
				tmpPageBean.setCount(count);
				
				//得到分页查询的结果
				//query = session.getNamedQuery(tmpPageBean.getListSQL());//session.createQuery(pageBean.getListSQL());
				query = session.createSQLQuery(querySQL);
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(params.get(key) instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(params.get(key) instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				
				if(clazz != null){
					setScalar(querySQL, (SQLQuery)query, clazz);
					query.setResultTransformer(new EscColumnToBean(clazz));
				}
				tmpPageBean.setResultList(query.list());
				return tmpPageBean;
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public PageBean pageQueryBySqlStr(final String totalSQLName,final String querySQL,final String requestURI,final int pageNumber,final int pageSize,
			final Map params,final Class clazz, final List<ColumnReturnType> lsColumnReturnType) {
		PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		if(pageSize > 0){
			pageBean.setPageSize(pageSize);
		}
		//pageBean.setTotalCountSQL(totalSQLName);
		//pageBean.setListSQL(querySQLName);

		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.getNamedQuery(totalSQLName);
				SQLQuery query = session.createSQLQuery(totalSQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				
				//首先获得记录总数
				Object o = query.uniqueResult();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
					if(o instanceof Long){
						count = ((Long)o).intValue();
					}else if(o instanceof BigDecimal){
						count = ((BigDecimal)o).intValue();
					}else{
						count = ((Integer)o).intValue();
					}

				tmpPageBean.setCount(count);
				
				//得到分页查询的结果
				//query = session.getNamedQuery(tmpPageBean.getListSQL());//session.createQuery(pageBean.getListSQL());
				query = session.createSQLQuery(querySQL);
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(params.get(key) instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(params.get(key) instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							query.addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							query.addScalar(columnReturnType.getColumnName());
						}
					}
				}
				
				if(clazz != null){
					if(lsColumnReturnType == null){
						setScalar(querySQL, (SQLQuery)query, clazz);
					}
					query.setResultTransformer(new EscColumnToBean(clazz));
//					query.setResultTransformer(new MyAliasToBeanResultTransformer(clazz));
				}
				tmpPageBean.setResultList(query.list());
				return tmpPageBean;
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List queryObjectsByCustomSQLName(final String querySQLName, final Map params,
			final Class clazz) {
		// TODO Auto-generated method stub
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				Query query = null;
				if("sql-query".equals(configQueryItem.getQueryType())){
					query = session.createSQLQuery(configQueryItem.getQueryString());
				}else if("query".equals(configQueryItem.getQueryType())){
					query = session.createQuery(configQueryItem.getQueryString());
				}
//				Query query = session.createQuery(configQueryItem);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				List<ColumnReturnType> lsColumnReturnType = configQueryItem.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					SQLQuery tmpQuery = (SQLQuery)query;
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							tmpQuery.addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							tmpQuery.addScalar(columnReturnType.getColumnName());
						}
					}
				}
				if(clazz != null){
					query.setResultTransformer(new EscColumnToBean(clazz));
				}
				List list = query.list();
				return list;
			}
		});
	}

	public List queryObjectsByCustomSQLName(String querySQLName, Map params) {
		// TODO Auto-generated method stub
		return queryObjectsByCustomSQLName(querySQLName, params, null);
	}
	
	@SuppressWarnings("unchecked")
	public PageBean pageQueryByCustomSQLName(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz, final String argument){
		PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		if(pageSize > 0){
			pageBean.setPageSize(pageSize);
		}
		//pageBean.setTotalCountSQL(totalSQLName);
		//pageBean.setListSQL(querySQLName);
		
		pageBean.setArgument(argument);
		
		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.getNamedQuery(totalSQLName);
				Map countParams = (Map)((HashMap)params).clone();
				countParams.remove("order");
				ConfigQueryItem configQueryItemCount = ConfigQueryUtil.getDealConfigQueryItem(totalSQLName, countParams);
//				Query query = session.createSQLQuery(configQueryItemCount.getQueryString());
				Query query = null;
				if("sql-query".equals(configQueryItemCount.getQueryType())){
					query = session.createSQLQuery(configQueryItemCount.getQueryString());
				}else if("query".equals(configQueryItemCount.getQueryType())){
					query = session.createQuery(configQueryItemCount.getQueryString());
				}
//				SQLQuery query = session.createSQLQuery(totalSQLName);
				if(countParams != null) {
					Iterator it = countParams.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = countParams.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)valueObj);
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])valueObj);
							}else if(!"".equals(valueObj)){
								query.setParameter(key, valueObj);
							}
						}
					}
				}
				//首先获得记录总数
				List<ColumnReturnType> lsColumnReturnType = configQueryItemCount.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				Object o = query.uniqueResult();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
					if(o instanceof Long){
						count = ((Long)o).intValue();
					}else if(o instanceof BigDecimal){
						count = ((BigDecimal)o).intValue();
					}else{
						count = ((Integer)o).intValue();
					}
					
				//算出总页数在PageBean的setCount方法中一并设置
				tmpPageBean.setCount(count);
				
				//得到分页查询的结果
				List orderList = (List) params.get("order");
				params.remove("order");
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params,orderList);
				if("sql-query".equals(configQueryItem.getQueryType())){
					query = session.createSQLQuery(configQueryItem.getQueryString());
				}else if("query".equals(configQueryItem.getQueryType())){
					query = session.createQuery(configQueryItem.getQueryString());
				}
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(params.get(key) instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(params.get(key) instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				lsColumnReturnType = configQueryItem.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				
				if(clazz != null){
					query.setResultTransformer(new EscColumnToBean(clazz));
//					query.setResultTransformer(new MyAliasToBeanResultTransformer(clazz));
				}
				tmpPageBean.setResultList(query.list());
				return tmpPageBean;
			}
		});
	}
	
	public PageBean pageQueryByCustomSQLName(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,
			final Map params,final Class clazz) {
		
		return pageQueryByCustomSQLName(totalSQLName,querySQLName,requestURI,pageNumber,pageSize,params,clazz,null);
		
	}


	public PageBean pageQueryByCustomSQLName(final String totalSQLName,
			final String querySQLName, final String requestURI, final int pageNumber,
			final int pageSize, final Map params) {
		// TODO Auto-generated method stub
		return pageQueryByCustomSQLName(totalSQLName, querySQLName, requestURI, pageNumber, pageSize, params, null);
	}
	
	/**
	 * 执行简单的sql语句，例如修改某列的值



	 */
	public void executeSQL(final String querySQLName)
	{
		executeSQL(querySQLName, null);
	}

	@SuppressWarnings("unchecked")
	public void executeSQL(final String querySQLName, final Map params)
	{
		getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.getNamedQuery(querySQLName);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null){
							query.setParameter(key, params.get(key));
						}
					}
				}
				query.executeUpdate();
				return null;
			}
		});
	}
	/**
	 * 执行简单sql 实现insert功能
	 * @param sql
	 * @param values
	 */
	public void insertBySql(final String sql,final Object[] values) {  
		List list= (List)getHibernateTemplate().executeFind(new HibernateCallback(){    
			public Object doInHibernate(Session session)throws HibernateException, SQLException{   
				Query query= session.createSQLQuery(sql);   
				for (int i = 0 ; i < values.length ; i++) {    
					query.setParameter( i, values[i]);     
					}        
				query.executeUpdate();   
				Object o=null;        
				return o;      
				}    
			} );
	}
	public void executeSQLByCustomSQLName(final String querySQLName, final Map params)
	{
		getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				Query query = null;
				if("sql-query".equals(configQueryItem.getQueryType())){
					query = session.createSQLQuery(configQueryItem.getQueryString());
				}else if("query".equals(configQueryItem.getQueryType())){
					query = session.createQuery(configQueryItem.getQueryString());
				}
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				List<ColumnReturnType> lsColumnReturnType = configQueryItem.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					SQLQuery tmpQuery = (SQLQuery)query;
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							tmpQuery.addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							tmpQuery.addScalar(columnReturnType.getColumnName());
						}
					}
				}
				query.executeUpdate();
				return null;
			}
		});
	}
	
	
	public List queryRows(final String querySQLName,final int firstRowNumber,final int rows,final Map params)
	{
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.getNamedQuery(querySQLName);
				query.setFirstResult(firstRowNumber);
				query.setMaxResults(rows);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));							
						}
					}
				}
				
				List list = query.list();
				return list;
			}
		});
	}
	
	
	public List queryRowsByCustomSQL(final String querySQLName,final int firstRowNumber,final int rows,final Map params,final Class clazz)
	{
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = null;
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				if("sql-query".equals(configQueryItem.getQueryType())){
					query = session.createSQLQuery(configQueryItem.getQueryString());
				}else if("query".equals(configQueryItem.getQueryType())){
					query = session.createQuery(configQueryItem.getQueryString());
				}
				query.setFirstResult(firstRowNumber);
				query.setMaxResults(rows);
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(params.get(key) instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(params.get(key) instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				List<ColumnReturnType> lsColumnReturnType = configQueryItem.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				
				if(clazz != null){
					query.setResultTransformer(new EscColumnToBean(clazz));
				}
				List list = query.list();
				return list;
			}
		});
	}
	
	
	public Object uniqueResultByCustomSQLName(final String querySQLName,final Map params,final Class clazz) {
		return getHibernateTemplate().execute(new HibernateCallback(){ 
			public Object doInHibernate(Session session) throws HibernateException, SQLException {	 
				ConfigQueryItem configQueryItemCount = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				Query query = null;
				if("sql-query".equals(configQueryItemCount.getQueryType())){
					query = session.createSQLQuery(configQueryItemCount.getQueryString());
				}else if("query".equals(configQueryItemCount.getQueryType())){
					query = session.createQuery(configQueryItemCount.getQueryString());
				}
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				//首先获得记录总数
				List<ColumnReturnType> lsColumnReturnType = configQueryItemCount.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				if(clazz != null){
					query.setResultTransformer(new EscColumnToBean(clazz));
				}
				List list = query.list();
				Object o = null;
				if(list != null && list.size() != 0) o=list.get(0);
				//Object o = query.uniqueResult();
				return o;
			}
		});
    }
	
	public Object uniqueResultByCustomSQLName(final String querySQLName,final Map params) {
		return getHibernateTemplate().execute(new HibernateCallback(){ 
			public Object doInHibernate(Session session) throws HibernateException, SQLException {	 
				ConfigQueryItem configQueryItemCount = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				Query query = null;
				if("sql-query".equals(configQueryItemCount.getQueryType())){
					query = session.createSQLQuery(configQueryItemCount.getQueryString());
				}else if("query".equals(configQueryItemCount.getQueryType())){
					query = session.createQuery(configQueryItemCount.getQueryString());
				}
				
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)params.get(key));
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])params.get(key));
							}else if(!"".equals(valueObj)){
								query.setParameter(key, params.get(key));
							}
						}
					}
				}
				//首先获得记录总数
				List<ColumnReturnType> lsColumnReturnType = configQueryItemCount.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				List list = query.list();
				Object o = null;
				if(list != null && list.size() != 0) o=list.get(0);
				//Object o = query.uniqueResult();
				return o;
			}
		});
    }

    public SQLQuery setScalar(String sql, SQLQuery query, Class cls) {
    	Field[] fields = cls.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			String columnType = fields[i].getType().getName();
			String columnName = fields[i].getName();
//			//确定大写字母位置
			String tmpSQL = sql.substring(sql.indexOf("select")+6, sql.indexOf("from"));
			if(tmpSQL.indexOf(columnName) != -1) {
				if("java.lang.String".equals(columnType)) {
					query.addScalar(columnName, Hibernate.STRING);
				}else if("java.lang.Integer".equals(columnType)) {
					query.addScalar(columnName, Hibernate.INTEGER);
				}else if("java.lang.Double".equals(columnType)) {
					query.addScalar(columnName,Hibernate.DOUBLE);
				}else{
					query.addScalar(columnName);
				}
			}
		}
		return query;
    }
    
    
    public List queryDynamicTableObject(final DynamicTable tableDefinition,final Map params) {
    	
		return (List)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(tableDefinition.getQuerySqlName(), params);
				Query query = null;
				query = session.createSQLQuery(configQueryItem.getQueryString());
				query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if("custom_view".equals(key)) {continue;}//避开自定义视图部分的参数
						if("order".equals(key)) {continue;}//避开Order by 部分参数
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				List list = query.list();
				List resultList = new ArrayList();
				if(params.get("custom_view") != null) {
					JSONArray jsonArray = JSONArray.fromObject(params.get("custom_view").toString());
					for (Iterator iterator = list.iterator(); iterator.hasNext();) {
						Map columnValue = (Map)iterator.next();
						DynamicTable row = new DynamicTable();
						row.setCustom_view(params.get("custom_view").toString());
						if(columnValue.get("id") != null) row.setId(columnValue.get("id").toString());
						for (int i = 0; i < jsonArray.size(); i++) {
							JSONObject jsonObject = (JSONObject) jsonArray.get(i);//jsonArray.getJSONObject(i);
							CustomViewDto dto = (CustomViewDto)JSONObject.toBean(jsonObject, CustomViewDto.class);
							if(columnValue.get(dto.getColumnAlias()) != null)
								dto.setColumnValue(columnValue.get(dto.getColumnAlias()));
							else 
								dto.setColumnValue("");
							row.addProperty(dto.getColumnAlias(), dto);
						}
						resultList.add(row);
					}
				}else {
					for (Iterator iterator = list.iterator(); iterator.hasNext();) {
						Map columnValue = (Map)iterator.next();
						DynamicTable row = new DynamicTable();
						if(columnValue.get("id") != null) row.setId(columnValue.get("id").toString());
						Object[] columns = columnValue.keySet().toArray();
						for (int i = 0; i < columns.length; i++) {
							CustomViewDto dto = new CustomViewDto();
							
							dto.setColumnAlias(columns[i].toString());
							dto.setColumnValue(columnValue.get(columns[i].toString()));
							row.addProperty(columns[i].toString(), dto);
						}
						resultList.add(row);
					}
				}
				return resultList;
			}
		});
    }
    
    public PageBean pageQueryDynamicTableObject(final String totalSQLName,final String querySQLName,final String requestURI,final int pageNumber,final int pageSize,final Map params,final Class clazz, final String argument) {
    	PageBean pageBean = new PageBean();
		pageBean.setRequestURI(requestURI);
		if(pageNumber < 1)
			pageBean.setPageNumber(1);
		else
			pageBean.setPageNumber(pageNumber);
		if(pageSize > 0){
			pageBean.setPageSize(pageSize);
		}
		//pageBean.setTotalCountSQL(totalSQLName);
		//pageBean.setListSQL(querySQLName);
		
		pageBean.setArgument(argument);
		
		final PageBean tmpPageBean = pageBean;
		return (PageBean)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				//Query query = session.getNamedQuery(totalSQLName);
				Map countParams = (Map)((HashMap)params).clone();
				ConfigQueryItem configQueryItemCount = ConfigQueryUtil.getDealConfigQueryItem(totalSQLName, countParams);
//				Query query = session.createSQLQuery(configQueryItemCount.getQueryString());
				Query query = null;
				if("sql-query".equals(configQueryItemCount.getQueryType())){
					query = session.createSQLQuery(configQueryItemCount.getQueryString());
				}else if("query".equals(configQueryItemCount.getQueryType())){
					query = session.createQuery(configQueryItemCount.getQueryString());
				}
//				SQLQuery query = session.createSQLQuery(totalSQLName);
				if(countParams != null) {
					Iterator it = countParams.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						if("custom_view".equals(key)) {continue;}//避开自定义视图部分的参数
						if("order".equals(key)) {continue;}//避开Order by 部分参数
						Object valueObj = countParams.get(key);
						if(valueObj != null){
							if(valueObj instanceof Collection) {
								query.setParameterList(key, (Collection)valueObj);
							}else if(valueObj instanceof Object[]) {
								query.setParameterList(key, (Object[])valueObj);
							}else if(!"".equals(valueObj)){
								query.setParameter(key, valueObj);
							}
						}
					}
				}
				//首先获得记录总数
				List<ColumnReturnType> lsColumnReturnType = configQueryItemCount.getLsColumnReturnType();
				if(lsColumnReturnType != null && lsColumnReturnType.size() > 0){
					for(ColumnReturnType columnReturnType : lsColumnReturnType){
						if(columnReturnType.getReturnType() != null){
							((SQLQuery)query).addScalar(columnReturnType.getColumnName(), columnReturnType.getReturnType());
						}else{
							((SQLQuery)query).addScalar(columnReturnType.getColumnName());
						}
					}
				}
				Object o = query.uniqueResult();//getHibernateTemplate().find(pageBean.getTotalCountSQL());
				int count = 0;
					if(o instanceof Long){
						count = ((Long)o).intValue();
					}else if(o instanceof BigDecimal){
						count = ((BigDecimal)o).intValue();
					}else{
						count = ((Integer)o).intValue();
					}
					
				//算出总页数在PageBean的setCount方法中一并设置
				tmpPageBean.setCount(count);
				
				
				//得到分页查询的结果
				ConfigQueryItem configQueryItem = ConfigQueryUtil.getDealConfigQueryItem(querySQLName, params);
				query = session.createSQLQuery(configQueryItem.getQueryString());
				query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				if(params != null) {
					Iterator it = params.keySet().iterator();
					while(it.hasNext()) {
						String key = (String)it.next();
						Object valueObj = params.get(key);
						if("custom_view".equals(key)) {continue;}//避开自定义视图部分的参数
						if("order".equals(key)) {continue;}//避开Order by 部分参数
						if(params.get(key) instanceof Collection) {
							query.setParameterList(key, (Collection)params.get(key));
						}else if(params.get(key) instanceof Object[]) {
							query.setParameterList(key, (Object[])params.get(key));
						}else if(valueObj!=null && !"".equals(valueObj)){
							query.setParameter(key, params.get(key));
						}
					}
				}
				
				query.setFirstResult(tmpPageBean.getPageSize()*(tmpPageBean.getPageNumber()-1));
				query.setMaxResults(tmpPageBean.getPageSize());
				List list = query.list();
				List resultList = new ArrayList();
				if(params.get("custom_view") != null) {
					JSONArray jsonArray = JSONArray.fromObject(params.get("custom_view").toString());
					for (Iterator iterator = list.iterator(); iterator.hasNext();) {
						Map columnValue = (Map)iterator.next();
						DynamicTable row = new DynamicTable();
						row.setCustom_view(params.get("custom_view").toString());
						if(columnValue.get("id") != null) row.setId(columnValue.get("id").toString());
						for (int i = 0; i < jsonArray.size(); i++) {
							JSONObject jsonObject = (JSONObject) jsonArray.get(i);//jsonArray.getJSONObject(i);
							CustomViewDto dto = (CustomViewDto)JSONObject.toBean(jsonObject, CustomViewDto.class);
							if(columnValue.get(dto.getColumnAlias()) != null)
								dto.setColumnValue(columnValue.get(dto.getColumnAlias()));
							else 
								dto.setColumnValue("");
							row.addProperty(dto.getColumnAlias(), dto);
						}
						resultList.add(row);
					}
				}else {
					for (Iterator iterator = list.iterator(); iterator.hasNext();) {
						Map columnValue = (Map)iterator.next();
						DynamicTable row = new DynamicTable();
						if(columnValue.get("id") != null) row.setId(columnValue.get("id").toString());
						Object[] columns = columnValue.keySet().toArray();
						for (int i = 0; i < columns.length; i++) {
							CustomViewDto dto = new CustomViewDto();
							
							dto.setColumnAlias(columns[i].toString());
							dto.setColumnValue(columnValue.get(columns[i].toString()));
							row.addProperty(columns[i].toString(), dto);
						}
						resultList.add(row);
					}
				}
				tmpPageBean.setResultList(resultList);
				return tmpPageBean;
			}
		});
    }

    
    public Object getEntity(final Class cls, final Object obj) {
    	return (Object)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				System.out.println("**************************"+session.toString());
				return ((SessionImpl)session).immediateLoad(cls.getName(), session.getIdentifier(obj));
			}
		});
    }

	@Override
	public <T> List<T> findByExample(Example example, T t)
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(t.getClass());
		criteria.add(example);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public <T> T findByExample(Example example, Class<T> clazz) throws Exception
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(clazz);
		criteria.add(example);
		List<T> result = (List<T>) getHibernateTemplate().findByCriteria(criteria);
		
		if (result.size() > 1) {
			throw new Exception("Expected one result (or null) to be returned, but found: " + result.size());
		}
		
		return result == null || result.size() == 0? null:result.get(0);
	}

	@Override
	public <T> T findByExampleExcludeZeroes(T t) throws Exception
	{
		Example example = Example.create(t);
		example.excludeZeroes();
		return (T) this.findByExample(example, t.getClass());
	}

	@Override
	public <T> T findByExample(T t) throws Exception
	{
		Example example = Example.create(t);
		return (T) this.findByExample(example, t.getClass());
	}

	@Override
	public <T> List<T> getListByExampleExcludeZeroes(T t, int firstResult, int maxResults) throws Exception
	{
		Example example = Example.create(t);
		example.excludeZeroes();
		DetachedCriteria criteria = DetachedCriteria.forClass(t.getClass());
		criteria.add(example);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	@Override
	public <T> List<T> getListByExample(T t, int firstResult, int maxResults) throws Exception
	{
		Example example = Example.create(t);
		DetachedCriteria criteria = DetachedCriteria.forClass(t.getClass());
		criteria.add(example);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	@Override
	public <T> List<T> getListByExampleExcludeZeroes(T t) throws Exception
	{
		Example example = Example.create(t);
		example.excludeZeroes();
		DetachedCriteria criteria = DetachedCriteria.forClass(t.getClass());
		criteria.add(example);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public <T> List<T> getListByExample(T t) throws Exception
	{
		Example example = Example.create(t);
		DetachedCriteria criteria = DetachedCriteria.forClass(t.getClass());
		criteria.add(example);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria);
	}

}

class EscColumnToBean implements ResultTransformer {
	private static final long serialVersionUID = 1L;   
    private final Class resultClass;   
    private Setter[] setters;   
    private PropertyAccessor propertyAccessor;   
       
    public EscColumnToBean(Class resultClass) {   
        if(resultClass==null) throw new IllegalArgumentException("resultClass cannot be null");   
        this.resultClass = resultClass;   
        propertyAccessor = new ChainedPropertyAccessor(new PropertyAccessor[] { PropertyAccessorFactory.getPropertyAccessor(resultClass,null), PropertyAccessorFactory.getPropertyAccessor("field")});         
    }   
  
    //结果转换时，HIBERNATE调用此方法   
    public Object transformTuple(Object[] tuple, String[] aliases) {   
        Object result;   
           
        try {   
            if(setters==null) {//首先初始化，取得目标POJO类的所有SETTER方法   
                setters = new Setter[aliases.length];   
                for (int i = 0; i < aliases.length; i++) {   
                    String alias = aliases[i];   
                    if(alias != null) {   
                        //我的逻辑主要是在getSetterByColumnName方法里面，其它都是HIBERNATE的另一个类中COPY的   
                        //这里填充所需要的SETTER方法   
                        setters[i] = getSetterByColumnName(alias);   
                    }   
                }   
            }   
            result = resultClass.newInstance();   
               
            //这里使用SETTER方法填充POJO对象   
            for (int i = 0; i < aliases.length; i++) {   
                if(setters[i]!=null) {   
                    setters[i].set(result, tuple[i], null);   
                }   
            }   
        } catch (InstantiationException e) {   
            throw new HibernateException("Could not instantiate resultclass: " + resultClass.getName());   
        } catch (IllegalAccessException e) {   
            throw new HibernateException("Could not instantiate resultclass: " + resultClass.getName());   
        }   
           
        return result;   
    }   
  
    //根据数据库字段名在POJO查找JAVA属性名，参数就是数据库字段名，如：USER_ID   
    private Setter getSetterByColumnName(String alias) {   
        //取得POJO所有属性名   
        Field[] fields = resultClass.getDeclaredFields();   
        if(fields==null || fields.length==0){   
            throw new RuntimeException("实体"+resultClass.getName()+"不含任何属性");   
        }   
        //把字段名中所有的下杠去除   
        String proName = alias.replaceAll("_", "").toLowerCase();   
        for (Field field : fields) {   
            if(field.getName().toLowerCase().equals(proName)){//去除下杠的字段名如果和属性名对得上，就取这个SETTER方法   
                return propertyAccessor.getSetter(resultClass, field.getName());   
            }   
        }   
        throw new RuntimeException("找不到数据库字段 ："+ alias + " 对应的POJO属性或其getter方法，比如数据库字段为USER_ID或USERID，那么JAVA属性应为userId");   
    }   
    
    @SuppressWarnings("unchecked")   
    public List transformList(List collection) {   
        return collection;   
    }  
}
