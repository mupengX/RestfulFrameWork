package com.tk.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * <pre> 
 *  
 *  File: IgnoreAuthentication.java
 *  
 *  Copyright (C): 2014
 *  Description: 自定义注解，用于标识某些方法不需要进行身份认证和权限校验
 *  TODO
 * 
 *  Notes:
 *  $Id: IgnoreAuthentication.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:19:21>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Target( {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreAuthentication
{

}

/*
 * $Log: av-env.bat,v $
 */