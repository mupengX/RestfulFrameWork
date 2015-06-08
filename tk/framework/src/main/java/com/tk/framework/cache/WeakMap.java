package com.tk.framework.cache;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**    
 *  TK Automation
 * @File:WeakMap.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:09:17>>, <<TK>>, <<Create>>      
 */ 
public class WeakMap<K, V>   implements ObjectCache<K, V>
{
	private static final Logger logger = LoggerFactory.getLogger(WeakMap.class);

	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = -5344939878533418974L;

	/**
	 * This hashtable stores all the items, and does all the searching.
	 */
	protected Map<K, V> myCache;

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
	 * Cache hit count tracking
	 */
	private int iHits = 0;

	private int iRequests = 0;

	/**
	 * Constructs a new, empty <code>WeakMap</code> with the given initial capacity and the given load factor.
	 * 
	 * @param initialCapacity The initial capacity of the <code>WeakMap</code>
	 * 
	 * @param loadFactor The load factor of the <code>SoftHashMap</code>
	 * 
	 */
	public WeakMap(int initialCapacity, float loadFactor)
	{
		myCache = new WeakHashMap<K, V>(initialCapacity, loadFactor);
	}

	/**
	 * Constructs a new, empty <code>WeakMap</code> with the given initial capacity and the default load factor, which
	 * is <code>0.75</code>.
	 * 
	 * @param initialCapacity The initial capacity of the <code>SoftHashMap</code>
	 * 
	 */
	public WeakMap(int initialCapacity)
	{
		myCache = new WeakHashMap<K, V>(initialCapacity);
	}

	/**
	 * Constructs a new, empty <code>WeakMap</code> with the default initial capacity and the default load factor, which
	 * is <code>0.75</code>.
	 */
	public WeakMap()
	{
		myCache = new WeakHashMap<K, V>();
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
		logger.info(this.toString());
		logger.info("Cache enable=" + bEnable);
	}

	/**
	 * Return cache name
	 */
	public String getCacheName()
	{
		return cacheName;
	}

	/**
	 * Set cache name
	 * 
	 * @param name cache name
	 */
	public void setCacheName(String name)
	{
		cacheName = name;
	}

	/**
	 * 
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
		return CACHE_TYPE_WEAKHASHMAP;
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
		incrHits(result);
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
	 * Entry set for cache.
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
	 * Key set for cache
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
	 * Return value by key
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
		incrHits(result != null);
		return result;
	}

	/**
	 * Remove value by key
	 * 
	 * @param key The key of the key/value pair in Map
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
	 * @param key The key of the key/value pair in Map
	 * @param value The value of the key/value pair in Map
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
	 * Clear cache content
	 */
	public void cleanWithNoEvent()
	{
		if (bEnable)
		{
			myCache.clear();
		}
		iHits = 0;
		iRequests = 0;
	}

	/**
	 * clear all value from cache, don't triggered any hook.
	 */
	/*
	 * public void clearNoHook() { clear(); }
	 */

	/**
	 * Increment the hit ratio
	 * 
	 * @param boolean got a cache hit or not.
	 * @return void
	 */
	private void incrHits(boolean bHit)
	{
		if (bHit)
		{
			iHits++;
		}
		iRequests++;
		if (iRequests % 1000 == 0)
		{
			// log a current hit ratio for this cache (in percent)
			logger.info(this.toString());
		}
		if (iRequests == Integer.MAX_VALUE)
		{
			iRequests = 0;
			iHits = 0;
		}
	}

	/**
	 * 
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		int iHitRatio = 0;
		if (iRequests != 0)
		{
			iHitRatio = iHits * 100 / iRequests;
		}
		sb.append("<cache>");
		sb.append("<type>WeakMap</type>");
		sb.append("<name>").append(getCacheName()).append("</name>");
		sb.append("<size>").append(myCache.size()).append("</size>");
		sb.append("<stats");
		sb.append("hits=\"");
		sb.append(iHits);
		sb.append("\" requests=\"");
		sb.append(iRequests);
		sb.append("\" hitratio=\"");
		sb.append(iHitRatio);
		sb.append("\" /></cache>");
		return sb.toString();
	}

	/**
	 * 
	 * 
	 */
	public void print()
	{
		StringBuilder buf = new StringBuilder();
		buf.append("LRU ");
		buf.append(size());
		Set st = myCache.keySet();
		if (st != null)
		{
			Iterator iter = st.iterator();
			while (iter.hasNext())
			{
				buf.append("," + iter.next());
			}
		}
		System.out.println(buf.toString());
		buf = new StringBuilder("      values:");
		Collection coll = values();
		if (coll != null)
		{
			Iterator iter = coll.iterator();
			while (iter.hasNext())
			{
				buf.append("," + iter.next());
			}
		}
		System.out.println(buf.toString());
	}

	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	

}
/*
 * $Log: WeakMap.java,v $Revision 1.5 2007/03/13 22:20:37 vcrandallCleanup of Caches for 6.3.2..... added ability to
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