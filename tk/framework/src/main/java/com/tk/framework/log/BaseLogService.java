package com.tk.framework.log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tk.orm.log.dto.LogDto;
import com.tk.orm.log.model.LogPo;

/**
 * <pre> 
 *  
 *  File: baseLogger.java
 *  , Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: baseLogger.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月16日下午2:24:45>>, <<Who>>, <<what>>  
 *  2015年1月16日		nie.yl		Initial.
 * </pre>
 */
public interface  BaseLogService 
{
	public  LogPo toModel(LogPo logPo) throws Exception;
	public  String toView(String json) throws Exception;
	public  String search(String json) throws Exception;
	
}

/*
*$Log: av-env.bat,v $
*/