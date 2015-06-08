package com.tk.framework.util.json;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre> 
 *  
 *  File: WebContext.java
 *  
 *  Copyright (C): 2014
 *  Description: webContext工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: WebContext.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:43:45>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class WebContext 
{ 
	private static ThreadLocal<WebContext> tlv = new ThreadLocal<WebContext>();
	private HttpServletRequest request; 
	private HttpServletResponse response;
	private ServletContext servletContext;
	protected WebContext()
	{
		
	} 
	public HttpServletRequest getRequest()
	{
		return request; 
		
	} 
	public void setRequest(HttpServletRequest request)
	{ 
		this.request = request; 
		
	} 
	
	public HttpServletResponse getResponse()
	{
		return response; 
		
	} 
	public void setResponse(HttpServletResponse response) 
	{
		this.response = response; 
		
	} 
	public ServletContext getServletContext() 
	{ 
		return servletContext;
		
	}
	
	public void setServletContext(ServletContext servletContext)
	{ 
		this.servletContext = servletContext;
		
	} 
	private WebContext(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext)
	{ 
		
		this.request = request; this.response = response; this.servletContext = servletContext; 
		
	} 
	
	public static WebContext getInstance() 
	{ 
		return tlv.get();
	}
		public static void create(HttpServletRequest request, HttpServletResponse response, ServletContext servletContext)
		
		{
			WebContext wc = new WebContext(request, response, servletContext);
			tlv.set(wc); 
			
		}
		
		public static void clear()
		{ 
			tlv.set(null);
			
		}
		
	
}

/*
*$Log: av-env.bat,v $
*/