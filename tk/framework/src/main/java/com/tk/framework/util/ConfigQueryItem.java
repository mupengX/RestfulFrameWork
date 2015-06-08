package com.tk.framework.util;

import java.io.Serializable;
import java.util.List;


/**
 * <pre> 
 *  
 *  File: ConfigQueryItem.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 配置查询项
 *  TODO
 * 
 *  Notes:
 *  $Id: ConfigQueryItem.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:47:41>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ConfigQueryItem implements Serializable, Cloneable {

	private String queryName;
	private String queryType;
	private String queryString;
	private List<ColumnReturnType> lsColumnReturnType;
	
	public List<ColumnReturnType> getLsColumnReturnType() {
		return lsColumnReturnType;
	}
	public void setLsColumnReturnType(List<ColumnReturnType> lsColumnReturnType) {
		this.lsColumnReturnType = lsColumnReturnType;
	}
	public ConfigQueryItem(){
		
	}
	public ConfigQueryItem(String queryName, String queryType, String queryString){
		this.queryName = queryName;
		this.queryType = queryType;
		this.queryString = queryString;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getQueryType() {
		return queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public String getQueryString() {
		System.out.println(queryString);
		return queryString;
	}
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}
	}
	
}
