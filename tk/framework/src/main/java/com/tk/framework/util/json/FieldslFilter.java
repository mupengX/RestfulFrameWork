package com.tk.framework.util.json;

import java.lang.reflect.Field;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.tk.framework.util.StringUtil;



/**
 * <pre> 
 *  
 *  File: FieldslFilter.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 动态字段过滤Filter
 *  TODO
 * 
 *  Notes:
 *  $Id: FieldslFilter.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:42:44>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@JsonIgnoreProperties(value={"name"}) //希望动态过滤掉的属性
public class FieldslFilter
{
	
	
	

	/**
	 * 获取与所给字段名不同的字段
	 * ,如果类中不包含所给字段名，则不进行匹配
	 * TODO.
	 *  
	 * @param Ignore 要过滤掉的字段名
	 * @param model  实体类
	 * @return       实体类中其他字段
	 */
	public static String ConversionProperties(String ignoreFieldNamesStr,Class<?> model)
	{
		String  returnFieldNames="";
		String realIgnoreFieldNames="";
		String [] ignoreFieldNames=ignoreFieldNamesStr.split(",");
		
		for(String ignoreFieldName:ignoreFieldNames )
		{
			if(isContainField(ignoreFieldName,model))
			{
				realIgnoreFieldNames+=ignoreFieldName+",";
			}
		}
		if(!realIgnoreFieldNames.equals(""))
		{
			realIgnoreFieldNames=realIgnoreFieldNames.substring(0, realIgnoreFieldNames.length()-1);
		}
		
		
		Field[] fields= model.getDeclaredFields();
		
		for(Field f: fields)
		{
			String fieldName= f.getName();
			if(!StringUtil.isContainStr(fieldName,ignoreFieldNames))
			{
				returnFieldNames+=fieldName+",";
			}
		}
		if(!returnFieldNames.equals(""))
		{
			returnFieldNames=returnFieldNames.substring(0, returnFieldNames.length()-1);
		}
		
		
		return returnFieldNames;
	}
	
	
	/**
	 * 类中是否包含指定字段
	 * TODO.
	 *
	 * @param fieldName
	 * @param model
	 * @return
	 */
	public  static boolean isContainField(String fieldName,Class<?> model)
	{
		Field[] fields= model.getDeclaredFields();
		for(Field field:fields)
		{
				if(field.getName().equals(fieldName))
				{
					return true;
				}
			
			
		}
		return false;
	}
	
	
	
}

/*
*$Log: av-env.bat,v $
*/