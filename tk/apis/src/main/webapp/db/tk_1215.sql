/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2014-12-15 18:21:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ag_resource_operation`
-- ----------------------------
DROP TABLE IF EXISTS `ag_resource_operation`;
CREATE TABLE `ag_resource_operation` (
  `AGREOP_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `MODULE_CODE` varchar(32) DEFAULT NULL COMMENT '模块代码，程序中的注解',
  `RESOURCE_CODE` varchar(32) DEFAULT NULL COMMENT '资源代码，程序中的注解',
  `OPRATE_CODE` varchar(32) DEFAULT NULL COMMENT '操作代码，程序中的注解',
  `LEVEL_CODE` varchar(32) DEFAULT NULL COMMENT '操作级别代码，程序中的注解',
  `MODULE_NAME` varchar(32) DEFAULT NULL COMMENT '模块名称',
  `RESOURCE_NAME` varchar(32) DEFAULT NULL COMMENT '资源名称',
  `OPRATE_NAME` varchar(32) DEFAULT NULL COMMENT '操作名称',
  `OPRATE_LEVEL` varchar(32) DEFAULT NULL COMMENT '操作级别',
  `AGENCY_CODE` varchar(8) DEFAULT NULL COMMENT '机构编码',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `ACCOUNT_LOCK_STATUS` varchar(1) DEFAULT NULL COMMENT '账号锁定状态',
  `ACCOUNT_LOCK_DATE` date DEFAULT NULL COMMENT '账号锁定时间',
  `ACCOUNT_LOCK_USERID` varchar(32) DEFAULT NULL COMMENT '锁定人ID外键',
  `EXTEND1` varchar(32) DEFAULT NULL COMMENT '扩展字段1',
  `EXTEND2` varchar(32) DEFAULT NULL COMMENT '扩展字段2',
  `EXTEND3` varchar(32) DEFAULT NULL COMMENT '扩展字段3',
  `DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AGREOP_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构资源操作表';

-- ----------------------------
-- Records of ag_resource_operation
-- ----------------------------
INSERT INTO `ag_resource_operation` VALUES ('1', 'userManage', 'user', 'getUser', 'AGENCY', '机构用户管理', '用户', '查找用户', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('2', 'userManage', 'user', 'updateUser', 'AGENCY', '机构用户管理', '用户', '更新用户', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('3', 'userManage', 'user', 'createUser', 'AGENCY', '机构用户管理', '用户', '创建用户', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('4', 'userManage', 'user', 'deleteUser', 'AGENCY', '机构用户管理', '用户', '删除用户', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('5', 'userManage', 'rsTemplate', 'getTemplate', 'AGENCY', '机构用户管理', '资源模板', '查找资源模板', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('6', 'userManage', 'rsTemplate', 'updateTemplate', 'AGENCY', '机构用户管理', '资源模板', '更新资源模板', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('7', 'userManage', 'rsTemplate', 'createTemplate', 'AGENCY', '机构用户管理', '资源模板', '创建资源模板', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_resource_operation` VALUES ('8', 'userManage', 'rsTemplate', 'deleteTemplate', 'AGENCY', '机构用户管理', '资源模板', '删除资源模板', '机构', 'A1', '2014-12-01', null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `ag_role`
-- ----------------------------
DROP TABLE IF EXISTS `ag_role`;
CREATE TABLE `ag_role` (
  `AGROLE_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `ROLE_CODE` varchar(32) DEFAULT NULL COMMENT '角色编码',
  `ROLE_NAME` varchar(32) DEFAULT NULL COMMENT '角色名称',
  `AGENCY_CODE` varchar(8) DEFAULT NULL COMMENT '机构编码',
  `ACCOUNT_LOCK_STATUS` varchar(1) DEFAULT NULL COMMENT '账号锁定状态',
  `ACCOUNT_LOCK_DATE` date DEFAULT NULL COMMENT '账号锁定时间',
  `ACCOUNT_LOCK_USERID` varchar(32) DEFAULT NULL COMMENT '锁定人ID外键',
  `EXTEND1` varchar(32) DEFAULT NULL COMMENT '扩展字段1',
  `EXTEND2` varchar(32) DEFAULT NULL COMMENT '扩展字段2',
  `EXTEND3` varchar(32) DEFAULT NULL COMMENT '扩展字段3',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AGROLE_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构角色表';

-- ----------------------------
-- Records of ag_role
-- ----------------------------
INSERT INTO `ag_role` VALUES ('1', 'admin', '管理员', 'A2', '0', null, null, null, null, null, '2014-12-06', null, '', null);
INSERT INTO `ag_role` VALUES ('10', 'wash', '洗车工', 'A1', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('2', 'manager', '经理', 'A2', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('3', 'service', '接待', 'A2', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('4', 'repair', '维修工', 'A2', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('5', 'wash', '洗车工', 'A2', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('6', 'admin', '管理员', 'A1', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('7', 'manager', '经理', 'A1', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('8', 'service', '接待', 'A1', '0', null, null, null, null, null, '2014-12-06', null, null, null);
INSERT INTO `ag_role` VALUES ('9', 'repair', '维修工', 'A1', '0', null, null, null, null, null, '2014-12-06', null, null, null);

-- ----------------------------
-- Table structure for `ag_role_resource_operation`
-- ----------------------------
DROP TABLE IF EXISTS `ag_role_resource_operation`;
CREATE TABLE `ag_role_resource_operation` (
  `AGROREOP_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `AGROLE_UID` varchar(32) DEFAULT NULL COMMENT '角色外键',
  `AGREOP_UID` varchar(32) DEFAULT NULL COMMENT '资源外键',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `PERMISSION` varchar(1) NOT NULL COMMENT '权限：F(Full)  N(No)  R(ReadOnly)',
  PRIMARY KEY (`AGROREOP_UID`),
  KEY `FK_RoleOperation_Resource` (`AGREOP_UID`),
  KEY `FK_RoleOperation_Role` (`AGROLE_UID`),
  CONSTRAINT `FK_RoleOperation_Resource` FOREIGN KEY (`AGREOP_UID`) REFERENCES `ag_resource_operation` (`AGREOP_UID`),
  CONSTRAINT `FK_RoleOperation_Role` FOREIGN KEY (`AGROLE_UID`) REFERENCES `ag_role` (`AGROLE_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='j机构资源角色操作表';

-- ----------------------------
-- Records of ag_role_resource_operation
-- ----------------------------

-- ----------------------------
-- Table structure for `ag_user`
-- ----------------------------
DROP TABLE IF EXISTS `ag_user`;
CREATE TABLE `ag_user` (
  `AGUSER_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `FNAME` varchar(16) DEFAULT NULL COMMENT '用户名称',
  `ADDRESS1` varchar(200) DEFAULT NULL COMMENT '地址1',
  `ADDRESS2` varchar(200) DEFAULT NULL COMMENT '地址2',
  `ADDRESS3` varchar(200) DEFAULT NULL COMMENT '地址3',
  `ORG_ID` varchar(32) DEFAULT NULL COMMENT '机构外键',
  `AGENCY_CODE` varchar(8) DEFAULT NULL COMMENT '机构编码',
  `PROVINCE` varchar(8) DEFAULT NULL COMMENT '省份',
  `CITY` varchar(8) DEFAULT NULL COMMENT '城市',
  `COUNTRY` varchar(8) DEFAULT NULL COMMENT '国家',
  `PHONE1` varchar(20) DEFAULT NULL COMMENT '联系方式1',
  `PHONE2` varchar(20) DEFAULT NULL COMMENT '联系方式2',
  `PHONE3` varchar(20) DEFAULT NULL COMMENT '联系方式3',
  `PRE_CONTACT_CHNL` varchar(1) DEFAULT NULL COMMENT '默认联系方式',
  `EMPLOYEE_CODE` varchar(20) DEFAULT NULL COMMENT '工号',
  `IDENTITY_CARD` varchar(20) DEFAULT NULL COMMENT '省份证号',
  `GENDER` varchar(1) DEFAULT NULL COMMENT '性别',
  `BIRTH_DATE` date DEFAULT NULL COMMENT '生日',
  `IS_MARRIED` varchar(1) DEFAULT NULL COMMENT '婚否',
  `AVATAR` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `EMER_CONTACT1` varchar(16) DEFAULT NULL COMMENT '紧急联系人1',
  `EMER_CON_PHONE1` varchar(20) DEFAULT NULL COMMENT '紧急联系方式1',
  `EMER_CONTACT2` varchar(16) DEFAULT NULL COMMENT '紧急联系人2',
  `EMER_CON_PHONE2` varchar(20) DEFAULT NULL COMMENT '紧急联系方式2',
  `RECIVE_SMS` varchar(1) DEFAULT NULL COMMENT '是否接收短息消息',
  `RECIVE_PUSH` varchar(1) DEFAULT NULL COMMENT '是否接收推送消息',
  `RIGISTER_DATE` date DEFAULT NULL COMMENT '注册日期',
  `NEED_CHANGE_PASS` varchar(1) DEFAULT NULL COMMENT '是否需要修改密码',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `ACCOUNT_LOCK_STATUS` varchar(1) DEFAULT NULL COMMENT '账号锁定状态',
  `ACCOUNT_LOCK_DATE` date DEFAULT NULL COMMENT '账号锁定时间',
  `ACCOUNT_LOCK_USERID` varchar(32) DEFAULT NULL COMMENT '锁定人ID外键',
  `EXTEND1` varchar(32) DEFAULT NULL COMMENT '扩展字段1',
  `EXTEND2` varchar(32) DEFAULT NULL COMMENT '扩展字段2',
  `EXTEND3` varchar(32) DEFAULT NULL COMMENT '扩展字段3',
  `DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AGUSER_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业机构用户';

-- ----------------------------
-- Records of ag_user
-- ----------------------------
INSERT INTO `ag_user` VALUES ('402882ef4a376ce1014a376ce55b0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a376e26014a376e2b1a0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a37735f014a377363ff0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a377998014a37799c990001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a377c92014a377c97a40001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a38009b014a38009fd70001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a383640014a383644df0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a383af1014a383af6cd0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a384368014a38436e150001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a384550014a384555a80001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a38467a014a3846d7d00001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a3847d8014a3847e0940001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a384d37014a384d3f610001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a384f1a014a384f22bc0001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882ef4a3850b6014a3850c6770001', null, '123456', 'xionger', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('402882f14a09a4b5014a09a4b73e0000', 'mupeng', 'admin', 'mupeng', null, null, null, null, 'A1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `ag_user` VALUES ('502882f14a09a4b5014a09a4b73e0000', 'agadmin', 'admin', 'csjAG', null, null, null, null, 'A2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `ag_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `ag_user_role`;
CREATE TABLE `ag_user_role` (
  `AGUSRO_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `FK_AGUSER_UID` varchar(32) DEFAULT NULL COMMENT '机构用户表外键',
  `FK_ROLE_UID` varchar(32) DEFAULT NULL COMMENT '角色表外键',
  `AGENCY_CODE` varchar(8) DEFAULT NULL COMMENT '机构编码',
  `ACCOUNT_LOCK_STATUS` varchar(1) DEFAULT NULL COMMENT '账号锁定状态',
  `ACCOUNT_LOCK_DATE` date DEFAULT NULL COMMENT '账号锁定时间',
  `ACCOUNT_LOCK_USERID` varchar(32) DEFAULT NULL COMMENT '锁定人ID外键',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AGUSRO_UID`),
  KEY `FK_UserRole_Role` (`FK_ROLE_UID`),
  KEY `FK_UserRole_User` (`FK_AGUSER_UID`),
  CONSTRAINT `FK_UserRole_Role` FOREIGN KEY (`FK_ROLE_UID`) REFERENCES `ag_role` (`AGROLE_UID`),
  CONSTRAINT `FK_UserRole_User` FOREIGN KEY (`FK_AGUSER_UID`) REFERENCES `ag_user` (`AGUSER_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色关系表';

-- ----------------------------
-- Records of ag_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for `esso_sessions`
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
-- Records of esso_sessions
-- ----------------------------
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a3dbd58014a3dbd5ca20000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-12 17:03:47', 'A', 'agadmin', '30', 'A', '2014-12-12 17:04:35', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('PUBLIC@USER', '402881fb4a4d68e1014a4d68e65a0000', 'tony', 'TEST', '0.0.0.0', '2014-12-15 18:05:28', 'A', 'testUser789', '3', 'A', '2014-12-15 18:05:53', 'PUBLICUSER@testUser789');
INSERT INTO `esso_sessions` VALUES ('A1', '402881fb4a4d68e1014a4d6c74680001', 'mupeng', 'AgecnyPro', '0.0.0.0', '2014-12-15 18:09:20', 'A', 'mupeng', '3', 'A', '2014-12-15 18:09:45', 'mupeng');
INSERT INTO `esso_sessions` VALUES ('A1', '4028828a4a2e307a014a2e3080fd0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 16:35:38', 'A', 'agadmin', '2', 'A', '2014-12-09 16:35:38', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '4028828a4a2e307a014a2e30fc920001', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 16:36:10', 'A', 'agadmin', '2', 'A', '2014-12-09 16:36:10', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('PUBLIC@USER', '4028828a4a338a6f014a338ae7800000', 'tony', 'TEST', '0.0.0.0', '2014-12-10 17:32:28', 'A', 'testUser789', '2', 'A', '2014-12-10 17:32:40', 'PUBLICUSER@testUser789');
INSERT INTO `esso_sessions` VALUES ('PUBLIC@USER', '4028828a4a338a6f014a338b44eb0001', 'tony', 'TEST', '0.0.0.0', '2014-12-10 17:32:52', 'A', 'testUser789', '2', 'A', '2014-12-10 17:32:52', 'PUBLICUSER@testUser789');
INSERT INTO `esso_sessions` VALUES ('PUBLIC@USER', '4028828a4a338a6f014a338b5b870002', 'tony', 'TEST', '0.0.0.0', '2014-12-10 17:32:58', 'A', 'testUser789', '2', 'A', '2014-12-10 17:32:58', 'PUBLICUSER@testUser789');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a2cb1c0014a2ccb084d0001', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:11', 'A', 'agadmin', '2', 'A', '2014-12-09 10:05:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a2', '402882e44a2cb1c0014a2ccb52f60002', 'csjAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:30', 'A', 'agadmin', '2', 'A', '2014-12-09 10:05:30', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a2cb1c0014a2ccba2520003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:50', 'A', 'agadmin', '2', 'A', '2014-12-09 10:05:50', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a1', '402882e44a2cb1c0014a2ccc08ed0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:06:16', 'A', 'agadmin', '2', 'A', '2014-12-09 10:06:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a1', '402882e44a2cb1c0014a2cced0950005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:09:18', 'A', 'agadmin', '2', 'A', '2014-12-09 10:09:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a1', '402882e44a2cb1c0014a2cd370fe0006', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:14:22', 'A', 'agadmin', '2', 'A', '2014-12-09 10:14:22', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a1', '402882e44a2cb1c0014a2cdaf9f80007', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:22:36', 'A', 'agadmin', '2', 'A', '2014-12-09 10:22:36', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('a1', '402882e44a2cb1c0014a2ce08f720008', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:28:41', 'A', 'agadmin', '2', 'A', '2014-12-09 10:30:20', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a3333ce014a3333d3c00000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-10 15:57:22', 'A', 'agadmin', '2', 'A', '2014-12-10 15:59:39', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a3338da014a3338dee30000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-10 16:02:52', 'A', 'agadmin', '2', 'A', '2014-12-10 16:07:41', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a337f6e014a337f72c00000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-10 17:19:58', 'A', 'agadmin', '2', 'A', '2014-12-10 17:20:15', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a338299014a33829c8c0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-10 17:23:25', 'A', 'agadmin', '2', 'A', '2014-12-10 17:23:58', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882e44a3730e9014a3730ec4a0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 10:32:40', 'A', 'agadmin', '2', 'A', '2014-12-11 10:33:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3764d5014a3764e1160000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:29:25', 'A', 'agadmin', '30', 'A', '2014-12-11 11:29:46', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3764d5014a376519c90002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:29:40', 'A', 'agadmin', '30', 'A', '2014-12-11 11:29:40', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3764d5014a37651f2e0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:29:41', 'A', 'agadmin', '30', 'A', '2014-12-11 11:29:41', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3764d5014a37652c3b0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:29:45', 'A', 'agadmin', '30', 'A', '2014-12-11 11:29:45', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3764d5014a376532070005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:29:46', 'A', 'agadmin', '30', 'A', '2014-12-11 11:29:46', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37664d014a37664fb50000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:30:59', 'A', 'agadmin', '30', 'A', '2014-12-11 11:32:02', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37664d014a376652ed0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:31:00', 'A', 'agadmin', '30', 'A', '2014-12-11 11:31:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37664d014a376654610003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:31:00', 'A', 'agadmin', '30', 'A', '2014-12-11 11:31:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37664d014a376741130004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:32:01', 'A', 'agadmin', '30', 'A', '2014-12-11 11:32:01', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37664d014a3767439c0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:32:02', 'A', 'agadmin', '30', 'A', '2014-12-11 11:32:02', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376927014a376929f70000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:34:06', 'A', 'agadmin', '30', 'A', '2014-12-11 11:35:37', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376927014a37692d560002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:34:07', 'A', 'agadmin', '30', 'A', '2014-12-11 11:34:07', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376927014a37692f450003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:34:07', 'A', 'agadmin', '30', 'A', '2014-12-11 11:34:07', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376927014a376a89cb0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:35:36', 'A', 'agadmin', '30', 'A', '2014-12-11 11:35:36', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376927014a376a8bc40005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:35:37', 'A', 'agadmin', '30', 'A', '2014-12-11 11:35:37', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376ce1014a376ce3cb0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:38:10', 'A', 'agadmin', '30', 'A', '2014-12-11 11:38:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376ce1014a376ce6840002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:38:11', 'A', 'agadmin', '30', 'A', '2014-12-11 11:38:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376ce1014a376ce8850003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:38:11', 'A', 'agadmin', '30', 'A', '2014-12-11 11:38:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376e26014a376e29390000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:39:34', 'A', 'agadmin', '30', 'A', '2014-12-11 11:39:44', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376e26014a376e2bcd0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:39:34', 'A', 'agadmin', '30', 'A', '2014-12-11 11:39:34', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a376e26014a376e2e020003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:39:35', 'A', 'agadmin', '30', 'A', '2014-12-11 11:39:35', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377154014a377157840000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:43:02', 'A', 'agadmin', '30', 'A', '2014-12-11 11:43:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377154014a37715c080002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:43:03', 'A', 'agadmin', '30', 'A', '2014-12-11 11:43:03', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377154014a37715d900003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:43:04', 'A', 'agadmin', '30', 'A', '2014-12-11 11:43:04', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377154014a37718f0e0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:43:16', 'A', 'agadmin', '30', 'A', '2014-12-11 11:43:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377154014a377191320005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:43:17', 'A', 'agadmin', '30', 'A', '2014-12-11 11:43:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37735f014a3773620a0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:45:16', 'A', 'agadmin', '30', 'A', '2014-12-11 11:45:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37735f014a377364dd0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:45:17', 'A', 'agadmin', '30', 'A', '2014-12-11 11:45:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37735f014a377366750003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:45:17', 'A', 'agadmin', '30', 'A', '2014-12-11 11:45:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377495014a377497ce0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:46:35', 'A', 'agadmin', '30', 'A', '2014-12-11 11:48:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377495014a37749b0e0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:46:36', 'A', 'agadmin', '30', 'A', '2014-12-11 11:46:36', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377495014a377543940003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:47:19', 'A', 'agadmin', '30', 'A', '2014-12-11 11:47:19', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377495014a37761eda0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:48:15', 'A', 'agadmin', '30', 'A', '2014-12-11 11:48:15', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377495014a377620de0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:48:16', 'A', 'agadmin', '30', 'A', '2014-12-11 11:48:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37778d014a37778ff70000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:49:50', 'A', 'agadmin', '30', 'A', '2014-12-11 11:51:24', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37778d014a377792da0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:49:50', 'A', 'agadmin', '30', 'A', '2014-12-11 11:49:50', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37778d014a3777f1760003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:50:15', 'A', 'agadmin', '30', 'A', '2014-12-11 11:50:15', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37778d014a3778fbd90004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:51:23', 'A', 'agadmin', '30', 'A', '2014-12-11 11:51:23', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a37778d014a3778fdcd0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:51:23', 'A', 'agadmin', '30', 'A', '2014-12-11 11:51:23', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377998014a37799aad0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:52:04', 'A', 'agadmin', '30', 'A', '2014-12-11 11:52:09', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377998014a37799d910002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:52:04', 'A', 'agadmin', '30', 'A', '2014-12-11 11:52:04', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377998014a3779a65c0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:52:07', 'A', 'agadmin', '30', 'A', '2014-12-11 11:52:07', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377c92014a377c95920000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:55:19', 'A', 'agadmin', '30', 'A', '2014-12-11 11:55:24', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377c92014a377c98930002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:55:20', 'A', 'agadmin', '30', 'A', '2014-12-11 11:55:20', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a377c92014a377ca2e60003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 11:55:22', 'A', 'agadmin', '30', 'A', '2014-12-11 11:55:22', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38009b014a38009dfa0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:19:32', 'A', 'agadmin', '30', 'A', '2014-12-11 14:19:40', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38009b014a3800a0db0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:19:32', 'A', 'agadmin', '30', 'A', '2014-12-11 14:19:32', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38009b014a3800b49d0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:19:38', 'A', 'agadmin', '30', 'A', '2014-12-11 14:19:38', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3804a4014a3804a7170000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:23:56', 'A', 'agadmin', '30', 'A', '2014-12-11 14:24:25', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3804a4014a3804aa010002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:23:57', 'A', 'agadmin', '30', 'A', '2014-12-11 14:23:57', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3804a4014a3804b7cb0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:24:00', 'A', 'agadmin', '30', 'A', '2014-12-11 14:24:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3804a4014a3805150a0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:24:24', 'A', 'agadmin', '30', 'A', '2014-12-11 14:24:24', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3804a4014a380516e20005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:24:25', 'A', 'agadmin', '30', 'A', '2014-12-11 14:24:25', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3806ba014a3806bd300000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:26:13', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:24', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3806ba014a3806c0aa0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:26:14', 'A', 'agadmin', '30', 'A', '2014-12-11 14:26:14', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3806ba014a3806ccef0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:26:17', 'A', 'agadmin', '30', 'A', '2014-12-11 14:26:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3806ba014a3807ce4f0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:23', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:23', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3806ba014a3807d03f0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:23', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:23', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38084f014a380852360000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:57', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:59', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38084f014a380854fb0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:57', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:57', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38084f014a380856400003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:58', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:58', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38084f014a380857ee0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:58', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:58', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38084f014a38085b650005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:27:59', 'A', 'agadmin', '30', 'A', '2014-12-11 14:27:59', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38154c014a38154fa30000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:08', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:10', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38154c014a381552970002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:09', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:09', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38154c014a3815541c0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:09', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:09', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38154c014a381555c80004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:09', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:09', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38154c014a381557aa0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:10', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:10', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38160a014a38160d330000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:56', 'A', 'agadmin', '30', 'A', '2014-12-11 14:43:53', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38160a014a38160fec0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:42:57', 'A', 'agadmin', '30', 'A', '2014-12-11 14:42:57', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38160a014a3816a1570003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:43:34', 'A', 'agadmin', '30', 'A', '2014-12-11 14:43:34', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38160a014a3816e8140004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:43:52', 'A', 'agadmin', '30', 'A', '2014-12-11 14:43:52', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38160a014a3816ea190005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 14:43:53', 'A', 'agadmin', '30', 'A', '2014-12-11 14:43:53', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3833a1014a3833a4110000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:15:16', 'A', 'agadmin', '30', 'A', '2014-12-11 15:15:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3833a1014a3833a70d0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:15:16', 'A', 'agadmin', '30', 'A', '2014-12-11 15:15:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3833a1014a3833a88c0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:15:17', 'A', 'agadmin', '30', 'A', '2014-12-11 15:15:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3833a1014a3833aa880004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:15:17', 'A', 'agadmin', '30', 'A', '2014-12-11 15:15:17', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3833a1014a3833ac730005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:15:18', 'A', 'agadmin', '30', 'A', '2014-12-11 15:15:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383561014a383564710000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:17:10', 'A', 'agadmin', '30', 'A', '2014-12-11 15:17:13', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383561014a383566f60002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:17:11', 'A', 'agadmin', '30', 'A', '2014-12-11 15:17:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383561014a383568620003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:17:11', 'A', 'agadmin', '30', 'A', '2014-12-11 15:17:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383561014a38356a0e0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:17:12', 'A', 'agadmin', '30', 'A', '2014-12-11 15:17:12', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383561014a38356c1a0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:17:12', 'A', 'agadmin', '30', 'A', '2014-12-11 15:17:12', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383640014a383643270000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:18:07', 'A', 'agadmin', '30', 'A', '2014-12-11 15:18:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383640014a383645be0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:18:08', 'A', 'agadmin', '30', 'A', '2014-12-11 15:18:08', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3839f3014a3839f60f0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:22:10', 'A', 'agadmin', '30', 'A', '2014-12-11 15:22:12', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3839f3014a3839f9070002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:22:11', 'A', 'agadmin', '30', 'A', '2014-12-11 15:22:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3839f3014a3839fa740003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:22:11', 'A', 'agadmin', '30', 'A', '2014-12-11 15:22:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3839f3014a3839fc6b0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:22:11', 'A', 'agadmin', '30', 'A', '2014-12-11 15:22:11', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3839f3014a3839fe650005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:22:12', 'A', 'agadmin', '30', 'A', '2014-12-11 15:22:12', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383af1014a383af4d20000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:23:15', 'A', 'agadmin', '30', 'A', '2014-12-11 15:23:42', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383af1014a383af8940002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:23:16', 'A', 'agadmin', '30', 'A', '2014-12-11 15:23:16', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a383af1014a383c90f00003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:25:01', 'A', 'agadmin', '30', 'A', '2014-12-11 15:25:01', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384368014a38436c2f0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:32:30', 'A', 'agadmin', '30', 'A', '2014-12-11 15:33:28', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384368014a38436efb0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:32:31', 'A', 'agadmin', '30', 'A', '2014-12-11 15:32:31', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384550014a384553990000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:34:35', 'A', 'agadmin', '30', 'A', '2014-12-11 15:34:57', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384550014a384556e30002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:34:36', 'A', 'agadmin', '30', 'A', '2014-12-11 15:34:36', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38467a014a38467d1a0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:35:51', 'A', 'agadmin', '30', 'A', '2014-12-11 15:37:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38467a014a3846f6b70002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:36:22', 'A', 'agadmin', '30', 'A', '2014-12-11 15:36:22', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3847d8014a3847db730000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:37:21', 'A', 'agadmin', '30', 'A', '2014-12-11 15:37:22', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3847d8014a3847e5610002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:37:23', 'A', 'agadmin', '30', 'A', '2014-12-11 15:37:23', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384964014a384967ec0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:39:02', 'A', 'agadmin', '30', 'A', '2014-12-11 15:40:01', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384964014a384972920002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:39:05', 'A', 'agadmin', '30', 'A', '2014-12-11 15:39:05', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384964014a384a3cd80003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:39:57', 'A', 'agadmin', '30', 'A', '2014-12-11 15:39:57', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384964014a384a45b80004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:39:59', 'A', 'agadmin', '30', 'A', '2014-12-11 15:39:59', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384964014a384a4c340005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:40:00', 'A', 'agadmin', '30', 'A', '2014-12-11 15:40:00', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384b57014a384b5a5c0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:41:10', 'A', 'agadmin', '30', 'A', '2014-12-11 15:42:44', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384b57014a384b69840002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:41:13', 'A', 'agadmin', '30', 'A', '2014-12-11 15:41:13', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384b57014a384cb99f0003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:42:40', 'A', 'agadmin', '30', 'A', '2014-12-11 15:42:40', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384b57014a384cc19a0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:42:42', 'A', 'agadmin', '30', 'A', '2014-12-11 15:42:42', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384b57014a384cc8730005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:42:43', 'A', 'agadmin', '30', 'A', '2014-12-11 15:42:43', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384d37014a384d39d70000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:43:12', 'A', 'agadmin', '30', 'A', '2014-12-11 15:43:19', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384d37014a384d43d00002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:43:15', 'A', 'agadmin', '30', 'A', '2014-12-11 15:43:15', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384f1a014a384f1d9a0000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:45:16', 'A', 'agadmin', '30', 'A', '2014-12-11 15:45:22', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a384f1a014a384f26770002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:45:18', 'A', 'agadmin', '30', 'A', '2014-12-11 15:45:18', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3850b6014a3850b9770000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:47:02', 'A', 'agadmin', '30', 'A', '2014-12-11 15:47:34', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a3850b6014a3851007d0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:47:20', 'A', 'agadmin', '30', 'A', '2014-12-11 15:47:20', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38522f014a385232680000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:48:38', 'A', 'agadmin', '30', 'A', '2014-12-11 15:48:41', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38522f014a385235000002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:48:39', 'A', 'agadmin', '30', 'A', '2014-12-11 15:48:39', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38522f014a385236910003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:48:39', 'A', 'agadmin', '30', 'A', '2014-12-11 15:48:39', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38522f014a3852380b0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:48:40', 'A', 'agadmin', '30', 'A', '2014-12-11 15:48:40', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882ef4a38522f014a38523c5f0005', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-11 15:48:41', 'A', 'agadmin', '30', 'A', '2014-12-11 15:48:41', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882f14a2ccb4e014a2ccb50a00000', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:29', 'A', 'agadmin', '30', 'A', '2014-12-09 10:05:30', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882f14a2ccb4e014a2ccb526b0002', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:30', 'A', 'agadmin', '30', 'A', '2014-12-09 10:05:30', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882f14a2ccb4e014a2ccb53a70003', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:30', 'A', 'agadmin', '30', 'A', '2014-12-09 10:05:30', 'agadmin');
INSERT INTO `esso_sessions` VALUES ('A1', '402882f14a2ccb4e014a2ccb551c0004', 'TonyAG', 'AgecnyPro', '0.0.0.0', '2014-12-09 10:05:30', 'A', 'agadmin', '30', 'A', '2014-12-09 10:05:30', 'agadmin');

-- ----------------------------
-- Table structure for `pu_user`
-- ----------------------------
DROP TABLE IF EXISTS `pu_user`;
CREATE TABLE `pu_user` (
  `PUSER_UID` varchar(32) NOT NULL COMMENT '物理主键',
  `USER_ID` varchar(32) DEFAULT NULL COMMENT '用户ID',
  `PASSWORD` varchar(32) DEFAULT NULL COMMENT '用户密码',
  `FNAME` varchar(16) DEFAULT NULL COMMENT '姓名',
  `ADDRESS1` varchar(200) DEFAULT NULL COMMENT '地址1',
  `ADDRESS2` varchar(200) DEFAULT NULL COMMENT '地址2',
  `ADDRESS3` varchar(200) DEFAULT NULL COMMENT '地址3',
  `PROVINCE` varchar(8) DEFAULT NULL COMMENT '省份',
  `CITY` varchar(8) DEFAULT NULL COMMENT '城市',
  `CONUTRY` varchar(8) DEFAULT NULL COMMENT '国家',
  `PHONE1` varchar(20) DEFAULT NULL COMMENT '联系电话1',
  `PHONE2` varchar(20) DEFAULT NULL COMMENT '联系电话2',
  `PHONE3` varchar(20) DEFAULT NULL COMMENT '联系电话3',
  `PRE_CONTACT_CHNL` varchar(1) DEFAULT NULL COMMENT '默认联系方式,数据字典中定义的联系方式',
  `GENDER` varchar(1) DEFAULT NULL COMMENT '性别',
  `BIRTH_DATE` date DEFAULT NULL COMMENT '生日',
  `AVATAR` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `RECIVE_SMS` varchar(1) DEFAULT NULL COMMENT '是否接收短信消息',
  `RECIVE_PUSH` varchar(1) DEFAULT NULL COMMENT '是否接收推送消息',
  `REGISTER_DATE` date DEFAULT NULL COMMENT '注册日期',
  `NEED_CHANGE_PASSWORD` varchar(1) DEFAULT NULL COMMENT '是否需要修改密码',
  `REGISTER_SOURCE` varchar(1) DEFAULT NULL COMMENT '注册源',
  `AUTH_AGENT_ID` varchar(100) DEFAULT NULL COMMENT '第三方账号',
  `QQ` varchar(32) DEFAULT NULL COMMENT 'QQ账号',
  `REC_DATE` date DEFAULT NULL COMMENT '创建时间',
  `REC_USERID` varchar(32) DEFAULT NULL COMMENT '创建者',
  `REC_STATUS` varchar(1) DEFAULT NULL COMMENT '数据状态 :I/A',
  `E_MAIL` varchar(100) DEFAULT NULL COMMENT '认证的电子邮件',
  `EXTEND1` varchar(32) DEFAULT NULL COMMENT '扩展字段1',
  `EXTEND2` varchar(32) DEFAULT NULL COMMENT '扩展字段2',
  `EXTEND3` varchar(32) DEFAULT NULL COMMENT '扩展字段3',
  `DESCRIPTION` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`PUSER_UID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公网用户';

-- ----------------------------
-- Records of pu_user
-- ----------------------------
INSERT INTO `pu_user` VALUES ('1', 'testUser789', '123456', 'tony', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
