package com.tk.framework.page;

import java.util.List;


/**
 * <pre> 
 *  
 *  File: PageBean.java
 *  
 *  Copyright (C): 2014
 *  Description: 分页类
 *  TODO
 * 
 *  Notes:
 *  $Id: PageBean.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:20:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class PageBean {
	private int count = 0; // 记录总数

	private int pageSize = 10; // 每页显示记录数

	private int pageCount = 0; // 总页数

	private int pageNumber = 1; // 当前页数

	private String totalCountSQL;// 得到总记录数sql语句

	private String listSQL;// 得到查询记录sql语句
	
	private String requestURI;//用户请求的地址
	
	private List resultList;//要显示的数据的结果集
	
	private String pageTag;//分页标签
	
	private String argument;
	
	public String getArgument() {
		return argument;
	}

	public void setArgument(String argument) {
		this.argument = argument;
	}

	public String getPageTag() {
		return pageTag;
	}

	public void setPageTag(String pageTag) {
		this.pageTag = pageTag;
	}

	public List getResultList() {
		return resultList;
	}

	public void setResultList(List resultList) {
		this.resultList = resultList;
	}

	public String getRequestURI() {
		return requestURI;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (pageSize != 0) {
			pageCount = count / pageSize;
			if (count % pageSize != 0) {
				pageCount++;
			}
		}
		this.count = count;
		if(pageCount<pageNumber)
			pageNumber = pageCount;
		System.out.println("pageNumber:"+pageNumber+"pageCount:"+pageCount+"COUNT:"+count);
		//Config nc = new Config();
		
		//开始设置分页标签
		//pageTag = "<div class='"+nc.getConfigInfo("page_style")+"'>";
		pageTag = "<div class='manu'>";
		if(pageNumber==1 || pageNumber == 0)
			pageTag += "<span class='disabled'>&lt; </span>";
		else
			pageTag += "<a href=javascript:gotoPage('"+(pageNumber-1)+"','"+argument+"',this)>&lt; </a>";
		
		//小于10页的话就全部显示
		if(pageCount <= 10)
		{
			for(int i = 1; i <= pageCount; i++) {
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
		}
		//大于10页并且当前页码小于等于7
		else if(pageCount > 10 && pageNumber <= 7)
		{
			for(int i=1; i<=7; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
			pageTag += "....";
			for(int i = (pageCount-1); i <= pageCount; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
		}
//		大于10页并且当前页码等于7
//		else if(pageCount > 10 && pageNumber == 7)
//		{
//			
//		}
		//大于10页并且当前页码大于7并且当前页码大于等于总页数减去6
		else if(pageCount > 10 && pageNumber > 7 && pageNumber >= (pageCount-6))
		{
			for(int i = 1; i <= 2; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
			pageTag += "....";   
			for(int i = (pageCount-6); i <= pageCount; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
		}
		//大于10页并且当前页码大于7并且当前页码小于总页数减去6
		else if(pageCount > 10 && pageNumber >7 && pageNumber < (pageCount-6))
		{
			for(int i = 1; i <= 2; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
			pageTag += "....";
			
			for(int i = pageNumber; i <= (pageNumber+3); i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
			
			pageTag += "....";
			for(int i = (pageCount-1); i <= pageCount; i++)
			{
				if(pageNumber == i)
					pageTag += "<span class='current'>"+i+"</span>";
				else
					pageTag += "<a href=javascript:gotoPage('"+i+"','"+argument+"',this);>"+i+"</a>";
			}
		}
		
		if(pageNumber>=pageCount)
			pageTag += "<span class='disabled'>&gt; </span>";
		else
			pageTag += "<a href=javascript:gotoPage('"+(pageNumber+1)+"','"+argument+"',this)>&gt; </a>";
		pageTag += "</div>";
	}

	public String getListSQL() {
		return listSQL;
	}

	public void setListSQL(String listSQL) {
		this.listSQL = listSQL;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCountSQL() {
		return totalCountSQL;
	}

	public void setTotalCountSQL(String totalCountSQL) {
		this.totalCountSQL = totalCountSQL;
	}
}
