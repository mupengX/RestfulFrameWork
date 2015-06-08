package com.tk.orm.govplaform.model;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: GovInfoAssetPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  政务部门资产情况表
 * 
 *  Notes:
 *  $Id: GovInfoAssetPo.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govSumAsset")
public class GovInfoAssetPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	
	private String id;	//主键
	
	private Double InfoTechAssets;	//信息化资产原值总值	
	
	private Double HardwareAssets;	//硬件资产原值
	
	private Double SysSoftwareAssets;	//系统软件资产原值	
	
	private Double OtherAssets;	//其他资产原值
	
	private Double AppSoftwareAssets;//应用软件资产原值	
	

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
	@Column(name = "SGSA_InfoTechAssets")
	public Double getInfoTechAssets() {
		return InfoTechAssets;
	}

	public void setInfoTechAssets(Double infoTechAssets) {
		InfoTechAssets = infoTechAssets;
	}
	@Column(name = "SGSA_HardwareAssets")
	public Double getHardwareAssets() {
		return HardwareAssets;
	}

	public void setHardwareAssets(Double hardwareAssets) {
		HardwareAssets = hardwareAssets;
	}
	@Column(name = "SGSA_AppSoftwareAssets")
	public Double getSysSoftwareAssets() {
		return SysSoftwareAssets;
	}

	public void setSysSoftwareAssets(Double sysSoftwareAssets) {
		SysSoftwareAssets = sysSoftwareAssets;
	}
	@Column(name = "SGSA_OtherAssets")
	public Double getOtherAssets() {
		return OtherAssets;
	}

	public void setOtherAssets(Double otherAssets) {
		OtherAssets = otherAssets;
	}
	@Column(name = "SGSA_SysSoftwareAssets")
	public Double getAppSoftwareAssets() {
		return AppSoftwareAssets;
	}

	public void setAppSoftwareAssets(Double appSoftwareAssets) {
		AppSoftwareAssets = appSoftwareAssets;
	}

	public GovInfoAssetPo(String id, Double infoTechAssets,
			Double hardwareAssets, Double sysSoftwareAssets,
			Double otherAssets, Double appSoftwareAssets) {
		super();
		this.id = id;
		InfoTechAssets = infoTechAssets;
		HardwareAssets = hardwareAssets;
		SysSoftwareAssets = sysSoftwareAssets;
		OtherAssets = otherAssets;
		AppSoftwareAssets = appSoftwareAssets;
	}

	public GovInfoAssetPo() {
		super();
		this.id = id;
		InfoTechAssets = 11.1;
		HardwareAssets = 11.1;
		SysSoftwareAssets = 11.1;
		OtherAssets = 11.1;
		AppSoftwareAssets = 11.1;
	}
	

	
	
}

/*
*$Log: av-env.bat,v $
*/