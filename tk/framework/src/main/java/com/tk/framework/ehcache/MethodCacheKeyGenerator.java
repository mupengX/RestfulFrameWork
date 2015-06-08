package com.tk.framework.ehcache;

import java.lang.reflect.Method;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cache.interceptor.KeyGenerator;

import com.tk.framework.page.PageBeanDto;

/**
 * <pre>
 * 
 *  Lexing
 *  File: MethodCacheKeyGenerator.java
 * 
 *  Lexing
 *  Copyright (C): 2014
 * 
 *  Description:
 *  缓存KEY生成类
 * 
 *  Notes:
 * 	$Id: MethodCacheKeyGenerator.java 72642 2014年12月16日 Lexing\zhaoqiang $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2014年12月16日		zhaoqiang		Initial.
 * 
 * </pre>
 */
public class MethodCacheKeyGenerator implements KeyGenerator
{
	public static final int NO_PARAM_KEY = 0;

	public static final int NULL_PARAM_KEY = 53;

	private int hashCode = 0;

	public Object generate(Object target, Method method, Object... params)
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append(target.getClass().getName()).append(".");
		buffer.append(method.getName()).append(".");
		if (params.length > 0)
		{
			for (Object each : params)
			{
				if (each != null)
				{
					if (each instanceof Boolean || each instanceof Character || each instanceof Void
							|| each instanceof Short || each instanceof Byte || each instanceof Double
							|| each instanceof Float || each instanceof Integer || each instanceof Long)
					{
						buffer.append(each.hashCode());
					}
					else if (each instanceof Object[])
					{
						// buffer.append(Arrays.hashCode((Object[]) each)); // 后面会说到可替换Arrays.deepHashCode
						buffer.append(Arrays.deepHashCode((Object[]) each)); // Arrays.deepHashCode多次运行生成的hashcode一致
					}
					else if (each instanceof HttpServletRequest || each instanceof HttpServletResponse)
					{
						continue; // 因为参数若有request、response之类，每次请求都变，就要在keyGenerator里做过滤了。
					}
					else if (each instanceof PageBeanDto)
					{
						buffer.append(((PageBeanDto) each).hashCode());
					}
					else
					{
						buffer.append(each.hashCode()); // list,map,set其内的元素类型一直才好,使用泛型
					}
				}
				else
				{
					buffer.append(NO_PARAM_KEY);
				}
			}
		}
		else
		{
			buffer.append(NO_PARAM_KEY);
		}
		hashCode = buffer.toString().hashCode();
		return hashCode;
	}

	public String toString()
	{
		return "MethodCacheKey [" + this.hashCode + "]";
	}
}

/*
 * $Log: av-env.bat,v $
 */