package com.tk.framework.annotations;

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


/**
 * <pre> 
 *  
 *  File: JsonFilter.java
 *  
 *  Copyright (C): 2014
 *  Description: 自定义注解，用于动态获取过滤字段
 *  TODO
 * 
 *  Notes:
 *  $Id: JsonFilter.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:20:19>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface JsonFilter
{	

	Class<?> target() default Object.class;
	
}

/*
*$Log: av-env.bat,v $
*/