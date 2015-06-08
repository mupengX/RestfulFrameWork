package com.tk.orm.auth.dao;

import com.tk.framework.dao.BaseDao;
import com.tk.orm.auth.model.UserSession;

/**    
 *  TK Automation
 * @File:UserSessionDao.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:51:56>>, <<TK>>, <<Create>>      
 */ 
public interface UserSessionDao extends BaseDao
{
	public UserSession createSession(UserSession session) throws Exception;
}

/*
*$Log: av-env.bat,v $
*/