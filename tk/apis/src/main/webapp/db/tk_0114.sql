/*
MySQL Data Transfer
Source Host: localhost
Source Database: tk
Target Host: localhost
Target Database: tk
Date: 2015/1/14 17:05:14
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for esso_sessions
-- ----------------------------
DROP TABLE IF EXISTS `esso_sessions`;
CREATE TABLE `esso_sessions` (
  `AGENCY_CODE` varchar(16) DEFAULT NULL,
  `SSO_SESSION_ID` varchar(32) NOT NULL,
  `SSO_USER_NAME` varchar(16) NOT NULL,
  `ACTION_BY_PRODUCT` varchar(16) NOT NULL DEFAULT '',
  `ACTION_BY_IP` varchar(20) NOT NULL,
  `REC_DATE` datetime NOT NULL,
  `REC_STATUS` varchar(1) NOT NULL,
  `REC_USER_ID` varchar(16) NOT NULL,
  `SSO_SESSION_EXPIRATION` varchar(32) NOT NULL,
  `SSO_SESSION_STATUS` varchar(1) NOT NULL,
  `SSO_SESSION_CREATION` datetime NOT NULL,
  `USERID` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`SSO_SESSION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SD_Name` varchar(64) DEFAULT NULL COMMENT '部门名称',
  `SD_Code` varchar(64) DEFAULT NULL COMMENT '部门编码',
  `SD_Description` varchar(255) DEFAULT NULL COMMENT '部门描述',
  `SD_ParentID` varchar(64) DEFAULT NULL COMMENT '上级部门',
  `SD_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码',
  `SD_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SD_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SD_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SD_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SD_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人',
  `SD_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SD_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SD_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SD_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SD_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SD_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SD_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SD_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Table structure for sys_privilege_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_privilege_relation`;
CREATE TABLE `sys_privilege_relation` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SP_PmType` varchar(64) DEFAULT NULL COMMENT '权限主体类型',
  `SP_PmID` varchar(64) DEFAULT NULL COMMENT '权限主体ID(fk)',
  `SP_ResOpType` varchar(64) DEFAULT NULL COMMENT '资源操作类型',
  `SP_ResOpID` varchar(64) DEFAULT NULL COMMENT '资源操作ID(fk)',
  `SP_Permission` varchar(1) DEFAULT NULL COMMENT '权限：F/N/R',
  `SP_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SP_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SP_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SP_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SP_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SP_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SP_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SP_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SP_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SP_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Table structure for sys_resourceoperation
-- ----------------------------
DROP TABLE IF EXISTS `sys_resourceoperation`;
CREATE TABLE `sys_resourceoperation` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SRO_ModuleCode` varchar(64) DEFAULT NULL COMMENT '模块代码，程序中的注解',
  `SRO_ModuleName` varchar(64) DEFAULT NULL COMMENT '模块名称',
  `SRO_ResourceCode` varchar(64) DEFAULT NULL COMMENT '资源代码，程序中的注解',
  `SRO_ResourceName` varchar(64) DEFAULT NULL COMMENT '资源名称',
  `SRO_OperateCode` varchar(64) DEFAULT NULL COMMENT '操作代码，程序中的注解',
  `SRO_OperateName` varchar(64) DEFAULT NULL COMMENT '操作名称',
  `SRO_OperateLevelCode` varchar(64) DEFAULT NULL COMMENT '操作级别代码，程序中的注解',
  `SRO_OperateLevel` varchar(64) DEFAULT NULL COMMENT '操作级别',
  `SRO_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SRO_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SRO_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SRO_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SRO_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SRO_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID外键(fk)',
  `SRO_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SRO_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SRO_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SRO_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SRO_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SRO_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SRO_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SRO_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源操作表';

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SR_Code` varchar(64) DEFAULT NULL COMMENT '角色编码',
  `SR_Name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `SR_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SR_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SR_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SR_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SR_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SR_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID外键(fk)',
  `SR_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SR_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SR_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SR_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SR_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SR_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SR_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SR_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SU_UserID` varchar(64) DEFAULT NULL COMMENT '用户ID',
  `SU_UserPwd` varchar(64) DEFAULT NULL COMMENT '用户密码',
  `SU_Code` varchar(64) DEFAULT NULL COMMENT '用户编码',
  `SU_Name` varchar(64) DEFAULT NULL COMMENT '用户名称',
  `SU_DeptID` varchar(64) DEFAULT NULL COMMENT '部门ID[fk]',
  `SU_UserDetail` varchar(64) DEFAULT NULL COMMENT '用户详情[fk]',
  `SU_RegDate` date DEFAULT NULL COMMENT '注册日期',
  `SU_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SU_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SU_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SU_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SU_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SU_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SU_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SU_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SU_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SU_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SU_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SU_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SU_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SU_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for sys_user_detail
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_detail`;
CREATE TABLE `sys_user_detail` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SUD_RealName` varchar(64) DEFAULT NULL COMMENT '姓名',
  `SUD_Sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `SUD_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SUD_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SUD_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SUD_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SUD_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SUD_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SUD_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SUD_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SUD_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SUD_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SUD_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SUD_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SUD_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SUD_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户详情表';

-- ----------------------------
-- Table structure for sys_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role_relation`;
CREATE TABLE `sys_user_role_relation` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SUR_UserID` varchar(64) NOT NULL COMMENT '用户ID(fk)',
  `SUR_RoleID` varchar(64) DEFAULT NULL COMMENT '角色ID(fk)',
  `SUR_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编码(fk)',
  `SUR_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SUR_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SUR_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SUR_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID外键(fk)',
  `SUR_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SUR_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SUR_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SUR_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SUR_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SUR_Extend1` varchar(64) DEFAULT NULL COMMENT '扩展字段1',
  `SUR_Extend2` varchar(64) DEFAULT NULL COMMENT '扩展字段2',
  `SUR_Extend3` varchar(64) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `sys_user` VALUES ('123', 'mupeng', 'admin', null, null, null, null, null, 'A1', null, null, null, null, null, null, null, null, null, null, null, null, null);
