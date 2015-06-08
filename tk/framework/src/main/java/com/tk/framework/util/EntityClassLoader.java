package com.tk.framework.util;

/**
 * <pre> 
 *  
 *  File: EntityClassLoader.java
 *  
 *  Copyright (C): 2014
 *  Description: class加载工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: EntityClassLoader.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:49:33>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class EntityClassLoader extends ClassLoader {  
      
    private ClassLoader parent;  
      
    public EntityClassLoader(ClassLoader parent){  
        this.parent = parent;  
    }  
       
    @Override  
    public Class<?> loadClass(String name) throws ClassNotFoundException {  
        return this.loadClass(name, false);  
    }  
      
    @Override  
    protected synchronized Class<?> loadClass(String name, boolean resolve)  
            throws ClassNotFoundException {  
        Class<?> clazz = this.findLoadedClass(name);  
        if(null != parent){  
            clazz = parent.loadClass(name);  
        }    
        if(null == clazz){  
            this.findSystemClass(name);  
        }  
          
        if(null == clazz){  
            throw new ClassNotFoundException();  
        }  
        if(null != clazz && resolve){  
            this.resolveClass(clazz);  
        }  
          
        return clazz;  
    }  
      
      
      
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
  
    }  
  
}  

/*
*$Log: av-env.bat,v $
*/