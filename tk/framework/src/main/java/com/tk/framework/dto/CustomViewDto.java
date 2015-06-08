package com.tk.framework.dto;

/**
 * <pre> 
 *  
 *  File: CustomViewDto.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:  自定义视图DTO
 *  TODO
 * 
 *  Notes:
 *  $Id: CustomViewDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:27:50>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class CustomViewDto {
	
	private String tableName;//表名
	private String tableAlias;//查询时用的表的别名(SQL中)
	private String columnName;//列名
	private String columnAlias;//查询时用的列的别名(SQL中)
	private String displayName;//界面显示列名
	private String columnType;//数据列类型
	private Object columnValue;//数据列的值
	private String isExtension;//是否扩展列 Y/N
	private String isVisible;//是否显示 Y/N
	private String showTab;//显示在哪个TAB面板中
	private String showTabName;//显示在哪个TAB面板's name
	private String refModuleCode;//引用到那个模块的自定义列
	private String refModuleName;//引用到哪个模块的自定义列名称
	private String defineId;//定义ID
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableAlias() {
		return tableAlias;
	}
	public void setTableAlias(String tableAlias) {
		this.tableAlias = tableAlias;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnAlias() {
		return columnAlias;
	}
	public void setColumnAlias(String columnAlias) {
		this.columnAlias = columnAlias;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getColumnType() {
		return columnType;
	}
	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}
	public Object getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(Object columnValue) {
		this.columnValue = columnValue;
	}
	public String getIsExtension() {
		return isExtension;
	}
	public void setIsExtension(String isExtension) {
		this.isExtension = isExtension;
	}
	public String getIsVisible() {
		return isVisible;
	}
	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}
	public String getShowTab() {
		return showTab;
	}
	public void setShowTab(String showTab) {
		this.showTab = showTab;
	}
	public String getShowTabName() {
		return showTabName;
	}
	public void setShowTabName(String showTabName) {
		this.showTabName = showTabName;
	}
	public String getRefModuleCode() {
		return refModuleCode;
	}
	public void setRefModuleCode(String refModuleCode) {
		this.refModuleCode = refModuleCode;
	}
	public String getRefModuleName() {
		return refModuleName;
	}
	public void setRefModuleName(String refModuleName) {
		this.refModuleName = refModuleName;
	}
	public String getDefineId() {
		return defineId;
	}
	public void setDefineId(String defineId) {
		this.defineId = defineId;
	}
}
