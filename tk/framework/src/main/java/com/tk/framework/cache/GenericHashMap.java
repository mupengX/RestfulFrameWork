package com.tk.framework.cache;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**    
 *  TK Automation
 * @File:GenericHashMap.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:07:56>>, <<TK>>, <<Create>>      
 */ 
public class GenericHashMap<K, V>  implements ObjectCache<K, V>
{
	/**
	 * Serial version ID.
	 */
	private static final long serialVersionUID = -509164748016930150L;

	/**
	 * This hashtable stores all the items, and does all the searching.
	 */
	private Map<K, V> myCache;

	/**
	 * Cache name by default.
	 */
	private String cacheName = "defaultCache";

	/**
	 * When clear action is performed, hook will be triggered.
	 */
	// private CacheHookable clearHook;
	/**
	 * Cache is enabled (or disabled)
	 */
	private boolean bEnable = true;

	/**
	 * Constructs a new, empty <code>GenericHashMap</code> with the given initial capacity and the given load factor.
	 * 
	 * @param initialCapacity The initial capacity of the <code>LRUHashMap</code>
	 * 
	 * @param loadFactor The load factor of the <code>LRUHashMap</code>
	 * 
	 */
	public GenericHashMap(int initialCapacity, float loadFactor)
	{
		myCache = Collections.synchronizedMap(new HashMap<K, V>(initialCapacity, loadFactor));
	}

	/**
	 * Constructs a new, empty <code>GenericHashMap</code> with the given initial capacity and the default load factor,
	 * which is <code>0.75</code>.
	 * 
	 * @param initialCapacity The initial capacity of the <code>LRUHashMap</code>
	 * 
	 */
	public GenericHashMap(int initialCapacity)
	{
		myCache = Collections.synchronizedMap(new HashMap<K, V>(initialCapacity));
	}

	/**
	 * Constructs a new, empty genericHashMap by default.
	 * 
	 */
	public GenericHashMap()
	{
		myCache = Collections.synchronizedMap(new HashMap<K, V>());
	}

	/**
	 * Checks to see if this cache is enabled
	 * 
	 * @return cache status (enabled or disabled)
	 */
	public boolean isEnabled()
	{
		return bEnable;
	}

	/**
	 * Enables or disables cache
	 */
	public void setEnable(boolean bEnable)
	{
		this.bEnable = bEnable;
	}

	/**
	 * Get cache name.
	 * 
	 * @return cache name
	 */
	public String getCacheName()
	{
		return cacheName;
	}

	/**
	 * Set cache name.
	 * 
	 * @param name cache name
	 */
	public void setCacheName(String name)
	{
		cacheName = name;
	}

	/**
	 * @return DISTRIBUTED_LEVEL_EXPIRING_NOTIFICATION
	 */
	public int getDistributedLevel()
	{
		return DISTRIBUTED_LEVEL_EXPIRING_NOTIFICATION;
	}

	/**
	 * Get cache type.
	 * 
	 * @return cache type
	 */
	public int getCacheType()
	{
		return CACHE_TYPE_HASHMAP;
	}

	/**
	 * Set clear hook.
	 * 
	 * @param hook timer hook
	 */
	/*
	 * public void setClearHook(String hook) { if (hook != null && hook.length() > 0) { Object obj =
	 * CacheHelper.getClassInstance(hook); if (!(obj instanceof CacheHookable)) { throw new Error(hook +
	 * " class must implement CacheHookable interface"); } this.clearHook = (CacheHookable) obj; } }
	 */

	/**
	 * cache size.
	 * 
	 * @return cache size
	 */
	public int size()
	{
		int result = 0;
		if (bEnable)
		{
			result = myCache.size();
		}
		return result;
	}

	/**
	 * Check to see if the cache is empty.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty()
	{
		boolean result = true;
		if (bEnable)
		{
			result = myCache.isEmpty();
		}
		return result;
	}

	/**
	 * Check to see if the key exist in cache.
	 * 
	 * @param key The key of the key/value pair
	 * @return boolean
	 */
	public boolean containsKey(Object key)
	{
		boolean result = false;
		if (bEnable)
		{
			result = myCache.containsKey(key);
		}
		return result;
	}

	/**
	 * if the cache contain the object as value.
	 * 
	 * @param value The value of the key/value pair
	 * @return boolean
	 */
	public boolean containsValue(Object value)
	{
		boolean result = false;
		if (bEnable)
		{
			result = myCache.containsValue(value);
		}
		return result;
	}

	/**
	 * get object by key from cache.
	 * 
	 * @param key The key of the key/value pair
	 * @return V
	 */
	public V get(Object key)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.get(key);
		}
		return result;
	}

	/**
	 * put the object to cache, its key is key.
	 * 
	 * @param key The key of the key/value pair
	 * @param value The value of the key/value pair
	 * @return V value
	 */
	public V put(K key, V value)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.put(key, value);
		}
		return result;
	}

	/**
	 * remove the object from cache by key.
	 * 
	 * @param key the key of the key/value pair
	 * @return V value
	 */
	public V remove(Object key)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.remove(key);
		}
		return result;
	}

	/**
	 * put map to cache.
	 * 
	 * @param values The key/value pair list
	 */
	public void putAll(Map<? extends K, ? extends V> values)
	{
		if (bEnable)
		{
			myCache.putAll(values);
		}
	}

	/**
	 * Return key set from cache.
	 * 
	 * @return set
	 */
	public Set<K> keySet()
	{
		Set<K> result = null;
		if (bEnable)
		{
			result = myCache.keySet();
		}
		return result;
	}

	/**
	 * Return value's collection from cache.
	 * 
	 * @return collection
	 */
	public Collection<V> values()
	{
		Collection<V> result = null;
		if (bEnable)
		{
			result = myCache.values();
		}
		return result;
	}

	/**
	 * @return set
	 */
	public Set<Map.Entry<K, V>> entrySet()
	{
		Set<Map.Entry<K, V>> result = null;
		if (bEnable)
		{
			result = myCache.entrySet();
		}
		return result;
	}

	/**
	 * clear all value from cache, don't triggered any hook.
	 */
	/*
	 * public void clearNoHook() { clear(); }
	 */

	/**
	 * clear all value from cache.
	 */
	public void cleanWithNoEvent()
	{
		if (bEnable)
		{
			myCache.clear();
		}
	}

	/**
	 * Display cache information.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<cache>");
		sb.append("Generic:");
		sb.append(getCacheName());
		sb.append(" size:").append(size());
		sb.append("</cache>");
		return sb.toString();
	}

	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	
}
/*
 * $Log: GenericHashMap.java,v $Revision 1.6 2007/04/19 15:24:43 vcrandallAuthor: ACHIEVO/michael.maoRequirement ID:387
 * Change Description:Add switch flag to disable cache.
 * 
 * Revision 1.5 2007/03/13 22:20:37 vcrandallCleanup of Caches for 6.3.2..... added ability to enable-disable cache and
 * added hit ratio diagnostics.
 * 
 * Revision 1.5 2007/03/13 22:19:27 vcrandallCleanup of Caches for 6.3.2..... added ability to enable-disable cache and
 * added hit ratio diagnostics.
 */