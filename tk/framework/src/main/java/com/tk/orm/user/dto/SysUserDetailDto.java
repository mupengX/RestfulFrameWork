package com.tk.orm.user.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysUserDetailPo;

/**
 * <pre>
 *  
 *  File: SysUserDetailDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  用户详情DTO
 * 
 *  Notes:
 *  $Id: SysUserDetailDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月7日上午9:55:30>>, <<Who>>, <<what>>  
 *  2015年1月7日		TK		Initial.
 * </pre>
 */
public class SysUserDetailDto extends BaseDto
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -3928430446582194414L;

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

	/**
	 * SysUserDetailDto Constructor.
	 * 
	 */
	public SysUserDetailDto()
	{
		super();
	}

	public SysUserDetailDto(SysUserDetailPo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	public SysUserDetailPo SysUserDeatilDto2Po(SysUserDetailDto dto)
	{
		SysUserDetailPo po = new SysUserDetailPo();
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
	 * @return the realName
	 */

	public String getRealName()
	{
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName)
	{
		this.realName = realName;
	}

	/**
	 * @return the sex
	 */

	public String getSex()
	{
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex)
	{
		this.sex = sex;
	}

	/**
	 * @return the photoURL
	 */

	public String getPhotoURL()
	{
		return photoURL;
	}

	/**
	 * @param photoURL the photoURL to set
	 */
	public void setPhotoURL(String photoURL)
	{
		this.photoURL = photoURL;
	}

	/**
	 * @return the photo
	 */

	public byte[] getPhoto()
	{
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(byte[] photo)
	{
		this.photo = photo;
	}

	/**
	 * @return the idNumber
	 */

	public String getIdNumber()
	{
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber)
	{
		this.idNumber = idNumber;
	}

	/**
	 * @return the birthday
	 */

	public Date getBirthday()
	{
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	/**
	 * @return the isMarried
	 */

	public String getIsMarried()
	{
		return isMarried;
	}

	/**
	 * @param isMarried the isMarried to set
	 */
	public void setIsMarried(String isMarried)
	{
		this.isMarried = isMarried;
	}

	/**
	 * @return the positionLevel
	 */

	public String getPositionLevel()
	{
		return positionLevel;
	}

	/**
	 * @param positionLevel the positionLevel to set
	 */
	public void setPositionLevel(String positionLevel)
	{
		this.positionLevel = positionLevel;
	}

	/**
	 * @return the belongWindow
	 */

	public String getBelongWindow()
	{
		return belongWindow;
	}

	/**
	 * @param belongWindow the belongWindow to set
	 */
	public void setBelongWindow(String belongWindow)
	{
		this.belongWindow = belongWindow;
	}

	/**
	 * @return the educationLevel
	 */

	public String getEducationLevel()
	{
		return educationLevel;
	}

	/**
	 * @param educationLevel the educationLevel to set
	 */
	public void setEducationLevel(String educationLevel)
	{
		this.educationLevel = educationLevel;
	}

	/**
	 * @return the contactWay
	 */

	public String getContactWay()
	{
		return contactWay;
	}

	/**
	 * @param contactWay the contactWay to set
	 */
	public void setContactWay(String contactWay)
	{
		this.contactWay = contactWay;
	}

	/**
	 * @return the email
	 */

	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the nation
	 */

	public String getNation()
	{
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation)
	{
		this.nation = nation;
	}

	/**
	 * @return the origin
	 */

	public String getOrigin()
	{
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}

	/**
	 * @return the politicalStatus
	 */

	public String getPoliticalStatus()
	{
		return politicalStatus;
	}

	/**
	 * @param politicalStatus the politicalStatus to set
	 */
	public void setPoliticalStatus(String politicalStatus)
	{
		this.politicalStatus = politicalStatus;
	}

	/**
	 * @return the address
	 */

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
	 * @return the company
	 */

	public String getCompany()
	{
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company)
	{
		this.company = company;
	}

	/**
	 * @return the title
	 */

	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the position
	 */

	public String getPosition()
	{
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position)
	{
		this.position = position;
	}

	/**
	 * @return the education
	 */

	public String getEducation()
	{
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education)
	{
		this.education = education;
	}

	/**
	 * @return the degree
	 */

	public String getDegree()
	{
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	/**
	 * @return the university
	 */

	public String getUniversity()
	{
		return university;
	}

	/**
	 * @param university the university to set
	 */
	public void setUniversity(String university)
	{
		this.university = university;
	}

	/**
	 * @return the major
	 */

	public String getMajor()
	{
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major)
	{
		this.major = major;
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