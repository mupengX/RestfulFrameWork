package com.tk.orm.publicplatform.dto;

import java.util.List;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * <pre> 
 *  
 *  File: PlatformDetailDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailDto.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月20日上午9:49:23>>, <<Who>>, <<what>>  
 *  2015年5月20日		mupeng		Initial.
 * </pre>
 */
@ApiModel("platformDetail")
public class PlatformDetailDto {
	@ApiModelProperty(required = true)
	private List<Map> add; //用于新增的数据
	@ApiModelProperty(required = true)
	private List<String> delete; //用于删除的数据
	@ApiModelProperty(required = true)
	private List<Map> update; //用于更新的数据
	@ApiModelProperty(required = true)
	private String networktype; //内外网标志位
	@ApiModelProperty(required = true)
	private String itemid; //设备类型itemid（来自数据字典）
	
	
	public List<Map> getAdd() {
		return add;
	}
	public void setAdd(List<Map> add) {
		this.add = add;
	}
	public List<String> getDelete() {
		return delete;
	}
	public void setDelete(List<String> delete) {
		this.delete = delete;
	}
	public List<Map> getUpdate() {
		return update;
	}
	public void setUpdate(List<Map> update) {
		this.update = update;
	}
	public String getNetworktype() {
		return networktype;
	}
	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	
	
	
}

/*
*$Log: av-env.bat,v $
*/