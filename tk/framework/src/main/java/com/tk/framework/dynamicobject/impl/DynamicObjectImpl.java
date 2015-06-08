package com.tk.framework.dynamicobject.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tk.framework.dto.CustomViewDto;
import com.tk.framework.dynamicobject.DynamicObject;

/**
 * <pre> 
 *  
 *  File: DynamicObjectImpl.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 动态表格封装实现类
 *  TODO
 * 
 *  Notes:
 *  $Id: DynamicObjectImpl.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:51:37>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DynamicObjectImpl implements DynamicObject {
	
	private Object id;
	public Object getId() {
		return id;
	}
	
	private Map properties = new HashMap();
	public Map getProperties() {
		return properties;
	}
	
	public boolean setId(Serializable id) {
		this.id = id;
		return true;
	}
	
	public boolean addProperty(Object propertyName, CustomViewDto propertyObject) {
		properties.put(propertyName, propertyObject);
		return true;
	}
	
	public boolean removeProperty(Object propertyName) {
		properties.remove(propertyName);
		return true;
	}
	
	public boolean updateProperty(Object propertyName,
			CustomViewDto propertyObject) {
		removeProperty(propertyName);
		addProperty(propertyName, propertyObject);
		return true;
	}
	
	public CustomViewDto getProperty(Object name) {
		return (CustomViewDto)properties.get(name);
	}

	public Object[] getPropertyNames() {
		return properties.keySet().toArray();
	}
}
