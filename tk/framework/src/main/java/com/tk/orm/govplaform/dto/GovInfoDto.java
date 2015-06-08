package com.tk.orm.govplaform.dto;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tk.framework.constant.AppConstats;
import com.tk.framework.vo.BaseDto;
import com.tk.orm.govplaform.model.GovInfoAssetPo;
import com.tk.orm.govplaform.model.GovInfoBasePo;
import com.tk.orm.govplaform.model.GovInfoInvestPo;
import com.tk.orm.govplaform.model.GovInfoNetWorkPo;
import com.tk.orm.govplaform.model.GovInfoRoomPo;
import com.tk.orm.user.model.SysDepartmentPo;



/**
 * <pre> 
 *  
 *  File: GovInfoDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  政务平台基本信息DTO
 * 
 *  Notes:
 *  $Id: GovInfoDto.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日上午10:09:47>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */

public class GovInfoDto extends BaseDto
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7072112636925145303L;

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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public SysDepartmentPo getSysDepartmentPo() {
		return sysDepartmentPo;
	}
	public void setSysDepartmentPo(SysDepartmentPo sysDepartmentPo) {
		this.sysDepartmentPo = sysDepartmentPo;
	}
	public GovInfoAssetPo getGovInfoAssetPo() {
		return govInfoAssetPo;
	}
	public void setGovInfoAssetPo(GovInfoAssetPo govInfoAssetPo) {
		this.govInfoAssetPo = govInfoAssetPo;
	}
	public Set<GovInfoInvestPo> getInfoInvestPos() {
		return infoInvestPos;
	}
	public void setInfoInvestPos(Set<GovInfoInvestPo> infoInvestPos) {
		this.infoInvestPos = infoInvestPos;
	}
	public GovInfoRoomPo getGovInfoRoomPo() {
		return govInfoRoomPo;
	}
	public void setGovInfoRoomPo(GovInfoRoomPo govInfoRoomPo) {
		this.govInfoRoomPo = govInfoRoomPo;
	}
	public String getManageOrginName() {
		return ManageOrginName;
	}
	public void setManageOrginName(String manageOrginName) {
		ManageOrginName = manageOrginName;
	}
	public String getManageOrginPhone() {
		return ManageOrginPhone;
	}
	public void setManageOrginPhone(String manageOrginPhone) {
		ManageOrginPhone = manageOrginPhone;
	}
	public String getManageOrginFax() {
		return ManageOrginFax;
	}
	public void setManageOrginFax(String manageOrginFax) {
		ManageOrginFax = manageOrginFax;
	}
	public String getManageOrginEmail() {
		return ManageOrginEmail;
	}
	public void setManageOrginEmail(String manageOrginEmail) {
		ManageOrginEmail = manageOrginEmail;
	}
	public String getTechOrginName() {
		return TechOrginName;
	}
	public void setTechOrginName(String techOrginName) {
		TechOrginName = techOrginName;
	}
	public String getTechOrginAddress() {
		return TechOrginAddress;
	}
	public void setTechOrginAddress(String techOrginAddress) {
		TechOrginAddress = techOrginAddress;
	}
	public String getTechOrginPhone() {
		return TechOrginPhone;
	}
	public void setTechOrginPhone(String techOrginPhone) {
		TechOrginPhone = techOrginPhone;
	}
	public String getTechOrginFax() {
		return TechOrginFax;
	}
	public void setTechOrginFax(String techOrginFax) {
		TechOrginFax = techOrginFax;
	}
	public String getTechOrginEmail() {
		return TechOrginEmail;
	}
	public void setTechOrginEmail(String techOrginEmail) {
		TechOrginEmail = techOrginEmail;
	}
	public GovInfoNetWorkPo getGovInfoNetWorkPo() {
		return govInfoNetWorkPo;
	}
	public void setGovInfoNetWorkPo(GovInfoNetWorkPo govInfoNetWorkPo) {
		this.govInfoNetWorkPo = govInfoNetWorkPo;
	}
	
	
	
	
	
}

/*
*$Log: av-env.bat,v $
*/