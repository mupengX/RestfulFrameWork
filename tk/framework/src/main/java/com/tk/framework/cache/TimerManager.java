package com.tk.framework.cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**    
 *  TK Automation
 * @File:TimerManager.java
 * @author TK  
 * @Description: 
 * <关于这个类的基本作用>
 * @Notes:
 * <一些特别的描述的信息>
 * @Revision History:
 * <<2014年12月16日下午4:09:05>>, <<TK>>, <<Create>>      
 */ 
public class TimerManager extends TimerTask
{
	/**
	 * Logger object.
	 */
	private static final Logger logger = LoggerFactory.getLogger(TimerManager.class);

	/**
	 * True if the cache-clearing thread should keep running.
	 */
	private boolean isActive = true;

	/**
	 * The cache timeout (in milliseconds).
	 */
	private long timeout;

	/**
	 * All cache which interval is the same.
	 */
	private Map<String, ObjectCache> cacheList = new HashMap<String, ObjectCache>(50);

	/**
	 * Construct timer manager to see if the cache is timeout.
	 * 
	 * @param interval time interval
	 */
	public TimerManager(String interval)
	{
		try
		{
			timeout = Long.parseLong(interval) * 1000;
			java.util.Timer timer = new java.util.Timer();

			timer.schedule(this, 100, timeout);
		}
		catch (NumberFormatException nfe)
		{
			nfe.printStackTrace();
		}
	}

	/**
	 * Register cache to current timer manager.
	 * 
	 * @param cache Timer cache
	 */
	public synchronized void registerCache(ObjectCache cache)
	{
		cacheList.put(cache.getCacheName(), cache);
	}

	/**
	 * Register cache to current timer manager.
	 * 
	 * @param cache Timer cache
	 */
	public synchronized void unRegisterCache(ObjectCache cache)
	{
		cacheList.remove(cache.getCacheName());
	}

	/**
	 * Called to stop the timer thread. This should only be called once and the cache should not be used afterwards.
	 */

	public synchronized void stop()
	{
		isActive = false;
		cancel();
	}

	/**
	 * 
	 */
	public void run()
	{
		if (isActive)
		{
			 System.out.println("active");
			refreshCache();
		}
		else
		{
			 System.out.println("no active");
		}
	}

	/**
	 * 
	 *
	 */
	private synchronized void refreshCache()
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("Refresh cache timeout");
		}
		
		System.out.println("Refresh cache timeout");
		if (cacheList.size() == 0)
		{
			return;
		}
		Iterator iter = cacheList.values().iterator();
		while (iter.hasNext())
		{
			Object obj = iter.next();
			// Cache is timeout
			ObjectCache oc = (ObjectCache) obj;
			//Only clean local machine's cache, don't notify other server for cleaning cache.
			oc.cleanWithNoEvent();
			if (logger.isDebugEnabled())
			{
				logger.debug("clear cache: " + oc.getCacheName());
			}
		}
	}

	public static void main(String[] argc) throws Exception
	{
		TimerManager timer = new TimerManager("5");
		System.out.println("end timer:" + timer);
		// timer.cancel();
		// timer.stop();
		// timer.cancel();
	}
}
/*
 * $Log: TimerManager.java,v $
 */