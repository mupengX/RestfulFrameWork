package com.tk.framework.log.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.tk.api.TKHttpClient;
import com.tk.api.TKResponse;
import com.tk.framework.exceptions.BusinessException;
import com.tk.framework.log.BaseLogService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.tk.framework.page.PageBeanDto;
import com.tk.framework.service.impl.BaseServiceImpl;
import com.tk.framework.util.SpringContextHelper;
import com.tk.framework.util.ValidationUtil;
import com.tk.orm.log.dao.LogDao;
import com.tk.orm.log.model.LogPo;
import com.tk.service.log.LogService;

/**
 * <pre>
 *  
 *  File: LogServiceImpl.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  日志Service层接口实现类
 * 
 *  Notes:
 *  $Id: LogServiceImpl.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2015年1月19日下午4:28:17>>, <<Who>>, <<what>>  
 *  2015年1月19日		nie.yl		Initial.
 * </pre>
 */
@Service(value = "logService")
public class LogServiceImpl extends BaseServiceImpl<LogPo, Object> implements LogService
{

	@Autowired
	private LogDao logDao;
	
	@Autowired
	private static SpringContextHelper springContextHelper;
	
	private final String countLogURL = "http://192.168.1.92/zq/das/log/selectcount";

	private final String queryLogURL = "http://192.168.1.92/zq/das/log/select";

	private final String insertLogURL = "http://192.168.1.92/zq/das/log/insert";

	private final String deleteLogURL = "http://192.168.1.92/zq/das/log/delete";

	private final Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);

	private final String HTTPSTATUS_OK = "200";

	@Override
	public void addLog(LogPo logPo) throws Exception
	{
		logDao.insertObject(logPo);

		String jsonText = logPo.getJsonText();
		JSONObject dataObject = JSONObject.parseObject(jsonText);
		JSONArray array = new JSONArray();
		array.add(dataObject);
		JSONObject object = new JSONObject();
		object.put("total", "1");
		object.put("data", array);
		TKResponse response = TKHttpClient.urlPostMethod4NoToken(insertLogURL, object);
		if (!HTTPSTATUS_OK.equals(response.getStatusCode()))
		{
			logger.error("操作日志入库输错！");
			throw new BusinessException(response.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tk.service.log.LogService#deleteLogById(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteLogById(String agencyCode, String id) throws Exception
	{
		TKResponse tKResponse = TKHttpClient.urlPostStringMethod4NoToken(deleteLogURL + "/" + id, null);
		String statusCode = tKResponse.getStatusCode();
		if (!HTTPSTATUS_OK.equals(statusCode))
		{
			throw new Exception(tKResponse.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tk.service.log.LogService#getLogById(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public LogPo getLogById(String agencyCode, String id) throws Exception
	{
		LogPo po = null;
		String sql = "WHERE 1=1 AND ID='" + id + "' AND agencyCode='" + agencyCode + "'";

		TKResponse tKResponse = TKHttpClient.urlPostStringMethod4NoToken(queryLogURL, sql);
		String statusCode = tKResponse.getStatusCode();
		if (HTTPSTATUS_OK.equals(statusCode))
		{
			String responseBody = tKResponse.getResponseBody();
			JSONObject obj = JSON.parseObject(responseBody);
			List<Map> logList = obj.getObject("data", List.class);
			if (!ValidationUtil.isEmpty(logList))
			{
				Map map = logList.get(0);
				po = JSON.parseObject(map.toString(), LogPo.class);
			}
		}
		else
		{
			throw new Exception(tKResponse.getMessage());
		}
		return po;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tk.service.log.LogService#pageGetLog(java.lang.String, com.tk.framework.page.PageBeanDto)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public PageBeanDto pageGetLog(String agencyCode, PageBeanDto pageBeanDto) throws Exception
	{
		if (!ValidationUtil.isEmpty(pageBeanDto))
		{
			String countsql = buildCountSql(agencyCode, pageBeanDto); // 根据查询参数拼写SQL用于查询符合条件的记录总数
			String querysql = buildQuerySql(agencyCode, pageBeanDto); // 根据查询参数拼写SQL用于分页查询符合条件的记录

			TKResponse countTKResponse = TKHttpClient.urlPostStringMethod4NoToken(countLogURL, countsql);
			String countStatusCode = countTKResponse.getStatusCode();
			if (HTTPSTATUS_OK.equals(countStatusCode))
			{
				String responseBody = countTKResponse.getResponseBody();
				JSONObject obj = JSON.parseObject(responseBody);
				int recordTotal = obj.getInteger("total");
				pageBeanDto.setRecordsFiltered(recordTotal);
			}
			else
			{
				throw new Exception(countTKResponse.getMessage());
			}

			TKResponse queryTKResponse = TKHttpClient.urlPostStringMethod4NoToken(queryLogURL, querysql);
			String queryStatusCode = queryTKResponse.getStatusCode();
			if (HTTPSTATUS_OK.equals(queryStatusCode))
			{
				String responseBody = queryTKResponse.getResponseBody();
				JSONObject obj = JSON.parseObject(responseBody);
				// int recordTotal = obj.getInteger("total");
				List logList = obj.getObject("data", List.class);
				pageBeanDto.setData(logList);
				pageBeanDto.setRecordsTotal(logList.size());
			}
			else
			{
				throw new Exception(queryTKResponse.getMessage());
			}
		}
		return pageBeanDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tk.service.log.LogService#compareValue(java.lang.String, java.lang.String)
	 */
	@Override
	public String compareValue(String logId, String agencyCode) throws Exception
	{
		// 获取当前日志的详细信息
		String queryDateString = "where id= '" + logId + "'";
		TKResponse dataResponse = TKHttpClient.urlPostStringMethod4NoToken(queryLogURL, queryDateString);
		if (HTTPSTATUS_OK.equals(dataResponse.getStatusCode()))
		{
			String currentLogString = dataResponse.getResponseBody();
			JSONObject responseObject = JSONObject.parseObject(currentLogString);
			JSONArray dataArray = responseObject.getJSONArray("data");
			if (dataArray.size() <= 0)
			{
				logger.error("未找到符合条件的日志记录");
				throw new BusinessException("未找到符合条件的日志记录");
			}
			JSONObject currentLog = dataArray.getJSONObject(0);
			String datetime = currentLog.getString("starttime");
			String resourceId = currentLog.getString("resourceid");
			String resourceName = currentLog.getString("resourcename");
			// 获取针对resourceid 操作中currentlog之前所有的操作，按照操作时间降序排序
			String queryLog4compareString = "where resourceid='" + resourceId + "' and starttime <='" + datetime
					+ "' order by starttime desc";
			TKResponse logs4compareResponse = TKHttpClient.urlPostStringMethod4NoToken(queryLogURL,
				queryLog4compareString);

			if (HTTPSTATUS_OK.equals(logs4compareResponse.getStatusCode()))
			{
				String logs = logs4compareResponse.getResponseBody();
				// 根据多态获取具体的logger实现类 如：userLogService
				BaseLogService entityLogger = (BaseLogService) springContextHelper.getBean(resourceName + "LogService");
				return entityLogger.toView(logs);
			}
			else
			{
				logger.error("获取比对日志出现异常：" + logs4compareResponse.getMessage());
				throw new BusinessException(logs4compareResponse.getMessage());
			}
		}
		else
		{
			logger.error("获取日志出现异常：" + dataResponse.getMessage());
			throw new BusinessException(dataResponse.getMessage());
		}
	}

	/**
	 * 根据查询参数拼写SQL用于分页查询符合条件的记录
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	private String buildQuerySql(String agencyCode, PageBeanDto pageBeanDto) throws Exception
	{
		StringBuffer buffSql = new StringBuffer(buildCommonSql(agencyCode, pageBeanDto));
		// #1.获取分页查询参数
		int startRecord = pageBeanDto.getStartRecord(); // 开始记录数
		int pageSize = pageBeanDto.getPageSize(); // 每页显示记录数
		String sortColumn = pageBeanDto.getSortColumn();// 排序字段
		String sortDir = pageBeanDto.getSortDir();// 排序方式

		// #2.3处理排序
		if (!ValidationUtil.isEmpty(sortColumn))
		{
			sortDir = ValidationUtil.isEmpty(sortDir) ? "ASC" : sortDir;
			buffSql.append(" ORDER BY " + sortColumn + " " + sortDir);
		}
		else
		{
			buffSql.append(" ORDER BY startTime DESC"); // 默认按时间倒序排列
		}

		// buffSql.append(" LIMIT " + offset + "," + end);
		buffSql.append(" OFFSET " + startRecord + " LIMIT " + pageSize);

		return buffSql.toString();
	}

	/**
	 * 根据查询参数拼写SQL用于查询符合条件的记录总数
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	private String buildCountSql(String agencyCode, PageBeanDto pageBeanDto) throws Exception
	{
		return buildCommonSql(agencyCode, pageBeanDto);
	}

	/**
	 * 根据查询参数拼写查询记录和记录数的共用SQL.
	 * 
	 * @param agencyCode
	 * @param pageBeanDto
	 * @return
	 * @throws Exception
	 */
	private String buildCommonSql(String agencyCode, PageBeanDto pageBeanDto) throws Exception
	{
		StringBuffer buffSql = new StringBuffer();
		// #1.获取分页查询参数
		String searchValue = pageBeanDto.getSearchValue();// 搜索关键字，该参数会匹配所有可查询的字段
		String where = pageBeanDto.getWhere();// 搜索参数
												// ，会按照可查询字段范围内的指定字段进行匹配,示例{"name":"tk"}

		// #2.拼写SQL
		// #2.1搜索关键字处理
		if (ValidationUtil.isEmpty(searchValue))
		{
			searchValue = "";
		}
		String search = " '%" + searchValue + "%'";
		buffSql.append(" WHERE 1=1 ");
		if (null != agencyCode)
		{
			buffSql.append(" AND agencyCode='" + agencyCode + "'");
		}
		buffSql.append(" AND (");
		buffSql.append(" userId LIKE " + search);
		buffSql.append(" OR userName LIKE " + search);
		buffSql.append(" OR operationType LIKE " + search);
		buffSql.append(" OR resourceName LIKE " + search);
		buffSql.append(" OR comment LIKE " + search);
		buffSql.append(" OR ip LIKE " + search);
		buffSql.append(")");

		// #2.2处理条件查询
		if (!ValidationUtil.isEmpty(where))
		{
			JSONObject jsonObject = JSONObject.parseObject(where);
			if (!jsonObject.isEmpty())
			{
				JSONArray rules = (JSONArray) jsonObject.get("rules");
				for (Iterator<Object> iterator = rules.iterator(); iterator.hasNext();)
				{
					JSONObject object = (JSONObject) iterator.next();
					String value = object.get("value").toString();
					if (!ValidationUtil.isEmpty(value))
					{
						// 去掉首尾空格
						value = value.trim();
						String field = object.get("field").toString();
						if (field.toLowerCase().equals("starttime"))
						{
							Date date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
							long millis = date.getTime();
							buffSql.append(" AND " + field + " >= '" + millis + "'");
						}
						else if (field.toLowerCase().equals("endtime"))
						{
							Date date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
							long millis = date.getTime();
							buffSql.append(" AND " + field + " <= '" + millis + "'");
						}
						else
						{
							buffSql.append(" AND " + field + " LIKE '%" + value + "%'");
						}
					}
				}
			}
		}
		return buffSql.toString();
	}
}

/*
 * $Log: av-env.bat,v $
 */