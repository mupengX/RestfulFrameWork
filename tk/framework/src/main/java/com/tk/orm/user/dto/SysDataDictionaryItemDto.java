package com.tk.orm.user.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysDataDictionaryItemPo;

/**
 * <pre>
 *  
 *  File: SysDataDictionaryItemDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  数据字典条目DTO
 * 
 *  Notes:
 *  $Id: SysDataDictionaryItemDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年3月12日下午5:36:14>>, <<Who>>, <<what>>  
 *  2015年3月12日		TK		Initial.
 * </pre>
 */
public class SysDataDictionaryItemDto extends BaseDto
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 6581425988614588197L;

	private String id; // 主键

	private String typeID; // 类型ID

	private String itemName; // 条目名称

	private int weight; // 权重

	private String description; // 描述

	private String agencyCode;// '机构编码(fk)'

	private String recStatus;// '数据状态'

	private String orders;// '排序'

	private String lockStatus;// '锁定状态'

	private Date lockDate;// '锁定时间'

	private String lockUserID;// '锁定人ID(fk)'

	private String createBy;// '创建者(fk)'

	private Date createDate;// '创建时间'

	private String lastEditBy;// '修改者(fk)'

	private Date lastEditDate;// '修改时间'

	private String remarks;// '备注'

	private String extend1;// '扩展字段1'

	private String extend2;// '扩展字段2'

	private String extend3;// '扩展字段3'

	/**
	 * SysDataDictionaryItemDto Constructor.
	 * 
	 */
	public SysDataDictionaryItemDto()
	{
		super();
	}

	/**
	 * SysDataDictionaryItemDto Constructor. 
	 *
	 * @param po
	 */
	public SysDataDictionaryItemDto(SysDataDictionaryItemPo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	/**
	 * DTO转PO.
	 * 
	 * @param dto
	 * @return
	 */
	public SysDataDictionaryItemPo SysDataDictionaryItemDto2Po(SysDataDictionaryItemDto dto)
	{
		SysDataDictionaryItemPo po = new SysDataDictionaryItemPo();
		BeanUtils.copyProperties(dto, po);
		return po;
	}

	/**
	 * @return the id
	 */

	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the typeID
	 */

	public String getTypeID()
	{
		return typeID;
	}

	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(String typeID)
	{
		this.typeID = typeID;
	}

	/**
	 * @return the itemName
	 */

	public String getItemName()
	{
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	/**
	 * @return the weight
	 */

	public int getWeight()
	{
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	/**
	 * @return the description
	 */

	public String getDescription()
	{
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * @return the agencyCode
	 */

	public String getAgencyCode()
	{
		return agencyCode;
	}

	/**
	 * @param agencyCode the agencyCode to set
	 */
	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	/**
	 * @return the recStatus
	 */

	public String getRecStatus()
	{
		return recStatus;
	}

	/**
	 * @param recStatus the recStatus to set
	 */
	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	/**
	 * @return the orders
	 */

	public String getOrders()
	{
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	/**
	 * @return the lockStatus
	 */

	public String getLockStatus()
	{
		return lockStatus;
	}

	/**
	 * @param lockStatus the lockStatus to set
	 */
	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	/**
	 * @return the lockDate
	 */

	public Date getLockDate()
	{
		return lockDate;
	}

	/**
	 * @param lockDate the lockDate to set
	 */
	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	/**
	 * @return the lockUserID
	 */

	public String getLockUserID()
	{
		return lockUserID;
	}

	/**
	 * @param lockUserID the lockUserID to set
	 */
	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	/**
	 * @return the createBy
	 */

	public String getCreateBy()
	{
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	/**
	 * @return the createDate
	 */

	public Date getCreateDate()
	{
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	/**
	 * @return the lastEditBy
	 */

	public String getLastEditBy()
	{
		return lastEditBy;
	}

	/**
	 * @param lastEditBy the lastEditBy to set
	 */
	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	/**
	 * @return the lastEditDate
	 */

	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	/**
	 * @param lastEditDate the lastEditDate to set
	 */
	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	/**
	 * @return the remarks
	 */

	public String getRemarks()
	{
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	/**
	 * @return the extend1
	 */

	public String getExtend1()
	{
		return extend1;
	}

	/**
	 * @param extend1 the extend1 to set
	 */
	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	/**
	 * @return the extend2
	 */

	public String getExtend2()
	{
		return extend2;
	}

	/**
	 * @param extend2 the extend2 to set
	 */
	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	/**
	 * @return the extend3
	 */

	public String getExtend3()
	{
		return extend3;
	}

	/**
	 * @param extend3 the extend3 to set
	 */
	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}

/*
 * $Log: av-env.bat,v $
 */