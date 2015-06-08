package com.tk.orm.user.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * <pre>
 *  
 *  File: SysUserDetailPo.java
 *  
 *  Copyright (C): 2014
 *  Description:
 *  用户详情PO
 * 
 *  Notes:
 *  $Id: SysUserDetailPo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:31:47>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@Entity
@Table(name = "sys_user_detail")
public class SysUserDetailPo implements java.io.Serializable
{

	private static final long serialVersionUID = 981535677605175180L;

	// Fields
	private String id; // '主键'

	private String realName; // '真实姓名'

	private String sex; // 性别

	private String photoURL; // 照片URL

	private byte[] photo; // 照片

	private String idNumber; // 身份证

	private Date birthday; // 出生日期

	private String isMarried; // 婚姻状况

	private String positionLevel; // 岗位级别

	private String belongWindow; // 归属窗口

	private String educationLevel; // 文化程度

	private String contactWay; // 联系方式

	private String email; // 电子邮件

	private String nation; // 民族

	private String origin; // 籍贯

	private String politicalStatus; // 政治面貌

	private String address; // 地址

	private String company; // 所在公司

	private String title; // 职称

	private String position; // 职位

	private String education; // 学历

	private String degree; // 学位

	private String university; // 毕业院校

	private String major; // 专业

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

	// Constructors

	/**
	 * SysUserDetailPo Constructor.
	 * 
	 */
	public SysUserDetailPo()
	{
	}

	/**
	 * SysUserDetailPo Constructor.
	 * 
	 * @param id
	 * @param realName
	 * @param sex
	 * @param photoURL
	 * @param photo
	 * @param idNumber
	 * @param birthday
	 * @param isMarried
	 * @param positionLevel
	 * @param belongWindow
	 * @param educationLevel
	 * @param contactWay
	 * @param email
	 * @param nation
	 * @param origin
	 * @param politicalStatus
	 * @param address
	 * @param company
	 * @param title
	 * @param position
	 * @param education
	 * @param degree
	 * @param university
	 * @param major
	 * @param agencyCode
	 * @param recStatus
	 * @param orders
	 * @param lockStatus
	 * @param lockDate
	 * @param lockUserID
	 * @param createBy
	 * @param createDate
	 * @param lastEditBy
	 * @param lastEditDate
	 * @param remarks
	 * @param extend1
	 * @param extend2
	 * @param extend3
	 */
	public SysUserDetailPo(String id, String realName, String sex, String photoURL, byte[] photo, String idNumber,
			Date birthday, String isMarried, String positionLevel, String belongWindow, String educationLevel,
			String contactWay, String email, String nation, String origin, String politicalStatus, String address,
			String company, String title, String position, String education, String degree, String university,
			String major, String agencyCode, String recStatus, String orders, String lockStatus, Date lockDate,
			String lockUserID, String createBy, Date createDate, String lastEditBy, Date lastEditDate, String remarks,
			String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.realName = realName;
		this.sex = sex;
		this.photoURL = photoURL;
		this.photo = photo;
		this.idNumber = idNumber;
		this.birthday = birthday;
		this.isMarried = isMarried;
		this.positionLevel = positionLevel;
		this.belongWindow = belongWindow;
		this.educationLevel = educationLevel;
		this.contactWay = contactWay;
		this.email = email;
		this.nation = nation;
		this.origin = origin;
		this.politicalStatus = politicalStatus;
		this.address = address;
		this.company = company;
		this.title = title;
		this.position = position;
		this.education = education;
		this.degree = degree;
		this.university = university;
		this.major = major;
		this.agencyCode = agencyCode;
		this.recStatus = recStatus;
		this.orders = orders;
		this.lockStatus = lockStatus;
		this.lockDate = lockDate;
		this.lockUserID = lockUserID;
		this.createBy = createBy;
		this.createDate = createDate;
		this.lastEditBy = lastEditBy;
		this.lastEditDate = lastEditDate;
		this.remarks = remarks;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
	}

	// Property accessors
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

	@Column(name = "SUD_RealName", length = 64)
	public String getRealName()
	{
		return realName;
	}

	public void setRealName(String realName)
	{
		this.realName = realName;
	}

	@Column(name = "SUD_Sex", length = 1)
	public String getSex()
	{
		return sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	@Column(name = "SUD_PhotoURL")
	public String getPhotoURL()
	{
		return photoURL;
	}

	public void setPhotoURL(String photoURL)
	{
		this.photoURL = photoURL;
	}

	@Column(name = "SUD_Photo")
	public byte[] getPhoto()
	{
		return photo;
	}

	public void setPhoto(byte[] photo)
	{
		this.photo = photo;
	}

	@Column(name = "SUD_IDNumber", length = 64)
	public String getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}

	@Column(name = "SUD_Birthday")
	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	@Column(name = "SUD_IsMarried", length = 1)
	public String getIsMarried()
	{
		return isMarried;
	}

	public void setIsMarried(String isMarried)
	{
		this.isMarried = isMarried;
	}

	@Column(name = "SUD_PositionLevel", length = 64)
	public String getPositionLevel()
	{
		return positionLevel;
	}

	public void setPositionLevel(String positionLevel)
	{
		this.positionLevel = positionLevel;
	}

	@Column(name = "SUD_BelongWindow", length = 64)
	public String getBelongWindow()
	{
		return belongWindow;
	}

	public void setBelongWindow(String belongWindow)
	{
		this.belongWindow = belongWindow;
	}

	@Column(name = "SUD_EducationLevel", length = 64)
	public String getEducationLevel()
	{
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel)
	{
		this.educationLevel = educationLevel;
	}

	@Column(name = "SUD_ContactWay", length = 64)
	public String getContactWay()
	{
		return contactWay;
	}

	public void setContactWay(String contactWay)
	{
		this.contactWay = contactWay;
	}

	@Column(name = "SUD_Email", length = 64)
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	@Column(name = "SUD_Nation", length = 64)
	public String getNation()
	{
		return nation;
	}

	public void setNation(String nation)
	{
		this.nation = nation;
	}

	@Column(name = "SUD_Origin", length = 255)
	public String getOrigin()
	{
		return origin;
	}

	public void setOrigin(String origin)
	{
		this.origin = origin;
	}

	@Column(name = "SUD_PoliticalStatus", length = 64)
	public String getPoliticalStatus()
	{
		return politicalStatus;
	}

	public void setPoliticalStatus(String politicalStatus)
	{
		this.politicalStatus = politicalStatus;
	}

	@Column(name = "SUD_Address", length = 255)
	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Column(name = "SUD_Company", length = 255)
	public String getCompany()
	{
		return company;
	}

	public void setCompany(String company)
	{
		this.company = company;
	}

	@Column(name = "SUD_Title", length = 64)
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Column(name = "SUD_Position", length = 64)
	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	@Column(name = "SUD_Education", length = 64)
	public String getEducation()
	{
		return education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	@Column(name = "SUD_Degree", length = 64)
	public String getDegree()
	{
		return degree;
	}

	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	@Column(name = "SUD_University", length = 64)
	public String getUniversity()
	{
		return university;
	}

	public void setUniversity(String university)
	{
		this.university = university;
	}

	@Column(name = "SUD_Major", length = 64)
	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	@Column(name = "SUD_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SUD_RecStatus", length = 1)
	public String getRecStatus()
	{
		return recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "SUD_Order", length = 64)
	public String getOrders()
	{
		return orders;
	}

	public void setOrders(String orders)
	{
		this.orders = orders;
	}

	@Column(name = "SUD_LockStatus", length = 1)
	public String getLockStatus()
	{
		return lockStatus;
	}

	public void setLockStatus(String lockStatus)
	{
		this.lockStatus = lockStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUD_LockDate", length = 10)
	public Date getLockDate()
	{
		return lockDate;
	}

	public void setLockDate(Date lockDate)
	{
		this.lockDate = lockDate;
	}

	@Column(name = "SUD_LockUserID", length = 64)
	public String getLockUserID()
	{
		return lockUserID;
	}

	public void setLockUserID(String lockUserID)
	{
		this.lockUserID = lockUserID;
	}

	@Column(name = "SUD_CreateBy", length = 64)
	public String getCreateBy()
	{
		return createBy;
	}

	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUD_CreateDate", length = 10)
	public Date getCreateDate()
	{
		return createDate;
	}

	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	@Column(name = "SUD_LastEditBy", length = 64)
	public String getLastEditBy()
	{
		return lastEditBy;
	}

	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SUD_LastEditDate", length = 10)
	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	@Column(name = "SUD_Remarks", length = 255)
	public String getRemarks()
	{
		return remarks;
	}

	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	@Column(name = "SUD_Extend1", length = 64)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SUD_Extend2", length = 64)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SUD_Extend3", length = 64)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}