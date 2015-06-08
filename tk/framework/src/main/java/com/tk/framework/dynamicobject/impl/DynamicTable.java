package com.tk.framework.dynamicobject.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.tk.framework.dto.CustomViewDto;


/**
 * <pre> 
 *  
 *  File: DynamicTable.java
 *  
 *  Copyright (C): 2014
 *  Description:动态表格封装类，每个实例相当于一行数据
 *  TODO
 * 
 *  Notes:
 *  $Id: DynamicTable.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:51:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DynamicTable {
	
	private String tableName;//数据库中的表名
	private String className;//该表对应的映射类名
	private String tenantId;//所属租户
	private String querySqlName;//用来查询数据使用的命名SQL名称
	private String custom_view;//自定义查询的JSON对象字符串
	
	private String jsonColumnValue;//这行数据动态列值的JSON对象字符串
	
	public String getJsonColumnValue() {
		jsonColumnValue = "[";
		JSONArray jsonArray = JSONArray.fromObject(custom_view);
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jsonObject = (JSONObject) jsonArray.get(i);
			CustomViewDto dto = (CustomViewDto)JSONObject.toBean(jsonObject, CustomViewDto.class);
			String colunmName = dto.getColumnAlias();
			Set values = this.properties.keySet();
			for (Iterator iterator = values.iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				if(key.equals(colunmName)) {
					CustomViewDto value = (CustomViewDto)this.properties.get(key);
					jsonColumnValue += "{";
					jsonColumnValue += "\"columnName\":"+"\""+key+"\",";
					if(value.getColumnValue() != null)
						jsonColumnValue += "\"columnValue\":\""+value.getColumnValue().toString()+"\"";
					else 
						jsonColumnValue += "\"columnValue\":\"\"";
					jsonColumnValue += "},";
				}
			}
		}
		jsonColumnValue = jsonColumnValue.substring(0, jsonColumnValue.length()-1);
		jsonColumnValue += "]";
		return jsonColumnValue;
	}
	public void setJsonColumnValue(String jsonColumnValue) {
		this.jsonColumnValue = jsonColumnValue;
	}

	private Object id;//这行数据的ID
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	
	private Map properties = new HashMap();//这行数据的动态列值
	public Map getProperties() {
		return properties;
	}
	public void setProperties(Map properties) {
		this.properties = properties;
	}
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getQuerySqlName() {
		return querySqlName;
	}
	public void setQuerySqlName(String querySqlName) {
		this.querySqlName = querySqlName;
	}
	public String getCustom_view() {
		return custom_view;
	}
	public void setCustom_view(String customView) {
		custom_view = customView;
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
	
//	private List tableNames = new ArrayList();
//	
//	public List getTableNames() {
//		return tableNames;
//	}

//	@Override
//	public boolean addProperty(Object propertyName, CustomViewDto propertyObject) {
//		int i=0;
//		for (Iterator iterator = tableNames.iterator(); iterator.hasNext();) {
//			String tableName = (String) iterator.next();
//			if(tableName.equals(propertyObject.getTableName())) break;
//			i++;
//		}
//		if(i == tableNames.size()) {
//			tableNames.add(propertyObject.getTableName());
//		}
//		return super.addProperty(propertyName, propertyObject);
//	}
}
