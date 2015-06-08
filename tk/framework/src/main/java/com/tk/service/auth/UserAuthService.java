package com.tk.service.auth;

import com.tk.orm.publicuser.model.PublicUserPo;

/**    
 *  TK Automation
 * @File:UserAuthService.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:55:01>>, <<TK>>, <<Create>>      
 */ 
public interface UserAuthService
{
	public Object getUserByUserId(String agencyCode,String user_id) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/