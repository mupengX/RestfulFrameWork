package com.tk.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * <pre> 
 *  
 *  File: JsonFilters.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: JsonFilter的复数形式
 *  TODO
 * 
 *  Notes:
 *  $Id: JsonFilters.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:21:02>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
public @interface JsonFilters
{
	JsonFilter[] value();
}

/*
*$Log: av-env.bat,v $
*/