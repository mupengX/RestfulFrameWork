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
import javax.persistence.OneToMany;
import javax.persistence.Table;



import org.hibernate.annotations.GenericGenerator;

/**
 * <pre> 
 *  
 *  File: GovInfoNetWorkPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  政务部门网络情况表
 * 
 *  Notes:
 *  $Id: GovInfoNetWorkPo.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govSumNetwork")
public class GovInfoNetWorkPo implements Serializable
{
	

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	
	private String id;	//主键
	
	private Integer isPhysicalIsolation;	//是否物理隔离
	
	private Integer outerNetworkCount;	//外网信息点数
	
	private Integer innerNetWorkCount;	//内网信息点数
	
	private String isUnifiedAccessInternet;	//是否统一接入互联网
	
	private String isSelfAccessInternet;	//是否有自行接入互联网
	
	private String selfAccessWay;	//自行接入方式
	
	private Integer bandwidth;	//带宽
	
	private Set<GovInfoNetWorkPriPo> govInfoNetWorkPriPos = new HashSet<GovInfoNetWorkPriPo>();

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
	@Column(name = "SGSN_IsPhysicalIsolation")
	public Integer getIsPhysicalIsolation() {
		return isPhysicalIsolation;
	}

	public void setIsPhysicalIsolation(Integer isPhysicalIsolation) {
		this.isPhysicalIsolation = isPhysicalIsolation;
	}
	@Column(name = "SGSN_OuterNetworkCount")
	public Integer getOuterNetworkCount() {
		return outerNetworkCount;
	}

	public void setOuterNetworkCount(Integer outerNetworkCount) {
		this.outerNetworkCount = outerNetworkCount;
	}
	@Column(name = "SGSN_InnerNetWorkCount")
	public Integer getInnerNetWorkCount() {
		return innerNetWorkCount;
	}

	public void setInnerNetWorkCount(Integer innerNetWorkCount) {
		this.innerNetWorkCount = innerNetWorkCount;
	}
	@Column(name = "SGSN_IsUnifiedAccessInternet")
	public String getIsUnifiedAccessInternet() {
		return isUnifiedAccessInternet;
	}

	public void setIsUnifiedAccessInternet(String isUnifiedAccessInternet) {
		this.isUnifiedAccessInternet = isUnifiedAccessInternet;
	}
	@Column(name = "SGSN_IsSelfAccessInternet")
	public String getIsSelfAccessInternet() {
		return isSelfAccessInternet;
	}

	public void setIsSelfAccessInternet(String isSelfAccessInternet) {
		this.isSelfAccessInternet = isSelfAccessInternet;
	}
	@Column(name = "SGSN_SelfAccessWay")
	public String getSelfAccessWay() {
		return selfAccessWay;
	}

	public void setSelfAccessWay(String selfAccessWay) {
		this.selfAccessWay = selfAccessWay;
	}
	@Column(name = "SGSN_Bandwidth")
	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}
	//@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OneToMany(targetEntity=GovInfoNetWorkPriPo.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	//@Fetch(FetchMode.JOIN)
	//updatable=false很关键，如果没有它，在级联删除的时候就会报错(反转的问题)
	@JoinColumn(name="SGSNP_GovSumNetworkID")
	public Set<GovInfoNetWorkPriPo> getGovInfoNetWorkPriPos() {
		return govInfoNetWorkPriPos;
	}

	public void setGovInfoNetWorkPriPos(
			Set<GovInfoNetWorkPriPo> govInfoNetWorkPriPos) {
		this.govInfoNetWorkPriPos = govInfoNetWorkPriPos;
	}



	public GovInfoNetWorkPo() {
		super();
		this.id = id;
		this.isPhysicalIsolation = 11;
		this.outerNetworkCount = 11;
		this.innerNetWorkCount =11;
		this.isUnifiedAccessInternet = "test";
		this.isSelfAccessInternet = "test";
		this.selfAccessWay = "test";
		this.bandwidth = 11;
		GovInfoNetWorkPriPo govInfoNetWorkPriPo=new GovInfoNetWorkPriPo();
		govInfoNetWorkPriPos.add(govInfoNetWorkPriPo);
		GovInfoNetWorkPriPo govInfoNetWorkPriPo1=new GovInfoNetWorkPriPo();
		govInfoNetWorkPriPos.add(govInfoNetWorkPriPo1);

	}
	
	
    
}

/*
*$Log: av-env.bat,v $
*/