package com.tk.orm.log.dto;


/**
 * <pre> 
 *  
 *  File: LogDetailDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: LogDetailDto.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月16日下午2:28:22>>, <<Who>>, <<what>>  
 *  2015年1月16日		nie.yl		Initial.
 * </pre>
 */
public class LogDetailDto
{
private String id; 
	
	private String logId; //日志记录ID
	
	private String attributeName; //资源属性 如：name
	
	private String attributeText; //资源属性名称 如：姓名
	
	private String attributeValue; //资源属性值  如：mupeng
	
	private String oldValue; //用于执行更新操作时记录资源属性旧值
	
	private String agencyCode; //机构代码
	
	private String extend1; // '扩展字段1'

	private String extend2; // '扩展字段2'

	private String extend3; // '扩展字段3'

	
	
	public LogDetailDto()
	{
		super();
	}



	public LogDetailDto(String id, String logId, String attributeName, String attributeText, String attributeValue,
			String oldValue, String agencyCode, String extend1, String extend2, String extend3)
	{
		super();
		this.id = id;
		this.logId = logId;
		this.attributeName = attributeName;
		this.attributeText = attributeText;
		this.attributeValue = attributeValue;
		this.oldValue = oldValue;
		this.agencyCode = agencyCode;
		this.extend1 = extend1;
		this.extend2 = extend2;
		this.extend3 = extend3;
	}


	public String getId()
	{
		return id;
	}



	public void setId(String id)
	{
		this.id = id;
	}


	public String getLogId()
	{
		return logId;
	}



	public void setLogId(String logId)
	{
		this.logId = logId;
	}


	public String getAttributeName()
	{
		return attributeName;
	}

	
	public void setAttributeName(String attributeName)
	{
		this.attributeName = attributeName;
	}


	public String getAttributeText()
	{
		return attributeText;
	}



	public void setAttributeText(String attributeText)
	{
		this.attributeText = attributeText;
	}


	public String getAttributeValue()
	{
		return attributeValue;
	}



	public void setAttributeValue(String attributeValue)
	{
		this.attributeValue = attributeValue;
	}


	public String getOldValue()
	{
		return oldValue;
	}



	public void setOldValue(String oldValue)
	{
		this.oldValue = oldValue;
	}


	public String getAgencyCode()
	{
		return agencyCode;
	}



	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}


	public String getExtend1()
	{
		return extend1;
	}


	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}


	public String getExtend2()
	{
		return extend2;
	}



	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}


	public String getExtend3()
	{
		return extend3;
	}



	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
	
}

/*
*$Log: av-env.bat,v $
*/