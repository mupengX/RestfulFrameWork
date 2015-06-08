package com.tk.framework.util.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre> 
 *  
 *  File: DateFormatHelper.java
 *  
 *  Copyright (C): 2014
 *  Description: 日期格式化工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: DateFormatHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:40:39>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DateFormatHelper {
	
	private DateFormatHelper(){}
	private final static String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	public static String long2str(long time){
		Date d = new Date(time);
		DateFormat df = new SimpleDateFormat(FORMAT_STR);
		return df.format(d);
	}
//	public static long str2long(String str){
//		DateFormat df = new SimpleDateFormat(FORMAT_STR);
//		return df.parse(str).getTime();
//	}
}
