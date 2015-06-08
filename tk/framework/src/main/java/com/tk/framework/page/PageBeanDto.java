package com.tk.framework.page;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * <pre>
 *  
 *  File: PageBean.java
 *  
 *  Copyright (C): 2014
 *  Description: 分页查询使用的DTO
 *  Notes:
 *  $Id: PageBean.java  2014-12-24 23:59:59Z \TK $ 
 * @param <T>
 * 
 * @Revision History:
 * <<2014年12月25日下午3:20:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class PageBeanDto implements Serializable
{
	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -5325545046096324818L;

	private int pageSize = 10; // 每页显示记录数

	private int startRecord = 0; // 开始记录数

	private String sortColumn; // 排序字段

	private String sortDir; // 排序方式

	private String searchValue = ""; // 搜索关键字，该参数会匹配所有可查询的字段

	private String where = ""; // 搜索参数 ，会按照可查询字段范围内的指定字段进行匹配,示例{"name":"tk"}

	private List<?> data; // 要显示的数据的结果集

	private int recordsTotal = 0; // 当前页面记录总数，即从搜索过滤后的记录中再进行分页查询后的记录数，这个数不会超过pageSize

	private int recordsFiltered = 0; // 搜索过滤后的记录总数，即按条件搜索过滤后不进行分页查询的记录总数，这个数可能会超过pageSize

	public PageBeanDto()
	{
		super();
	}

	/**
	 * @return the pageSize
	 */

	public int getPageSize()
	{
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	/**
	 * @return the startRecord
	 */

	public int getStartRecord()
	{
		return startRecord;
	}

	/**
	 * @param startRecord the startRecord to set
	 */
	public void setStartRecord(int startRecord)
	{
		this.startRecord = startRecord;
	}

	/**
	 * @return the sortColumn
	 */

	public String getSortColumn()
	{
		return sortColumn;
	}

	/**
	 * @param sortColumn the sortColumn to set
	 */
	public void setSortColumn(String sortColumn)
	{
		this.sortColumn = sortColumn;
	}

	/**
	 * @return the sortDir
	 */

	public String getSortDir()
	{
		return sortDir;
	}

	/**
	 * @param sortDir the sortDir to set
	 */
	public void setSortDir(String sortDir)
	{
		this.sortDir = sortDir;
	}

	/**
	 * @return the searchValue
	 */

	public String getSearchValue()
	{
		return searchValue;
	}

	/**
	 * @param searchValue the searchValue to set
	 */
	public void setSearchValue(String searchValue)
	{
		this.searchValue = searchValue;
	}

	/**
	 * @return the where
	 */

	public String getWhere()
	{
		return where;
	}

	/**
	 * @param where the where to set
	 */
	public void setWhere(String where)
	{
		this.where = where;
	}

	/**
	 * @return the data
	 */

	public List<?> getData()
	{
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<?> data)
	{
		this.data = data;
	}

	/**
	 * @return the recordsTotal
	 */

	public int getRecordsTotal()
	{
		return recordsTotal;
	}

	/**
	 * @param recordsTotal the recordsTotal to set
	 */
	public void setRecordsTotal(int recordsTotal)
	{
		this.recordsTotal = recordsTotal;
	}

	/**
	 * @return the recordsFiltered
	 */

	public int getRecordsFiltered()
	{
		return recordsFiltered;
	}

	/**
	 * @param recordsFiltered the recordsFiltered to set
	 */
	public void setRecordsFiltered(int recordsFiltered)
	{
		this.recordsFiltered = recordsFiltered;
	}

	@Override
	public int hashCode()
	{

		return new HashCodeBuilder(17, 37).append(pageSize).append(startRecord).append(sortColumn).append(sortDir)
				.append(searchValue).append(where).toHashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		boolean equals = false;
		if (o != null && getClass() == o.getClass())
		{
			PageBeanDto po = (PageBeanDto) o;
			equals = (new EqualsBuilder().append(pageSize, po.pageSize).append(startRecord, po.startRecord)
					.append(sortColumn, po.sortColumn).append(sortDir, po.sortDir).append(searchValue, po.searchValue)
					.append(where, po.where)).isEquals();
		}
		return equals;
	}

	public static void main(String[] args)
	{
		PageBeanDto dto1 = new PageBeanDto();
		dto1.setPageSize(0);
		dto1.setStartRecord(10);
		dto1.setSearchValue("hello");
		dto1.setSortColumn("name");
		dto1.setSortDir("asc");
		dto1.setWhere("{}");

		PageBeanDto dto2 = new PageBeanDto();
		dto2.setPageSize(0);
		dto2.setStartRecord(10);
		dto2.setSearchValue("hello");
		dto2.setSortColumn("name");
		dto2.setSortDir("asc");
		dto2.setWhere("{}");

		PageBeanDto dto3 = new PageBeanDto();
		dto3.setPageSize(2);
		dto3.setStartRecord(10);
		dto3.setSearchValue("hello");
		dto3.setSortColumn("name");
		dto3.setSortDir("asc");
		dto3.setWhere("{}");

		System.out.println("dto1=HashCode：" + dto1.hashCode());
		System.out.println("dto2=HashCode：" + dto2.hashCode());
		System.out.println("dto3=HashCode：" + dto3.hashCode());
	}
}
