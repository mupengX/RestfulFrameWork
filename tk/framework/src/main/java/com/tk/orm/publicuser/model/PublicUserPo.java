package com.tk.orm.publicuser.model;

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
 *  TK Automation
 * @File:PublicUserPo.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:52:51>>, <<TK>>, <<Create>>      
 */ 
@Entity
@Table(name = "pu_user")
public class PublicUserPo implements java.io.Serializable
{

	// Fields

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 3804481017888309687L;

	private String puserUid;

	private String userId;

	private String password;

	private String fname;

	private String address1;

	private String address2;

	private String address3;

	private String province;

	private String city;

	private String conutry;

	private String phone1;

	private String phone2;

	private String phone3;

	private String preContactChnl;

	private String gender;

	private Date birthDate;

	private String avatar;

	private String reciveSms;

	private String recivePush;

	private Date registerDate;

	private String needChangePassword;

	private String registerSource;

	private String authAgentId;

	private String qq;

	private Date recDate;

	private String recUserid;

	private String recStatus;

	private String EMail;

	private String extend1;

	private String extend2;

	private String extend3;

	private String description;

	// Constructors

	/** default constructor */
	public PublicUserPo()
	{
	}

	/** full constructor */
	public PublicUserPo(String userId, String password, String fname, String address1, String address2, String address3,
			String province, String city, String conutry, String phone1, String phone2, String phone3,
			String preContactChnl, String gender, Date birthDate, String avatar, String reciveSms, String recivePush,
			Date registerDate, String needChangePassword, String registerSource, String authAgentId, String qq,
			Date recDate, String recUserid, String recStatus, String EMail, String extend1, String extend2,
			String extend3, String description)
	{
		this.userId = userId;
		this.password = password;
		this.fname = fname;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.province = province;
		this.city = city;
		this.conutry = conutry;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.preContactChnl = preContactChnl;
		this.gender = gender;
		this.birthDate = birthDate;
		this.avatar = avatar;
		this.reciveSms = reciveSms;
		this.recivePush = recivePush;
		this.registerDate = registerDate;
		this.needChangePassword = needChangePassword;
		this.registerSource = registerSource;
		this.authAgentId = authAgentId;
		this.qq = qq;
		this.recDate = recDate;
		this.recUserid = recUserid;
		this.recStatus = recStatus;
		this.EMail = EMail;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
		this.description = description;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "PUSER_UID", unique = true, nullable = false, length = 32)
	public String getPuserUid()
	{
		return this.puserUid;
	}

	public void setPuserUid(String puserUid)
	{
		this.puserUid = puserUid;
	}

	@Column(name = "USER_ID", length = 32)
	public String getUserId()
	{
		return this.userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	@Column(name = "PASSWORD", length = 32)
	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Column(name = "FNAME", length = 16)
	public String getFname()
	{
		return this.fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	@Column(name = "ADDRESS1", length = 200)
	public String getAddress1()
	{
		return this.address1;
	}

	public void setAddress1(String address1)
	{
		this.address1 = address1;
	}

	@Column(name = "ADDRESS2", length = 200)
	public String getAddress2()
	{
		return this.address2;
	}

	public void setAddress2(String address2)
	{
		this.address2 = address2;
	}

	@Column(name = "ADDRESS3", length = 200)
	public String getAddress3()
	{
		return this.address3;
	}

	public void setAddress3(String address3)
	{
		this.address3 = address3;
	}

	@Column(name = "PROVINCE", length = 8)
	public String getProvince()
	{
		return this.province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	@Column(name = "CITY", length = 8)
	public String getCity()
	{
		return this.city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	@Column(name = "CONUTRY", length = 8)
	public String getConutry()
	{
		return this.conutry;
	}

	public void setConutry(String conutry)
	{
		this.conutry = conutry;
	}

	@Column(name = "PHONE1", length = 20)
	public String getPhone1()
	{
		return this.phone1;
	}

	public void setPhone1(String phone1)
	{
		this.phone1 = phone1;
	}

	@Column(name = "PHONE2", length = 20)
	public String getPhone2()
	{
		return this.phone2;
	}

	public void setPhone2(String phone2)
	{
		this.phone2 = phone2;
	}

	@Column(name = "PHONE3", length = 20)
	public String getPhone3()
	{
		return this.phone3;
	}

	public void setPhone3(String phone3)
	{
		this.phone3 = phone3;
	}

	@Column(name = "PRE_CONTACT_CHNL", length = 1)
	public String getPreContactChnl()
	{
		return this.preContactChnl;
	}

	public void setPreContactChnl(String preContactChnl)
	{
		this.preContactChnl = preContactChnl;
	}

	@Column(name = "GENDER", length = 1)
	public String getGender()
	{
		return this.gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTH_DATE", length = 10)
	public Date getBirthDate()
	{
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}

	@Column(name = "AVATAR")
	public String getAvatar()
	{
		return this.avatar;
	}

	public void setAvatar(String avatar)
	{
		this.avatar = avatar;
	}

	@Column(name = "RECIVE_SMS", length = 1)
	public String getReciveSms()
	{
		return this.reciveSms;
	}

	public void setReciveSms(String reciveSms)
	{
		this.reciveSms = reciveSms;
	}

	@Column(name = "RECIVE_PUSH", length = 1)
	public String getRecivePush()
	{
		return this.recivePush;
	}

	public void setRecivePush(String recivePush)
	{
		this.recivePush = recivePush;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REGISTER_DATE", length = 10)
	public Date getRegisterDate()
	{
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate)
	{
		this.registerDate = registerDate;
	}

	@Column(name = "NEED_CHANGE_PASSWORD", length = 1)
	public String getNeedChangePassword()
	{
		return this.needChangePassword;
	}

	public void setNeedChangePassword(String needChangePassword)
	{
		this.needChangePassword = needChangePassword;
	}

	@Column(name = "REGISTER_SOURCE", length = 1)
	public String getRegisterSource()
	{
		return this.registerSource;
	}

	public void setRegisterSource(String registerSource)
	{
		this.registerSource = registerSource;
	}

	@Column(name = "AUTH_AGENT_ID", length = 100)
	public String getAuthAgentId()
	{
		return this.authAgentId;
	}

	public void setAuthAgentId(String authAgentId)
	{
		this.authAgentId = authAgentId;
	}

	@Column(name = "QQ", length = 32)
	public String getQq()
	{
		return this.qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REC_DATE", length = 10)
	public Date getRecDate()
	{
		return this.recDate;
	}

	public void setRecDate(Date recDate)
	{
		this.recDate = recDate;
	}

	@Column(name = "REC_USERID", length = 32)
	public String getRecUserid()
	{
		return this.recUserid;
	}

	public void setRecUserid(String recUserid)
	{
		this.recUserid = recUserid;
	}

	@Column(name = "REC_STATUS", length = 1)
	public String getRecStatus()
	{
		return this.recStatus;
	}

	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	@Column(name = "E_MAIL", length = 100)
	public String getEMail()
	{
		return this.EMail;
	}

	public void setEMail(String EMail)
	{
		this.EMail = EMail;
	}

	@Column(name = "EXTEND1", length = 32)
	public String getExtend1()
	{
		return this.extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "EXTEND2", length = 32)
	public String getExtend2()
	{
		return this.extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "EXTEND3", length = 32)
	public String getExtend3()
	{
		return this.extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription()
	{
		return this.description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}