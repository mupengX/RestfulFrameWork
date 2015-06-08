package com.tk.framework.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.tk.framework.util.APILevel;


 
/**
 * <pre> 
 *  
 *  File: ResourceDescription.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 自定义注解用于权限描述
 *  TODO
 * 
 *  Notes:
 *  $Id: ResourceDescription.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:21:51>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ResourceDescription  {
	//模块名
	String Module();
	//资源名称
	String Resource();
	//对资源进行的操作
	String Operation();
	//API可见级别
	APILevel ApiLevel();
	//描述
	String Description() default "";
	
}
