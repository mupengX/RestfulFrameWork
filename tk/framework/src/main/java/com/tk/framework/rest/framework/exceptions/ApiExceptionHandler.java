package com.tk.framework.rest.framework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.tk.framework.exceptions.BusinessException;
import com.tk.framework.rest.framework.model.ResponseModel;
import com.tk.framework.rest.framework.util.ResponseHelper;


/**
 * <pre> 
 *  
 *  File: ApiExceptionHandler.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: api异常处理类
 *  TODO
 * 
 *  Notes:
 *  $Id: ApiExceptionHandler.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:23:40>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ApiExceptionHandler {

    @ExceptionHandler(UnknownResourceException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Resource not found.")
    @ResponseBody
    public ResponseModel handleUnknownResourceException(UnknownResourceException ex) {
       
    	return ResponseHelper.notFound(ex.getMessage());
    }
    
    @ExceptionHandler(RestException .class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = " Internal server error.")
    @ResponseBody
    public ResponseModel handleUnknownResourceException(RestException ex) {
       
    	return ResponseHelper.internal_server_error(ex.getMessage());
    }
    @ExceptionHandler(BusinessException .class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "Internal  server business exception.")
    @ResponseBody
    public ResponseModel handleBusinessException(BusinessException ex) {
        String code = ex.getCode();
    	return ResponseHelper.internal_biz_error(ex.getMessage(),code);
    }
}

/*
*$Log: av-env.bat,v $
*/