package com.tk.orm.log.model;

import java.io.Serializable;
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
 *  File: LogPro.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: LogPro.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月16日下午12:01:04>>, <<Who>>, <<what>>  
 *  2015年1月16日		nie.yl		Initial.
 * </pre>
 */

@Entity
@Table(name = "sys_log")
public class LogPo implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -4245780727102713995L;

	// Fields
	private String id; // '主键'

	private String userId; // 用户id

	private String userName; // 用户名

	private String operationType; // 操作类型 如：更新、添加、删除

	private String resourceName; // 资源名称

	private String resourceId; // 资源ID

	private Date startTime; // 开始时间

	private Date endTime; // 结束时间

	private long spendTime; // 消耗时间，单位：秒

	private String targetMethod; // 执行的方法名 某个类的某个方法

	private String args; // 执行参数

	private String comment; // 日志简短简述

	private String ip; // 发请求的IP地址

	private String url; // 请求的URL

	private String key1; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key2; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key3; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key4; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key5; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key6; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String key7; // 操作的资源属性名。具体映射关系由具体资源的log类决定

	private String jsonText; // 该表所有字段和值的完整映射，以json的形式存储

	private String agencyCode; // 机构代码

	private String extend1;// '扩展字段1'

	private String extend2;// '扩展字段2'

	private String extend3;// '扩展字段3'

	public LogPo()
	{
		super();
	}

	public LogPo(String id, String userId, String userName, String operationType, String resourceName,
			String resourceId, Date startTime, Date endTime, int spendTime, String targetMethod, String args,
			String comment, String ip, String url, String key1, String key2, String key3, String key4, String key5,
			String key6, String key7, String jsonText, String agencyCode, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.operationType = operationType;
		this.resourceName = resourceName;
		this.resourceId = resourceId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.spendTime = spendTime;
		this.targetMethod = targetMethod;
		this.args = args;
		this.comment = comment;
		this.ip = ip;
		this.url = url;
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
		this.key4 = key4;
		this.key5 = key5;
		this.key6 = key6;
		this.key7 = key7;
		this.jsonText = jsonText;
		this.agencyCode = agencyCode;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
	}

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

	@Column(name = "SL_UserId", length = 64)
	public String getUserId()
	{
		return userId;
	}

	public void setUserId(String userId)
	{
		this.userId = userId;
	}

	@Column(name = "SL_UserName", length = 255)
	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	@Column(name = "SL_OperationType", length = 64)
	public String getOperationType()
	{
		return operationType;
	}

	public void setOperationType(String operationType)
	{
		this.operationType = operationType;
	}

	@Column(name = "SL_ResourceName", length = 64)
	public String getResourceName()
	{
		return resourceName;
	}

	public void setResourceName(String resourceName)
	{
		this.resourceName = resourceName;
	}

	@Column(name = "SL_ResourceId")
	public String getResourceId()
	{
		return resourceId;
	}

	public void setResourceId(String resourceId)
	{
		this.resourceId = resourceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SL_StartTime")
	public Date getStartTime()
	{
		return startTime;
	}

	public void setStartTime(Date startTime)
	{
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SL_EndTime")
	public Date getEndTime()
	{
		return endTime;
	}

	public void setEndTime(Date endTime)
	{
		this.endTime = endTime;
	}

	@Column(name = "SL_SpendTime")
	public long getSpendTime()
	{
		return spendTime;
	}

	public void setSpendTime(long spendTime)
	{
		this.spendTime = spendTime;
	}

	@Column(name = "SL_TargetMethod")
	public String getTargetMethod()
	{
		return targetMethod;
	}

	public void setTargetMethod(String targetMethod)
	{
		this.targetMethod = targetMethod;
	}

	@Column(name = "SL_Args")
	public String getArgs()
	{
		return args;
	}

	public void setArgs(String args)
	{
		this.args = args;
	}

	@Column(name = "SL_Comment")
	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	@Column(name = "SL_Ip", length = 64)
	public String getIp()
	{
		return ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	@Column(name = "SL_Url")
	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	@Column(name = "SL_Key1")
	public String getKey1()
	{
		return key1;
	}

	public void setKey1(String key1)
	{
		this.key1 = key1;
	}

	@Column(name = "SL_Key2")
	public String getKey2()
	{
		return key2;
	}

	public void setKey2(String key2)
	{
		this.key2 = key2;
	}

	@Column(name = "SL_Key3")
	public String getKey3()
	{
		return key3;
	}

	public void setKey3(String key3)
	{
		this.key3 = key3;
	}

	@Column(name = "SL_Key4")
	public String getKey4()
	{
		return key4;
	}

	public void setKey4(String key4)
	{
		this.key4 = key4;
	}

	@Column(name = "SL_Key5")
	public String getKey5()
	{
		return key5;
	}

	public void setKey5(String key5)
	{
		this.key5 = key5;
	}

	@Column(name = "SL_Key6")
	public String getKey6()
	{
		return key6;
	}

	public void setKey6(String key6)
	{
		this.key6 = key6;
	}

	@Column(name = "SL_Key7")
	public String getKey7()
	{
		return key7;
	}

	public void setKey7(String key7)
	{
		this.key7 = key7;
	}

	@Column(name = "SL_JsonText")
	public String getJsonText()
	{
		return jsonText;
	}

	public void setJsonText(String jsonText)
	{
		this.jsonText = jsonText;
	}

	@Column(name = "SL_AgencyCode", length = 64)
	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	@Column(name = "SL_Extend1", length = 255)
	public String getExtend1()
	{
		return extend1;
	}

	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	@Column(name = "SL_Extend2", length = 255)
	public String getExtend2()
	{
		return extend2;
	}

	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	@Column(name = "SL_Extend3", length = 255)
	public String getExtend3()
	{
		return extend3;
	}

	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}

}
