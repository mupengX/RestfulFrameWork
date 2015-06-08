package com.tk.orm.user.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.tk.framework.vo.BaseDto;
import com.tk.orm.user.model.SysPrivilegePo;

/**
 * <pre>
 *  
 *  File: SysPrivilegeVo.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  权限DTO
 * 
 *  Notes:
 *  $Id: SysPrivilegeVo.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月24日下午1:36:12>>, <<Who>>, <<what>>  
 *  2014年12月24日		TK		Initial.
 * </pre>
 */
public class SysPrivilegeDto extends BaseDto
{

	private static final long serialVersionUID = 7079150384710891866L;

	// Fields
	private String id; // '主键'

	private String pmType; // '权限主体类型'

	private String pmID; // '权限主体ID(fk)'

	private String pmJson;// '权限主体JSON描述'

	private String resOpType; // '资源操作类型'

	private String resOpID; // '资源操作ID(fk)'

	private String resOpJson;// '资源操作JSON描述'

	private String permission; // '权限：F/N/R'

	private String agencyCode; // '机构编码(fk)'

	private String recStatus; // '数据状态'

	private String createBy; // '创建者(fk)'

	private Date createDate; // '创建时间'

	private String lastEditBy; // '修改者(fk)'

	private Date lastEditDate; // '修改时间'

	private String remarks; // '备注'

	private String extend1; // '扩展字段1'

	private String extend2; // '扩展字段2'

	private String extend3; // '扩展字段3'

	public SysPrivilegeDto()
	{
		super();
	}

	public SysPrivilegeDto(SysPrivilegePo po)
	{
		super();
		BeanUtils.copyProperties(po, this);
	}

	public SysPrivilegePo SysPrivilegeDto2Po(SysPrivilegeDto dto)
	{
		SysPrivilegePo po = new SysPrivilegePo();
		BeanUtils.copyProperties(dto, po);
		return po;
	}

	/**
	 * @return the id
	 */

	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the pmType
	 */

	public String getPmType()
	{
		return pmType;
	}

	/**
	 * @param pmType the pmType to set
	 */
	public void setPmType(String pmType)
	{
		this.pmType = pmType;
	}

	/**
	 * @return the pmID
	 */

	public String getPmID()
	{
		return pmID;
	}

	/**
	 * @param pmID the pmID to set
	 */
	public void setPmID(String pmID)
	{
		this.pmID = pmID;
	}
	
	/**
	 * @return the pmJson
	 */
	
	public String getPmJson()
	{
		return pmJson;
	}

	/**
	 * @param pmJson the pmJson to set
	 */
	public void setPmJson(String pmJson)
	{
		this.pmJson = pmJson;
	}

	/**
	 * @return the resOpType
	 */

	public String getResOpType()
	{
		return resOpType;
	}

	/**
	 * @param resOpType the resOpType to set
	 */
	public void setResOpType(String resOpType)
	{
		this.resOpType = resOpType;
	}

	/**
	 * @return the resOpID
	 */

	public String getResOpID()
	{
		return resOpID;
	}

	/**
	 * @param resOpID the resOpID to set
	 */
	public void setResOpID(String resOpID)
	{
		this.resOpID = resOpID;
	}

	/**
	 * @return the resOpJson
	 */
	
	public String getResOpJson()
	{
		return resOpJson;
	}

	/**
	 * @param resOpJson the resOpJson to set
	 */
	public void setResOpJson(String resOpJson)
	{
		this.resOpJson = resOpJson;
	}

	/**
	 * @return the permission
	 */

	public String getPermission()
	{
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission)
	{
		this.permission = permission;
	}

	/**
	 * @return the agencyCode
	 */

	public String getAgencyCode()
	{
		return agencyCode;
	}

	/**
	 * @param agencyCode the agencyCode to set
	 */
	public void setAgencyCode(String agencyCode)
	{
		this.agencyCode = agencyCode;
	}

	/**
	 * @return the recStatus
	 */

	public String getRecStatus()
	{
		return recStatus;
	}

	/**
	 * @param recStatus the recStatus to set
	 */
	public void setRecStatus(String recStatus)
	{
		this.recStatus = recStatus;
	}

	/**
	 * @return the createBy
	 */

	public String getCreateBy()
	{
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy)
	{
		this.createBy = createBy;
	}

	/**
	 * @return the createDate
	 */

	public Date getCreateDate()
	{
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	/**
	 * @return the lastEditBy
	 */

	public String getLastEditBy()
	{
		return lastEditBy;
	}

	/**
	 * @param lastEditBy the lastEditBy to set
	 */
	public void setLastEditBy(String lastEditBy)
	{
		this.lastEditBy = lastEditBy;
	}

	/**
	 * @return the lastEditDate
	 */

	public Date getLastEditDate()
	{
		return lastEditDate;
	}

	/**
	 * @param lastEditDate the lastEditDate to set
	 */
	public void setLastEditDate(Date lastEditDate)
	{
		this.lastEditDate = lastEditDate;
	}

	/**
	 * @return the remarks
	 */

	public String getRemarks()
	{
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}

	/**
	 * @return the extend1
	 */

	public String getExtend1()
	{
		return extend1;
	}

	/**
	 * @param extend1 the extend1 to set
	 */
	public void setExtend1(String extend1)
	{
		this.extend1 = extend1;
	}

	/**
	 * @return the extend2
	 */

	public String getExtend2()
	{
		return extend2;
	}

	/**
	 * @param extend2 the extend2 to set
	 */
	public void setExtend2(String extend2)
	{
		this.extend2 = extend2;
	}

	/**
	 * @return the extend3
	 */

	public String getExtend3()
	{
		return extend3;
	}

	/**
	 * @param extend3 the extend3 to set
	 */
	public void setExtend3(String extend3)
	{
		this.extend3 = extend3;
	}
}
