package com.tk.framework.rest.framework.controllor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tk.framework.rest.framework.exceptions.UnknownResourceException;


/**
 * <pre> 
 *  
 *  File: DefaultController.java
 *  
 *  Copyright (C): 2014
 *  Description: 拦截错误URL的Controller
 *  TODO
 * 
 *  Notes:
 *  $Id: DefaultController.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:20:52>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Controller
public class DefaultController
{
	@RequestMapping("/**")//导入所有错误的URL
	public void unmappedRequest(HttpServletRequest request) throws Exception
	{
		
		throw new UnknownResourceException("There is no resource for path " + request.getRequestURI());
	}

}
/*
 * $Log: av-env.bat,v $
 */