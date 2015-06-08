package com.tk.framework.cache;

import java.util.HashMap;
import java.util.Map;

import com.tk.framework.util.SystemProperties;


/**    
 *  TK Automation
 * @File:CacheConfig.java
 * @author TK  
 * @Description: 
 * 	Store cache config information.
 *   The cache may include the following parameters:
 *    1. type
 *       This is cache type. it may be:   
 *        1.1 LRUHASHMAP       LRU cache
 *        1.2 GENERICHASHMAP   HashMap cache 
 *        1.3 SOFTHASHMAP      SoftReference HashMap 
 *        1.4 WEAKMAP          WeakReference HashMap     
 *         
 *    2. max_size
 *       Only when the cache type is &quot;LRUHASHMAP&quot;, it will specify the LRU's max size.
 *           
 *    3. mode
 *      This is cluster mode. 
 *      If it is empty, it denote this is not a clustering cache.
 *      If it is not empty, it should be a clustering mode name. 
 *      The clustering mode will be configured in &quot;framework.cache_cluster&quot; section 
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:07:12>>, <<TK>>, <<Create>>      
 */ 
public class CacheConfig
{
	/**
	 * Cache type may be LRUHASHMAP,GENERICHASHMAP,SOFTHASHMAP.
	 */
	private static final String CACHE_TYPE = "type";

	/**
	 * LRU cache's max size.
	 */
	private static final String CACHE_MAX_SIZE = "max_size";

	/**
	 * it denote cache size by default.
	 */
	private static final String CACHE_INIT_SIZE = "init_size";

	/**
	 * If it was specified, it denote expiry time interval for the cached data.
	 */
	private static final String CACHE_TIMEOUT = "timeout";

	/**
	 * after clearing cache, callback hook will be invoked if it was specified.
	 */
	private static final String CACHE_CLEAR_HOOK = "clearhook";

	/**
	 * cache enabled. Defaults to true..
	 */
	private static final String CACHE_ENABLE = "enable";

	/**
	 * Config section prefix.
	 */
	private static final String CACHE_CONFIG_CONSTANT = "framework.cache.";

	/**
	 * Cache config by default.
	 */
	private static Map<String, String> defaultConfig = new HashMap<String, String>();

	/**
	 * Set the defualt cache type and parameter.
	 */
	static
	{
		defaultConfig.put("type", "GENERICHASHMAP");
		defaultConfig.put("init_size", "100");
	}

	/**
	 * Return specified cache's all attributes.
	 * 
	 * @param cacheName Cache group name
	 * @return attribute list
	 */
	public static Map getAttributes(String cacheName) throws Exception
	{
		if (cacheName == null || cacheName.length() == 0)
		{
			return defaultConfig;
		}

		Map<String, String> result = new HashMap<String, String>();
		String cacheNamePrefix = CACHE_CONFIG_CONSTANT + cacheName + ".";
		String val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_TYPE);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_TYPE, val);
		}
		val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_MAX_SIZE);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_MAX_SIZE, val);
		}
		val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_INIT_SIZE);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_INIT_SIZE, val);
		}

		val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_TIMEOUT);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_TIMEOUT, val);
		}

		val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_CLEAR_HOOK);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_CLEAR_HOOK, val);
		}

		val = SystemProperties.getPropertyValue(cacheNamePrefix + CACHE_ENABLE);
		if (val != null && val.length() > 0)
		{
			result.put(CACHE_ENABLE, val);
		}

		if (result == null || result.size() == 0)
		{
			return defaultConfig;
		}
		return result;
	}

}
/*
 * $Log: CacheConfig.java,v $Revision 1.2 2007/02/02 21:33:17 vcrandallChanged CachConfig to simplify complexity of
 * cluster cache configuration. Merged changes into AADBAccessor.
 */

