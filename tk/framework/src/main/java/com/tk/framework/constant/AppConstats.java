package com.tk.framework.constant;

/**
 * <pre>
 *  
 *  File: AppConstats.java
 *  
 *  Copyright (C): 2014
 *  Description: 常量类
 *  TODO
 * 
 *  Notes:
 *  $Id: AppConstats.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午2:22:45>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class AppConstats
{
	public static final String TOKEN = "token";

	public static final String EXPIRE = "expire";

	public static final String PUBLICUSER_PREFIX = "PUBLICUSER@";

	// the status for YES/NO
	public static final String COMMON_Y = "Y";

	public static final String COMMON_N = "N";

	public static final String COMMON_YES = "YES";

	public static final String COMMON_NO = "NO";

	// the status for active and inacitve
	public static final String COMMON_A = "A";

	public static final String COMMON_I = "I";

	public static final String COMMON_ACTIVE = "A";

	public static final String COMMON_INACTIVE = "I";

	public static final String TRACEID = "traceId";

	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String PUBLIC_AGENCY_CODE = "PUBLIC@USER";

	public static final long AGENCY_TIME_MENU1 = 1000 * 60 * 60 * 24 * 365 * 1;

	public static final long AGENCY_TIME_MENU2 = 1000 * 60 * 60 * 24 * 365 * 2;

	public static final long AGENCY_TIME_MENU3 = 1000 * 60 * 60 * 24 * 365 * 3;

	public static final long AGENCY_TIME_MENU4 = 1000 * 60 * 60 * 24 * 365 * 4;

	public static final String ACCESSTOKEN_ZQSOFT = "75f05661-78e6-455b-9ac5-fa5968646594";

	public static final String USER_UID = "uId";

	public static final String USER_USERID = "userID";

	public static final String USER_NAME = "userName";

	public static final String ADMIN_ID = "admin"; // 机构管理员账号

	public static final String ADMIN_PWD = "324:ab02eadf0b911acf28ecac8c27fc45e6c717ed7cbda69928:9cfb43127d52d7d1172609c369095364e1971f02006e7b81"; // 机构管理员密码

	public static final String AGENCY_DEFAULT_DEPARTMENT_CODE = "DEFAULT_DEPARMENT"; // 默认机构部门编码

	public static final String AGENCY_DEFAULT_DEPARTMENT_DESCRIPTION = "默认部门，请勿删除."; // 默认机构部门描述

	public static final String AGENCY_DEFAULT_ROLE_CODE = "DEFAULT_ROLE"; // 默认机构管理员编码

	public static final String AGENCY_DEFAULT_ROLE_NAME = "管理员"; // 默认机构管理员编码

	public static final String AGENCY_DEFAULT_USER_CODE = "DEFAULT_USER"; // 默认机构管理员编码

	public static final String LOCKSTATUS_LOCK = "1"; // 锁定

	public static final String LOCKSTATUS_UNLOCK = "0"; // 未锁定

	public static final String URL_ZQFLOW = "http://192.168.1.82:8080/zqflow";

	public static final String URL_PRODEF = URL_ZQFLOW + "/1/processDefinitions";

	public static final String TOKEN_ZQFLOW = "zqibp";

	public static final String ADMIN_ROLECODE_INFOCENTER_PROVINCE = "ADMIN_INFOCENTER_PROVINCE"; // 省信息化中心管理员

	public static final String ADMIN_ROLECODE_INFOCENTER_CITY = "ADMIN_INFOCENTER_CITY"; // 市信息化中心管理员

	public static final String ADMIN_ROLECODE_INFOCENTER_COUNTY = "ADMIN_INFOCENTER_COUNTY"; // 县信息化中心管理员

	public static final String ADMIN_ROLECODE_GOVDEPART_PROVINCE = "ADMIN_GOVDEPART_PROVINCE"; // 省政务部门管理员

	public static final String ADMIN_ROLECODE_GOVDEPART_CITY = "ADMIN_GOVDEPART_CITY"; // 市政务部门管理员

	public static final String ADMIN_ROLECODE_GOVDEPART_COUNTY = "ADMIN_GOVDEPART_COUNTY"; // 县政务部门管理员

	public static final String DEPARTMENT_TYPE_IC = "ic"; // 部门类别：信息化中心

	public static final String DEPARTMENT_TYPE_GOV = "gov"; // 部门类别：政务部门

	public static final String DEPARTMENT_PREFFIX_IC = "0"; // 信息化中心编号前缀

	public static final String DEPARTMENT_PREFFIX_GOV = "1"; // 政务部门编号前缀
	
	public static final String DEFAULT_SUM_OBJ = "1";	//默认汇总对象
	
	public static final int DEFAULT_YEAR = 2015; //默认报送年
	
	public static final String INVEST_DATE_TEYPE_FIVE_YEAR_PLAN = "0";	//投资时间的类型 五年计划
	
	public static final String INVEST_DATE_TYPE_CURRENT_YEAR = "1";	//投资时间的类型  年度
	
	public static final String INVEST_DATE_TYPE_FIVE_YRAE_PLAN_DEFALUT_VALUE = "十二五";	//五年计划默认值
	
	public static final String INVEST_SUM_TYPE_SELF = "0";	//投资表统计类型 本级机关
	
	public static final String INVEST_SUM_TYPE_SUB = "1";	//投资表统计类型  下级合计
	
	public static final String INVEST_SUM_TYPE_TOTAL = "2"; //投资表统计类型    合计
	
	/**
	 * 数据类型：硬件分类编码
	 */
	public static final String TYPE_HARDWARE_CODE = "hardware";
	
	/**
	 * 数据类型：软件分类编码
	 */
	public static final String TYPE_SOFTWARE_CODE = "software";
	
	/**
	 * 国产品牌权重
	 */
	public static final int TYPE_WEIGTH_CHINA = 1;
	
	/**
	 * 国外品牌权重
	 */
	public static final int TYPE_WEIGTH_FOREIGN = 2;
	
	/**
	 * 软件的小分类中 合计的权重
	 */
	public static final int TYPE_WEIGHT_TOTAL = 2;
	
	/**
	 * 网络类型内网
	 */
	public static final String NETWORK_TYPE_IN = "intranet";
	
	
	/**
	 * 网络类型外网
	 */
	public static final String NETWORK_TYPE_OUT = "extranet";
	
	/**
	 * 部署方式 虚拟化
	 */
	public static final String DEPLOY_WAR_VIRTUAL = "virtual";
	
//	/**
//	 * 部署方式 托管
//	 */
//	public static final String DEPLOY_WAR_TRUSTEESHIP = "trusteeship";
//	
//	/**
//	 * 部署方式 混合
//	 */
//	public static final String DEPLOY_WAR_MIX = "mix";
	
	/**
	 * 应用系统分类、网站
	 */
	public static final String TYPE_APPSYSTEM_WEBSITE = "website";
}
