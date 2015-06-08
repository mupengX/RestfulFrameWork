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
 *  File: GovInfoNetWorkPriPo.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  政务部门专网情况表
 * 
 *  Notes:
 *  $Id: GovInfoNetWorkPriPo.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govsumnetworkprivate")
public class GovInfoNetWorkPriPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	
	private String id;	//主键
	
	private String netWorkName;	//专网名称
	
	private String uses;	//主要用途	
	
	private String accessWay;	//接入方式
	
    private String govNetId;


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
	@Column(name = "SGSNP_NetWorkName")
	public String getNetWorkName() {
		return netWorkName;
	}

	public void setNetWorkName(String netWorkName) {
		this.netWorkName = netWorkName;
	}
	@Column(name = "SGSNP_Uses")
	public String getUses() {
		return uses;
	}

	public void setUses(String uses) {
		this.uses = uses;
	}
	@Column(name = "SGSNP_AccessWay")
	public String getAccessWay() {
		return accessWay;
	}

	public void setAccessWay(String accessWay) {
		this.accessWay = accessWay;
	}


	@Column(name = "SGSNP_GovSumNetworkID")
	public String getGovNetId() {
		return govNetId;
	}

	public void setGovNetId(String govNetId) {
		this.govNetId = govNetId;
	}

	public GovInfoNetWorkPriPo() {
		super();
		this.id = id;
		this.netWorkName = "test";
		this.uses = "test";
		this.accessWay = "test";
	}
	
	

}

/*
*$Log: av-env.bat,v $
*/