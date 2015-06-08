package com.tk.framework.cache;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**    
 *  TK Automation
 * @File:CacheFactory.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:07:35>>, <<TK>>, <<Create>>      
 */ 
public class CacheFactory<K,V>
{	
	private static final Logger logger = LoggerFactory.getLogger(CacheFactory.class);
	/**
	 * All cache objects.
	 */
	private static Map<String, ObjectCache> caches = new HashMap<String, ObjectCache>(30);
	
	/**
	 * All cache timer manager object.
	 */
	private static Map<String, TimerManager> timerManagers = new HashMap<String, TimerManager>(30);
	/**
	 * Single instance.
	 */
	private static CacheFactory singleInstance = new CacheFactory();

	/**
	 * 不允许开发人员实例化cacheFactory .
	 */
	private CacheFactory()
	{
		
	}
	
	public static CacheFactory getInstance()
	{
		return singleInstance;
	}
	/**
	 * Get ObjectCache, if it don't exist, new object will be generated.
	 * 
	 * @param name cache group name
	 * @return objectCache
	 */
	
	
	public ObjectCache getCache(String name) throws Exception
	{
		if (name == null || name.length() == 0)
		{
			name = "default";
		}
		ObjectCache cache = caches.get(name);
		if (cache != null)
		{
			return cache;
		}
		Map cacheConfig = CacheConfig.getAttributes(name);
		// String type = "LRUHASHMAP";
		// String max_size = "100";
		// String mode = "default";
		// String timeout = "100000";
		String type = (String) cacheConfig.get("type");
		String maxSize = (String) cacheConfig.get("max_size");
		String initSize = (String) cacheConfig.get("init_size");
		String timeout = (String) cacheConfig.get("timeout");
		String clearHook = (String) cacheConfig.get("clearhook");
		String enabled = (String) cacheConfig.get("enable");

		return singleInstance.getCache(name, type, maxSize, initSize, timeout, clearHook, enabled);
	}

	/**
	 * Get ObjectCache, if it don't exist, new object will be generated.
	 * 
	 * @param name cache name is unique.
	 * @param type cache type, it may be "GENERICHASHMAP", "LRUHASHMAP" "SOFTHASHMAP", "WEAKMAP"
	 * @param maxSize LRU(least recently used) CacheSize
	 * @param initSize Initial size
	 * @param clusterConfig Clustering config
	 * @param simpleSync cluster mode
	 * @param hook cluster sync hook
	 * @param timeout timeout config
	 * @param timerHook timer Hook will be triggered after the timer clear cache.
	 * @return objectCache
	 */
	public ObjectCache getCache(String name, String type, String maxSize, String initSize, String timeout,
			String clearHook, String sEnable)
	{
		if (name == null || name.length() == 0)
		{
			name = "default";
		}
		ObjectCache cache = caches.get(name);
		if (cache != null)
		{
			return cache;
		}
		if (type == null || type.length() == 0)
		{
			type = "GENERICHASHMAP";
		}
		int initialSize = 100;
		if (initSize != null && initSize.length() > 0)
		{
			initialSize = Integer.parseInt(initSize);
		}
		boolean bEnable = true;
		if ("false".equals(sEnable))
		{
			bEnable = false;
		}

		ObjectCache<K, V> localCache = null;
		if (type.equalsIgnoreCase("GENERICHASHMAP"))
		{
			localCache = new GenericHashMap<K, V>(initialSize);
		}
		else if (type.toUpperCase().equals("LRUHASHMAP"))
		{
			int lruCacheSize = 100;
			if (maxSize != null && maxSize.length() > 0)
			{
				lruCacheSize = Integer.parseInt(maxSize);
			}
			if (lruCacheSize <= 0)
			{
				lruCacheSize = 100;
			}
			LRUHashMap<K, V> localCache1 = new LRUHashMap<K, V>(lruCacheSize);
			localCache = localCache1;
		}
		else if (type.toUpperCase().equals("SOFTHASHMAP"))
		{
			// localCache = new SoftHashMap < K, V >(initialSize);
			localCache = new WeakMap<K, V>(initialSize);
		}
		else if (type.toUpperCase().equals("WEAKMAP"))
		{
			localCache = new WeakMap<K, V>(initialSize);
		}	
		
		localCache.setCacheName(name);
		localCache.setEnable(bEnable);

//		if (CacheConfig.isClusterEnable())
//		{
//			ClusterHashMap<K, V> cache1 = new ClusterHashMap<K, V>(localCache);
//			cache1.setClusterMode("true");
//			cache1.setTimerHook(clearHook);
//			String partitionName = CacheConfig.getPartitionName();
//			ClusterCacheManager clusterManager = (ClusterCacheManager) clusterManagers.get(partitionName);
//			if (clusterManager == null)
//			{
//				String properties = CacheConfig.getClusterConfig();
//				clusterManager = new ClusterCacheManager(properties, partitionName);
//			}
//			clusterManager.addCache(name, cache1);
//			clusterManagers.put(CacheConfig.getPartitionName(), clusterManager);
//			cache1.setNotificationManager(clusterManager);
//			caches.put(cache1.getCacheName(), cache1);
//			localCache = cache1;
//			if (timeout != null && timeout.length() > 0)
//			{
//				registerCache(timeout, localCache);
//			}
//		}
//		else
//		{
		if (timeout != null && timeout.length() > 0)
		{
			TimerCache<K, V> timerCache = new TimerCache<K, V>(localCache);
			registerCache(timeout, timerCache);
			localCache = timerCache;
		}
		

		caches.put(localCache.getCacheName(), localCache);
		if (logger.isInfoEnabled())
		{
			logger.info("Constructor:" + localCache.toString());
		}
		
		return localCache;
	}
	/**
	 * Register cache to timer manager.
	 * 
	 * @param interval interval time
	 * @param cache cache object
	 */
	private static void registerCache(String interval, ObjectCache cache)
	{
		TimerManager timer = (TimerManager) timerManagers.get(interval);
		if (timer == null)
		{
			timer = new TimerManager(interval);
			timerManagers.put(interval, timer);
		}
		timer.registerCache(cache);
	}

}

/*
 * $Log: av-env.bat,v $
 */