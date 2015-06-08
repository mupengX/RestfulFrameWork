package com.tk.orm.publicplatform.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import com.tk.orm.log.model.LogPo;

/**
 * <pre> 
 *  
 *  File: PlatformDetailgovNetModel.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *   公共平台网络统一接口 services
 * 
 *  Notes:
 *  $Id: PlatformDetailgovNetModel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年5月21日下午3:03:19>>, <<Who>>, <<what>>  
 *  2015年5月21日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformDetailgovNet")
public class PlatformDetailgovNetModel  implements Serializable
{
	// Fields
	private String id; // '主键'
	private String no;
	private String name;
	private String way;
	private String bandwidth;
	private Date date;
	private String operators;
	private String remark;
	
	private int year;
	private String reportDept;
	private String networkType;
	private String agencyCode;
	private String recStatus;
	private String order;
	private String lockStatus;
	private Date lockDate;
	private String lockUserID;
	private String createBy;
	private Date createDate;
	private String lastEditBy;
	private Date lastEditDate;
	private String remarks;
	private String extend1;
	private String extend2;
	private String extend3;
	private String platformID;
	
	
	
	
	public PlatformDetailgovNetModel() {
		// TODO Auto-generated constructor stub
	}
	
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	@Column(name = "spdena_no")
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	
	
	@Column(name = "spdena_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "spdena_way")
	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	
	@Column(name = "spdena_bandwidth")
	public String getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}

	
	@Column(name = "spdena_date")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
	@Column(name = "spdena_operators")
	public String getOperators() {
		return operators;
	}

	public void setOperators(String operators) {
		this.operators = operators;
	}
	
	
	@Column(name = "spdena_Remark")
	public String getRemark() {
		return remark;
	}

	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	@Column(name = "spdena_year")
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	@Column(name = "spdena_reportDept")
	public String getReportDept() {
		return reportDept;
	}

	public void setReportDept(String reportDept) {
		this.reportDept = reportDept;
	}

	
	
	@Column(name = "spdena_networkType")
	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	
	
	@Column(name = "spdena_agencyCode")
	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	
	@Column(name = "spdena_recStatus")
	public String getRecStatus() {
		return recStatus;
	}

	public void setRecStatus(String recStatus) {
		this.recStatus = recStatus;
	}

	
	
	@Column(name = "spdena_order")
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	
	@Column(name = "spdena_lockStatus")
	public String getLockStatus() {
		return lockStatus;
	}

	public void setLockStatus(String lockStatus) {
		this.lockStatus = lockStatus;
	}

	
	
	@Column(name = "spdena_lockDate")
	public Date getLockDate() {
		return lockDate;
	}

	public void setLockDate(Date lockDate) {
		this.lockDate = lockDate;
	}

	
	
	@Column(name = "spdena_lockUserID")
	public String getLockUserID() {
		return lockUserID;
	}

	public void setLockUserID(String lockUserID) {
		this.lockUserID = lockUserID;
	}

	
	@Column(name = "spdena_createBy")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	
	@Column(name = "spdena_createDate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	@Column(name = "spdena_lastEditBy")
	public String getLastEditBy() {
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy) {
		this.lastEditBy = lastEditBy;
	}

	
	@Column(name = "spdena_lastEditDate")
	public Date getLastEditDate() {
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate) {
		this.lastEditDate = lastEditDate;
	}
	
	
	@Column(name = "spdena_remarks")
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "spdena_extend1")
	public String getExtend1() {
		return extend1;
	}

	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	
	@Column(name = "spdena_extend2")
	public String getExtend2() {
		return extend2;
	}

	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}
	
	@Column(name = "spdena_extend3")
	public String getExtend3() {
		return extend3;
	}

	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}

	
	@Column(name = "spdena_platformid")
	public String getPlatformID() {
		return platformID;
	}

	public void setPlatformID(String platformID) {
		this.platformID = platformID;
	}
	
	
	
	
	
	

}

/*
 * $Log: av-env.bat,v $
 */