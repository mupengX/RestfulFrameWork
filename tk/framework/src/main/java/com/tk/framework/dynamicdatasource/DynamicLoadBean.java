package com.tk.framework.dynamicdatasource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <pre> 
 *  
 *  File: DynamicLoadBean.java
 *  
 *  Copyright (C): 2014
 *  Description: 动态加载数据源bean
 *  TODO
 * 
 *  Notes:
 *  $Id: DynamicLoadBean.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:28:32>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DynamicLoadBean implements ApplicationContextAware {

	private ConfigurableApplicationContext applicationContext = null;
	
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.applicationContext = (ConfigurableApplicationContext)context;
	}
	
	public ConfigurableApplicationContext getApplicationContext() {
		return this.applicationContext;
	}
	
	public void loadBean(String configLocationString) {
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)getApplicationContext().getBeanFactory());
		beanDefinitionReader.setResourceLoader(getApplicationContext());
		beanDefinitionReader.setEntityResolver(new ResourceEntityResolver(getApplicationContext()));
		try {
			String[] configLocations = new String[]{configLocationString};
			for(int i=0;i<configLocations.length;i++)
				beanDefinitionReader.loadBeanDefinitions(getApplicationContext().getResources(configLocations[i]));
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}