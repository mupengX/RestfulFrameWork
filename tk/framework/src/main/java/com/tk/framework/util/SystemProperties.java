package com.tk.framework.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import com.tk.framework.constant.MessageConstants;
import com.tk.framework.exceptions.ConfigurationException;

/**
 * <pre> 
 *  
 *  File: SystemProperties.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 系统配置属性工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: SystemProperties.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:51:12>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class SystemProperties
{
	// WARNING: Do not use AVLogger in this class! AVLogger will be dependent (indirectly) on this class.
	// private static AVLogger logger = AVLogger.getLogger(AVProperties.class);
	// private static final Log LOGGER = LogFactory.getLog(AVProperties.class);

	/**
	 * start with an empty Properties instance for graceful error handling.
	 */
	private static Properties props = new Properties();

	public static void loadCodeDip()
	{
		try
		{
			//System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("server.cache.properties"));
			
		}
		catch (IOException e)
		{
			// log.error("load uploadxls.properties error:"+e);
		}
	}

	/**
	 * 获取值
	 * 
	 * @param key
	 * @return
	 */
	public static String getPropertyValue(String key) throws Exception
	{
		loadCodeDip();
		if(ValidationUtil.isEmpty(props))
		{
			throw new ConfigurationException(MessageConstants.CONFIG_ERROR);
		}
		String value = (String) props.get(key);
		if (!ValidationUtil.isEmpty(value))
		{
			try
			{
				value = new String(value.getBytes("ISO8859_1"), "UTF-8");
			}
			catch (UnsupportedEncodingException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			value = "";
		}
		return value;
	}
}

/*
 * $Log: av-env.bat,v $
 */