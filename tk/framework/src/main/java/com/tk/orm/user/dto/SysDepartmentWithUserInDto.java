package com.tk.orm.user.dto;

import com.tk.framework.vo.BaseDto;

/**
 * <pre>
 *  
 *  File: SysDepartmentWithUserInDto.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  附加了用户的部门DTO，即添加部门时会同时绑定一个用户
 * 
 *  Notes:
 *  $Id: SysDepartmentWithUserInDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年4月15日上午9:52:19>>, <<Who>>, <<what>>  
 *  2015年4月15日		TK		Initial.
 * </pre>
 */
public class SysDepartmentWithUserInDto extends BaseDto
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -1417062020579953810L;

	// Fields
	private String deptID; // '部门主键'

	private String deptName;// '部门名称'

	private String deptCode; // '部门编号'

	private String deptCategory; // 部门类别

	private String deptTel; // 部门联系电话

	private String deptAddress; // 部门地址

	private String deptEmail; // 部门Email

	private String deptFax; // 部门传真

	private String deptDescription;// 部门描述

	private String deptParentID;// 上级部门

	private String uID; // 用户主键

	private String userID;// '用户ID'

	private String userPwd;// '用户密码'

	private String userName;// 用户名

	private String userContactWay; // 用户联系方式

	/**
	 * @return the deptID
	 */

	public String getDeptID()
	{
		return deptID;
	}

	/**
	 * @param deptID the deptID to set
	 */
	public void setDeptID(String deptID)
	{
		this.deptID = deptID;
	}

	/**
	 * @return the deptName
	 */

	public String getDeptName()
	{
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}

	/**
	 * @return the deptCode
	 */

	public String getDeptCode()
	{
		return deptCode;
	}

	/**
	 * @param deptCode the deptCode to set
	 */
	public void setDeptCode(String deptCode)
	{
		this.deptCode = deptCode;
	}

	/**
	 * @return the deptCategory
	 */

	public String getDeptCategory()
	{
		return deptCategory;
	}

	/**
	 * @param deptCategory the deptCategory to set
	 */
	public void setDeptCategory(String deptCategory)
	{
		this.deptCategory = deptCategory;
	}

	/**
	 * @return the deptTel
	 */

	public String getDeptTel()
	{
		return deptTel;
	}

	/**
	 * @param deptTel the deptTel to set
	 */
	public void setDeptTel(String deptTel)
	{
		this.deptTel = deptTel;
	}

	/**
	 * @return the deptAddress
	 */

	public String getDeptAddress()
	{
		return deptAddress;
	}

	/**
	 * @param deptAddress the deptAddress to set
	 */
	public void setDeptAddress(String deptAddress)
	{
		this.deptAddress = deptAddress;
	}

	/**
	 * @return the deptEmail
	 */

	public String getDeptEmail()
	{
		return deptEmail;
	}

	/**
	 * @param deptEmail the deptEmail to set
	 */
	public void setDeptEmail(String deptEmail)
	{
		this.deptEmail = deptEmail;
	}

	/**
	 * @return the deptFax
	 */

	public String getDeptFax()
	{
		return deptFax;
	}

	/**
	 * @param deptFax the deptFax to set
	 */
	public void setDeptFax(String deptFax)
	{
		this.deptFax = deptFax;
	}

	/**
	 * @return the deptDescription
	 */

	public String getDeptDescription()
	{
		return deptDescription;
	}

	/**
	 * @param deptDescription the deptDescription to set
	 */
	public void setDeptDescription(String deptDescription)
	{
		this.deptDescription = deptDescription;
	}

	/**
	 * @return the deptParentID
	 */

	public String getDeptParentID()
	{
		return deptParentID;
	}

	/**
	 * @param deptParentID the deptParentID to set
	 */
	public void setDeptParentID(String deptParentID)
	{
		this.deptParentID = deptParentID;
	}

	/**
	 * @return the uID
	 */

	public String getuID()
	{
		return uID;
	}

	/**
	 * @param uID the uID to set
	 */
	public void setuID(String uID)
	{
		this.uID = uID;
	}

	/**
	 * @return the userID
	 */

	public String getUserID()
	{
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	/**
	 * @return the userPwd
	 */

	public String getUserPwd()
	{
		return userPwd;
	}

	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd)
	{
		this.userPwd = userPwd;
	}

	/**
	 * @return the userName
	 */

	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the userContactWay
	 */

	public String getUserContactWay()
	{
		return userContactWay;
	}

	/**
	 * @param userContactWay the userContactWay to set
	 */
	public void setUserContactWay(String userContactWay)
	{
		this.userContactWay = userContactWay;
	}
}

/*
 * $Log: av-env.bat,v $
 */