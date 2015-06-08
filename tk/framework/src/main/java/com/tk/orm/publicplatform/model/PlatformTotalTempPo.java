package com.tk.orm.publicplatform.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <pre> 
 *  
 *  File: PlatfromTotalTemp.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  作为汇总统计的临时存储变量
 * 
 *  Notes:
 *  $Id: PlatfromTotalTemp.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月27日下午2:59:08>>, <<Who>>, <<what>>  
 *  2015年5月27日		cy		Initial.
 * </pre>
 */
public class PlatformTotalTempPo implements Serializable
{
	
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 5582943729450778165L;

	/**
	 * 总数量
	 */
	private Integer num;
	
	/**
	 * 总金额
	 */
	private BigDecimal money;
	
	/**
	 * 分类
	 */
	private String classID;
	
	/**
	 * 权重，用来表示是否是合计项目
	 */
	private String totalWeight;
	
	/**
	 * 权重，用来表示是国产还是非国产
	 */
	private String brandWeight;
	
	
	public PlatformTotalTempPo()
	{
	}

	public Integer getNum()
	{
		return num;
	}

	public void setNum(Integer num)
	{
		this.num = num;
	}

	public BigDecimal getMoney()
	{
		return money;
	}

	public void setMoney(BigDecimal money)
	{
		this.money = money;
	}

	public String getClassID()
	{
		return classID;
	}

	public void setClassID(String classID)
	{
		this.classID = classID;
	}

	public String getTotalWeight()
	{
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight)
	{
		this.totalWeight = totalWeight;
	}

	public String getBrandWeight()
	{
		return brandWeight;
	}

	public void setBrandWeight(String brandWeight)
	{
		this.brandWeight = brandWeight;
	}
	
}

/*
*$Log: av-env.bat,v $
*/