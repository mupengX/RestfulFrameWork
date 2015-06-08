package com.tk.orm.govplaform.model;

import java.io.Serializable;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




import org.hibernate.annotations.GenericGenerator;

import com.tk.framework.constant.AppConstats;

/**
 * <pre> 
 *  
 *  File: Platform.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  公共平台基本信息表
 * 
 *  Notes:
 *  $Id: Platform.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govSumInvestment")
public class GovInfoInvestPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	

	private String id;	//主键
	
	private String periodType=AppConstats.INVEST_DATE_TEYPE_FIVE_YEAR_PLAN;	//时期类型 0：五年计划 1：年份
	
	private String periodValue=AppConstats.INVEST_DATE_TYPE_FIVE_YRAE_PLAN_DEFALUT_VALUE;	//时期 时期类型对应的值
	
	private String sumType=AppConstats.INVEST_SUM_TYPE_SELF;	//统计类型 0：本机机关 1：下属各单位合计 2：合计
	
	private Double sameLevelFinance;	//本级财政
	
	private Double superiorsFinance;	//上级财政
	
	private Double socialInvestment;	//社会投入
	
	private Double projectConstruction;	//项目建设
	
	private Double operationService;	//运维服务
	
	private Double networkOperationService;	//网络运维服务
	
	private Double investmentSum;	//投资合计
    private String govDeptInfoID;//
	
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
	@Column(name = "SGSI_PeriodType")
	public String getPeriodType() {
		return periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	@Column(name = "SGSI_PeriodValue")
	public String getPeriodValue() {
		return periodValue;
	}

	public void setPeriodValue(String periodValue) {
		this.periodValue = periodValue;
	}
	@Column(name = "SGSI_SumType")
	public String getSumType() {
		return sumType;
	}

	public void setSumType(String sumType) {
		this.sumType = sumType;
	}
	@Column(name = "SGSI_SameLevelFinance")
	public Double getSameLevelFinance() {
		return sameLevelFinance;
	}

	public void setSameLevelFinance(Double sameLevelFinance) {
		this.sameLevelFinance = sameLevelFinance;
	}
	@Column(name = "SGSI_SuperiorsFinance")
	public Double getSuperiorsFinance() {
		return superiorsFinance;
	}

	public void setSuperiorsFinance(Double superiorsFinance) {
		this.superiorsFinance = superiorsFinance;
	}
	@Column(name = "SGSI_SocialInvestment")
	public Double getSocialInvestment() {
		return socialInvestment;
	}

	public void setSocialInvestment(Double socialInvestment) {
		this.socialInvestment = socialInvestment;
	}
	@Column(name = "SGSI_ProjectConstruction")
	public Double getProjectConstruction() {
		return projectConstruction;
	}

	public void setProjectConstruction(Double projectConstruction) {
		this.projectConstruction = projectConstruction;
	}
	@Column(name = "SGSI_OperationService")
	public Double getOperationService() {
		return operationService;
	}

	public void setOperationService(Double operationService) {
		this.operationService = operationService;
	}
	@Column(name = "SGSI_NetworkOperationService")
	public Double getNetworkOperationService() {
		return networkOperationService;
	}

	public void setNetworkOperationService(Double networkOperationService) {
		this.networkOperationService = networkOperationService;
	}
	@Column(name = "SGSI_InvestmentSum")
	public Double getInvestmentSum() {
		return investmentSum;
	}

	public void setInvestmentSum(Double investmentSum) {
		this.investmentSum = investmentSum;
	}
	@Column(name = "SGSI_GovDeptInfoID")
	public String getGovDeptInfoID() {
		return govDeptInfoID;
	}

	public void setGovDeptInfoID(String govDeptInfoID) {
		this.govDeptInfoID = govDeptInfoID;
	}

	public GovInfoInvestPo(String id, String periodType, String periodValue,
			String sumType, Double sameLevelFinance, Double superiorsFinance,
			Double socialInvestment, Double projectConstruction,
			Double operationService, Double networkOperationService,
			Double investmentSum) {
		super();
		this.id = id;
		this.periodType = periodType;
		this.periodValue = periodValue;
		this.sumType = sumType;
		this.sameLevelFinance = sameLevelFinance;
		this.superiorsFinance = superiorsFinance;
		this.socialInvestment = socialInvestment;
		this.projectConstruction = projectConstruction;
		this.operationService = operationService;
		this.networkOperationService = networkOperationService;
		this.investmentSum = investmentSum;
	}

	public GovInfoInvestPo() {
		super();
		this.id = id;
		this.periodType = periodType;
		this.periodValue = periodValue;
		this.sumType = sumType;
		this.sameLevelFinance = 11.1;
		this.superiorsFinance = 11.1;
		this.socialInvestment = 11.1;
		this.projectConstruction = 11.1;
		this.operationService = 11.1;
		this.networkOperationService = 11.1;
		this.investmentSum = 11.1;
	}
	
	

}

/*
*$Log: av-env.bat,v $
*/