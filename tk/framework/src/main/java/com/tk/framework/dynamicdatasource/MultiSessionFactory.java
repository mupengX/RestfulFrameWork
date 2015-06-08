package com.tk.framework.dynamicdatasource;

import java.io.Serializable;
import java.sql.Connection;
import java.util.Map;
import java.util.Set;

import javax.naming.NamingException;
import javax.naming.Reference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Cache;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.TypeHelper;
import org.hibernate.classic.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.engine.FilterDefinition;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.hibernate.stat.Statistics;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <pre> 
 *  
 *  File: MultiSessionFactory.java
 *  
 *  Copyright (C): 2014
 *  Description: 动态获取SessionFactory类
 *  TODO
 * 
 *  Notes:
 *  $Id: MultiSessionFactory.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:30:39>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class MultiSessionFactory implements SessionFactory, ApplicationContextAware {
	
	private static final Log log = LogFactory.getLog(MultiSessionFactory.class);
	private ApplicationContext applicationContext = null;
	private SessionFactory sessionFactory = null;
	
	private DynamicLoadBean dynamicLoadBean;
	public void setDynamicLoadBean(DynamicLoadBean dynamicLoadBean) {
		this.dynamicLoadBean = dynamicLoadBean;
	}
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	public SessionFactory getSessionFactory(String sessionFactoryName) {
		System.out.println("sessionFactoryName:"+sessionFactoryName);
		try{
			sessionFactory = (SessionFactory)this.getApplicationContext().getBean(sessionFactoryName+"SessionFactory");
			return sessionFactory;
			//return (SessionFactory)this.getApplicationContext().getBean(sessionFactoryName);
		}catch(NoSuchBeanDefinitionException ex){
			dynamicLoadBean.setApplicationContext(applicationContext);
			dynamicLoadBean.loadBean(applicationContext.getClassLoader().getResource(sessionFactoryName+"DataSource.xml").toString());
			sessionFactory = (SessionFactory)this.getApplicationContext().getBean(sessionFactoryName+"SessionFactory");
			return sessionFactory;
		}
	}
	
	public SessionFactory getSessionFactory() {
		String sessionFactoryName = ThreadService.getSourceName();
		if(sessionFactoryName==null || sessionFactoryName.equals("")) {
			sessionFactoryName = "default";
		}
		return getSessionFactory(sessionFactoryName);
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#close()
	 */
	public void close() throws HibernateException {
		getSessionFactory().close();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evict(java.lang.Class)
	 */
	public void evict(Class persistentClass) throws HibernateException {
		getSessionFactory().evict(persistentClass);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evict(java.lang.Class, java.io.Serializable)
	 */
	public void evict(Class persistentClass, Serializable id) throws HibernateException {
		getSessionFactory().evict(persistentClass, id);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictCollection(java.lang.String)
	 */
	public void evictCollection(String roleName) throws HibernateException {
		getSessionFactory().evictCollection(roleName);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictCollection(java.lang.String, java.io.Serializable)
	 */
	public void evictCollection(String roleName, Serializable id) throws HibernateException {
		getSessionFactory().evictCollection(roleName, id);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictEntity(java.lang.String)
	 */
	public void evictEntity(String entityName) throws HibernateException {
		getSessionFactory().evictEntity(entityName);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictEntity(java.lang.String, java.io.Serializable)
	 */
	public void evictEntity(String entityName, Serializable id) throws HibernateException {
		getSessionFactory().evictEntity(entityName, id);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictQueries()
	 */
	public void evictQueries() throws HibernateException {
		getSessionFactory().evictQueries();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#evictQueries(java.lang.String)
	 */
	public void evictQueries(String cacheRegion) throws HibernateException {
		getSessionFactory().evictQueries(cacheRegion);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getAllClassMetadata()
	 */
	public Map getAllClassMetadata() throws HibernateException {
		return getSessionFactory().getAllClassMetadata();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getAllCollectionMetadata()
	 */
	public Map getAllCollectionMetadata() throws HibernateException {
		return getSessionFactory().getAllCollectionMetadata();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getClassMetadata(java.lang.Class)
	 */
	public ClassMetadata getClassMetadata(Class persistentClass) throws HibernateException {
		return getSessionFactory().getClassMetadata(persistentClass);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getClassMetadata(java.lang.String)
	 */
	public ClassMetadata getClassMetadata(String entityName) throws HibernateException {
		return getSessionFactory().getClassMetadata(entityName);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getCollectionMetadata(java.lang.String)
	 */
	public CollectionMetadata getCollectionMetadata(String roleName) throws HibernateException {
		return getSessionFactory().getCollectionMetadata(roleName);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getCurrentSession()
	 */
	public Session getCurrentSession() throws HibernateException {
		return getSessionFactory().getCurrentSession();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getDefinedFilterNames()
	 */
	public Set getDefinedFilterNames() {
		return getSessionFactory().getDefinedFilterNames();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getFilterDefinition(java.lang.String)
	 */
	public FilterDefinition getFilterDefinition(String filterName) throws HibernateException {
		return getSessionFactory().getFilterDefinition(filterName);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#getStatistics()
	 */
	public Statistics getStatistics() {
		return getSessionFactory().getStatistics();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#isClosed()
	 */
	public boolean isClosed() {
		return getSessionFactory().isClosed();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openSession()
	 */
	public Session openSession() throws HibernateException {
		return getSessionFactory().openSession();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openSession(java.sql.Connection)
	 */
	public Session openSession(Connection connection) {
		return getSessionFactory().openSession(connection);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openSession(org.hibernate.Interceptor)
	 */
	public Session openSession(Interceptor interceptor) throws HibernateException {
		return getSessionFactory().openSession(interceptor);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openSession(java.sql.Connection, org.hibernate.Interceptor)
	 */
	public Session openSession(Connection connection, Interceptor interceptor) {
		return getSessionFactory().openSession(connection, interceptor);
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openStatelessSession()
	 */
	public StatelessSession openStatelessSession() {
		return getSessionFactory().openStatelessSession();
	}
	/* (non-Javadoc)
	 * @see org.hibernate.SessionFactory#openStatelessSession(java.sql.Connection)
	 */
	public StatelessSession openStatelessSession(Connection connection) {
		return getSessionFactory().openStatelessSession(connection);
	}
	/* (non-Javadoc)
	 * @see javax.naming.Referenceable#getReference()
	 */
	public Reference getReference() throws NamingException {
		return getSessionFactory().getReference();
	}

	public boolean containsFetchProfileDefinition(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Cache getCache() {
		// TODO Auto-generated method stub
		return null;
	}

	public TypeHelper getTypeHelper() {
		// TODO Auto-generated method stub
		return null;
	}


}