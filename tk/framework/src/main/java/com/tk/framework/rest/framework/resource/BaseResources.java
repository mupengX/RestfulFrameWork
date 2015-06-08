package com.tk.framework.rest.framework.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tk.framework.rest.framework.model.RestThreadLocal;

/**
 * <pre> 
 *  
 *  File: BaseResources.java
 *  
 *  Copyright (C): 2014
 *  Description: 资源基础类
 *  TODO
 * 
 *  Notes:
 *  $Id: BaseResources.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:33:18>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class BaseResources
{
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "error")
	public class InternalServerError extends Exception
	{
		public InternalServerError(String message)
		{
			super(message);
		}
	}
	
	public  boolean checkAgencyCode(String agencyCode)
	{
		String currentAgencyCode=RestThreadLocal.getAgencyCode();
		if(currentAgencyCode==null||"".equals(currentAgencyCode))
		{
			return false;
		}
		if(agencyCode!=null&&!"".equals(agencyCode)&&currentAgencyCode.equals(agencyCode))
		{
			//if(agencyCode.equals("admin"))
			//{
				return true;
			//}
		}
		
		return false;
	}
	
}

/*
 * $Log: av-env.bat,v $
 */