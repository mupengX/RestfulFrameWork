package com.tk.framework.rest.framework.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import com.tk.framework.constant.ErrorCode;
import com.tk.framework.constant.ErrorCodeConstants;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.rest.framework.model.MultipleObjectResultModel;
import com.tk.framework.rest.framework.model.ResponseModel;
import com.tk.framework.rest.framework.model.RestThreadLocal;
import com.tk.framework.util.ValidationUtil;

/**
 * <pre>
 *  
 *  File: ResponseHelper.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:Http Response工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: ResponseHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:36:25>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@SuppressWarnings("deprecation")
public class ResponseHelper
{

	private static final Logger logger = LoggerFactory.getLogger(ResponseHelper.class);

	public static ResponseModel notFound(String message)
	{

		ResponseModel response = new ResponseModel();

		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setCode(HttpStatus.NOT_FOUND.name());
		response.setMessage(message);

		return response;
	}

	public static ResponseModel internal_server_error(String message)
	{
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		responseModel.setCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		responseModel.setMessage(message);

		return responseModel;
	}

	public static ResponseModel internal_biz_error(String message, String code)
	{
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		responseModel.setCode(code);
		responseModel.setMessage(message);

		return responseModel;
	}

	/**
	 * Wrap response for validation failure.
	 * 
	 * @param message the message
	 * @return the response model
	 */
	public static ResponseModel validationFailure(String message)
	{
		ResponseModel response = new ResponseModel();

		response.setCode(ErrorCode.DATA_VALIDATION_ERROR.getCode() + "");
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		response.setMessage(message);
		response.setTraceId(RestThreadLocal.getTraceId());
		RestThreadLocal.clean();

		return response;
	}

	/**
	 * 更新请求成功后的返回结果 TODO.
	 * 
	 * @param result
	 * @return
	 */
	public static ResponseModel buildResponseModel(Object result)
	{
		ResponseModel response = new ResponseModel();
		response.setCode(HttpServletResponse.SC_OK + "");
		response.setMessage("success");
		response.setStatus(HttpServletResponse.SC_OK);
		response.setResult(result);
		response.setTraceId(RestThreadLocal.getTraceId());
		RestThreadLocal.clean();
		return response;

	}

	public static ResponseModel buildResponseModel(Object id, Class<?> resultType, String callerID, Object code,
			String message)
	{
		ResponseModel response = new ResponseModel();
		response.setCode(code.toString());
		response.setMessage(message);
		response.setResult(id);
		response.setTraceId(RestThreadLocal.getTraceId());
		RestThreadLocal.clean();
		return response;
	}

	/**
	 * 
	 * 构造添加删除方法使用到的返回结果
	 * 
	 * @param response ResponseModel
	 * @param result the result model;
	 * @param isSearchSubResourc the flag determine whether the operation is search subResource
	 * @param qf the query format.
	 */
	@SuppressWarnings("rawtypes")
	public static ResponseModel buildResponseModel(Object result, Class<?> resultType)
	{
		ResponseModel response = new ResponseModel();

		if (result instanceof List && resultType == MultipleObjectResultModel.class)
		{
			if (!ValidationUtil.isEmpty(result))
			{
				try
				{
					List resultList = (List) result;
					int failedCount = 0;

					for (int i = 0; i < resultList.size(); i++)
					{
						try
						{
							MultipleObjectResultModel multipleObjectResultModel = (MultipleObjectResultModel) resultList
									.get(i);
							if (!ValidationUtil.isEmpty(multipleObjectResultModel)
									&& !ValidationUtil.isEmpty(multipleObjectResultModel.getIsSuccess())
									&& !multipleObjectResultModel.getIsSuccess())
							{
								failedCount++;
							}

						}
						catch (Exception e)
						{
							logger.error("BuildResponseModel failed : object in result can not convert to MultipleObjectResultModel");
							logger.error(e.getMessage());
						}

					}
					if (failedCount == 0)
					{
						ResponseHelper.errorV4(response, null, HttpServletResponse.SC_OK, MessageConstants.SUCCEED,
							null);
					}
					else if (failedCount > 0 && failedCount < resultList.size())
					{
						ResponseHelper.errorV4(response, ErrorCodeConstants.OPERATE_PART_SUCCESS_206,
							HttpServletResponse.SC_PARTIAL_CONTENT, MessageConstants.PARTIAL_SUCCEED, null);
					}
					else if (failedCount == resultList.size())
					{
						ResponseHelper.errorV4(response, ErrorCodeConstants.INTERNAL_SERVER_ERROR_500,
							HttpServletResponse.SC_INTERNAL_SERVER_ERROR, null, null);
					}
					response.setResult(result);
				}
				catch (Exception e)
				{
					logger.error("BuildResponseModel failed :");
					logger.error(e.getMessage());
				}
			}
			else
			{
				response.setStatus(HttpServletResponse.SC_OK);
				response.setMessage(MessageConstants.SUCCEED);
				response.setTraceId(RestThreadLocal.getTraceId());
				response.setResult(new ArrayList());
				RestThreadLocal.clean();

			}
		}
		else if (!ValidationUtil.isEmpty(result) && result instanceof ResponseModel
				&& ErrorCodeConstants.EMSE_500.equals(((ResponseModel) result).getCode()))
		{
			ResponseModel responseModel = (ResponseModel) result;
			response.setCode(responseModel.getCode());
			response.setMessage(responseModel.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.setTraceId(RestThreadLocal.getTraceId());
			RestThreadLocal.clean();
		}
		else
		{
			ResponseHelper.error(response, ErrorCode.APP_SUCCESS, HttpServletResponse.SC_OK, MessageConstants.SUCCEED,
				null);

			if (!ValidationUtil.isEmpty(result))
			{
				response.setResult(result);
			}

		}

		return response;
	}

	private static ResponseModel errorV4(ResponseModel responseModel, String errorCode, Integer statusCode,
			String message, Throwable e)
	{

		responseModel.setCode(errorCode);
		responseModel.setStatus(statusCode);
		responseModel.setMessage(message);
		responseModel.setTraceId(RestThreadLocal.getTraceId());
		RestThreadLocal.clean();
		return responseModel;
	}

	/**
	 * Return the response giving status code and error message.
	 * 
	 * @param statusCode the response status code.
	 * @param message the error message.
	 * @param message the error exception.
	 * @return the response giving status code, error message and exception.
	 */
	private static ResponseModel error(ResponseModel responseModel, ErrorCode errorCode, Integer statusCode,
			String message, Throwable e)
	{
		logger.error(message);
		// 1.0 get response status.
		/*
		 * setResponseStatus(responseModel, errorCode, statusCode, message, e); ResponseBuilder responseBuilder =
		 * Response.status(statusCode); responseBuilder.entity(responseModel);
		 */

		responseModel.setStatus(statusCode);
		responseModel.setMessage(message);
		responseModel.setTraceId(RestThreadLocal.getTraceId());
		RestThreadLocal.clean();

		return responseModel;
	}

	/**
	 * 
	 * Get URL Parameter List which the parameter use "," to split.
	 * 
	 * @param param the parameter from URL
	 * @return List String
	 */
	public static List<String> getURLParamToList(String param)
	{
		List<String> paramList = null;

		if (!ValidationUtil.isEmpty(param))
		{
			String[] params = param.split(",");
			paramList = new ArrayList<String>(params.length);

			for (int i = 0; i < params.length; i++)
			{
				paramList.add(params[i]);
			}
		}

		return paramList;
	}

}

/*
 * $Log: av-env.bat,v $
 */