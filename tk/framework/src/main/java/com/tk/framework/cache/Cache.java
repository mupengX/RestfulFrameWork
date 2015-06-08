package com.tk.framework.cache;

public interface Cache<K, V> {
	public abstract void set(String paramString, V paramV) throws Exception;

	public abstract void expire(String paramString, Long paramLong) throws Exception;

	public abstract void setWithExpire(String paramString, V paramV, Long paramLong) throws Exception;

	public abstract V get(String paramString) throws Exception;

	public abstract void remove(String paramString) throws Exception;
}
