package com.tk.framework.cache;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


/**    
 *  TK Automation
 * @File:TimerCache.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:08:56>>, <<TK>>, <<Create>>      
 */ 
public class TimerCache<K, V> implements ObjectCache<K, V>, Timeoutable
{

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = -4164053608773277455L;

	/**
	 * This hashtable stores all the items, and does all the searching.
	 */
	protected ObjectCache<K, V> myCache;

	/**
	 * Last modified time
	 */
	protected long lastModifiedTime = System.currentTimeMillis();

	/**
	 * Wrapped a ObjectCache
	 * 
	 * @param cache The original cache object support timer.
	 */
	public TimerCache(ObjectCache<K, V> cache)
	{
		myCache = cache;
	}

	/**
	 * Checks to see if this cache is enabled
	 * 
	 * @return cache status (enabled or disabled)
	 */
	public boolean isEnabled()
	{
		return myCache.isEnabled();
	}

	/**
	 * Enables or disables cache
	 */
	public void setEnable(boolean bEnable)
	{
		myCache.setEnable(bEnable);
	}

	/**
	 * Get cache name
	 */
	public String getCacheName()
	{
		return myCache.getCacheName();
	}

	/**
	 * Set cache name
	 * 
	 * @param name Cache group name
	 */
	public void setCacheName(String name)
	{
		myCache.setCacheName(name);
	}

	/**
	 * getDistributedLevel
	 */
	public int getDistributedLevel()
	{
		return myCache.getDistributedLevel();
	}

	/**
	 * Return original cache.
	 * 
	 * @return
	 */
	public ObjectCache getOriginalCache()
	{
		return this.myCache;
	}

	/**
	 * Get cache type
	 */
	public int getCacheType()
	{
		return myCache.getCacheType();
	}

	/**
	 * Cache size
	 */
	public int size()
	{
		return myCache.size();
	}

	/**
	 * Clear cache
	 */
	public void cleanWithNoEvent()
	{
		myCache.cleanWithNoEvent();
	}
	
	
	/**
	 * clear all value from cache, don't triggered any hook.
	 */
	/*
	 * public void clearNoHook() { myCache.clear(); }
	 */
	/**
	 * Returns <code>true</code> if this map contains no key-value mappings.
	 */
	public boolean isEmpty()
	{
		return myCache.isEmpty();
	}

	/**
	 * Returns <code>true</code> if this map contains a mapping for the specified key.
	 * 
	 * @param key The key whose presence in this map is to be tested
	 */
	public boolean containsKey(Object key)
	{
		return myCache.containsKey(key);
	}

	/**
	 * Returns <code>true</code> if this map contains a mapping for the specified value.
	 * 
	 * @param value The value whose presence in this map is to be tested
	 */
	public boolean containsValue(Object value)
	{
		return myCache.containsValue(value);
	}

	/**
	 * Returns all values
	 * 
	 */
	public Collection<V> values()
	{
		return myCache.values();
	}

	/**
	 * Put the map to cache
	 * 
	 * @param values Key/value pair list
	 */
	public synchronized void putAll(Map<? extends K, ? extends V> values)
	{
		this.myCache.putAll(values);
	}

	/**
	 * Entry set
	 */
	public Set<Map.Entry<K, V>> entrySet()
	{
		return myCache.entrySet();
	}

	/**
	 * key set
	 */
	public Set<K> keySet()
	{
		return myCache.keySet();
	}

	/**
	 * Get value by key
	 * 
	 * @param key The key of the key/value pair
	 */
	public V get(Object key)
	{
		return myCache.get(key);
	}

	/**
	 * Remove a object from cache by key
	 * 
	 * @param key The key of the key/value pair
	 * @return
	 */
	public V remove(Object key)
	{
		lastModifiedTime = System.currentTimeMillis();
		return myCache.remove(key);
	}

	/**
	 * Put key/value pair to cache
	 * 
	 * @param key The key of the key/value pair
	 * @param value The value of the key/value pair
	 * @return
	 */
	public V put(K key, V value)
	{
		lastModifiedTime = System.currentTimeMillis();
		return myCache.put(key, value);
	}

	/**
	 * Return last modified time
	 * 
	 * @return
	 */
	public long getLastModifiedTime()
	{
		return lastModifiedTime;
	}

	/**
	 * Display cache information.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(" <TimerCache> ");
		sb.append(myCache.toString());
		sb.append(" </TimerCache> ");
		return sb.toString();
	}

	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	

}
/*
 * $Log: TimerCache.java,v $Revision 1.5 2007/03/13 22:20:37 vcrandallCleanup of Caches for 6.3.2..... added ability to
 * enable-disable cache and added hit ratio diagnostics.
 * 
 * Revision 1.5 2007/03/13 22:19:27 vcrandallCleanup of Caches for 6.3.2..... added ability to enable-disable cache and
 * added hit ratio diagnostics.
 * 
 * Revision 1.4 2007/02/16 22:54:30 vcrandallCleaned up comments because they broke the build.
 * 
 * Revision 1.3 2007/02/16 21:46:07 vcrandallAuthor: ACHIEVO/michael.maoRequirement ID:511Defect ID:389
 * Reviewer:michael.maoRemove Cluster Cache CodeAdd callback function to timer cache.Remove JGroup related codeComment
 * out clear cache hook related code
 * 
 * Author: ACHIEVO/anna.yuChange Description:update a special characterCacheModel
 */