package com.tk.framework.util;

/**
 * <pre> 
 *  
 *  File: UserType.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 用户类型枚举类
 *  TODO
 * 
 *  Notes:
 *  $Id: UserType.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:52:12>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public enum UserType
{

	PUBLIC_USER(0),

	AGENCY_USER(1),

	SUPER_ADMIN(2);

	/**
	 * Field value
	 */
	private int value;

	/**
	 * Constructs ...
	 *
	 *
	 * @param str Integer
	 */
	private UserType(int str)
	{
		this.value = str;
	}

	/**
	 * Method getValue
	 *
	 *
	 * @return Integer
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * toString
	 *
	 * @return String
	 */
	public String toString()
	{
		String userType = "";
		switch (this)
		{
			case PUBLIC_USER:
				userType = "PUBLIC_USER";
				break;

			case AGENCY_USER:
				userType = "AGENCY_USER";
				break;
			case SUPER_ADMIN:
				userType = "SUPER_ADMIN";
				break;
			default:
				userType = "";
		}

		return userType;
	}

	public static UserType getUserType(int str)
	{
		UserType userType = null;
		for (UserType ut : UserType.values())
		{
			if (ut.value == str)
			{
				userType = ut;
				break;
			}
		}
		return userType;
	}
}

/*
 * $Log: av-env.bat,v $
 */