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
 *  File: GovInfoRoomPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  政务部门机房情况表
 * 
 *  Notes:
 *  $Id: GovInfoRoomPo.java  2014-12-24 23:59:59Z \cx $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午2:54:17>>, <<Who>>, <<what>>  
 *  2015年5月13日		cx		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_govSumRoom")
public class GovInfoRoomPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5631086693203792377L;
	
	private String id;	//主键
	
	private Double SGSR_UsedRoomAera;	//机房使用面积
	
	private Double SGSR_ShieldRoomAera;	//屏蔽机房面积
	
	private Integer SGSR_MachineSum;	//机柜合计个数
	
	private Integer SGSR_OuterNetMachineCount;	//外网机柜个数
	
	private Integer SGSR_InnerNetMachineCount;	//内网机柜个数
	
	private Integer SGSR_ShieldMachineCount;	//屏蔽机柜个数	
	

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
	@Column(name = "SGSR_UsedRoomAera")
	public Double getSGSR_UsedRoomAera() {
		return SGSR_UsedRoomAera;
	}

	public void setSGSR_UsedRoomAera(Double sGSR_UsedRoomAera) {
		SGSR_UsedRoomAera = sGSR_UsedRoomAera;
	}
	@Column(name = "SGSR_ShieldRoomAera")
	public Double getSGSR_ShieldRoomAera() {
		return SGSR_ShieldRoomAera;
	}

	public void setSGSR_ShieldRoomAera(Double sGSR_ShieldRoomAera) {
		SGSR_ShieldRoomAera = sGSR_ShieldRoomAera;
	}
	@Column(name = "SGSR_MachineSum")
	public Integer getSGSR_MachineSum() {
		return SGSR_MachineSum;
	}

	public void setSGSR_MachineSum(Integer sGSR_MachineSum) {
		SGSR_MachineSum = sGSR_MachineSum;
	}
	@Column(name = "SGSR_OuterNetMachineCount")
	public Integer getSGSR_OuterNetMachineCount() {
		return SGSR_OuterNetMachineCount;
	}

	public void setSGSR_OuterNetMachineCount(Integer sGSR_OuterNetMachineCount) {
		SGSR_OuterNetMachineCount = sGSR_OuterNetMachineCount;
	}
	@Column(name = "SGSR_InnerNetMachineCount")
	public Integer getSGSR_InnerNetMachineCount() {
		return SGSR_InnerNetMachineCount;
	}

	public void setSGSR_InnerNetMachineCount(Integer sGSR_InnerNetMachineCount) {
		SGSR_InnerNetMachineCount = sGSR_InnerNetMachineCount;
	}
	@Column(name = "SGSR_ShieldMachineCount")
	public Integer getSGSR_ShieldMachineCount() {
		return SGSR_ShieldMachineCount;
	}

	public void setSGSR_ShieldMachineCount(Integer sGSR_ShieldMachineCount) {
		SGSR_ShieldMachineCount = sGSR_ShieldMachineCount;
	}


	public GovInfoRoomPo() {
		super();
		this.id = id;
		SGSR_UsedRoomAera = 11.1;
		SGSR_ShieldRoomAera = 11.1;
		SGSR_MachineSum = 11;
		SGSR_OuterNetMachineCount = 11;
		SGSR_InnerNetMachineCount = 11;
		SGSR_ShieldMachineCount = 11;
	}
	
	
	
}

/*
*$Log: av-env.bat,v $
*/