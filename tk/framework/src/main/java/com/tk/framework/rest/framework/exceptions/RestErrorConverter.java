package com.tk.framework.rest.framework.exceptions;

import org.springframework.core.convert.converter.Converter;


/**
 * <pre> 
 *  
 *  File: RestErrorConverter.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: rest错误转换类
 *  TODO
 * 
 *  Notes:
 *  $Id: RestErrorConverter.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:28:02>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public interface RestErrorConverter<T> extends Converter<RestError, T> {

    /**
     * Converts the RestError instance into an object that will then be used by an
     * {@link org.springframework.http.converter.HttpMessageConverter HttpMessageConverter} to render the response body.
     *
     * @param re the {@code RestError} instance to convert to another object instance 'understood' by other registered
     *           {@code HttpMessageConverter} instances.
     * @return an object suited for HTTP response rendering by an {@code HttpMessageConverter}
     */
    T convert(RestError re);
}
