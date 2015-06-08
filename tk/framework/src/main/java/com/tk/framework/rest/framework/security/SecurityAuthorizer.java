package com.tk.framework.rest.framework.security;


/**
 * <pre> 
 *  
 *  File: SecurityAuthorizer.java
 *  
 *  Copyright (C): 2014
 *  Description: 权限判断接口
 *  TODO
 * 
 *  Notes:
 *  $Id: SecurityAuthorizer.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:34:00>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface SecurityAuthorizer
{

	/**
	 * Checks if is operation allowed.
	 * 
	 * @param operation the operation
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is operation allowed
	 */
	public boolean isOperationAllowed(String operation, String callerId, Object resource);

	/**
	 * Checks if is list allowed.
	 * 
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is list allowed
	 */
	public boolean isListAllowed(String callerId, Object resource);

	/**
	 * Checks if is gets the allowed.
	 * 
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is gets the allowed
	 */
	public boolean isGetAllowed(String callerId, Object resource);

	/**
	 * Checks if is creates the allowed.
	 * 
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is creates the allowed
	 */
	public boolean isCreateAllowed(String callerId, Object resource);

	/**
	 * Checks if is update allowed.
	 * 
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is update allowed
	 */
	public boolean isUpdateAllowed(String callerId, Object resource);

	/**
	 * Checks if is delete allowed.
	 * 
	 * @param callerId the caller id
	 * @param resource the resource
	 * 
	 * @return true, if is delete allowed
	 */
	public boolean isDeleteAllowed(String callerId, Object resource);

}
