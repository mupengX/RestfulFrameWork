package com.tk.framework.rest.framework.exceptions;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * <pre> 
 *  
 *  File: RestErrorResolver.java
 *  
 *  Copyright (C): 2014
 *  Description: rest错误处理类
 *  TODO
 * 
 *  Notes:
 *  $Id: RestErrorResolver.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:28:25>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface RestErrorResolver {

    /**
     * Returns a {@code RestError} instance to render as the response body based on the given exception.
     *
     * @param request current {@link ServletWebRequest} that can be used to obtain the source request/response pair.
     * @param handler the executed handler, or <code>null</code> if none chosen at the time of the exception
     *                (for example, if multipart resolution failed)
     * @param ex      the exception that was thrown during handler execution
     * @return a resolved {@code RestError} instance to render as the response body or <code>null</code> for default
     *         processing
     */
    RestError resolveError(ServletWebRequest request, Object handler, Exception ex);
}
