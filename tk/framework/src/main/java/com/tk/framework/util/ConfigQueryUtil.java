package com.tk.framework.util;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.type.Type;
import org.hibernate.type.TypeResolver;

import com.tk.framework.dto.CustomViewDto;
import com.tk.framework.dto.OrderByDto;
import com.tk.framework.exceptions.BusinessException;

/**
 * <pre>
 *  
 *  File: ConfigQueryUtil.java
 *  
 *  Copyright (C): 2014
 *  Description: 配置查询工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: ConfigQueryUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:48:23>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class ConfigQueryUtil
{

	private static Map<String, ConfigQueryItem> namedHqlQueries = new HashMap<String, ConfigQueryItem>();

	private static Map<String, ConfigQueryItem> namedSqlQueries = new HashMap<String, ConfigQueryItem>();

	private static String[] nameSqlConfigLocation = ConfigProperty.getProperty("queryConfigFile").split(",");

	public final static int ROUND_COUNT = 1000;

	static
	{
		initConfig();
	}

	private static void initConfig()
	{
		try
		{
			SAXReader saxReader = new SAXReader();
			for (String configLocation : nameSqlConfigLocation)
			{
				URL url = ConfigQueryUtil.class.getResource(configLocation);
				if (url == null)
					throw new BusinessException("自定义命名配置文件" + configLocation + "不存在");
				Document documentRead = saxReader.read(url.openStream());
				Element rootElement = documentRead.getRootElement();
				List ls = rootElement.elements();
				for (int i = 0; i < ls.size(); i++)
				{
					Element e = (Element) ls.get(i);
					String nodeName = e.getName(); // 节点名称
					String key = e.attribute("name").getText().toLowerCase().trim(); // sql名称
					if (key.equals("getCountVehPriceInfo".toLowerCase().trim()))
					{
						System.out.println("找到SQL：getCountVehPriceInfo");
					}
					if (namedHqlQueries.containsKey(key))
					{
						throw new BusinessException("命名sql文件有重名！" + key);
					}
					if (namedSqlQueries.containsKey(key))
					{
						throw new BusinessException("命名sql文件有重名！" + key);
					}
					String value = e.getText(); // sql内容
					if ("sql-query".equals(nodeName))
					{
						ConfigQueryItem configQueryItem = new ConfigQueryItem(key, nodeName, value);
						parseReturnScalar(e, configQueryItem);
						namedSqlQueries.put(key, configQueryItem);
					}
					else if ("query".equals(nodeName))
					{
						namedHqlQueries.put(key, new ConfigQueryItem(key, nodeName, value));
					}
				}
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	private static void parseReturnScalar(Element e, ConfigQueryItem configQueryItem)
	{
		// TODO Auto-generated method stub
		List ls = e.elements("return-scalar");
		List<ColumnReturnType> lsColumnReturnType = new ArrayList<ColumnReturnType>();
		if (ls != null)
		{
			for (int i = 0; i < ls.size(); i++)
			{
				Element child = (Element) ls.get(i);
				String columnName = child.attribute("column").getText().trim();
				ColumnReturnType columnReturnType = new ColumnReturnType(columnName);
				if (child.attribute("type") != null)
				{
					String typeName = child.attribute("type").getText().toLowerCase().trim();
					// Type type = TypeFactory.basic(typeName);
					// 修改Hibernate升级后得到sql返回类型的方法【慕鹏】
					Type type = new TypeResolver().heuristicType(typeName);
					columnReturnType.setReturnType(type);
				}
				lsColumnReturnType.add(columnReturnType);
			}
		}
		configQueryItem.setLsColumnReturnType(lsColumnReturnType);
	}

	public static void refresh()
	{
		namedHqlQueries.clear();
		namedSqlQueries.clear();
		initConfig();
	}

	public static String getConfigQueryValue(String queryName)
	{
		ConfigQueryItem item = getConfigQueryItem(queryName);
		if (item != null)
		{
			return item.getQueryString();
		}
		return null;
	}

	public static ConfigQueryItem getConfigQueryItem(String queryName)
	{
		String key = queryName.toLowerCase();
		if (namedHqlQueries.containsKey(key))
		{
			return namedHqlQueries.get(key);
		}
		if (namedSqlQueries.containsKey(key))
		{
			return namedSqlQueries.get(key);
		}
		return null;
	}

	public static ConfigQueryItem getDealConfigQueryItem(String queryName, Map conditionMap, Object... objects)
	{
		ConfigQueryItem item = getConfigQueryItem(queryName);
		if (item != null)
		{
			ConfigQueryItem cloneItem = (ConfigQueryItem) item.clone();
			String queryString = cloneItem.getQueryString();
			StringBuilder sb = new StringBuilder(cloneItem.getQueryString());
			int index = 0;
			while ((index = queryString.indexOf("&")) != -1)
			{
				int begin = queryString.lastIndexOf("{", index);
				int end = queryString.indexOf("}", index);
				int paraEnd = queryString.indexOf(" ", index + 1);
				String pare = queryString.substring(index + 1, paraEnd);
				if (conditionMap == null || conditionMap.get(pare) == null)
				{
					sb.replace(begin, end + 1, "");
				}
				else
				{
					sb.deleteCharAt(begin);
					sb.deleteCharAt(end - 1);
					sb.replace(index - 1, paraEnd, "");
				}
				queryString = sb.toString();
			}
			int end = 0;
			while ((index = queryString.indexOf(":", end)) != -1)
			{
				int begin = queryString.lastIndexOf("{", index);
				end = queryString.indexOf("}", index);
				int paraEnd = queryString.indexOf(" ", index + 1);
				String pare = queryString.substring(index + 1, paraEnd);
				if (conditionMap == null || conditionMap.get(pare) == null)
				{
					sb.replace(begin, end + 1, "");
					end = begin;
				}
				else
				{
					sb.deleteCharAt(begin);
					sb.deleteCharAt(end - 1);
				}
				queryString = sb.toString();
			}
			end = 0;
			while ((index = queryString.indexOf("#", end)) != -1)
			{
				int begin = queryString.lastIndexOf("{", index);
				end = queryString.indexOf("}", index);
				int paraEnd = queryString.indexOf(" ", index + 1);
				String pare = queryString.substring(index + 1, paraEnd);
				if (conditionMap == null || conditionMap.get(pare) == null)
				{
					sb.replace(begin, end + 1, "");
					end = begin;
				}
				else
				{
					Object value = conditionMap.get(pare);
					int size = 0;
					if (value instanceof Collection)
					{
						size = ((Collection) value).size();
					}
					else if (value instanceof Object[])
					{
						size = ((Object[]) value).length;
					}
					if (size == 0)
					{
						// sb.replace(begin, end+1, "");
						// end=begin;
						int beginfang = queryString.lastIndexOf("[", index);
						int endfang = queryString.indexOf("]", index);
						String prefang = queryString.substring(begin + 1, beginfang);
						String fangString = queryString.substring(beginfang + 1, endfang);
						String tmp = fangString.replace("#" + pare, "''");
						String afterfang = queryString.substring(endfang + 1, end);
						StringBuilder sbIn = new StringBuilder();
						sbIn.insert(0, prefang);
						sbIn.append(tmp);
						sbIn.append(afterfang);
						sb.replace(begin, end + 1, sbIn.toString());
						conditionMap.remove(pare);
						end = begin + sbIn.length();
						queryString = sb.toString();
						continue;
					}
					int randCount = (size - 1) / ROUND_COUNT + 1;
					int beginfang = queryString.lastIndexOf("[", index);
					int endfang = queryString.indexOf("]", index);
					String prefang = queryString.substring(begin + 1, beginfang);
					String fangString = queryString.substring(beginfang + 1, endfang);
					String afterfang = queryString.substring(endfang + 1, end);
					StringBuilder sbIn = new StringBuilder();
					for (int k = 0; k < randCount; k++)
					{
						if (value instanceof Collection)
						{
							Collection vCollection = (Collection) value;
							int m = 0;
							Collection arg = null;
							try
							{
								arg = vCollection.getClass().newInstance();
							}
							catch (InstantiationException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							catch (IllegalAccessException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							for (Object o : vCollection)
							{
								if (m / ROUND_COUNT == k)
								{
									arg.add(o);
								}
								if (m / ROUND_COUNT > k)
								{
									break;
								}
								m++;
							}
							conditionMap.put(pare + k, arg);
						}
						else if (value instanceof Object[])
						{
							Object[] vCollection = (Object[]) value;
							int m = 0;
							Object[] arg = null;
							if (k == randCount - 1)
							{
								arg = new Object[vCollection.length - ROUND_COUNT * k];
							}
							else
							{
								arg = new Object[ROUND_COUNT];
							}
							for (Object o : vCollection)
							{
								if (m / ROUND_COUNT == k)
								{
									arg[m % ROUND_COUNT] = o;
								}
								if (m / ROUND_COUNT > k)
								{
									break;
								}
								m++;
							}
							conditionMap.put(pare + k, arg);
						}
						String tmp = fangString.replace("#" + pare, ":" + pare + k);
						if (k != 0)
						{
							sbIn.append(" or ");
						}
						sbIn.append(tmp);
					}
					sbIn.insert(0, "(");
					sbIn.append(")");
					sbIn.insert(0, prefang);
					sbIn.append(afterfang);
					sb.replace(begin, end + 1, sbIn.toString());
					conditionMap.remove(pare);
					end = begin + sbIn.length();
				}
				queryString = sb.toString();
			}
			/******************* 用于有自定义扩展列的情形 *************************/
			String groupBy = " group by ";
			boolean isExtSQL = false;
			boolean isDynamicSQL = false;
			// 是否有自定义视图列定义传入
			end = 0;
			if ((index = queryString.indexOf("（", end)) != -1)
			{
				isDynamicSQL = true;
				end = queryString.indexOf("）", end);
				if (conditionMap.get("custom_view") != null)
				{
					JSONArray jsonArray = JSONArray.fromObject(conditionMap.get("custom_view").toString());
					String tmpStr = "";
					for (int i = 0; i < jsonArray.size(); i++)
					{
						JSONObject jsonObject = (JSONObject) jsonArray.get(i);// jsonArray.getJSONObject(i);
						CustomViewDto dto = (CustomViewDto) JSONObject.toBean(jsonObject, CustomViewDto.class);
						if ("id".equals(dto.getColumnAlias()))
						{
							tmpStr += "," + dto.getTableAlias() + "." + dto.getColumnName() + " "
									+ dto.getColumnAlias();
						}
						else
						{
							// if("Y".equals(dto.getIsVisible())) {
							if ("Y".equals(dto.getIsExtension()))
							{
								tmpStr += "《,【" + dto.getTableName() + " " + dto.getTableAlias() + "】"
										+ dto.getColumnName() + " " + dto.getColumnAlias() + "》";
							}
							else if ("N".equals(dto.getIsExtension()))
							{
								tmpStr += "," + dto.getTableAlias() + "." + dto.getColumnName() + " "
										+ dto.getColumnAlias();
							}
							// }
						}
					}
					if (!"".equals(tmpStr))
						tmpStr = tmpStr.substring(1, tmpStr.length());
					sb.replace(index, end + 1, "（" + tmpStr + "）");
					queryString = sb.toString();
				}

				// 开始统计拼装最后面的 group by 语句
				end = 0;
				index = queryString.indexOf("（", end);
				end = queryString.indexOf("）", end);
				String columnStr = queryString.substring(index + 1, end);
				String[] columns = columnStr.split(",");
				for (int i = 0; i < columns.length; i++)
				{
					if (columns[i].indexOf("【") != -1)
					{
					}
					else
					{
						String[] columnNameAndAlias = columns[i].split(" ");
						if (columnNameAndAlias.length > 0)
						{
							if (columnNameAndAlias.length > 2)
							{
								String[] tt = columnNameAndAlias[1].split(" ");
								groupBy += " " + tt[0] + ",";
							}
							else
							{
								groupBy += " " + columnNameAndAlias[0] + ",";
							}
						}
					}
				}
				if (!" group by ".equals(groupBy))
				{
					groupBy = groupBy.substring(0, groupBy.length() - 1);
				}

				String tmpStr = queryString.substring(index + 1, end);
				sb.replace(index, end + 1, tmpStr);
				queryString = sb.toString();
			}

			// 是否有自定义扩展列的查询
			end = 0;
			if (queryString.indexOf("【", end) != -1)
			{
				isExtSQL = true;
				// System.out.println(queryString);
				Map tableMap = new HashMap();
				String tmpStr = queryString;
				int tmpStart = 0;
				int tmpEnd = 0;
				// 统计里面有多少个扩展表
				int k = 0;// 用于扩展表别名
				while ((tmpStart = tmpStr.indexOf("【", tmpEnd)) != -1)
				{
					tmpEnd = tmpStr.indexOf("】", tmpStart);
					// System.out.println(tmpEnd);
					String tableNameAndAlias = tmpStr.substring(tmpStart + 1, tmpEnd);
					String[] arr = tableNameAndAlias.split(" ");
					if (tableMap.get(arr[0]) != null)
					{
					}
					else
					{
						CustomViewDto dto = new CustomViewDto();
						dto.setTableName(arr[0]);
						dto.setTableAlias(arr[1]);
						dto.setIsExtension("" + k);
						tableMap.put(dto.getTableName(), dto);
						k++;
					}
				}

				// 开始替换字符串
				end = 0;
				while ((index = queryString.indexOf("《", end)) != -1)
				{
					end = queryString.indexOf("》", end);

					String tableNameAndAlias = queryString.substring(index + 3, queryString.indexOf("】", index));
					String columnNameAndAlias = queryString.substring(queryString.indexOf("】") + 1,
						queryString.indexOf("》", index));

					String[] arr = tableNameAndAlias.split(" ");
					if (tableMap.get(arr[0]) != null)
					{
						CustomViewDto dto = (CustomViewDto) tableMap.get(arr[0]);
						String[] columnArr = columnNameAndAlias.split(" ");
						String replaceStr = ",max( case when ed" + dto.getIsExtension() + ".column_name='"
								+ columnArr[0] + "' then ev" + dto.getIsExtension() + ".ext_value end ) "
								+ columnArr[1];
						sb.replace(index, end + 1, replaceStr);
					}
					// sb.replace(index, end+1, "");

					queryString = sb.toString();
					end = 0;
				}
				// 开始添加扩展表的left join语句
				end = 0;
				while ((index = queryString.indexOf("“", end)) != -1)
				{
					end = queryString.indexOf("”", end);
					String tableStr = queryString.substring(index + 1, end);
					for (Iterator it = tableMap.entrySet().iterator(); it.hasNext();)
					{
						Map.Entry e = (Map.Entry) it.next();
						CustomViewDto dto = (CustomViewDto) e.getValue();
						if (tableStr.indexOf(dto.getTableName()) != -1)
						{
							tableStr += " left join ext_definition ed" + dto.getIsExtension() + " on ed"
									+ dto.getIsExtension() + ".table_name='" + dto.getTableName() + "' ";
							tableStr += " left join ext_value ev" + dto.getIsExtension() + " on ev"
									+ dto.getIsExtension() + ".ext_definition_id=ed" + dto.getIsExtension()
									+ ".id and ev" + dto.getIsExtension() + ".ext_row_id=" + dto.getTableAlias()
									+ ".id ";
						}
					}
					sb.replace(index, end + 1, tableStr);
					queryString = sb.toString();
					end = 0;
				}

			}
			queryString = queryString.replaceAll("“", "");
			queryString = queryString.replaceAll("”", "");
			if (isExtSQL && isDynamicSQL)
			{
				queryString = "select * from (" + queryString + groupBy + ") ext_table_sql";
			}
			else if (isDynamicSQL)
			{
				queryString = "select * from (" + queryString + ") ext_table_sql";
			}
			/*********************** 有自定义扩展列的情形结束 *****************************/

			if (conditionMap != null && conditionMap.size() != 0)
			{
				List<OrderByDto> orderList = (List<OrderByDto>) conditionMap.get("order");
				if (orderList != null && orderList.size() != 0)
				{
					queryString += " order by ";
					for (int i = 1; i < orderList.size(); i++)
					{
						OrderByDto orderByDto = (OrderByDto) orderList.get(i);
						queryString += " " + orderByDto.getColumnName() + " " + orderByDto.getOrderby() + ", ";
					}
					OrderByDto orderByDto = (OrderByDto) orderList.get(0);
					queryString += " " + orderByDto.getColumnName() + " " + orderByDto.getOrderby() + " ";
				}
			}
			// yl add
			if (null != objects && objects.length > 0 && objects[0] instanceof List)
			{
				List orderlist = (List) objects[0];
				if (orderlist != null && orderlist.size() != 0)
				{
					queryString += " order by ";
					for (int i = 1; i < orderlist.size(); i++)
					{
						OrderByDto orderByDto = (OrderByDto) orderlist.get(i);
						queryString += " " + orderByDto.getColumnName() + " " + orderByDto.getOrderby() + ", ";
					}
					OrderByDto orderByDto = (OrderByDto) orderlist.get(0);
					queryString += " " + orderByDto.getColumnName() + " " + orderByDto.getOrderby() + " ";
				}
			}
			// yl end
			cloneItem.setQueryString(queryString);
			return cloneItem;
		}
		return null;
	}

	public static void main(String[] args)
	{

		String[] domainIds = new String[] {"1", "2", "3", "4", "5", "6"};
		Map params = new HashMap();
		String temp = "[{\"tableName\":\"lce_user\",\"tableAlias\":\"lu\",\"columnName\":\"user_name\",\"columnAlias\":\"userName\",\"columnType\":\"string\",\"isExtension\":\"N\",\"isVisible\":\"Y\"},"
				+ "	    {\"tableName\":\"lce_user\",\"tableAlias\":\"lu\",\"columnName\":\"password\",\"columnAlias\":\"password\",\"columnType\":\"string\",\"isExtension\":\"N\",\"isVisible\":\"Y\"},"
				+ "		{\"tableName\":\"lce_user\",\"tableAlias\":\"lu\",\"columnName\":\"mail\",\"columnAlias\":\"userMail\",\"columnType\":\"string\",\"isExtension\":\"Y\",\"isVisible\":\"Y\"},"
				+ "		{\"tableName\":\"lce_org\",\"tableAlias\":\"lo\",\"columnName\":\"address\",\"columnAlias\":\"orgAddress\",\"columnType\":\"string\",\"isExtension\":\"Y\",\"isVisible\":\"Y\"}]";
		System.out.println(temp);
		// params.put("custom_view", temp);
		List list = new ArrayList();
		OrderByDto order = new OrderByDto();
		order.setColumnName("userMail");
		order.setOrderby("desc");
		list.add(order);
		params.put("order", list);
		params.put("uId", "001");
		System.out.println(ConfigQueryUtil.getDealConfigQueryValue("testTTT", params, null));
		System.out.println(params.size());
	}

	public static String getDealConfigQueryValue(String queryName, Map conditionMap, List orderlist)
	{
		ConfigQueryItem item = getDealConfigQueryItem(queryName, conditionMap);
		if (item != null)
		{
			return item.getQueryString();
		}
		return null;
	}
}
