package com.tk.framework.rest.framework.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.tk.framework.util.json.WebContext;


/**
 * <pre> 
 *  
 *  File: WebContextFilter.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: WebContextFilter.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:36:07>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Component("webContextFilter")
public class WebContextFilter implements Filter
{
	public void init(FilterConfig filterConfig) throws ServletException
	{
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException,
			ServletException
	{
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		ServletContext servletContext = request.getSession().getServletContext();
		WebContext.create(request, response, servletContext);
		chain.doFilter(request, response);
		WebContext.clear();

	}

	public void destroy()
	{ // TODO Auto-generated method stub }

	}

}

/*
 * $Log: av-env.bat,v $
 */