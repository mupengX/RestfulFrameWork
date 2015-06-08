package com.tk.service.publicuser;

import com.tk.framework.service.BaseService;
import com.tk.orm.publicuser.model.PublicUserPo;

/**    
 *  TK Automation
 * @File:PuUserService.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:55:23>>, <<TK>>, <<Create>>      
 */ 
public interface PuUserService extends BaseService<PublicUserPo, Object>
{
	public PublicUserPo getUserByUserId(String agencyCode, String user_id) throws Exception;	
}

/*
*$Log: av-env.bat,v $f
*/