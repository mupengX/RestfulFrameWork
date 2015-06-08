package com.tk.orm.publicplatform.dto;

import java.math.BigDecimal;

/**
 * <pre> 
 *  
 *  File: PlatformDetailHardWareDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailHardWareDto.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月20日上午10:08:52>>, <<Who>>, <<what>>  
 *  2015年5月20日		mupeng		Initial.
 * </pre>
 */
public class PlatformDetailSoftHardWareDto {
	
	private String id;
	
	private String types; //类型
	
	private String brand; //品牌
	
	private String model; //型号
	
	private String productcompany; //生产厂家
	
	private String purpose; //主要用途
	
	private int dateofpurchasing;  //购买年份
	
	private int counts; //数量
	
	private BigDecimal money; //金额
	
	private String remark; //备注
	
	private int years; //年份
	
	private String networktype; // 内外网标志位

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProductcompany() {
		return productcompany;
	}

	public void setProductcompany(String productcompany) {
		this.productcompany = productcompany;
	}

	

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getDateofpurchasing() {
		return dateofpurchasing;
	}

	public void setDateofpurchasing(int dateofpurchasing) {
		this.dateofpurchasing = dateofpurchasing;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getNetworktype() {
		return networktype;
	}

	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}

	
	
	
	
}

/*
*$Log: av-env.bat,v $
*/