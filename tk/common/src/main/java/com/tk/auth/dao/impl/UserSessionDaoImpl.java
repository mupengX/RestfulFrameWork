package com.tk.auth.dao.impl;

import org.springframework.stereotype.Repository;

import com.tk.framework.dao.impl.BaseDaoImpl;
import com.tk.orm.auth.dao.UserSessionDao;
import com.tk.orm.auth.model.UserSession;


/**    
 * @File:UserSessionDaoImpl.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:02:59>>, <<TK>>, <<Create>>      
 */ 
@Repository(value="userSessionDao")
public class UserSessionDaoImpl extends BaseDaoImpl implements UserSessionDao
{

	public UserSession createSession(UserSession session) throws Exception
	{
		// TODO Auto-generated method stub
		return null;
	}

}

/*
*$Log: av-env.bat,v $
*/