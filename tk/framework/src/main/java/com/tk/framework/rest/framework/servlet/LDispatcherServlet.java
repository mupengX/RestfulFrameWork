package com.tk.framework.rest.framework.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.DispatcherServlet;

import com.tk.framework.rest.framework.exceptions.RestException;
import com.tk.framework.rest.framework.exceptions.UnauthorizedException;


/**
 * <pre> 
 *  
 *  File: LDispatcherServlet.java
 *  
 *  Copyright (C): 2014
 *  Description: 处理REST的 DispatcherServlet
 *  TODO
 * 
 *  Notes:
 *  $Id: LDispatcherServlet.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:34:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class LDispatcherServlet extends DispatcherServlet
{ 

	private static final Logger logger = LoggerFactory.getLogger(LDispatcherServlet.class);
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		logger.info("LDispatcherServlet......Begin");
	
		super.doService(request, response);
		
		logger.info("LDispatcherServlet......Done.");
	}
	@Override
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws RestException,Exception
	{
		super.doDispatch(request, response);
		
	}
}

/*
*$Log: av-env.bat,v $
*/