package com.tk.framework.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * <pre> 
 *  
 *  File: ConfigProperty.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 读取sql xml文件配置类
 *  TODO
 * 
 *  Notes:
 *  $Id: ConfigProperty.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:47:03>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ConfigProperty {

	private final static String fileName = "/tk-config.properties";
	private static Properties p = null;
	static{
		load(null);
	}
	public static void load(String fName){
		if(fName==null||fName.length()<=0){
			fName= fileName;
		}
		if(p==null){
			try {
				InputStream is = ConfigProperty.class.getResourceAsStream(fName);
				p = new Properties();
				p.load(is);
			} catch (IOException e) {
				// TODO 自动生成 catch 块
				e.printStackTrace();
			}
		}
	}
	public static String getProperty(String key){
		return p.getProperty(key);
	}
	public static void reload(String fName){
		p=null;
		load(fName);
	}
}
