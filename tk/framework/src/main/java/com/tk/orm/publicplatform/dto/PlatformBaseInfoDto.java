package com.tk.orm.publicplatform.dto;

import com.tk.framework.constant.AppConstats;
import com.tk.framework.vo.BaseDto;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * <pre> 
 *  
 *  File: PlatFormBaseInfoDto.java
 *  
 *  Copyright (C): 2015
 *  Description:
 *  公共平台基本信息DTO
 * 
 *  Notes:
 *  $Id: PlatFormBaseInfoDto.java  2014-12-24 23:59:59Z \cy $ 
 * 
 * @Revision History:
 * <<2015年5月13日上午10:09:47>>, <<Who>>, <<what>>  
 *  2015年5月13日		cy		Initial.
 * </pre>
 */
@ApiModel("platform")
public class PlatformBaseInfoDto extends BaseDto
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = -29989950126477938L;
	
	@ApiModelProperty(required = false)
	private String id;	//基本信息ID
	
	private String deptId;	//填报部门ID
	
	private String agencyCode;	//机构编码
	
	private String uid;	//填报人ID
	
	private String sumObj = AppConstats.DEFAULT_SUM_OBJ;	//汇总对象
	
	@ApiModelProperty(required = true)
	private String name;	//公共平台名称
	
	@ApiModelProperty(required = true)
	private int buildStatus;	//建设情况
	
	@ApiModelProperty(required = true)
	private String manaDeptName;	//管理机构全称
	
	@ApiModelProperty(required = true)
	private int manaDeptType;	//管理机构性质
	
	@ApiModelProperty(required = true)
	private String manaDeptAddress;	//详细地址
	
	@ApiModelProperty(required = true)
	private String manaTel;	//管理机构电话
	
	@ApiModelProperty(required = true)
	private String manaFax;	//管理机构传真
	
	@ApiModelProperty(required = true)
	private String manaMail;	//管理结构邮件
	
	@ApiModelProperty(required = true)
	private String operationalDeptName;	//运维机构名称
	
	@ApiModelProperty(required = true)
	private int operationalDeptType;	//运维机构性质
	
	@ApiModelProperty(required = true)
	private int operationalCountOfPeople;	//运维机构人数
	
	@ApiModelProperty(required = true)
	private int operationalDeptManner;	//运维方式
	
	@ApiModelProperty(required = true)
	private String operationalDeptTel;	//运维机构联系电话
	
	@ApiModelProperty(required = true)
	private String operationalDeptFax;	//运维机构传真
	
	@ApiModelProperty(required = true)	
	private String operationalDeptMail;	//运维机构电子邮件
	
	@ApiModelProperty(required = true)
	private String roomArea;	//机房面积
	
	@ApiModelProperty(required = true)
	private String shieldedRoomArea;	//屏蔽机房面积
	
	@ApiModelProperty(required = true)
	private int cabinetCount;	//机柜个数
	
	@ApiModelProperty(required = true)
	private int outCabinetCount;	//外机柜个数
	
	@ApiModelProperty(required = true)
	private int shieldedCabinetCount;	//屏蔽机柜个数
	
	@ApiModelProperty(required = true)
	private int insideCabinetCount;	//内网机柜个数
	
	@ApiModelProperty(required = true)
	private int extranetDeptCount;	//应当接入外网的本级政务部门个数
	
	@ApiModelProperty(required = true)
	private int realExtranetDeptCount;	//实际接入外网的本级政务部门个数
	
	@ApiModelProperty(required = true)
	private int intranetDeptCount;	//应该接入内网的本级政务部门个数
	
	@ApiModelProperty(required = true)
	private int realIntranetDeptCount;	//实际接入内网的本级政务部门个数
	
	@ApiModelProperty(required = true)
	private int isUnity;	//是否有统一的互联网接口
	
	@ApiModelProperty(required = true)
	private int outLineCount;	//互联网出口线路条数
	
	@ApiModelProperty(required = true)
	private int outBandwidth;	//总出口带宽
	
	@ApiModelProperty(required = true)
	private int serviceCount;	//目前为本级多少个政务部门提供服务
	
	@ApiModelProperty(required = true)
	private String totalAssets;	//资产总值
	
	@ApiModelProperty(required = true)
	private String hardwareAssets;	//硬件资产
	
	@ApiModelProperty(required = true)
	private String softwareAssets;	//系统软件资产
	
	@ApiModelProperty(required = true)
	private String appAssets;	//应用软件资产
	
	@ApiModelProperty(required = true)
	private String otherAssets;	//其他资产
	
	@ApiModelProperty(required = true)
	private String totalFinanical;	//累计本级财政
	
	@ApiModelProperty(required = true)
	private String totalParentFinanical;	//累计上级财政
	
	@ApiModelProperty(required = true)
	private String totalSocietyInvest;	//累计社会投资
	
	@ApiModelProperty(required = true)
	private String totalProjectBuild;	//累计项目建设
	
	@ApiModelProperty(required = true)
	private String totalOperateSercie;	//累计运维服务
	
	@ApiModelProperty(required = true)
	private String totalNetOperateService;	//累计网络运维服务
	
	@ApiModelProperty(required = true)
	private String currentFinanical;	//本年本级财政
	
	@ApiModelProperty(required = true)
	private String currentParentFinanical;	//本年上级财政
	
	@ApiModelProperty(required = true)
	private String currentSocietyInvest;	//本年社会投资
	
	@ApiModelProperty(required = true)
	private String currentProjectBuild;	//本年项目建设
	
	@ApiModelProperty(required = true)
	private String currentOperateSercie;	//本年运维服务
	
	@ApiModelProperty(required = true)
	private String currentNetOperateService;	//本年网络运维服务
	
	public PlatformBaseInfoDto()
	{
		super();
	}
	
	public PlatformBaseInfoDto(String id, String deptId, String agencyCode, String uid, String sumObj, String name,
			int buildStatus, String manaDeptName, int manaDeptType, String manaDeptAddress, String manaTel,
			String manaFax, String manaMail, String operationalDeptName, int operationalDeptType,
			int operationalCountOfPeople, int operationalDeptManner, String operationalDeptTel,
			String operationalDeptFax, String operationalDeptMail, String roomArea, String shieldedRoomArea,
			int cabinetCount, int outCabinetCount, int shieldedCabinetCount, int insideCabinetCount,
			int extranetDeptCount, int realExtranetDeptCount, int intranetDeptCount, int realIntranetDeptCount,
			int isUnity, int outLineCount, int outBandwidth, int serviceCount, String totalAssets,
			String hardwareAssets, String softwareAssets, String appAssets, String otherAssets, String totalFinanical,
			String totalParentFinanical, String totalSocietyInvest, String totalProjectBuild,
			String totalOperateSercie, String totalNetOperateService, String currentFinanical,
			String currentParentFinanical, String currentSocietyInvest, String currentProjectBuild,
			String currentOperateSercie, String currentNetOperateService)
	{
		super();
		this.id = id;
		this.deptId = deptId;
		this.agencyCode = agencyCode;
		this.uid = uid;
		this.sumObj = sumObj;
		this.name = name;
		this.buildStatus = buildStatus;
		this.manaDeptName = manaDeptName;
		this.manaDeptType = manaDeptType;
		this.manaDeptAddress = manaDeptAddress;
		this.manaTel = manaTel;
		this.manaFax = manaFax;
		this.manaMail = manaMail;
		this.operationalDeptName = operationalDeptName;
		this.operationalDeptType = operationalDeptType;
		this.operationalCountOfPeople = operationalCountOfPeople;
		this.operationalDeptManner = operationalDeptManner;
		this.operationalDeptTel = operationalDeptTel;
		this.operationalDeptFax = operationalDeptFax;
		this.operationalDeptMail = operationalDeptMail;
		this.roomArea = roomArea;
		this.shieldedRoomArea = shieldedRoomArea;
		this.cabinetCount = cabinetCount;
		this.outCabinetCount = outCabinetCount;
		this.shieldedCabinetCount = shieldedCabinetCount;
		this.insideCabinetCount = insideCabinetCount;
		this.extranetDeptCount = extranetDeptCount;
		this.realExtranetDeptCount = realExtranetDeptCount;
		this.intranetDeptCount = intranetDeptCount;
		this.realIntranetDeptCount = realIntranetDeptCount;
		this.isUnity = isUnity;
		this.outLineCount = outLineCount;
		this.outBandwidth = outBandwidth;
		this.serviceCount = serviceCount;
		this.totalAssets = totalAssets;
		this.hardwareAssets = hardwareAssets;
		this.softwareAssets = softwareAssets;
		this.appAssets = appAssets;
		this.otherAssets = otherAssets;
		this.totalFinanical = totalFinanical;
		this.totalParentFinanical = totalParentFinanical;
		this.totalSocietyInvest = totalSocietyInvest;
		this.totalProjectBuild = totalProjectBuild;
		this.totalOperateSercie = totalOperateSercie;
		this.totalNetOperateService = totalNetOperateService;
		this.currentFinanical = currentFinanical;
		this.currentParentFinanical = currentParentFinanical;
		this.currentSocietyInvest = currentSocietyInvest;
		this.currentProjectBuild = currentProjectBuild;
		this.currentOperateSercie = currentOperateSercie;
		this.currentNetOperateService = currentNetOperateService;
	}



	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getBuildStatus()
	{
		return buildStatus;
	}

	public void setBuildStatus(int buildStatus)
	{
		this.buildStatus = buildStatus;
	}

	public String getManaDeptName()
	{
		return manaDeptName;
	}

	public void setManaDeptName(String manaDeptName)
	{
		this.manaDeptName = manaDeptName;
	}

	public int getManaDeptType()
	{
		return manaDeptType;
	}

	public void setManaDeptType(int manaDeptType)
	{
		this.manaDeptType = manaDeptType;
	}

	public String getManaDeptAddress()
	{
		return manaDeptAddress;
	}

	public void setManaDeptAddress(String manaDeptAddress)
	{
		this.manaDeptAddress = manaDeptAddress;
	}

	public String getManaTel()
	{
		return manaTel;
	}

	public void setManaTel(String manaTel)
	{
		this.manaTel = manaTel;
	}

	public String getManaFax()
	{
		return manaFax;
	}

	public void setManaFax(String manaFax)
	{
		this.manaFax = manaFax;
	}

	public String getManaMail()
	{
		return manaMail;
	}

	public void setManaMail(String manaMail)
	{
		this.manaMail = manaMail;
	}

	public String getOperationalDeptName()
	{
		return operationalDeptName;
	}

	public void setOperationalDeptName(String operationalDeptName)
	{
		this.operationalDeptName = operationalDeptName;
	}

	public int getOperationalDeptType()
	{
		return operationalDeptType;
	}

	public void setOperationalDeptType(int operationalDeptType)
	{
		this.operationalDeptType = operationalDeptType;
	}

	public int getOperationalCountOfPeople()
	{
		return operationalCountOfPeople;
	}

	public void setOperationalCountOfPeople(int operationalCountOfPeople)
	{
		this.operationalCountOfPeople = operationalCountOfPeople;
	}

	public int getOperationalDeptManner()
	{
		return operationalDeptManner;
	}

	public void setOperationalDeptManner(int operationalDeptManner)
	{
		this.operationalDeptManner = operationalDeptManner;
	}

	public String getOperationalDeptTel()
	{
		return operationalDeptTel;
	}

	public void setOperationalDeptTel(String operationalDeptTel)
	{
		this.operationalDeptTel = operationalDeptTel;
	}

	public String getOperationalDeptFax()
	{
		return operationalDeptFax;
	}

	public void setOperationalDeptFax(String operationalDeptFax)
	{
		this.operationalDeptFax = operationalDeptFax;
	}

	public String getOperationalDeptMail()
	{
		return operationalDeptMail;
	}

	public void setOperationalDeptMail(String operationalDeptMail)
	{
		this.operationalDeptMail = operationalDeptMail;
	}

	public String getRoomArea()
	{
		return roomArea;
	}

	public void setRoomArea(String roomArea)
	{
		this.roomArea = roomArea;
	}

	public String getShieldedRoomArea()
	{
		return shieldedRoomArea;
	}

	public void setShieldedRoomArea(String shieldedRoomArea)
	{
		this.shieldedRoomArea = shieldedRoomArea;
	}

	public int getCabinetCount()
	{
		return cabinetCount;
	}

	public void setCabinetCount(int cabinetCount)
	{
		this.cabinetCount = cabinetCount;
	}

	public int getOutCabinetCount()
	{
		return outCabinetCount;
	}

	public void setOutCabinetCount(int outCabinetCount)
	{
		this.outCabinetCount = outCabinetCount;
	}

	public int getShieldedCabinetCount()
	{
		return shieldedCabinetCount;
	}

	public void setShieldedCabinetCount(int shieldedCabinetCount)
	{
		this.shieldedCabinetCount = shieldedCabinetCount;
	}

	public int getInsideCabinetCount()
	{
		return insideCabinetCount;
	}

	public void setInsideCabinetCount(int insideCabinetCount)
	{
		this.insideCabinetCount = insideCabinetCount;
	}

	public int getExtranetDeptCount()
	{
		return extranetDeptCount;
	}

	public void setExtranetDeptCount(int extranetDeptCount)
	{
		this.extranetDeptCount = extranetDeptCount;
	}

	public int getRealExtranetDeptCount()
	{
		return realExtranetDeptCount;
	}

	public void setRealExtranetDeptCount(int realExtranetDeptCount)
	{
		this.realExtranetDeptCount = realExtranetDeptCount;
	}

	public int getIntranetDeptCount()
	{
		return intranetDeptCount;
	}

	public void setIntranetDeptCount(int intranetDeptCount)
	{
		this.intranetDeptCount = intranetDeptCount;
	}

	public int getRealIntranetDeptCount()
	{
		return realIntranetDeptCount;
	}

	public void setRealIntranetDeptCount(int realIntranetDeptCount)
	{
		this.realIntranetDeptCount = realIntranetDeptCount;
	}

	public int getIsUnity()
	{
		return isUnity;
	}

	public void setIsUnity(int isUnity)
	{
		this.isUnity = isUnity;
	}

	public int getOutLineCount()
	{
		return outLineCount;
	}

	public void setOutLineCount(int outLineCount)
	{
		this.outLineCount = outLineCount;
	}

	public int getOutBandwidth()
	{
		return outBandwidth;
	}

	public void setOutBandwidth(int outBandwidth)
	{
		this.outBandwidth = outBandwidth;
	}

	public int getServiceCount()
	{
		return serviceCount;
	}

	public void setServiceCount(int serviceCount)
	{
		this.serviceCount = serviceCount;
	}

	public String getTotalAssets()
	{
		return totalAssets;
	}

	public void setTotalAssets(String totalAssets)
	{
		this.totalAssets = totalAssets;
	}

	public String getHardwareAssets()
	{
		return hardwareAssets;
	}

	public void setHardwareAssets(String hardwareAssets)
	{
		this.hardwareAssets = hardwareAssets;
	}

	public String getSoftwareAssets()
	{
		return softwareAssets;
	}

	public void setSoftwareAssets(String softwareAssets)
	{
		this.softwareAssets = softwareAssets;
	}

	public String getAppAssets()
	{
		return appAssets;
	}

	public void setAppAssets(String appAssets)
	{
		this.appAssets = appAssets;
	}

	public String getOtherAssets()
	{
		return otherAssets;
	}

	public void setOtherAssets(String otherAssets)
	{
		this.otherAssets = otherAssets;
	}

	public String getDeptId()
	{
		return deptId;
	}

	public void setDeptId(String deptId)
	{
		this.deptId = deptId;
	}

	public String getAgencyCode()
	{
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}
	
	public String getSumObj()
	{
		return sumObj;
	}

	public void setSumObj(String sumObj)
	{
		this.sumObj = sumObj;
	}

	public String getUid()
	{
		return uid;
	}

	public void setUid(String uid)
	{
		this.uid = uid;
	}

	public String getTotalFinanical()
	{
		return totalFinanical;
	}

	public void setTotalFinanical(String totalFinanical)
	{
		this.totalFinanical = totalFinanical;
	}

	public String getTotalParentFinanical()
	{
		return totalParentFinanical;
	}

	public void setTotalParentFinanical(String totalParentFinanical)
	{
		this.totalParentFinanical = totalParentFinanical;
	}

	public String getTotalSocietyInvest()
	{
		return totalSocietyInvest;
	}

	public void setTotalSocietyInvest(String totalSocietyInvest)
	{
		this.totalSocietyInvest = totalSocietyInvest;
	}

	public String getTotalProjectBuild()
	{
		return totalProjectBuild;
	}

	public void setTotalProjectBuild(String totalProjectBuild)
	{
		this.totalProjectBuild = totalProjectBuild;
	}

	public String getTotalOperateSercie()
	{
		return totalOperateSercie;
	}

	public void setTotalOperateSercie(String totalOperateSercie)
	{
		this.totalOperateSercie = totalOperateSercie;
	}

	public String getTotalNetOperateService()
	{
		return totalNetOperateService;
	}

	public void setTotalNetOperateService(String totalNetOperateService)
	{
		this.totalNetOperateService = totalNetOperateService;
	}

	public String getCurrentFinanical()
	{
		return currentFinanical;
	}

	public void setCurrentFinanical(String currentFinanical)
	{
		this.currentFinanical = currentFinanical;
	}

	public String getCurrentParentFinanical()
	{
		return currentParentFinanical;
	}

	public void setCurrentParentFinanical(String currentParentFinanical)
	{
		this.currentParentFinanical = currentParentFinanical;
	}

	public String getCurrentSocietyInvest()
	{
		return currentSocietyInvest;
	}

	public void setCurrentSocietyInvest(String currentSocietyInvest)
	{
		this.currentSocietyInvest = currentSocietyInvest;
	}

	public String getCurrentProjectBuild()
	{
		return currentProjectBuild;
	}

	public void setCurrentProjectBuild(String currentProjectBuild)
	{
		this.currentProjectBuild = currentProjectBuild;
	}

	public String getCurrentOperateSercie()
	{
		return currentOperateSercie;
	}

	public void setCurrentOperateSercie(String currentOperateSercie)
	{
		this.currentOperateSercie = currentOperateSercie;
	}

	public String getCurrentNetOperateService()
	{
		return currentNetOperateService;
	}

	public void setCurrentNetOperateService(String currentNetOperateService)
	{
		this.currentNetOperateService = currentNetOperateService;
	}
}

/*
*$Log: av-env.bat,v $
*/