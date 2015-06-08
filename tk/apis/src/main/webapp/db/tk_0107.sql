/*
MySQL Data Transfer
Source Host: localhost
Source Database: tk
Target Host: localhost
Target Database: tk
Date: 2015/1/7 14:56:58
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
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bcdea014a7bcdecdc0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:18:20', 'A', 'mupeng', '3', 'A', '2014-12-24 18:18:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bce78014a7bce7a460000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:18:56', 'A', 'mupeng', '3', 'A', '2014-12-24 18:18:57', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bcf26014a7bcf3e4d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:19:41', 'A', 'mupeng', '3', 'A', '2014-12-24 18:19:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bcf26014a7bcf56a50002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:19:53', 'A', 'mupeng', '3', 'A', '2014-12-24 18:19:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bcf26014a7bcf57770003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:19:53', 'A', 'mupeng', '3', 'A', '2014-12-24 18:19:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a7bcf26014a7bcf58750004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-24 18:19:53', 'A', 'mupeng', '3', 'A', '2014-12-24 18:19:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a804c3f014a804c53400000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-25 15:14:53', 'A', 'mupeng', '3', 'A', '2014-12-25 15:14:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a804c3f014a804c55710002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-25 15:14:53', 'A', 'mupeng', '3', 'A', '2014-12-25 15:14:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a804c3f014a804c565b0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-25 15:14:54', 'A', 'mupeng', '3', 'A', '2014-12-25 15:14:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a804c3f014a804c57170004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-25 15:14:54', 'A', 'mupeng', '3', 'A', '2014-12-25 15:14:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85cf1a014a85cf1fea0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:55:51', 'A', 'mupeng', '3', 'A', '2014-12-26 16:55:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85cf1a014a85cf221c0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:55:52', 'A', 'mupeng', '3', 'A', '2014-12-26 16:55:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85cf1a014a85cf22c80003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:55:52', 'A', 'mupeng', '3', 'A', '2014-12-26 16:55:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85cf1a014a85cf23930004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:55:52', 'A', 'mupeng', '3', 'A', '2014-12-26 16:55:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85cf1a014a85cf246e0005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:55:52', 'A', 'mupeng', '3', 'A', '2014-12-26 16:55:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d091014a85d093380000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:57:26', 'A', 'mupeng', '3', 'A', '2014-12-26 16:57:26', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d0f0014a85d0f3c90000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 16:57:51', 'A', 'mupeng', '3', 'A', '2014-12-26 16:57:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d3ca014a85d3cd290000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:00:58', 'A', 'mupeng', '3', 'A', '2014-12-26 17:00:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d3ca014a85d3cea10002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:00:58', 'A', 'mupeng', '3', 'A', '2014-12-26 17:00:58', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d3ca014a85d3cf7b0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:00:58', 'A', 'mupeng', '3', 'A', '2014-12-26 17:00:58', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d3ca014a85d3d0460004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:00:58', 'A', 'mupeng', '3', 'A', '2014-12-26 17:00:58', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d3ca014a85d3d1010005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:00:59', 'A', 'mupeng', '3', 'A', '2014-12-26 17:00:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d53b014a85d53dc60000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:02:32', 'A', 'mupeng', '3', 'A', '2014-12-26 17:02:32', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d5cd014a85d5cf950000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:03:09', 'A', 'mupeng', '3', 'A', '2014-12-26 17:03:43', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85d7a6014a85d7a92f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:05:10', 'A', 'mupeng', '3', 'A', '2014-12-26 17:05:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85ddf9014a85ddfb4d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:12:05', 'A', 'mupeng', '3', 'A', '2014-12-26 17:12:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85ddf9014a85ddfca40002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:12:05', 'A', 'mupeng', '3', 'A', '2014-12-26 17:12:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85ddf9014a85ddfd7e0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:12:05', 'A', 'mupeng', '3', 'A', '2014-12-26 17:12:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85ddf9014a85ddfe680004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:12:05', 'A', 'mupeng', '3', 'A', '2014-12-26 17:12:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85ddf9014a85ddff230005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:12:06', 'A', 'mupeng', '3', 'A', '2014-12-26 17:12:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85df29014a85df2c580000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:13:23', 'A', 'mupeng', '3', 'A', '2014-12-26 17:13:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85df29014a85df2dde0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:13:23', 'A', 'mupeng', '3', 'A', '2014-12-26 17:13:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85df29014a85df2e8a0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:13:23', 'A', 'mupeng', '3', 'A', '2014-12-26 17:13:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85df29014a85df2f750004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:13:24', 'A', 'mupeng', '3', 'A', '2014-12-26 17:13:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85df29014a85df30300005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:13:24', 'A', 'mupeng', '3', 'A', '2014-12-26 17:13:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e123014a85e125210000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:15:32', 'A', 'mupeng', '3', 'A', '2014-12-26 17:15:32', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e276014a85e2788d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:16:59', 'A', 'mupeng', '3', 'A', '2014-12-26 17:16:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e34a014a85e34c900000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:17:53', 'A', 'mupeng', '3', 'A', '2014-12-26 17:17:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e34a014a85e34e070002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:17:54', 'A', 'mupeng', '3', 'A', '2014-12-26 17:17:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e34a014a85e34ed10003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:17:54', 'A', 'mupeng', '3', 'A', '2014-12-26 17:17:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e34a014a85e34fbc0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:17:54', 'A', 'mupeng', '3', 'A', '2014-12-26 17:17:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e34a014a85e350780005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:17:54', 'A', 'mupeng', '3', 'A', '2014-12-26 17:17:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85e399014a85e39bff0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:18:14', 'A', 'mupeng', '3', 'A', '2014-12-26 17:18:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f146c60000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:33:09', 'A', 'mupeng', '3', 'A', '2014-12-26 17:33:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f6c7bc0001', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:39:10', 'A', 'mupeng', '3', 'A', '2014-12-26 17:39:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f6ef500002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:39:20', 'A', 'mupeng', '3', 'A', '2014-12-26 17:39:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f743970003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:39:42', 'A', 'mupeng', '3', 'A', '2014-12-26 17:39:42', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f788ca0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:39:59', 'A', 'mupeng', '3', 'A', '2014-12-26 17:39:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f7f0020005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:40:26', 'A', 'mupeng', '3', 'A', '2014-12-26 17:40:26', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f896620006', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:41:08', 'A', 'mupeng', '3', 'A', '2014-12-26 17:41:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f8a4750007', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:41:12', 'A', 'mupeng', '3', 'A', '2014-12-26 17:41:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f8f9550008', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:41:34', 'A', 'mupeng', '3', 'A', '2014-12-26 17:41:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85f92f180009', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:41:47', 'A', 'mupeng', '3', 'A', '2014-12-26 17:41:47', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a85f144014a85facad1000a', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-26 17:43:33', 'A', 'mupeng', '3', 'A', '2014-12-26 17:43:33', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93b37b014a93b380de0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:40:22', 'A', 'mupeng', '3', 'A', '2014-12-29 09:42:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93b8c8014a93b8cbc70000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:46:09', 'A', 'mupeng', '3', 'A', '2014-12-29 09:46:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93b8c8014a93b8fddc0001', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:46:22', 'A', 'mupeng', '3', 'A', '2014-12-29 09:46:22', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93b8c8014a93b9827a0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:46:55', 'A', 'mupeng', '3', 'A', '2014-12-29 09:46:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93b8c8014a93ba354f0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:47:41', 'A', 'mupeng', '3', 'A', '2014-12-29 09:47:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93c0182f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:54:07', 'A', 'mupeng', '3', 'A', '2014-12-29 09:54:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93c022d20001', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:54:10', 'A', 'mupeng', '3', 'A', '2014-12-29 09:54:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93c02e830002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 09:54:13', 'A', 'mupeng', '3', 'A', '2014-12-29 09:54:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93d0b2a10003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:12:15', 'A', 'mupeng', '3', 'A', '2014-12-29 10:12:15', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93d0fc820004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:12:34', 'A', 'mupeng', '3', 'A', '2014-12-29 10:12:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93c014014a93d2f74e0005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:14:44', 'A', 'mupeng', '3', 'A', '2014-12-29 10:14:44', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93e68f014a93e691ca0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:36:09', 'A', 'mupeng', '3', 'A', '2014-12-29 10:36:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93e68f014a93ee042c0001', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:44:17', 'A', 'mupeng', '3', 'A', '2014-12-29 10:44:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93e68f014a93ee16460002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:44:21', 'A', 'mupeng', '3', 'A', '2014-12-29 10:44:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93e68f014a93ee1b180003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:44:22', 'A', 'mupeng', '3', 'A', '2014-12-29 10:44:22', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93e68f014a93ee1ec10004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:44:23', 'A', 'mupeng', '3', 'A', '2014-12-29 10:44:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93ef0c014a93ef199f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:45:28', 'A', 'mupeng', '3', 'A', '2014-12-29 10:46:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93ef0c014a93ef7f480002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:45:54', 'A', 'mupeng', '3', 'A', '2014-12-29 10:45:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93ef0c014a93ef96b10003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:46:00', 'A', 'mupeng', '3', 'A', '2014-12-29 10:46:00', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93ef0c014a93efa38d0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:46:03', 'A', 'mupeng', '3', 'A', '2014-12-29 10:46:03', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93ef0c014a93efa9b70005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:46:04', 'A', 'mupeng', '3', 'A', '2014-12-29 10:46:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93f014014a93f016650000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:46:32', 'A', 'mupeng', '3', 'A', '2014-12-29 10:47:02', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a93fb7b014a93fb7dbc0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 10:59:00', 'A', 'mupeng', '3', 'A', '2014-12-29 11:00:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a94ae45014a94ae48df0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 14:14:17', 'A', 'mupeng', '3', 'A', '2014-12-29 14:14:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95331f014a953321ac0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:39:23', 'A', 'mupeng', '3', 'A', '2014-12-29 16:39:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95331f014a9533333b0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:39:28', 'A', 'mupeng', '3', 'A', '2014-12-29 16:39:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95331f014a953333f70003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:39:28', 'A', 'mupeng', '3', 'A', '2014-12-29 16:39:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95331f014a953334d10004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:39:28', 'A', 'mupeng', '3', 'A', '2014-12-29 16:39:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95331f014a9533359c0005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:39:28', 'A', 'mupeng', '3', 'A', '2014-12-29 16:39:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9533e8014a9533eae20000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:40:15', 'A', 'mupeng', '3', 'A', '2014-12-29 16:40:15', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9535ed014a9535f0eb0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:42:27', 'A', 'mupeng', '3', 'A', '2014-12-29 16:42:35', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a953e62014a953e65420000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:51:42', 'A', 'mupeng', '3', 'A', '2014-12-29 16:51:42', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95400f014a954011ce0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:53:31', 'A', 'mupeng', '3', 'A', '2014-12-29 16:53:32', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9544ff014a954501cd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 16:58:55', 'A', 'mupeng', '3', 'A', '2014-12-29 16:58:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95460c014a95460e460000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:00:04', 'A', 'mupeng', '3', 'A', '2014-12-29 17:00:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954a1f014a954a21f30000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:04:31', 'A', 'mupeng', '3', 'A', '2014-12-29 17:04:31', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954ae9014a954aeb8c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:05:22', 'A', 'mupeng', '3', 'A', '2014-12-29 17:05:29', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954caa014a954cac920000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:07:17', 'A', 'mupeng', '3', 'A', '2014-12-29 17:07:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954cfd014a954cffbd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:07:39', 'A', 'mupeng', '3', 'A', '2014-12-29 17:07:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954e4d014a954e4fe80000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:09:05', 'A', 'mupeng', '3', 'A', '2014-12-29 17:09:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a954f1a014a954f1d080000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:09:57', 'A', 'mupeng', '3', 'A', '2014-12-29 17:10:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9551b5014a9551b8200000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:12:48', 'A', 'mupeng', '3', 'A', '2014-12-29 17:12:48', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9552d7014a9552d9630000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:14:02', 'A', 'mupeng', '3', 'A', '2014-12-29 17:14:02', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9553ae014a9553b12c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:14:57', 'A', 'mupeng', '3', 'A', '2014-12-29 17:14:57', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9554ec014a9554eeb50000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:16:18', 'A', 'mupeng', '3', 'A', '2014-12-29 17:16:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955658014a95565b2d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:17:52', 'A', 'mupeng', '3', 'A', '2014-12-29 17:17:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955658014a95565d500002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:17:52', 'A', 'mupeng', '3', 'A', '2014-12-29 17:17:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955658014a95565e0c0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:17:53', 'A', 'mupeng', '3', 'A', '2014-12-29 17:17:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955658014a95565ec70004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:17:53', 'A', 'mupeng', '3', 'A', '2014-12-29 17:17:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955658014a95565f820005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:17:53', 'A', 'mupeng', '3', 'A', '2014-12-29 17:17:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955988014a95598a9d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:21:21', 'A', 'mupeng', '3', 'A', '2014-12-29 17:21:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955a49014a955a4b220000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:10', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955a49014a955a4d350002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:10', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955a49014a955a4dd10003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:11', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955a49014a955a4e9c0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:11', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955a49014a955a4f470005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:11', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ae6014a955ae8c80000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:50', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ae6014a955aea6d0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:51', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ae6014a955aeb390003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:51', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ae6014a955aebf40004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:51', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ae6014a955aeca00005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:22:51', 'A', 'mupeng', '3', 'A', '2014-12-29 17:22:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955b8e014a955b90640000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:23:33', 'A', 'mupeng', '3', 'A', '2014-12-29 17:23:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955b8e014a955b91bc0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:23:33', 'A', 'mupeng', '3', 'A', '2014-12-29 17:23:33', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955b8e014a955b92680003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:23:34', 'A', 'mupeng', '3', 'A', '2014-12-29 17:23:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955b8e014a955b93320004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:23:34', 'A', 'mupeng', '3', 'A', '2014-12-29 17:23:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955b8e014a955b93de0005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:23:34', 'A', 'mupeng', '3', 'A', '2014-12-29 17:23:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955ce6014a955ce8cd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:25:01', 'A', 'mupeng', '3', 'A', '2014-12-29 17:25:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955e52014a955e54f60000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:26:34', 'A', 'mupeng', '3', 'A', '2014-12-29 17:26:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955f37014a955f39db0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:27:33', 'A', 'mupeng', '3', 'A', '2014-12-29 17:27:33', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a955fff014a956002720000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:28:24', 'A', 'mupeng', '3', 'A', '2014-12-29 17:28:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95603b014a95603e120000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:28:40', 'A', 'mupeng', '3', 'A', '2014-12-29 17:28:40', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9560a8014a9560aa4b0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:29:07', 'A', 'mupeng', '3', 'A', '2014-12-29 17:29:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9562d9014a9562db640000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:31:31', 'A', 'mupeng', '3', 'A', '2014-12-29 17:31:31', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9564ef014a9564f1780000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:33:48', 'A', 'mupeng', '3', 'A', '2014-12-29 17:33:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9564ef014a9564f2cf0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:33:48', 'A', 'mupeng', '3', 'A', '2014-12-29 17:33:48', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9564ef014a9564f3940003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:33:48', 'A', 'mupeng', '3', 'A', '2014-12-29 17:33:48', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9564ef014a9564f4640004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:33:49', 'A', 'mupeng', '3', 'A', '2014-12-29 17:33:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9564ef014a9564f5330005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:33:49', 'A', 'mupeng', '3', 'A', '2014-12-29 17:33:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956530014a9565333c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:34:05', 'A', 'mupeng', '3', 'A', '2014-12-29 17:34:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95659f014a9565a0ed0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:34:33', 'A', 'mupeng', '3', 'A', '2014-12-29 17:34:33', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95665e014a9566600c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:35:22', 'A', 'mupeng', '3', 'A', '2014-12-29 17:35:22', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9566a7014a9566aa350000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:35:41', 'A', 'mupeng', '3', 'A', '2014-12-29 17:35:43', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9567d9014a9567db720000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:36:59', 'A', 'mupeng', '3', 'A', '2014-12-29 17:36:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956807014a95680a1b0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:37:11', 'A', 'mupeng', '3', 'A', '2014-12-29 17:37:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95691f014a9569217c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:22', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95691f014a956922e00002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:23', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95691f014a9569238d0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:23', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95691f014a956924430004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:23', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95691f014a956925160005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:23', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956956014a956958760000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:36', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:40', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956956014a956959dd0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:37', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956956014a95695a8c0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:37', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956956014a95695b4a0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:37', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956956014a95695c340005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:38:37', 'A', 'mupeng', '3', 'A', '2014-12-29 17:38:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a956b6e014a956b70390000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:40:53', 'A', 'mupeng', '3', 'A', '2014-12-29 17:40:53', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9570d8014a9570da380000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:46:48', 'A', 'mupeng', '3', 'A', '2014-12-29 17:46:48', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957142014a9571442c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:15', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957142014a957145750002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:16', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957142014a957146130003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:16', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957142014a957146bf0004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:16', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957142014a9571477a0005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:16', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9571e8014a9571e9ca0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:47:58', 'A', 'mupeng', '3', 'A', '2014-12-29 17:47:58', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957234014a957236c30000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:17', 'A', 'mupeng', '3', 'A', '2014-12-29 17:48:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957234014a9572381c0002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:18', 'A', 'mupeng', '3', 'A', '2014-12-29 17:48:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957234014a957238be0003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:18', 'A', 'mupeng', '3', 'A', '2014-12-29 17:48:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957234014a957239890004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:18', 'A', 'mupeng', '3', 'A', '2014-12-29 17:48:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957234014a95723a440005', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:18', 'A', 'mupeng', '3', 'A', '2014-12-29 17:48:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9572cc014a9572ce480000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:48:56', 'A', 'mupeng', '3', 'A', '2014-12-29 17:49:00', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957454014a9574570d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:50:37', 'A', 'mupeng', '3', 'A', '2014-12-29 17:50:43', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957665014a957666db0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:52:52', 'A', 'mupeng', '3', 'A', '2014-12-29 17:52:52', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9576b3014a9576b61e0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:53:12', 'A', 'mupeng', '3', 'A', '2014-12-29 17:53:18', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957718014a95771c520000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:53:38', 'A', 'mupeng', '3', 'A', '2014-12-29 17:53:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95787e014a957880690000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:55:10', 'A', 'mupeng', '3', 'A', '2014-12-29 17:55:15', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957ca2014a957ca5af0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 17:59:41', 'A', 'mupeng', '3', 'A', '2014-12-29 17:59:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957d34014a957d36cd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:00:18', 'A', 'mupeng', '3', 'A', '2014-12-29 18:00:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a957d92014a957d94500000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:00:42', 'A', 'mupeng', '3', 'A', '2014-12-29 18:01:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958000014a958002980000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:03:22', 'A', 'mupeng', '3', 'A', '2014-12-29 18:03:24', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958183014a958185bd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:05:01', 'A', 'mupeng', '3', 'A', '2014-12-29 18:05:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958491014a958494000000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:08:21', 'A', 'mupeng', '3', 'A', '2014-12-29 18:08:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9586c1014a9586c3320000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:10:44', 'A', 'mupeng', '3', 'A', '2014-12-29 18:10:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958753014a958755440000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:11:22', 'A', 'mupeng', '3', 'A', '2014-12-29 18:11:30', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958802014a958804c90000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:12:06', 'A', 'mupeng', '3', 'A', '2014-12-29 18:12:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9588a3014a9588a5be0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:12:48', 'A', 'mupeng', '3', 'A', '2014-12-29 18:15:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a958d5b014a958d5da00000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:17:57', 'A', 'mupeng', '3', 'A', '2014-12-29 18:18:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95907d014a959081d10000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:21:23', 'A', 'mupeng', '3', 'A', '2014-12-29 18:21:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a95937f014a959381d80000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-29 18:24:39', 'A', 'mupeng', '3', 'A', '2014-12-29 18:24:42', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9984cf014a9984d5490000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 12:47:07', 'A', 'mupeng', '3', 'A', '2014-12-30 12:47:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a998d05014a998d07ab0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 12:56:04', 'A', 'mupeng', '3', 'A', '2014-12-30 12:56:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a998dcd014a998dd0210000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 12:56:55', 'A', 'mupeng', '3', 'A', '2014-12-30 12:56:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a998f26014a998f28920000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 12:58:23', 'A', 'mupeng', '3', 'A', '2014-12-30 12:58:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9993da014a9993dc430000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 13:03:31', 'A', 'mupeng', '3', 'A', '2014-12-30 13:03:31', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a99946b014a99946d820000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 13:04:09', 'A', 'mupeng', '3', 'A', '2014-12-30 13:04:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a99a2bd014a99a2bf300000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 13:19:47', 'A', 'mupeng', '3', 'A', '2014-12-30 13:19:47', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a99a321014a99a3243b0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 13:20:13', 'A', 'mupeng', '3', 'A', '2014-12-30 13:20:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1cca014a9a1cf1fb0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:33:15', 'A', 'mupeng', '3', 'A', '2014-12-30 15:33:15', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1ebb014a9a1ebf4f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:35:13', 'A', 'mupeng', '3', 'A', '2014-12-30 15:35:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1ebb014a9a1f80300001', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:36:03', 'A', 'mupeng', '3', 'A', '2014-12-30 15:36:03', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1ebb014a9a206f380002', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:37:04', 'A', 'mupeng', '3', 'A', '2014-12-30 15:37:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1ebb014a9a2272f40003', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:39:16', 'A', 'mupeng', '3', 'A', '2014-12-30 15:39:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a1ebb014a9a28cf770004', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:46:13', 'A', 'mupeng', '3', 'A', '2014-12-30 15:46:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a29a3014a9a29a7600000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:47:08', 'A', 'mupeng', '3', 'A', '2014-12-30 15:48:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a2d4a014a9a2d4d980000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:51:07', 'A', 'mupeng', '3', 'A', '2014-12-30 15:51:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a2f91014a9a2f93f40000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:53:37', 'A', 'mupeng', '3', 'A', '2014-12-30 15:53:39', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a31a4014a9a31a6470000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 15:55:52', 'A', 'mupeng', '3', 'A', '2014-12-30 15:55:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4a9a36c4014a9a36c7a50000', 'ul', 'AgecnyPro', '0.0.0.0', '2014-12-30 16:01:28', 'A', 'mupeng', '3', 'A', '2014-12-30 16:01:31', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8b738014ab8b73f430000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:10:24', 'A', 'mupeng', '30', 'A', '2015-01-05 14:10:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8b796014ab8b799c80000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:10:47', 'A', 'mupeng', '30', 'A', '2015-01-05 14:10:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8b939014ab8b93c030000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:12:34', 'A', 'mupeng', '30', 'A', '2015-01-05 14:12:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8b9a5014ab8b9a7680000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:13:02', 'A', 'mupeng', '30', 'A', '2015-01-05 14:13:02', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8ba32014ab8ba35990000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:13:38', 'A', 'mupeng', '30', 'A', '2015-01-05 14:13:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bae6014ab8bae9340000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:14:24', 'A', 'mupeng', '30', 'A', '2015-01-05 14:14:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bae6014ab8baea9b0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:14:25', 'A', 'mupeng', '30', 'A', '2015-01-05 14:14:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bae6014ab8baeb2a0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:14:25', 'A', 'mupeng', '30', 'A', '2015-01-05 14:14:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bae6014ab8baeb780003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:14:25', 'A', 'mupeng', '30', 'A', '2015-01-05 14:14:25', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bae6014ab8bb18810004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:14:36', 'A', 'mupeng', '30', 'A', '2015-01-05 14:14:36', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bba2014ab8bba6060000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:13', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bba2014ab8bba75e0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:13', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bba2014ab8bba7ea0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:13', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bba2014ab8bba8480003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:13', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:13', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bba2014ab8bbbe380004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:19', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bc47014ab8bc49d90000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bc47014ab8bc4af20001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bc47014ab8bc4b8f0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bc47014ab8bc4bed0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bc47014ab8bc4c3b0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:15:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:15:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bd16014ab8bd24f60000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:16:51', 'A', 'mupeng', '30', 'A', '2015-01-05 14:20:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bd16014ab8c0991a0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:20:37', 'A', 'mupeng', '30', 'A', '2015-01-05 14:20:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bd16014ab8c099970002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:20:37', 'A', 'mupeng', '30', 'A', '2015-01-05 14:20:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bd16014ab8c099f40003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:20:37', 'A', 'mupeng', '30', 'A', '2015-01-05 14:20:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8bd16014ab8c09a420004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:20:37', 'A', 'mupeng', '30', 'A', '2015-01-05 14:20:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8c0d1014ab8c0d4180000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:20:52', 'A', 'mupeng', '30', 'A', '2015-01-05 14:21:55', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8c662014ab8c665160000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:26:57', 'A', 'mupeng', '30', 'A', '2015-01-05 14:27:27', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8c899014ab8c89b490000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:29:22', 'A', 'mupeng', '30', 'A', '2015-01-05 14:29:26', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cc41014ab8cc441f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:33:22', 'A', 'mupeng', '30', 'A', '2015-01-05 14:33:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cc41014ab8cc5c030001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:33:28', 'A', 'mupeng', '30', 'A', '2015-01-05 14:33:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cc41014ab8cc5c9f0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:33:28', 'A', 'mupeng', '30', 'A', '2015-01-05 14:33:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cc41014ab8cc5cfd0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:33:28', 'A', 'mupeng', '30', 'A', '2015-01-05 14:33:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cc41014ab8cc5d7a0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:33:28', 'A', 'mupeng', '30', 'A', '2015-01-05 14:33:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8cf28014ab8cf2a960000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:36:32', 'A', 'mupeng', '30', 'A', '2015-01-05 14:37:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d0b3014ab8d0b5630000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:38:13', 'A', 'mupeng', '30', 'A', '2015-01-05 14:38:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d0b3014ab8d0d3010001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:38:20', 'A', 'mupeng', '30', 'A', '2015-01-05 14:38:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d0b3014ab8d0d3bd0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:38:21', 'A', 'mupeng', '30', 'A', '2015-01-05 14:38:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d0b3014ab8d0d41a0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:38:21', 'A', 'mupeng', '30', 'A', '2015-01-05 14:38:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d0b3014ab8d0d4780004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:38:21', 'A', 'mupeng', '30', 'A', '2015-01-05 14:38:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d37a014ab8d37c5f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:41:15', 'A', 'mupeng', '30', 'A', '2015-01-05 14:41:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d468014ab8d46aeb0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:16', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d468014ab8d479ca0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:20', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d468014ab8d47a770003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:20', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d468014ab8d47b9f0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:20', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d468014ab8d47ca80005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:20', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d502014ab8d504e00000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:55', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:56', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d502014ab8d506560002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:56', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:56', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d502014ab8d507120003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:56', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:56', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d502014ab8d507dd0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:56', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:56', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d502014ab8d508a80005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:42:56', 'A', 'mupeng', '30', 'A', '2015-01-05 14:42:56', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d577014ab8d57a240000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:25', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:26', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d5c5014ab8d5c8190000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:45', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d5c5014ab8d5c99f0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:46', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d5c5014ab8d5ca4c0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:46', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d5c5014ab8d5cb740004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:46', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d5c5014ab8d5cc300005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:43:46', 'A', 'mupeng', '30', 'A', '2015-01-05 14:43:46', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d658014ab8d65aec0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:44:23', 'A', 'mupeng', '30', 'A', '2015-01-05 14:44:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab8d7ce014ab8d7d04d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 14:45:58', 'A', 'mupeng', '30', 'A', '2015-01-05 14:45:59', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab91b41014ab91b44220000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 15:59:39', 'A', 'mupeng', '30', 'A', '2015-01-05 15:59:39', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab91ba7014ab91baa880000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:00:05', 'A', 'mupeng', '30', 'A', '2015-01-05 16:00:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab92832014ab92835580000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:13:47', 'A', 'mupeng', '30', 'A', '2015-01-05 16:13:48', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab928ce014ab928d0940000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:14:27', 'A', 'mupeng', '30', 'A', '2015-01-05 16:14:27', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9297a014ab9297cce0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:15:11', 'A', 'mupeng', '30', 'A', '2015-01-05 16:15:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab92a66014ab92a68e60000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:16:11', 'A', 'mupeng', '30', 'A', '2015-01-05 16:16:11', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab92aac014ab92aae920000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:16:29', 'A', 'mupeng', '30', 'A', '2015-01-05 16:16:29', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab92b8a014ab92b8c280000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:17:26', 'A', 'mupeng', '30', 'A', '2015-01-05 16:17:47', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab92ccd014ab92ccfbd0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 16:18:49', 'A', 'mupeng', '30', 'A', '2015-01-05 16:18:58', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9533e014ab953409c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:00:48', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9533e014ab95341f30002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:00:49', 'A', 'mupeng', '30', 'A', '2015-01-05 17:00:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9533e014ab95342a40003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:00:49', 'A', 'mupeng', '30', 'A', '2015-01-05 17:00:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9533e014ab953436e0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:00:49', 'A', 'mupeng', '30', 'A', '2015-01-05 17:00:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9533e014ab95394f90005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:10', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95409014ab9540c7e0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:40', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95409014ab9540dd50002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:41', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95409014ab9540e820003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:41', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95409014ab9540f4c0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:41', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95409014ab95410080005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:01:41', 'A', 'mupeng', '30', 'A', '2015-01-05 17:01:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95492014ab95495140000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:02:15', 'A', 'mupeng', '30', 'A', '2015-01-05 17:02:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95492014ab95496a90002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:02:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:02:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95492014ab95497560003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:02:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:02:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95492014ab95498400004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:02:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:02:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab95492014ab95499390005', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:02:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:02:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab97529014ab9752be30000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:37:51', 'A', 'mupeng', '30', 'A', '2015-01-05 17:37:51', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9761d014ab9761f6f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:38:53', 'A', 'mupeng', '30', 'A', '2015-01-05 17:38:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9761d014ab97620680001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:38:54', 'A', 'mupeng', '30', 'A', '2015-01-05 17:38:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9761d014ab97620f50002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:38:54', 'A', 'mupeng', '30', 'A', '2015-01-05 17:38:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9761d014ab97621520003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:38:54', 'A', 'mupeng', '30', 'A', '2015-01-05 17:38:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9761d014ab976220e0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:38:54', 'A', 'mupeng', '30', 'A', '2015-01-05 17:38:54', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9791b014ab9791d900000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:42:10', 'A', 'mupeng', '30', 'A', '2015-01-05 17:42:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9791b014ab9795e0c0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:42:26', 'A', 'mupeng', '30', 'A', '2015-01-05 17:42:26', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9791b014ab9796bd30002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:42:30', 'A', 'mupeng', '30', 'A', '2015-01-05 17:42:30', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9791b014ab9796c400003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:42:30', 'A', 'mupeng', '30', 'A', '2015-01-05 17:42:30', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9791b014ab979b7a00004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:42:49', 'A', 'mupeng', '30', 'A', '2015-01-05 17:42:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98084014ab98086f40000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:15', 'A', 'mupeng', '30', 'A', '2015-01-05 17:50:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98084014ab980880d0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:50:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98084014ab98088ba0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:50:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98084014ab98089080003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:50:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98084014ab98089940004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:16', 'A', 'mupeng', '30', 'A', '2015-01-05 17:50:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab980b6014ab980b8e30000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:50:28', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab980b6014ab98143880001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:04', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:04', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab980b6014ab98149340002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:05', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab980b6014ab98149910003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:05', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:05', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab980b6014ab9814cad0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:06', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98186014ab981885c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:21', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98186014ab981b76d0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:33', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:33', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98186014ab981b96f0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:34', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98186014ab981b9bd0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:34', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98186014ab981bb8d0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:51:34', 'A', 'mupeng', '30', 'A', '2015-01-05 17:51:34', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98361014ab983635a0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:53:23', 'A', 'mupeng', '30', 'A', '2015-01-05 17:53:23', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab9847f014ab98482370000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:54:36', 'A', 'mupeng', '30', 'A', '2015-01-05 17:54:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ab98671014ab98674110000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-05 17:56:44', 'A', 'mupeng', '30', 'A', '2015-01-05 17:56:44', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30495014ac30498420000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:11:05', 'A', 'mupeng', '30', 'A', '2015-01-07 14:11:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30495014ac304c28e0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:11:16', 'A', 'mupeng', '30', 'A', '2015-01-07 14:11:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30495014ac304c3590002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:11:16', 'A', 'mupeng', '30', 'A', '2015-01-07 14:11:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30495014ac304c3a70003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:11:17', 'A', 'mupeng', '30', 'A', '2015-01-07 14:11:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30495014ac304c4910004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:11:17', 'A', 'mupeng', '30', 'A', '2015-01-07 14:11:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30585014ac30588030000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:12:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:12:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30585014ac30589ca0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:12:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:12:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30585014ac3058a660002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:12:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:12:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30585014ac3058ab40003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:12:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:12:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30585014ac3058b400004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:12:08', 'A', 'mupeng', '30', 'A', '2015-01-07 14:12:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30857014ac30859b00000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:12', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30857014ac3085b270001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:12', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30857014ac3085bd30002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:12', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30857014ac3085c400003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:12', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30857014ac3085ccd0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:12', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:12', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac308ba014ac308bcad0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:37', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac308ba014ac308be140001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:37', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac308ba014ac308bec00002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:37', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac308ba014ac308beff0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:37', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:37', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac308ba014ac308bf9b0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:15:38', 'A', 'mupeng', '30', 'A', '2015-01-07 14:15:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a00014ac30a023f0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:00', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a00014ac30a03e40001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:01', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a00014ac30a04910002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:01', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a00014ac30a04df0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:01', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a00014ac30a056b0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:01', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:01', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a47014ac30a49b60000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a47014ac30a4b3c0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a47014ac30a4be90002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a47014ac30a4c660003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30a47014ac30a4d110004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:17:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:17:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30c07014ac30c0a950000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:19:13', 'A', 'mupeng', '30', 'A', '2015-01-07 14:19:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30c07014ac30c0c4a0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:19:14', 'A', 'mupeng', '30', 'A', '2015-01-07 14:19:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30c07014ac30c0ce60002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:19:14', 'A', 'mupeng', '30', 'A', '2015-01-07 14:19:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30c07014ac30c0d340003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:19:14', 'A', 'mupeng', '30', 'A', '2015-01-07 14:19:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30c07014ac30c0dff0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:19:14', 'A', 'mupeng', '30', 'A', '2015-01-07 14:19:14', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30cfc014ac30d16e90000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:20:16', 'A', 'mupeng', '30', 'A', '2015-01-07 14:21:50', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30f4d014ac30f64490000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:22:48', 'A', 'mupeng', '30', 'A', '2015-01-07 14:23:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30f4d014ac30fc7fe0001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:23:17', 'A', 'mupeng', '30', 'A', '2015-01-07 14:23:17', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30f4d014ac30fcc810002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:23:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:23:19', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30f4d014ac30fcf210003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:23:20', 'A', 'mupeng', '30', 'A', '2015-01-07 14:23:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac30f4d014ac30fd1620004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:23:21', 'A', 'mupeng', '30', 'A', '2015-01-07 14:23:21', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac31083014ac310854d0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:24:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:24:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac31083014ac31086560001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:24:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:24:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac31083014ac31087010002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:24:07', 'A', 'mupeng', '30', 'A', '2015-01-07 14:24:07', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac31083014ac310876f0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:24:08', 'A', 'mupeng', '30', 'A', '2015-01-07 14:24:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac31083014ac310881b0004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:24:08', 'A', 'mupeng', '30', 'A', '2015-01-07 14:24:08', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac3119d014ac3119f680000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:25:19', 'A', 'mupeng', '30', 'A', '2015-01-07 14:25:20', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac315ec014ac315eeb50000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:30:02', 'A', 'mupeng', '30', 'A', '2015-01-07 14:30:02', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac3176d014ac3176fcb0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:31:40', 'A', 'mupeng', '30', 'A', '2015-01-07 14:31:41', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac317d3014ac317d5b70000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:32:06', 'A', 'mupeng', '30', 'A', '2015-01-07 14:32:10', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac317d3014ac317e0530001', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:32:09', 'A', 'mupeng', '30', 'A', '2015-01-07 14:32:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac317d3014ac317e0ef0002', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:32:09', 'A', 'mupeng', '30', 'A', '2015-01-07 14:32:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac317d3014ac317e14c0003', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:32:09', 'A', 'mupeng', '30', 'A', '2015-01-07 14:32:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac317d3014ac317e2080004', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:32:09', 'A', 'mupeng', '30', 'A', '2015-01-07 14:32:09', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881ee4ac318d4014ac319252c0000', 'ul', 'AgecnyPro', '0.0.0.0', '2015-01-07 14:33:27', 'A', 'mupeng', '30', 'A', '2015-01-07 14:33:38', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881f74a57a116014a57a11bb20000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-17 17:43:03', 'A', 'mupeng', '3', 'A', '2014-12-17 17:44:43', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a3dbd58014a3dbd5ca20000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-12 17:03:47', 'A', 'agadmin', '30', 'A', '2014-12-12 17:04:35', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('PUBLIC@USER', '402881fb4a4d68e1014a4d68e65a0000', 'tony', 'TEST', '0.0.0.0', '2014-12-15 18:05:28', 'A', 'testUser789', '3', 'A', '2014-12-15 18:05:53', 'PUBLICUSER@testUser789');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a526619014a52661d930000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-16 17:20:31', 'A', 'mupeng', '3', 'A', '2014-12-16 17:20:31', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a526619014a526662f90001', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-16 17:20:49', 'A', 'mupeng', '3', 'A', '2014-12-16 17:20:49', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a6fc3f5014a6fc3fb0a0000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-22 10:12:02', 'A', 'mupeng', '3', 'A', '2014-12-22 10:12:28', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b66bf014a7b66c2ab0000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:25:39', 'A', 'mupeng', '3', 'A', '2014-12-24 16:25:39', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b68fb014a7b68ff4a0000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:28:06', 'A', 'mupeng', '3', 'A', '2014-12-24 16:28:06', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b694e014a7b6951c60000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:28:27', 'A', 'mupeng', '3', 'A', '2014-12-24 16:28:27', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b698f014a7b6992480000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:28:43', 'A', 'mupeng', '3', 'A', '2014-12-24 16:28:43', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b6a09014a7b6a0c930000', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:29:15', 'A', 'mupeng', '3', 'A', '2014-12-24 16:29:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b6a09014a7b6a0e8a0002', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:29:15', 'A', 'mupeng', '3', 'A', '2014-12-24 16:29:15', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b6a09014a7b6a0f780003', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:29:16', 'A', 'mupeng', '3', 'A', '2014-12-24 16:29:16', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a7b6a09014a7b6a10650004', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-24 16:29:16', 'A', 'mupeng', '3', 'A', '2014-12-24 16:29:16', 'mupeng');
