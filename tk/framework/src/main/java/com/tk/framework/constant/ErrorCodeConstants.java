package com.tk.framework.constant;

/**
 * <pre> 
 *  
 *  File: ErrorCodeConstants.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 错误业务代码常量
 *  TODO
 * 
 *  Notes:
 *  $Id: ErrorCodeConstants.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:25:32>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ErrorCodeConstants
{
	 public static final String FID_AUTH_FAILD_401 = "fid_unauthorized";
	 public static final String NO_PERMISSON_401 = "no_permission";
	 public static final String BAD_REQUEST_400 = "bad_request";
     public static final String DATA_VALIDATION_ERROR_400 = "data_validation_error";
     public static final String INVALID_URI_400 = "invalid_uri";
     public static final String RECORD_HAS_EXISTED_400 = "record_has_existed";
     public static final String UNAUTHORIZED_401 = "unauthorized";
     public static final String EDMS_SERVER_UNAVAILABLE_401 = "edms_server_unavailable";
     public static final String NO_TOKEN_401 = "no_token";
     public static final String TOKEN_EXPIRED_401 = "token_expired";
     public static final String USER_LOCKED_401 = "user_account_locked";
     public static final String INVALID_PASSWORD_401 = "invalid_userid_or_password";
     public static final String USER_ACCOUNT_UNAVAILABLE_401 = "user_account_unavailable";
     public static final String USER_ACCOUNT_NO_MAPPING_401 = "user_account_no_aa_mapping";
     public static final String USER_ACCOUNT_NOT_EXIST_401 = "user_account_not_exist";
     public static final String USER_ACCOUNT_NOT_ACTIVE_401 = "user_account_inactive";
     public static final String USER_ACCOUNT_DISABLED_401 = "user_account_disabled";
     public static final String FORBIDDEN_403 = "forbidden";
     public static final String NOT_FOUND_404 = "resource_not_found";
     public static final String INTERNAL_SERVER_ERROR_500 = "internal_server_error";
     public static final String EMSE_500 = "emse_error";
     public static final String CONFIGURATION_ERROR_500 = "configuration_error";
     public static final String DUPLICATE_409 = "duplicate_data";
     public static final String OPERATE_PART_SUCCESS_206 = "partial_success";
}

/*
*$Log: av-env.bat,v $
*/