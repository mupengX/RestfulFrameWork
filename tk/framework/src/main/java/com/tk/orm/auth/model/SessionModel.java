package com.tk.orm.auth.model;

// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * SessionModel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "esso_sessions")
public class SessionModel implements java.io.Serializable
{

	// Fields

	private String ssoSessionId;

	private String agencyCode;

	private String ssoUserName;

	private String actionByProduct;

	private String actionByIp;

	private Timestamp recDate;

	private String recStatus;

	private String recUserId;

	private String ssoSessionExpiration;

	private String ssoSessionStatus;

	private Timestamp ssoSessionCreation;

	// Constructors

	/** default constructor */
	public SessionModel()
	{

	}

	/** minimal constructor */
	public SessionModel(String ssoUserName, String actionByProduct, String actionByIp, Timestamp recDate,
			String recStatus, String recUserId, String ssoSessionExpiration, String ssoSessionStatus,
			Timestamp ssoSessionCreation)
	{
		this.ssoUserName = ssoUserName;
		this.actionByProduct = actionByProduct;
		this.actionByIp = actionByIp;
		this.recDate = recDate;
		this.recStatus = recStatus;
		this.recUserId = recUserId;
		this.ssoSessionExpiration = ssoSessionExpiration;
		this.ssoSessionStatus = ssoSessionStatus;
		this.ssoSessionCreation = ssoSessionCreation;
	}

	/** full constructor */
	public SessionModel(String agencyCode, String ssoUserName, String actionByProduct, String actionByIp,
			Timestamp recDate, String recStatus, String recUserId, String ssoSessionExpiration,
			String ssoSessionStatus, Timestamp ssoSessionCreation)
	{
		this.agencyCode = agencyCode;
		this.ssoUserName = ssoUserName;
		this.actionByProduct = actionByProduct;
		this.actionByIp = actionByIp;
		this.recDate = recDate;
		this.recStatus = recStatus;
		this.recUserId = recUserId;
		this.ssoSessionExpiration = ssoSessionExpiration;
		this.ssoSessionStatus = ssoSessionStatus;
		this.ssoSessionCreation = ssoSessionCreation;
	}

	// Property accessors
	@Id
	@Column(name = "SSO_SESSION_ID", unique = true, nullable = false, length = 32)
	public String getSsoSessionId()
	{
		return this.ssoSessionId;
	}

	public void setSsoSessionId(String ssoSessionId)
	{
		this.ssoSessionId = ssoSessionId;
	}

	@Column(name = "AGENCY_CODE", length = 8)
	public String getAgencyCode()
	{
		return this.agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SSO_USER_NAME", nullable = false, length = 16)
	public String getSsoUserName()
	{
		return this.ssoUserName;
	}

	public void setSsoUserName(String ssoUserName)
	{
		this.ssoUserName = ssoUserName;
	}

	@Column(name = "ACTION_BY_PRODUCT", nullable = false, length = 8)
	public String getActionByProduct()
	{
		return this.actionByProduct;
	}

	public void setActionByProduct(String actionByProduct)
	{
		this.actionByProduct = actionByProduct;
	}

	@Column(name = "ACTION_BY_IP", nullable = false, length = 20)
	public String getActionByIp()
	{
		return this.actionByIp;
	}

	public void setActionByIp(String actionByIp)
	{
		this.actionByIp = actionByIp;
	}

	@Column(name = "REC_DATE", nullable = false, length = 19)
	public Timestamp getRecDate()
	{
		return this.recDate;
	}

	public void setRecDate(Timestamp recDate)
	{
		this.recDate = recDate;
	}

	@Column(name = "REC_STATUS", nullable = false, length = 1)
	public String getRecStatus()
	{
		return this.recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "REC_USER_ID", nullable = false, length = 16)
	public String getRecUserId()
	{
		return this.recUserId;
	}

	public void setRecUserId(String recUserId)
	{
		this.recUserId = recUserId;
	}

	@Column(name = "SSO_SESSION_EXPIRATION", nullable = false, length = 32)
	public String getSsoSessionExpiration()
	{
		return this.ssoSessionExpiration;
	}

	public void setSsoSessionExpiration(String ssoSessionExpiration)
	{
		this.ssoSessionExpiration = ssoSessionExpiration;
	}

	@Column(name = "SSO_SESSION_STATUS", nullable = false, length = 1)
	public String getSsoSessionStatus()
	{
		return this.ssoSessionStatus;
	}

	public void setSsoSessionStatus(String ssoSessionStatus)
	{
		this.ssoSessionStatus = ssoSessionStatus;
	}

	@Column(name = "SSO_SESSION_CREATION", nullable = false, length = 19)
	public Timestamp getSsoSessionCreation()
	{
		return this.ssoSessionCreation;
	}

	public void setSsoSessionCreation(Timestamp ssoSessionCreation)
	{
		this.ssoSessionCreation = ssoSessionCreation;
	}

}