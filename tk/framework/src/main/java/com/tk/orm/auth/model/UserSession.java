package com.tk.orm.auth.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

/**
 *  TK Automation
 * 
 * @File:UserSession.java
 * @author TK
 * @Description: <关于这个类的基本作用>
 * @Notes: <一些特别的描述的信息>
 * @Revision History: <<2014年12月16日下午4:52:22>>, <<TK>>, <<Create>>
 */
@Entity
@Table(name = "esso_sessions")
public class UserSession implements java.io.Serializable
{

	// Fields

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 1701924515983788810L;

	private String ssoSessionId;

	private String agencyCode;

	private String ssoUserName;

	private String actionByProduct;

	private String actionByIp;

	private Date recDate;

	private String recStatus;

	private String recUserId;

	private String ssoSessionExpiration;

	private String ssoSessionStatus;

	private Date ssoSessionCreation;

	private long ssoSessionCreationMillis;

	private String password;

	private String userId;

	// Constructors
	/** default constructor */
	public UserSession()
	{
	}

	/**
	 * UserSession Constructor.
	 * 
	 * @param ssoSessionId
	 * @param agencyCode
	 * @param ssoUserName
	 * @param actionByProduct
	 * @param actionByIp
	 * @param recDate
	 * @param recStatus
	 * @param recUserId
	 * @param ssoSessionExpiration
	 * @param ssoSessionStatus
	 * @param ssoSessionCreation
	 * @param ssoSessionCreationMillis
	 * @param password
	 * @param userId
	 */
	public UserSession(String ssoSessionId, String agencyCode, String ssoUserName, String actionByProduct,
			String actionByIp, Date recDate, String recStatus, String recUserId, String ssoSessionExpiration,
			String ssoSessionStatus, Date ssoSessionCreation, long ssoSessionCreationMillis, String password,
			String userId)
	{
		super();
		this.ssoSessionId = ssoSessionId;
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
		this.ssoSessionCreationMillis = ssoSessionCreationMillis;
		this.password = password;
		this.userId = userId;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "SSO_SESSION_ID", unique = true, nullable = false, length = 45)
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REC_DATE", length = 19)
	public Date getRecDate()
	{
		return recDate;
	}

	public void setRecDate(Date recDate)
	{
		this.recDate = recDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SSO_SESSION_CREATION", length = 19)
	public Date getSsoSessionCreation()
	{
		return ssoSessionCreation;
	}

	public void setSsoSessionCreation(Date ssoSessionCreation)
	{
		this.ssoSessionCreation = ssoSessionCreation;
	}

	@Column(name = "SSO_SESSION_CREATION_Millis", length = 20)
	public long getSsoSessionCreationMillis()
	{
		return ssoSessionCreationMillis;
	}

	public void setSsoSessionCreationMillis(long ssoSessionCreationMillis)
	{
		this.ssoSessionCreationMillis = ssoSessionCreationMillis;
	}

	@Column(name = "USERID", length = 32)
	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	@Transient
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}