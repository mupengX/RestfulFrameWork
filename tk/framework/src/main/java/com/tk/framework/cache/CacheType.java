package com.tk.framework.cache;

/**
 * <pre> 
 *  
 *  File: CacheType.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: CacheType.java  2014-12-24 23:59:59Z \mupeng $ 
 * 
 * @Revision History:
 * <<2015年5月26日下午2:36:20>>, <<Who>>, <<what>>  
 *  2015年5月26日		mupeng		Initial.
 * </pre>
 */
public enum CacheType {
	SESSION(0), AGENCYINFO(1), SERVICETYPE(2), SERVICEINFO(3), RESOURCES(4);

	private int value;

	private CacheType(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	
	public static CacheType getCacheType(int V) {
		CacheType type = null;
		for (CacheType cacheType : values()) {
			if (cacheType.value == V) {
				type = cacheType;
				break;
			}
		}
		return type;
	}

	public static CacheType getCacheType(String key) {
		CacheType type = null;
		for (CacheType cacheType : values()) {
			if (key.equals(cacheType.toString())) {
				type = cacheType;
				break;
			}
		}
		return type;
	}
}

/*
 * Location:
 * C:\work\WorkSpaces\Redis-Api\apis\WEB-INF\lib\framework-0.0.1-SNAPSHOT.jar
 * Qualified Name: com.tk.framework.cache.CacheType JD-Core Version: 0.6.2
 */