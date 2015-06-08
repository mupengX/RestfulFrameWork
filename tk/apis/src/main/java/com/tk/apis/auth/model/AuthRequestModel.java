package com.tk.apis.auth.model;

import java.io.Serializable;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * <pre>
 *  File: AuthRequestModel.java
 *  Copyright (C): 2014
 *  Description:
 *  用户身份认证的请求数据模型
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月24日下午12:11:16>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
@ApiModel(value="AuthModel")
public class AuthRequestModel implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -536412498052440039L;
	
	@ApiModelProperty(required = false)
	private String agency;
	
	@ApiModelProperty(required = true)
	private String userId;
	
	@ApiModelProperty(required = true)
	private String password;
	
	@ApiModelProperty(required = true)
	private String product;

	/**
	 * @return the agency
	 */

	public String getAgency()
	{
		return agency;
	}

	/**
	 * @param agency the agency to set
	 */
	public void setAgency(String agency)
	{
		this.agency = agency;
	}

	/**
	 * Gets the user id.
	 * 
	 * @return the userId
	 */
	public String getUserId()
	{
		return userId;
	}

	/**
	 * Sets the user id.
	 * 
	 * @param userId the userId to set
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the product
	 */
	public String getProduct()
	{
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product)
	{
		this.product = product;
	}
}

/*
 * $Log: av-env.bat,v $
 */