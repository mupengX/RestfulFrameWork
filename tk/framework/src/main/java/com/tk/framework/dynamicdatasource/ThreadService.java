package com.tk.framework.dynamicdatasource;

/**
 * <pre> 
 *  
 *  File: ThreadService.java
 *  
 *  Copyright (C): 2014
 *  Description: 提供线程数据存取服务
 *  TODO
 * 
 *  Notes:
 *  $Id: ThreadService.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:31:23>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ThreadService
{
	private final static ThreadLocal threadLocal = new ThreadLocal();

	public static void setSourceName(String sourceName)
	{
		threadLocal.set(sourceName);
	}

	public static String getSourceName()
	{
		return (String) threadLocal.get();
	}
}
