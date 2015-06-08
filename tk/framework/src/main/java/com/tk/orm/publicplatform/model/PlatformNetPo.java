package com.tk.orm.publicplatform.model;

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
 *  File: PlatformTotalNetPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  公共平台_网络
 * 
 *  Notes:
 *  $Id: PlatformTotalNetPo.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日下午7:31:34>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@Entity
@Table(name = "sois_platformNet")
public class PlatformNetPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 8660951696281322545L;
	
	private String id;	//主键
	
	private Integer planOutNetDept;	//应接入外网的本级政务部门数
	
	private Integer realOutNetDept;	//实际接入外网的本级政务部门数
	
	private Integer planInNetDept;	//应接入内网的本级政务部门数
	
	private Integer realInNetDept;	//实际接入内网的本级政务部门数
	
	private String isUnifyNetOut;	//是否有统一的互联网出口
	
	private Integer netOutCount;	//互联网出口线路数
	
	private Integer totlaNetWide;	//总出口带宽
	
	private Integer unifyNetService;	//统一提供上（互联）网服务的本级政务数
	
	private String platformID;	//公共平台主键

	public PlatformNetPo()
	{
		super();
	}

	public PlatformNetPo(String id, Integer planOutNetDept, Integer realOutNetDept, Integer planInNetDept, Integer realInNetDept,
			String isUnifyNetOut, Integer netOutCount, Integer totlaNetWide, Integer unifyNetService, String platformID)
	{
		super();
		this.id = id;
		this.planOutNetDept = planOutNetDept;
		this.realOutNetDept = realOutNetDept;
		this.planInNetDept = planInNetDept;
		this.realInNetDept = realInNetDept;
		this.isUnifyNetOut = isUnifyNetOut;
		this.netOutCount = netOutCount;
		this.totlaNetWide = totlaNetWide;
		this.unifyNetService = unifyNetService;
		this.platformID = platformID;
	}
	
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
	
	@Column(name = "SPN_PlanOutNetDept")
	public Integer getPlanOutNetDept()
	{
		return planOutNetDept;
	}

	public void setPlanOutNetDept(Integer planOutNetDept)
	{
		this.planOutNetDept = planOutNetDept;
	}
	
	@Column(name = "SPN_RealOutNetDept")
	public Integer getRealOutNetDept()
	{
		return realOutNetDept;
	}

	public void setRealOutNetDept(Integer realOutNetDept)
	{
		this.realOutNetDept = realOutNetDept;
	}
	
	@Column(name = "SPN_PlanInNetDept")
	public Integer getPlanInNetDept()
	{
		return planInNetDept;
	}

	public void setPlanInNetDept(Integer planInNetDept)
	{
		this.planInNetDept = planInNetDept;
	}
	
	@Column(name = "SPN_RealInNetDept")
	public Integer getRealInNetDept()
	{
		return realInNetDept;
	}

	public void setRealInNetDept(Integer realInNetDept)
	{
		this.realInNetDept = realInNetDept;
	}
	
	@Column(name = "SPN_IsUnifyNetOut", length = 1)
	public String getIsUnifyNetOut()
	{
		return isUnifyNetOut;
	}

	public void setIsUnifyNetOut(String isUnifyNetOut)
	{
		this.isUnifyNetOut = isUnifyNetOut;
	}
	
	@Column(name = "SPN_NetOutCount")
	public Integer getNetOutCount()
	{
		return netOutCount;
	}

	public void setNetOutCount(Integer netOutCount)
	{
		this.netOutCount = netOutCount;
	}
	
	@Column(name = "SPN_TotlaNetWide")
	public Integer getTotlaNetWide()
	{
		return totlaNetWide;
	}

	public void setTotlaNetWide(Integer totlaNetWide)
	{
		this.totlaNetWide = totlaNetWide;
	}
	
	@Column(name = "SPN_UnifyNetService")
	public Integer getUnifyNetService()
	{
		return unifyNetService;
	}

	public void setUnifyNetService(Integer unifyNetService)
	{
		this.unifyNetService = unifyNetService;
	}
	
	@Column(name = "SPN_PlatformID")
	public String getPlatformID()
	{
		return platformID;
	}

	public void setPlatformID(String platformID)
	{
		this.platformID = platformID;
	}
	
}

/*
*$Log: av-env.bat,v $
*/