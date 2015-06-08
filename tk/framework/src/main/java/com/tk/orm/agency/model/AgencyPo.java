package com.tk.orm.agency.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre>
 *  
 *  File: AgencyPo.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  机构信息PO
 * 
 *  Notes:
 *  $Id: AgencyPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年2月10日下午1:20:28>>, <<Who>>, <<what>>  
 *  2015年2月10日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_agency")
public class AgencyPo implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 1558077718545930603L;

	private String id; // 主键

	private String name; // 机构名称

	private String accessToken; // 令牌

	private String alias; // 机构别名

	private String banner; // 横幅Logo

	private String level; // 机构级别

	private String country; // 国家代码

	private String address; // 地址

	private Date expirationTime; // 到期时间

	private String legalPerson; // 企业法人

	private String legalMobile; // 企业法人联系电话

	private Date businessHoursStart; // 营业开始时间

	private Date businessHoursEnd; // 营业结束时间

	private String license; // 企业营业号

	private String adminID; // 管理员ID

	private String adminPwd; // 管理员密码

	private String adminPhone; // 管理员联系电话

	private String recStatus; // '数据状态'

	private String orders; // '排序'

	private String createBy;// '创建者(fk)'

	private Date createDate;// '创建时间'

	private String lastEditBy;// '修改者(fk)'

	private Date lastEditDate;// '修改时间'

	private String remarks;// '备注'

	private String extend1;// '扩展字段1'

	private String extend2;// '扩展字段2'

	private String extend3;// '扩展字段3'

	/**
	 * AgencyPo Constructor.
	 * 
	 */
	public AgencyPo()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * AgencyPo Constructor.
	 * 
	 * @param id
	 * @param name
	 * @param accessToken
	 * @param alias
	 * @param banner
	 * @param level
	 * @param country
	 * @param address
	 * @param expirationTime
	 * @param legalPerson
	 * @param legalMobile
	 * @param businessHoursStart
	 * @param businessHoursEnd
	 * @param license
	 * @param adminID
	 * @param adminPwd
	 * @param adminPhone
	 * @param recStatus
	 * @param orders
	 * @param createBy
	 * @param createDate
	 * @param lastEditBy
	 * @param lastEditDate
	 * @param remarks
	 * @param extend1
	 * @param extend2
	 * @param extend3
	 */
	public AgencyPo(String id, String name, String accessToken, String alias, String banner, String level,
			String country, String address, Date expirationTime, String legalPerson, String legalMobile,
			Date businessHoursStart, Date businessHoursEnd, String license, String adminID, String adminPwd,
			String adminPhone, String recStatus, String orders, String createBy, Date createDate, String lastEditBy,
			Date lastEditDate, String remarks, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.name = name;
		this.accessToken = accessToken;
		this.alias = alias;
		this.banner = banner;
		this.level = level;
		this.country = country;
		this.address = address;
		this.expirationTime = expirationTime;
		this.legalPerson = legalPerson;
		this.legalMobile = legalMobile;
		this.businessHoursStart = businessHoursStart;
		this.businessHoursEnd = businessHoursEnd;
		this.license = license;
		this.adminID = adminID;
		this.adminPwd = adminPwd;
		this.adminPhone = adminPhone;
		this.recStatus = recStatus;
		this.orders = orders;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastEditBy = lastEditBy;
		this.lastEditDate = lastEditDate;
		this.remarks = remarks;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
	}

	/**
	 * @return the id
	 */
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
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
	 * @return the name
	 */
	@Column(name = "SA_Name", length = 64)
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the accessToken
	 */
	@Column(name = "SA_AccessToken", length = 64)
	public String getAccessToken()
	{
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken)
	{
		this.accessToken = accessToken;
	}

	/**
	 * @return the alias
	 */
	@Column(name = "SA_Alias", length = 64)
	public String getAlias()
	{
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias)
	{
		this.alias = alias;
	}

	/**
	 * @return the banner
	 */
	@Column(name = "SA_Banner", length = 255)
	public String getBanner()
	{
		return banner;
	}

	/**
	 * @param banner the banner to set
	 */
	public void setBanner(String banner)
	{
		this.banner = banner;
	}

	/**
	 * @return the level
	 */
	@Column(name = "SA_Level", length = 64)
	public String getLevel()
	{
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level)
	{
		this.level = level;
	}

	/**
	 * @return the country
	 */
	@Column(name = "SA_Country", length = 64)
	public String getCountry()
	{
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}

	/**
	 * @return the address
	 */
	@Column(name = "SA_Address", length = 255)
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return the expirationTime
	 */
	@Column(name = "SA_ExpirationTime")
	public Date getExpirationTime()
	{
		return expirationTime;
	}

	/**
	 * @param expirationTime the expirationTime to set
	 */
	public void setExpirationTime(Date expirationTime)
	{
		this.expirationTime = expirationTime;
	}

	/**
	 * @return the legalPerson
	 */
	@Column(name = "SA_LegalPerson", length = 64)
	public String getLegalPerson()
	{
		return legalPerson;
	}

	/**
	 * @param legalPerson the legalPerson to set
	 */
	public void setLegalPerson(String legalPerson)
	{
		this.legalPerson = legalPerson;
	}

	/**
	 * @return the legalMobile
	 */
	@Column(name = "SA_LegalMobile", length = 64)
	public String getLegalMobile()
	{
		return legalMobile;
	}

	/**
	 * @param legalMobile the legalMobile to set
	 */
	public void setLegalMobile(String legalMobile)
	{
		this.legalMobile = legalMobile;
	}

	/**
	 * @return the businessHoursStart
	 */
	@Column(name = "SA_BusinessHoursStart")
	public Date getBusinessHoursStart()
	{
		return businessHoursStart;
	}

	/**
	 * @param businessHoursStart the businessHoursStart to set
	 */
	public void setBusinessHoursStart(Date businessHoursStart)
	{
		this.businessHoursStart = businessHoursStart;
	}

	/**
	 * @return the businessHoursEnd
	 */
	@Column(name = "SA_BusinessHoursEnd")
	public Date getBusinessHoursEnd()
	{
		return businessHoursEnd;
	}

	/**
	 * @param businessHoursEnd the businessHoursEnd to set
	 */
	public void setBusinessHoursEnd(Date businessHoursEnd)
	{
		this.businessHoursEnd = businessHoursEnd;
	}

	/**
	 * @return the license
	 */
	@Column(name = "SA_License", length = 64)
	public String getLicense()
	{
		return license;
	}

	/**
	 * @param license the license to set
	 */
	public void setLicense(String license)
	{
		this.license = license;
	}

	/**
	 * @return the adminID
	 */
	@Column(name = "SA_AdminID", length = 64)
	public String getAdminID()
	{
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(String adminID)
	{
		this.adminID = adminID;
	}

	/**
	 * @return the adminPwd
	 */
	@Column(name = "SA_AdminPwd", length = 255)
	public String getAdminPwd()
	{
		return adminPwd;
	}

	/**
	 * @param adminPwd the adminPwd to set
	 */
	public void setAdminPwd(String adminPwd)
	{
		this.adminPwd = adminPwd;
	}

	/**
	 * @return the adminPhone
	 */
	@Column(name = "SA_AdminPhone", length = 64)
	public String getAdminPhone()
	{
		return adminPhone;
	}

	/**
	 * @param adminPhone the adminPhone to set
	 */
	public void setAdminPhone(String adminPhone)
	{
		this.adminPhone = adminPhone;
	}

	/**
	 * @return the recStatus
	 */
	@Column(name = "SA_RecStatus", length = 1)
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
	@Column(name = "SA_Order", length = 64)
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
	 * @return the createBy
	 */
	@Column(name = "SA_CreateBy", length = 64)
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
	@Column(name = "SA_CreateDate")
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
	@Column(name = "SA_LastEditBy", length = 64)
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
	@Column(name = "SA_LastEditDate")
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
	@Column(name = "SA_Remarks", length = 255)
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
	@Column(name = "SA_Extend1", length = 255)
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
	@Column(name = "SA_Extend2", length = 255)
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
	@Column(name = "SA_Extend3", length = 255)
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