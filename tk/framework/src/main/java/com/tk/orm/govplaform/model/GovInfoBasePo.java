package com.tk.orm.govplaform.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;







import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;

import com.tk.framework.constant.AppConstats;
import com.tk.orm.user.model.SysDepartmentPo;

/**
 * <pre>
 *  
 *  File: GovInfoBasePo.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  政务部门基础信息表
 * 
 *  Notes:
 *  $Id: GovInfoBasePo.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govdeptinfo")
public class GovInfoBasePo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4373775424361596217L;

	private String id; // 主键

	private String year=""+AppConstats.DEFAULT_YEAR; // 年份

	private SysDepartmentPo sysDepartmentPo; // 填报机构
	private GovInfoAssetPo govInfoAssetPo; // 政务部门资产情况
	private Set<GovInfoInvestPo> infoInvestPos=new HashSet<GovInfoInvestPo>(); // 政务部门五年计划信息化投资
	private GovInfoNetWorkPo govInfoNetWorkPo; // 政务部门网络情况
	private GovInfoRoomPo govInfoRoomPo; // 政务部门机房情况
	private String ManageOrginName;// 本单位信息化管理机构全称
	private String ManageOrginPhone;// 信息化机构联系电话
	private String ManageOrginFax;// 信息化机构传真
	private String ManageOrginEmail;// 信息化电子邮箱
	private String TechOrginName;// 本单位信息化技术机构全称
	private String TechOrginAddress;// 技术机构地址
	private String TechOrginPhone;// 技术机构联系电话
	private String TechOrginFax;// 技术机构传真
	private String TechOrginEmail;// 技术机构邮箱

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

	@Column(name = "sgdi_writeyear")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(name = "sgdi_infomanageorginname")
	public String getManageOrginName() {
		return ManageOrginName;
	}

	public void setManageOrginName(String manageOrginName) {
		ManageOrginName = manageOrginName;
	}

	@Column(name = "sgdi_infomanageorginphone")
	public String getManageOrginPhone() {
		return ManageOrginPhone;
	}

	public void setManageOrginPhone(String manageOrginPhone) {
		ManageOrginPhone = manageOrginPhone;
	}

	@Column(name = "sgdi_infomanageorginfax")
	public String getManageOrginFax() {
		return ManageOrginFax;
	}

	public void setManageOrginFax(String manageOrginFax) {
		ManageOrginFax = manageOrginFax;
	}

	@Column(name = "sgdi_infomanageorginemail")
	public String getManageOrginEmail() {
		return ManageOrginEmail;
	}

	public void setManageOrginEmail(String manageOrginEmail) {
		ManageOrginEmail = manageOrginEmail;
	}

	@Column(name = "sgdi_infotechorginname")
	public String getTechOrginName() {
		return TechOrginName;
	}

	public void setTechOrginName(String techOrginName) {
		TechOrginName = techOrginName;
	}

	@Column(name = "sgdi_infotechorginaddress")
	public String getTechOrginAddress() {
		return TechOrginAddress;
	}

	public void setTechOrginAddress(String techOrginAddress) {
		TechOrginAddress = techOrginAddress;
	}

	@Column(name = "sgdi_infotechorginphone")
	public String getTechOrginPhone() {
		return TechOrginPhone;
	}

	public void setTechOrginPhone(String techOrginPhone) {
		TechOrginPhone = techOrginPhone;
	}

	@Column(name = "sgdi_infotechorginfax")
	public String getTechOrginFax() {
		return TechOrginFax;
	}

	public void setTechOrginFax(String techOrginFax) {
		TechOrginFax = techOrginFax;
	}

	@Column(name = "sgdi_infotechorginemail")
	public String getTechOrginEmail() {
		return TechOrginEmail;
	}

	public void setTechOrginEmail(String techOrginEmail) {
		TechOrginEmail = techOrginEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToOne(cascade = { CascadeType.REFRESH }, targetEntity = SysDepartmentPo.class)
	@JoinColumn(name = "sgdi_deptid")
	public SysDepartmentPo getSysDepartmentPo() {
		return sysDepartmentPo;
	}

	public void setSysDepartmentPo(SysDepartmentPo sysDepartmentPo) {
		this.sysDepartmentPo = sysDepartmentPo;
	}
	
//	@OneToOne
//	@JoinColumn(name = "SGDI_GovAssetID", insertable = false, updatable = false)
	@ManyToOne(cascade = { CascadeType.ALL}, targetEntity = GovInfoAssetPo.class)
	@JoinColumn(name = "SGDI_GovAssetID")
	public GovInfoAssetPo getGovInfoAssetPo() {
		return govInfoAssetPo;
	}

	public void setGovInfoAssetPo(GovInfoAssetPo govInfoAssetPo) {
		this.govInfoAssetPo = govInfoAssetPo;
	}

	@OneToMany(targetEntity=GovInfoInvestPo.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="SGSI_GovDeptInfoID")
    public Set<GovInfoInvestPo> getInfoInvestPos() {
		return infoInvestPos;
	}

	public void setInfoInvestPos(Set<GovInfoInvestPo> infoInvestPos) {
		this.infoInvestPos = infoInvestPos;
	}

	//	@OneToOne
//	@JoinColumn(name = "SGDI_GovNetWork", insertable = true, updatable = true)
	@ManyToOne(cascade = { CascadeType.ALL }, targetEntity = GovInfoNetWorkPo.class)
	@JoinColumn(name = "SGDI_GovNetWork")
	public GovInfoNetWorkPo getGovInfoNetWorkPo() {
		return govInfoNetWorkPo;
	}

	public void setGovInfoNetWorkPo(GovInfoNetWorkPo govInfoNetWorkPo) {
		this.govInfoNetWorkPo = govInfoNetWorkPo;
	}

//	@OneToOne
//	@JoinColumn(name = "SGDI_GovRoomID", insertable = true, updatable = true)
	@ManyToOne(cascade = { CascadeType.ALL }, targetEntity = GovInfoRoomPo.class)
	@JoinColumn(name = "SGDI_GovRoomID")
	public GovInfoRoomPo getGovInfoRoomPo() {
		return govInfoRoomPo;
	}

	public void setGovInfoRoomPo(GovInfoRoomPo govInfoRoomPo) {
		this.govInfoRoomPo = govInfoRoomPo;
	}



	public GovInfoBasePo() {
		super();
		this.id = id;
		this.year = year;
		this.sysDepartmentPo = new SysDepartmentPo();
		this.govInfoAssetPo = new GovInfoAssetPo();
		GovInfoInvestPo govInfoInvestPo=new GovInfoInvestPo();
		GovInfoInvestPo govInfoInvestPo2=new GovInfoInvestPo();
		infoInvestPos.add(govInfoInvestPo);
		infoInvestPos.add(govInfoInvestPo2);
		this.govInfoNetWorkPo = new GovInfoNetWorkPo();
		this.govInfoRoomPo = new GovInfoRoomPo();
		ManageOrginName = "test";
		ManageOrginPhone = "test";
		ManageOrginFax = "test";
		ManageOrginEmail = "test";
		TechOrginName = "test";
		TechOrginAddress = "test";
		TechOrginPhone = "test";
		TechOrginFax = "test";
		TechOrginEmail = "test";
	}

}

/*
 * $Log: av-env.bat,v $
 */