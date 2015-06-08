package com.tk.framework.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


/**    
 *  TK Automation
 * @File:LRUHashMap.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:08:24>>, <<TK>>, <<Create>>      
 */ 
public class LRUHashMap<K,V> implements ObjectCache<K, V>
{

	/**
	 * Serial versoin ID
	 */
	private static final long serialVersionUID = 852672286186015492L;

	/**
	 * Maximum allowed size of the cache.
	 */
	protected int maxSize = 1000;

	private float hashTableLoadFactor = 0.75f;

	/**
	 * This hashtable stores all the items, and does all the searching.
	 */
	protected LinkedHashMap<K, V> myCache;

	/**
	 * Cache name by default.
	 */
	protected String cacheName = "defaultCache";

	/**
	 * When clear action is performed, hook will be triggered.
	 */
	// private CacheHookable clearHook;

	/**
	 * Cache is enabled (or disabled)
	 */
	private boolean bEnable = true;

	/**
	 * Constructs a new, empty <code>LRUHashMap</code> with the given initial capacity and the given load factor.
	 * 
	 * @param cacheSize the maximum number of entries that will be kept in this cache
	 * 
	 */
	public LRUHashMap(int cacheSize)
	{
		maxSize = cacheSize;
		int hashTableCapacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;
		myCache = new LinkedHashMap<K, V>(hashTableCapacity, hashTableLoadFactor, true)
		{
			// (an anonymous inner class)
			private static final long serialVersionUID = 1;

			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
			{
				return size() > LRUHashMap.this.maxSize;
			}
		};
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
//		if (logger.isInfoEnabled())
//		{
//			logger.info(toString());
//			logger.info("Cache enable=" + bEnable);
//		}
	}

	/**
	 * Get cache name
	 */
	public String getCacheName()
	{
		return cacheName;
	}

	/**
	 * Set cache name
	 * 
	 * @param name cache group name
	 */
	public void setCacheName(String name)
	{
		cacheName = name;
	}

	/**
	 * get distributed Level
	 */
	public int getDistributedLevel()
	{
		return DISTRIBUTED_LEVEL_EXPIRING_NOTIFICATION;
	}

	/**
	 * return cache type
	 */
	public int getCacheType()
	{
		return CACHE_TYPE_LRUMAP;
	}

	/**
	 * Return cache max size
	 * 
	 * @return
	 */
	public int getMaxSize()
	{
		return this.maxSize;
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
	 * Returns the number of key-value mappings in this map. <strong>Note:</strong>
	 * <em>In contrast with most implementations of the
	 * <code>Map</code> interface, the time required by this operation is
	 * linear in the size of the map.</em>
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
	 * Returns <code>true</code> if this map contains no key-value mappings.
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
	 * Returns <code>true</code> if this map contains a mapping for the specified key.
	 * 
	 * @param key The key whose presence in this map is to be tested
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
	 * Returns <code>true</code> if this map contains a mapping for the specified value.
	 * 
	 * @param value The value whose presence in this map is to be tested
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
	 * Returns all values
	 * 
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
	 * Copies all of the mappings from the specified map to this map (optional operation). These mappings will replace
	 * any mappings that this map had for any of the keys currently in the specified map.
	 * <p>
	 * 
	 * This implementation iterates over the specified map's <tt>entrySet()</tt> collection, and calls this map's
	 * <tt>put</tt> operation once for each entry returned by the iteration.
	 * <p>
	 * 
	 * Note that this implementation throws an <tt>UnsupportedOperationException</tt> if this map does not support the
	 * <tt>put</tt> operation and the specified map is nonempty.
	 * 
	 * @param values mappings to be stored in this map.
	 * 
	 */
	public synchronized void putAll(Map<? extends K, ? extends V> values)
	{
		if (bEnable)
		{
			myCache.putAll(values);
		}
	}

	/**
	 * Entry set for cache
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
	 * Return key set of cache.
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
	 * Get value by key
	 * 
	 * @param key the key of the key/value pair
	 */
	public synchronized V get(Object key)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.get(key);
		}
		return result;
	}

	/**
	 * Remove object by key
	 * 
	 * @param key the key of the key/value pair
	 */
	public synchronized V remove(Object key)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.remove(key);
		}
		return result;
	}

	/**
	 * Put key/value pair to cache
	 * 
	 * @param key The key of the key/value pair
	 * @param value The value of the key/value pair
	 */
	public synchronized V put(K key, V value)
	{
		V result = null;
		if (bEnable)
		{
			result = myCache.put(key, value);
		}
		return result;
	}

	/**
	 * Returns a <code>Collection</code> that contains a copy of all cache entries.
	 * 
	 * @return a <code>Collection</code> with a copy of the cache content.
	 */
	public synchronized Collection<Map.Entry<K, V>> getAll()
	{
		return new ArrayList<Map.Entry<K, V>>(entrySet());
	}

	/**
	 * Clear cache content.
	 */
	public void cleanWithNoEvent()
	{
		if (bEnable)
		{
			myCache.clear();
		}
	}

	/**
	 * clear all value from cache, don't triggered any hook.
	 */
	/*
	 * public void clearNoHook() { clear(); }
	 */

	/**
	 * Display cache information.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<cache>");
		sb.append("LRU:");
		sb.append(getCacheName());
		sb.append(" size:").append(myCache.size());
		sb.append(" maxSize:").append(maxSize);
		sb.append("</cache>");
		return sb.toString();
	}

	/**
	 * 
	 * @param args parameter
	 */
	public static void main(String[] args)
	{
		LRUHashMap<String, String> c = new LRUHashMap<String, String>(3);
		c.put("1", "one"); // 1
		c.put("2", "two"); // 2 1
		c.put("3", "three"); // 3 2 1
		c.put("4", "four"); // 4 3 2
		if (c.get("2") == null)
			throw new Error(); // 2 4 3
		c.put("5", "five"); // 5 2 4
		c.put("4", "second four"); // 4 5 2
		// Verify cache content.
		if (c.size() != 3)
			throw new Error();
		if (!c.get("4").equals("second four"))
			throw new Error();
		if (!c.get("5").equals("five"))
			throw new Error();
		if (!c.get("2").equals("two"))
			throw new Error();
		// List cache content.
		for (Map.Entry<String, String> e : c.getAll())
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println(c.toString());
	}

	public void clear()
	{
		// TODO Auto-generated method stub
		
	}



}

/*
*$Log: av-env.bat,v $
*/