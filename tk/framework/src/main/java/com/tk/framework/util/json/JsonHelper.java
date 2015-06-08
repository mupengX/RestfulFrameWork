package com.tk.framework.util.json;

import org.codehaus.jackson.map.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre> 
 *  
 *  File: JsonHelper.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: json转换工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: JsonHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:43:11>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class JsonHelper
{

	private static final Logger logger = LoggerFactory.getLogger(JsonHelper.class);
	private JsonHelper()
	{
	}

	public static String object2str(Object obj)
	{
		String retStr = "";
		ObjectMapper mapper = new ObjectMapper();

		try
		{
			retStr = mapper.writeValueAsString(obj);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(),e);
			}
		return retStr;
	}

	public static Object str2Object(String str, Class cls)
	{
		Object retObj = null;
		ObjectMapper mapper = new ObjectMapper();

		try
		{
			retObj = mapper.readValue(str, cls);
		}
		catch (Exception e)
		{
			logger.error(e.getMessage(),e);

		}
		return retObj;
	}
	
	

	
}

