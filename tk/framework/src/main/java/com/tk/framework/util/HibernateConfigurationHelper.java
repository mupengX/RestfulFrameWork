package com.tk.framework.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Column;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;

/**
 * <pre>
 *  
 *  File: HibernateConfigurationHelper.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  根据实体类得到对应的表名、主键名、字段名工具类
 * 
 *  Notes:
 *  $Id: HibernateConfigurationHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月13日下午5:22:20>>, <<Who>>, <<what>>  
 *  2015年1月13日		TK		Initial.
 * </pre>
 */
public class HibernateConfigurationHelper
{
	private static Configuration hibernateConf;

	private static Configuration getHibernateConf()
	{
		if (hibernateConf == null)
		{
			return new Configuration();
		}
		return hibernateConf;
	}

	@SuppressWarnings("rawtypes")
	private static PersistentClass getPersistentClass(Class clazz)
	{
		synchronized (HibernateConfigurationHelper.class)
		{
			PersistentClass pc = getHibernateConf().getClassMapping(clazz.getName());
			if (pc == null)
			{
				hibernateConf = getHibernateConf().addClass(clazz);
				pc = getHibernateConf().getClassMapping(clazz.getName());

			}
			return pc;
		}
	}

	/**
	 * <pre>
	 * 功能描述：获取实体对应的表名
	 * 注：po类名须与对应映射文件名一致，即Student.java与Student.hbm.xml
	 * </pre>
	 * 
	 * @param clazz 实体类
	 * @return 表名
	 */
	@SuppressWarnings("rawtypes")
	public static String getTableName(Class clazz)
	{
		return getPersistentClass(clazz).getTable().getName();
	}

	/**
	 * <pre>
	 * 功能描述：获取实体对应的表名
	 * 注：针对注解方式
	 * </pre>
	 * 
	 * @param clazz 实体类
	 * @return 表名
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static String getTableName4Annotation(Class clazz)
	{
		String tablename = null;
		if (null != clazz)
		{
			Annotation entityAnn = clazz.getAnnotation(Entity.class);
			Annotation tableAnn = clazz.getAnnotation(Table.class);
			if (null != entityAnn && null != tableAnn)
			{
				Table table = (Table) tableAnn;
				tablename = table.name();
			}
		}
		return tablename;
	}

	/**
	 * <pre>
	 * 功能描述：获取实体对应表的主键字段名称 
	 * 注：po类名须与对应映射文件名一致，即Student.java与Student.hbm.xml
	 * </pre>
	 * 
	 * @param clazz 实体类
	 * @return 主键字段名称
	 */
	@SuppressWarnings("rawtypes")
	public static String getPkColumnName(Class clazz)
	{

		return getPersistentClass(clazz).getTable().getPrimaryKey().getColumn(0).getName();

	}

	/**
	 * <pre>
	 * 功能描述：通过实体类和属性，获取实体类属性对应的表字段名称 
	 * 注：po类名须与对应映射文件名一致，即Student.java与Student.hbm.xml
	 * </pre>
	 * 
	 * @param clazz 实体类
	 * @param propertyName 属性名称
	 * @return 字段名称
	 */
	@SuppressWarnings("rawtypes")
	public static String getColumnName(Class clazz, String propertyName)
	{
		PersistentClass persistentClass = getPersistentClass(clazz);
		Property property = persistentClass.getProperty(propertyName);
		Iterator it = property.getColumnIterator();
		if (it.hasNext())
		{
			Column column = (Column) it.next();
			return column.getName();
		}
		return null;
	}

	/**
	 * <pre>
	 * 功能描述：通过实体类和属性，获取实体类属性对应的表字段名称 
	 * 注：针对注解方式
	 * </pre>
	 * 
	 * @param clazz 实体类
	 * @param propertyName 属性名称
	 * @return 字段名称
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static String getColumnName4Annotation(Class clazz, String propertyName)
	{
		String columnName = null;
		if (null != clazz && null != propertyName)
		{
			try
			{
				Method method = clazz.getDeclaredMethod("get" + propertyName.substring(0, 1).toUpperCase()
						+ propertyName.substring(1));
				javax.persistence.Column column = method.getAnnotation(javax.persistence.Column.class);
				if (null != column)
				{
					columnName = column.name();
				}
			}
			catch (NoSuchMethodException e)
			{
				e.printStackTrace();
			}
			catch (SecurityException e)
			{
				e.printStackTrace();
			}
		}
		return columnName;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// System.out.println(getTableName(IntelligenceNetVPNAndSCP.class));
		// System.out.println(getColumnName(IntelligenceNetVPNAndSCP.class,
		// "vsCode"));
	}
}

/*
 * $Log: av-env.bat,v $
 */