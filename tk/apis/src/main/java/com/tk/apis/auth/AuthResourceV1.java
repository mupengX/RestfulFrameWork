package com.tk.apis.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tk.apis.auth.model.AuthRequestModel;
import com.tk.auth.utils.AuthAdapter;
import com.tk.framework.annotations.IgnoreAuthentication;
import com.tk.framework.annotations.ResourceDescription;
import com.tk.framework.constant.AppConstats;
import com.tk.framework.constant.MessageConstants;
import com.tk.framework.rest.framework.exceptions.BadRequestException;
import com.tk.framework.rest.framework.exceptions.RestException;
import com.tk.framework.rest.framework.model.ResponseModel;
import com.tk.framework.rest.framework.model.RestThreadLocal;
import com.tk.framework.rest.framework.util.ResponseHelper;
import com.tk.framework.util.APILevel;
import com.tk.framework.util.UserType;
import com.tk.framework.util.ValidationUtil;
import com.tk.framework.util.superadmin.SuperAdminUtil;
import com.tk.orm.agency.model.AgencyPo;
import com.tk.orm.auth.model.UserSession;
import com.tk.orm.user.model.SysUserPo;
import com.tk.service.agency.AgencyService;
import com.tk.service.auth.AuthorizeService;
import com.tk.service.user.SysUserService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * <pre>
 *  File: AuthResourcesV1.java
 *  Copyright (C): 2014
 *  Description:
 *  用户身份认证入口api
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月24日下午1:16:25>>, <<Who>>, <<what>>  
 *  2014年12月24日		Tk		Initial.
 * </pre>
 */
@RestController
@RequestMapping(value = "/1/auth")
@Api(value = "auth-resource-v-1")
public class AuthResourceV1
{

	@Autowired
	private AuthorizeService authorizeService;

	//@Autowired 实现AgencyService后将此注释打开
	private AgencyService agencyService;

	//@Autowired 实现SysUserService后将此注释打开
	private SysUserService sysUserService;

	/**
	 * 公网用户登录认证.
	 * 
	 * @param authModel
	 * @return
	 * @throws Exception
	 */
	@IgnoreAuthentication
	@ResourceDescription(Module = "SSO", Resource = "auth", Operation = "publicLogin", ApiLevel = APILevel.PUBLIC, Description = "公网用户登录.")
	@ApiOperation(nickname = "公网用户登录认证.", value = "authPublic", httpMethod = "POST")
	@RequestMapping(value = "/public", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseModel authPublic(@RequestBody AuthRequestModel authModel) throws Exception
	{
		UserType userType = UserType.PUBLIC_USER;
		AuthAdapter authAdapter = AuthAdapter.getAuthAdapter(userType);
		UserSession session = authAdapter.createSession(authModel.getAgency(), authModel.getPassword(), userType,
			authModel.getUserId(), authModel.getProduct());

		return toResponse(session);
	}

	/**
	 * 企业用户登录认证.
	 * 
	 * @param authModel
	 * @return
	 * @throws Exception
	 */
	@IgnoreAuthentication
	@ResourceDescription(Module = "SSO", Resource = "auth", Operation = "agencyLogin", ApiLevel = APILevel.AGENCY, Description = "企业用户登录.")
	@ApiOperation(nickname = "企业用户登录认证.", value = "authAgency", httpMethod = "POST")
	@RequestMapping(value = "/agency", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseModel authAgency(@RequestBody AuthRequestModel authModel) throws Exception
	{
		// #1.如果传递的参数为空，则视为无效数据
		if (ValidationUtil.isEmpty(authModel))
		{
			return ResponseHelper.validationFailure(MessageConstants.DATA_VALIDATION_FAILED);
		}
		String userID = authModel.getUserId();
		String password = authModel.getPassword();
		if (ValidationUtil.isEmpty(userID))
		{
			throw new BadRequestException("账号不能为空.");
		}
		if (ValidationUtil.isEmpty(password))
		{
			throw new BadRequestException("密码不能为空.");
		}
		UserSession session = null;
		boolean isSuperAdmin = SuperAdminUtil.isSuperAdmin(authModel.getUserId());

		if (isSuperAdmin)
		{
			UserType userType = UserType.SUPER_ADMIN;
			AuthAdapter authAdapter = AuthAdapter.getAuthAdapter(userType);
			session = authAdapter.createSession(authModel.getAgency(), authModel.getPassword(), userType,
				authModel.getUserId(), authModel.getProduct());
		}
		else
		{
			AgencyPo agencyPo = agencyService.getAgencyByAccessToken(authModel.getAgency());
			if (ValidationUtil.isEmpty(agencyPo) || "1".equals(agencyPo.getRecStatus()))
			{
				throw new BadRequestException("无效令牌, 请核对您的令牌, 如有疑问请联系管理.");
			}
			UserType userType = UserType.AGENCY_USER;
			AuthAdapter authAdapter = AuthAdapter.getAuthAdapter(userType);
			session = authAdapter.createSession(agencyPo.getId(), authModel.getPassword(), userType,
				authModel.getUserId(), authModel.getProduct());
		}
		return toResponse(session);
	}

	/**
	 * 超级管理员登录认证.
	 * 
	 * @param authModel
	 * @return
	 * @throws RestException
	 */
	@IgnoreAuthentication
	@ResourceDescription(Module = "SSO", Resource = "auth", Operation = "superadminLogin", ApiLevel = APILevel.SUPERADMIN, Description = "超级管理员登录.")
	@ApiOperation(nickname = "超级管理员登录认证.", value = "authSuperAdmin", httpMethod = "POST")
	@RequestMapping(value = "/superadmin", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseModel authSuperAdmin(@RequestBody AuthRequestModel authModel) throws Exception
	{
		// UserType userType = UserType.SUPER_ADMIN;
		// AuthAdapter authAdapter = AuthAdapter.getAuthAdapter(userType);
		// UserSession session = authAdapter.createSession(authModel.getAgency(), authModel.getPassword(), userType,
		// authModel.getUserId(), authModel.getProduct());

		return null;
	}

	private ResponseModel toResponse(UserSession session) throws Exception
	{
		ResponseModel responseModel = new ResponseModel();
		responseModel.setStatus(HttpStatus.OK.value());
		String userID = session.getUserId();
		String agencyCode = session.getAgencyCode();
		boolean isSuperAdmin = SuperAdminUtil.isSuperAdmin(userID);
		SysUserPo po = new SysUserPo();
		if (isSuperAdmin)
		{
			po = SuperAdminUtil.getSuperAdmin(userID);
		}
		else
		{
			po = sysUserService.getSysUserByUserId(agencyCode, userID);
		}

		String uId = po.getId();
		String userName = po.getName();

		Map<String, String> result = new HashMap<String, String>();
		result.put(AppConstats.TOKEN, session.getSsoSessionId());
		result.put(AppConstats.EXPIRE, "" + Integer.parseInt(session.getSsoSessionExpiration()) * 60);
		result.put(AppConstats.USER_UID, "" + uId);
		result.put(AppConstats.USER_USERID, "" + userID);
		result.put(AppConstats.USER_NAME, "" + userName);
		responseModel.setResult(result);
		responseModel.setTraceId(RestThreadLocal.getTraceId());
		return responseModel;
	}
}

/*
 * $Log: av-env.bat,v $
 */