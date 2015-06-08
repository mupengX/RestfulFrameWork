package com.tk.framework.cache;


/**    
 *  TK Automation
 * @File:CacheHelper.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:07:45>>, <<TK>>, <<Create>>      
 */ 
public class CacheHelper
{
	private static final String NULL_KEY = "NULL.";

	private static final String SPLIT_CHAR = "/";

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @param key2
	 * @param key3
	 * @param key4
	 * @param key5
	 * @param key6
	 * @return
	 */
	public static Object generateKey(Object key1, Object key2, Object key3, Object key4, Object key5, Object key6)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		if (key1 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key1).append(SPLIT_CHAR);
		}
		if (key2 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key2).append(SPLIT_CHAR);
		}
		if (key3 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key3).append(SPLIT_CHAR);
		}
		if (key4 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key4).append(SPLIT_CHAR);
		}
		if (key5 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key5).append(SPLIT_CHAR);
		}
		if (key6 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key6);
		}
		return keyBuff.toString();
	}

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @param key2
	 * @param key3
	 * @param key4
	 * @param key5
	 * @return
	 */
	public static Object generateKey(Object key1, Object key2, Object key3, Object key4, Object key5)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		if (key1 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key1).append(SPLIT_CHAR);
		}
		if (key2 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key2).append(SPLIT_CHAR);
		}
		if (key3 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key3).append(SPLIT_CHAR);
		}
		if (key4 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key4).append(SPLIT_CHAR);
		}
		if (key5 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key5);
		}
		return keyBuff.toString();
	}

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @param key2
	 * @param key3
	 * @param key4
	 * @return
	 */
	public static Object generateKey(Object key1, Object key2, Object key3, Object key4)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		if (key1 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key1).append(SPLIT_CHAR);
		}
		if (key2 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key2).append(SPLIT_CHAR);
		}
		if (key3 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key3).append(SPLIT_CHAR);
		}
		if (key4 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key4);
		}
		return keyBuff.toString();
	}

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @param key2
	 * @param key3
	 * @return
	 */
	public static Object generateKey(Object key1, Object key2, Object key3)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		if (key1 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key1).append(SPLIT_CHAR);
		}
		if (key2 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key2).append(SPLIT_CHAR);
		}
		if (key3 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key3);
		}
		return keyBuff.toString();
	}

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @param key2
	 * @return
	 */
	public static Object generateKey(Object key1, Object key2)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		if (key1 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key1).append(SPLIT_CHAR);
		}
		if (key2 == null)
		{
			keyBuff.append(NULL_KEY);
		}
		else
		{
			keyBuff.append(key2);
		}
		return keyBuff.toString();
	}

	/**
	 * Generate key to support tree-like cache
	 * 
	 * @param key1
	 * @return
	 */
	public static Object generateKey(Object key1)
	{
		return key1;
	}

	public static Object generateKey(Object[] keys)
	{
		StringBuilder keyBuff = new StringBuilder(100);
		for (int i = 0; i < keys.length; i++)
		{
			if (keys[i] == null)
			{
				keyBuff.append(NULL_KEY);
			}
			else
			{
				keyBuff.append(keys[i]).append(SPLIT_CHAR);
			}
		}
		return keyBuff.toString();
	}

	/**
	 * Return class new instance with class name
	 * 
	 * @param className Class name
	 * @return
	 */
	public static Object getClassInstance(final String className)
	{
		if (className == null || className.length() == 0)
		{
			return null;
		}
		try
		{
			return loadClass(className).newInstance();
		}
		catch (IllegalAccessException e)
		{
			throw new Error(className + " class Illegal access error", e);
		}
		catch (InstantiationException e)
		{
			throw new Error(className + " class instantiation error", e);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			throw new Error(className + " class instantiation error", e);
		}

	}

	/**
	 * Return class new instance with class name
	 * 
	 * @param className The class name
	 * @return
	 */
	private static Class loadClass(String className)
	{
		Class clazz = null;
		try
		{
			// Look up the class loader to be used
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			if (classLoader == null)
			{
				classLoader = CacheHelper.class.getClassLoader();
			}
			clazz = classLoader.loadClass(className);
			return clazz;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			throw new Error(className + " class not found", e);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			throw new Error(className + " class not found", e);
		}
	}

}
/*
 * $Log: CacheHelper.java,v $
 */