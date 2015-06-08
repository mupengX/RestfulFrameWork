package com.tk.framework.util;

import org.hibernate.type.Type;


/**
 * <pre> 
 *  
 *  File: ColumnReturnType.java
 *  
 *  Copyright (C): 2014
 *  Description: 字段返回类型
 *  TODO
 * 
 *  Notes:
 *  $Id: ColumnReturnType.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:45:46>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ColumnReturnType {

	private String columnName;
	private Type returnType;
	
	public ColumnReturnType(){
		
	}
	
	public ColumnReturnType(String columnName, Type returnType){
		this.columnName = columnName;
		this.returnType = returnType;
	}
	
	public ColumnReturnType(String columnName){
		this.columnName = columnName;
	}
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Type getReturnType() {
		return returnType;
	}
	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}
	
	
}
