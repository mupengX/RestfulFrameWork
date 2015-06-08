package com.tk.orm.publicplatform.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: PlatformDetailHardWarePo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: PlatformDetailHardWarePo.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月19日下午3:05:04>>, <<Who>>, <<what>>  
 *  2015年5月19日		mupeng		Initial.
 * </pre>
 */

@Entity
@Table(name = "sois_platformdetailhardware")
public class PlatformDetailSoftHardWarePo {
	private static final long serialVersionUID = -4245780727102713995L;
	
	private String id; //主键
	
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
	
	private String reportdept; //填报机构
	
	private String networktype; // 内外网标志位
	
	private String agencycode; //机构编码
	
	private String recstatus; //数据状态
	
	private String order; //排序
	
	private String lockstatus; //锁定状态
	
	private String lockuserid; //锁定人
	
	private Date lockdate; //锁定时间
	
	private String createby; //创建者(fk)
	
	private Date createdate; //创建时间
	
	private String lasteditby; //修改者(fk)
	
	private Date lasteditdate; //修改时间
	
	private String remarks; //备注
	
	private String extend1; //扩展字段1
	
	private String extend2; //扩展字段2
	
	private String extend3; //扩展字段3
	
	private String platformid; //公共平台主键

	
	public PlatformDetailSoftHardWarePo() {
		super();
	}


	
	public PlatformDetailSoftHardWarePo(String id, String type, String brand,
			String model, String productcompany, String use,
			int dateofpurchasing, int count, BigDecimal money, String remark,
			int year, String reportdept, String networktype, String agencycode,
			String recstatus, String order, String lockstatus,
			String lockuserid, Date lockdate, String createby, Date createdate,
			String lasteditby, Date lasteditdate, String remarks,
			String extend1, String extend2, String extend3, String platformid) {
		super();
		this.id = id;
		this.types = type;
		this.brand = brand;
		this.model = model;
		this.productcompany = productcompany;
		this.purpose = use;
		this.dateofpurchasing = dateofpurchasing;
		this.counts = count;
		this.money = money;
		this.remark = remark;
		this.years = year;
		this.reportdept = reportdept;
		this.networktype = networktype;
		this.agencycode = agencycode;
		this.recstatus = recstatus;
		this.order = order;
		this.lockstatus = lockstatus;
		this.lockuserid = lockuserid;
		this.lockdate = lockdate;
		this.createby = createby;
		this.createdate = createdate;
		this.lasteditby = lasteditby;
		this.lasteditdate = lasteditdate;
		this.remarks = remarks;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.platformid = platformid;
	}




	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false, length = 64)
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	@Column(name="spdh_type")
    public String getTypes() {
		return types;
	}



	public void setTypes(String types) {
		this.types = types;
	}


	@Column(name="spdh_brand")
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Column(name="spdh_model")
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

	@Column(name="spdh_productcompany")
	public String getProductcompany() {
		return productcompany;
	}


	public void setProductcompany(String productcompany) {
		this.productcompany = productcompany;
	}


	@Column(name="spdh_use")
	public String getPurpose() {
		return purpose;
	}



	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}



	@Column(name="spdh_dateofpurchasing")
	public int getDateofpurchasing() {
		return dateofpurchasing;
	}


	public void setDateofpurchasing(int dateofpurchasing) {
		this.dateofpurchasing = dateofpurchasing;
	}

	@Column(name="spdh_count")
	public int getCounts() {
		return counts;
	}



	public void setCounts(int counts) {
		this.counts = counts;
	}


	@Column(name="spdh_money")
	public BigDecimal getMoney() {
		return money;
	}

	
	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Column(name="spdh_remark")
	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}

	
	@Column(name="spdh_year")
	public int getYears() {
		return years;
	}



	public void setYears(int years) {
		this.years = years;
	}


	@Column(name="spdh_reportdept")
	public String getReportdept() {
		return reportdept;
	}


	public void setReportdept(String reportdept) {
		this.reportdept = reportdept;
	}

	@Column(name="spdh_networktype")
	public String getNetworktype() {
		return networktype;
	}


	public void setNetworktype(String networktype) {
		this.networktype = networktype;
	}

	@Column(name="spdh_agencycode")
	public String getAgencycode() {
		return agencycode;
	}


	public void setAgencycode(String agencycode) {
		this.agencycode = agencycode;
	}

	@Column(name="spdh_recstatus")
	public String getRecstatus() {
		return recstatus;
	}


	public void setRecstatus(String recstatus) {
		this.recstatus = recstatus;
	}

	@Column(name="spdh_order")
	public String getOrder() {
		return order;
	}


	public void setOrder(String order) {
		this.order = order;
	}

	@Column(name="spdh_lockstatus")
	public String getLockstatus() {
		return lockstatus;
	}


	public void setLockstatus(String lockstatus) {
		this.lockstatus = lockstatus;
	}

	@Column(name="spdh_lockuserid")
	public String getLockuserid() {
		return lockuserid;
	}


	public void setLockuserid(String lockuserid) {
		this.lockuserid = lockuserid;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spdh_lockdate")
	public Date getLockdate() {
		return lockdate;
	}


	public void setLockdate(Date lockdate) {
		this.lockdate = lockdate;
	}
	
	@Column(name="spdh_createby")
	public String getCreateby() {
		return createby;
	}


	public void setCreateby(String createby) {
		this.createby = createby;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spdh_createdate")
	public Date getCreatedate() {
		return createdate;
	}


	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Column(name="spdh_lasteditby")
	public String getLasteditby() {
		return lasteditby;
	}


	public void setLasteditby(String lasteditby) {
		this.lasteditby = lasteditby;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="spdh_lasteditdate")
	public Date getLasteditdate() {
		return lasteditdate;
	}


	public void setLasteditdate(Date lasteditdate) {
		this.lasteditdate = lasteditdate;
	}

	@Column(name="spdh_remarks")
	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name="spdh_extend1")
	public String getExtend1() {
		return extend1;
	}


	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}

	@Column(name="spdh_extend2")
	public String getExtend2() {
		return extend2;
	}


	public void setExtend2(String extend2) {
		this.extend2 = extend2;
	}

	@Column(name="spdh_extend3")
	public String getExtend3() {
		return extend3;
	}


	public void setExtend3(String extend3) {
		this.extend3 = extend3;
	}

	@Column(name="spdh_platformid")
	public String getPlatformid() {
		return platformid;
	}


	public void setPlatformid(String platformid) {
		this.platformid = platformid;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
