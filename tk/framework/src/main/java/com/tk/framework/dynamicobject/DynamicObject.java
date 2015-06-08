package com.tk.framework.dynamicobject;

import java.io.Serializable;
import java.util.List;

import com.tk.framework.dto.CustomViewDto;



/**
 * <pre> 
 *  
 *  File: DynamicObject.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:动态数据对象
 *  TODO
 * 
 *  Notes:
 *  $Id: DynamicObject.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:33:55>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface DynamicObject extends Serializable{
	
	/**
	 * 设置ID值
	 * @param id
	 * @return
	 */
	public boolean setId(Serializable id);
	
	/**
	 * 获取ID值
	 * @return
	 */
	public Object getId();
	
	/**
	 * 添加一个属性
	 * @param propertyName
	 * @param propertyObject
	 * @return
	 */
	public boolean addProperty(Object propertyName,CustomViewDto propertyObject);
	
	/**
	 * 移除一个属性
	 * @param propertyName
	 * @return
	 */
	public boolean removeProperty(Object propertyName);
	
	/**
	 * 修改一个属性
	 * @param propertyName
	 * @param propertyObject
	 * @return
	 */
	public boolean updateProperty(Object propertyName,CustomViewDto propertyObject);
	
	/**
	 * 获得一个属性
	 * @param name
	 * @return
	 */
	public CustomViewDto getProperty(Object name);
	
	/**
	 * 获得所有属性名称
	 * @return
	 */
	public Object[] getPropertyNames();
}
