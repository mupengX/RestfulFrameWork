package com.tk.framework.cache;

import java.io.Serializable;
import java.util.Map;

/**    
 *  TK Automation
 * @File:ObjectCache.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:08:33>>, <<TK>>, <<Create>>      
 */ 
public interface ObjectCache<K, V> extends Map<K, V>, Serializable
{
	/**
	 * constant for distributed level.
	 */
	int DISTRIBUTED_LEVEL_EXPIRING_NOTIFICATION = 0;

	/**
	 * constant for distributed level.
	 */
	int DISTRIBUTED_LEVEL_REPLICATION = 1;

	/**
	 * cache type for WeakHashMap.
	 */
	int CACHE_TYPE_WEAKHASHMAP = 0;

	/**
	 * cache type for LRUMap.
	 */
	int CACHE_TYPE_LRUMAP = 1;

	/**
	 * cache type for SoftHashMap.
	 */
	int CACHE_TYPE_SOFTHASHMAP = 2;

	/**
	 * cache type for HashMap.
	 */
	int CACHE_TYPE_HASHMAP = 3;

	/**
	 * cache type for DiskMap.
	 */
	int CACHE_TYPE_DISK = 4;

	/**
	 * Return Cache Name.
	 * 
	 * @return cache name
	 */
	String getCacheName();

	/**
	 * Set cache name.
	 * 
	 * @param name cache group name
	 */
	void setCacheName(String name);

	/**
	 * 
	 * @return DistributedLevel
	 */
	int getDistributedLevel();

	/**
	 * Gets the type of cache.
	 * 
	 * @return cache type
	 */
	int getCacheType();

	/**
	 * Clear all value from cache, don't triggered any hook. It can be used in monitor thread.
	 */
	// void clearNoHook();
	/**
	 * Checks to see if this cache is enabled
	 * 
	 * @return cache status (enabled or disabled)
	 */
	boolean isEnabled();

	/**
	 * Enables or disables cache
	 */
	public void setEnable(boolean bEnable);
	
	
	/**
	 * Clean with no event.
	 */
	public void cleanWithNoEvent();
}

/*
*$Log: av-env.bat,v $
*/