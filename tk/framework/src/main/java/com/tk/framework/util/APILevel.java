package com.tk.framework.util;

/**
 * <pre> 
 *  
 *  File: APILevel.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: REST API 调用级别
 *  TODO
 * 
 *  Notes:
 *  $Id: APILevel.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:45:22>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public enum APILevel
{
    PUBLIC(0),

    AGENCY(1),
    
    ALL(2),
    
    SUPERADMIN(3);
    
	/**
     * Field value
     */
    private int value;

    /**
     * Constructs ...
     *
     *
     * @param str Integer
     */
    private APILevel(int str)
    {
        this.value = str;
    }

    /**
     * Method getValue
     *
     *
     * @return Integer
     */
    public int getValue()
    {
        return value;
    }

    /**
     * toString
     *
     * @return String
     */
    public String toString()
    {
        String aPILevel = "";
        switch (this)
        {
            case PUBLIC :
            	aPILevel = "PUBLIC";
                break;

            case AGENCY :
            	aPILevel = "AGENCY";
                break;
            case ALL :
            	aPILevel = "ALL";
                break;
            case SUPERADMIN :
            	aPILevel = "SUPERADMIN";
                break;    
            default :
            	aPILevel = "";
        }

        return aPILevel;
    }

    public static APILevel getAPILevel(int str)
    {
    	APILevel aPILevel = null;
        for (APILevel ut : APILevel.values())
        {
            if (ut.value == str)
            {
            	aPILevel = ut;
                break;
            }
        }
        return aPILevel;
    }
}

/*
*$Log: av-env.bat,v $
*/