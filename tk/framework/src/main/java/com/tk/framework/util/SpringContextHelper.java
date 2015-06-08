package com.tk.framework.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <pre> 
 *  
 *  File: SpringContextHelper.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  上下文工具类，用于动态获取bean
 * 
 *  Notes:
 *  $Id: SpringContextHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:14:04>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class SpringContextHelper implements ApplicationContextAware
{
	private  static ApplicationContext context = null;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		context = applicationContext;
	}

	public static  Object getBean(String name)
	{
		return context.getBean(name);
	}

}

/*
 * $Log: av-env.bat,v $
 */