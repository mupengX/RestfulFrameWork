package com.tk.framework.util.format;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre> 
 *  
 *  File: SmartDateFormat.java
 *  
 *  Copyright (C): 2014
 *  Description: 日期格式化工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: SmartDateFormat.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:42:18>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class SmartDateFormat extends SimpleDateFormat
{
	@Override
	public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos)
	{
		return new StringBuffer(DateUtil.smartFormat(date));
	}

	@Override
	public Date parse(String text) throws ParseException
	{
		return DateUtil.smartFormat(text);
	}
}
/*
 * $Log: av-env.bat,v $
 */