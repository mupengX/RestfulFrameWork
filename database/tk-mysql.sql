/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : tk

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2015-06-08 16:27:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authority`
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `id` varchar(255) NOT NULL,
  `operation` varchar(255) DEFAULT NULL,
  `resource` varchar(255) DEFAULT NULL,
  `roleId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------

-- ----------------------------
-- Table structure for `esso_sessions`
-- ----------------------------
DROP TABLE IF EXISTS `esso_sessions`;
CREATE TABLE `esso_sessions` (
  `AGENCY_CODE` varchar(64) DEFAULT NULL,
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
  `SSO_SESSION_CREATION_Millis` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`SSO_SESSION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of esso_sessions
-- ----------------------------
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6d5cf8014c6d5f1e980002', 'admin', 'AgecnyPro', '192.168.1.148', '2015-03-31 09:08:13', 'A', 'admin', '30', 'A', '2015-03-31 09:08:13', 'admin', '1427764093061');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6dc44b014c6dc44fe40000', 'admin', 'AgecnyPro', '192.168.1.148', '2015-03-31 10:58:44', 'A', 'admin', '30', 'A', '2015-03-31 10:58:46', 'admin', '1427770725614');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6dc44b014c6dcaa8fb0001', 'admin', 'AgecnyPro', '192.168.1.148', '2015-03-31 11:05:40', 'A', 'admin', '30', 'A', '2015-03-31 11:05:41', 'admin', '1427771140880');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6dc44b014c6dcf7b130002', 'admin', 'AgecnyPro', '192.168.1.148', '2015-03-31 11:10:56', 'A', 'admin', '30', 'A', '2015-03-31 11:27:33', 'admin', '1427772453497');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6e8dccb00000', 'admin', 'AgecnyPro', '192.168.1.156', '2015-03-31 14:38:49', 'A', 'admin', '30', 'A', '2015-03-31 15:01:41', 'admin', '1427785301465');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6eb067790002', '慕鹏', 'AgecnyPro', '192.168.1.114', '2015-03-31 15:16:37', 'A', 'mupeng', '30', 'A', '2015-03-31 15:16:46', 'mupeng', '1427786205684');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ebc3d970003', 'admin', 'AgecnyPro', '192.168.1.156', '2015-03-31 15:29:33', 'A', 'admin', '30', 'A', '2015-03-31 15:34:20', 'admin', '1427787260219');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ec065390004', '慕鹏', 'AgecnyPro', '192.168.1.114', '2015-03-31 15:34:05', 'A', 'mupeng', '30', 'A', '2015-03-31 15:34:18', 'mupeng', '1427787258318');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ec113be0005', 'admin', 'AgecnyPro', '192.168.1.114', '2015-03-31 15:34:50', 'A', 'admin', '30', 'A', '2015-03-31 15:58:01', 'admin', '1427788680697');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ecc2dfe0006', '高冰', 'AgecnyPro', '192.168.1.156', '2015-03-31 15:46:57', 'A', 'gaobing', '30', 'A', '2015-03-31 15:47:07', 'gaobing', '1427788026771');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ed6b54e0007', 'admin', 'AgecnyPro', '192.168.1.156', '2015-03-31 15:58:27', 'A', 'admin', '30', 'A', '2015-03-31 15:59:47', 'admin', '1427788787192');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6ed8c9610008', 'admin', 'AgecnyPro', '192.168.1.114', '2015-03-31 16:00:43', 'A', 'admin', '30', 'A', '2015-03-31 16:03:44', 'admin', '1427789024002');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6edf1fe9000c', 'admin', 'AgecnyPro', '192.168.1.156', '2015-03-31 16:07:39', 'A', 'admin', '30', 'A', '2015-03-31 16:21:55', 'admin', '1427790115008');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c6f2e9ad6000d', 'admin', 'AgecnyPro', '192.168.1.114', '2015-03-31 17:34:28', 'A', 'admin', '30', 'A', '2015-03-31 17:43:04', 'admin', '1427794983960');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c72766a670015', 'admin', 'AgecnyPro', '192.168.1.156', '2015-04-01 08:51:45', 'A', 'admin', '30', 'A', '2015-04-01 08:52:10', 'admin', '1427849530492');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c727b0acd0016', 'admin', 'AgecnyPro', '192.168.1.93', '2015-04-01 08:56:49', 'A', 'admin', '30', 'A', '2015-04-01 08:57:58', 'admin', '1427849878336');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c727c75ca001b', '傅天博', 'AgecnyPro', '192.168.1.93', '2015-04-01 08:58:22', 'A', 'futianbo', '30', 'A', '2015-04-01 08:58:59', 'futianbo', '1427849938511');
INSERT INTO `esso_sessions` VALUES ('402881dd4b763c1a014b768878050018', '402881dd4c6e8dc9014c72821bc8001c', 'admin', 'AgecnyPro', '192.168.1.93', '2015-04-01 09:04:32', 'A', 'admin', '30', 'A', '2015-04-01 09:08:07', 'admin', '1427850487394');

-- ----------------------------
-- Table structure for `sp_privilege_relation`
-- ----------------------------
DROP TABLE IF EXISTS `sp_privilege_relation`;
CREATE TABLE `sp_privilege_relation` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SPR_PmType` varchar(64) DEFAULT NULL COMMENT '权限主体类型',
  `SPR_PmID` varchar(64) DEFAULT NULL COMMENT '权限主体ID',
  `SPR_ResOpType` varchar(64) DEFAULT NULL COMMENT '资源操作类型',
  `SPR_ResOpID` varchar(64) DEFAULT NULL COMMENT '资源操作ID',
  `SPR_Permission` varchar(10) DEFAULT NULL COMMENT '权限(F/N/R)',
  `SPR_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编号',
  `SPR_RecStatus` varchar(2) DEFAULT NULL COMMENT '数据状态',
  `SPR_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SPR_LockStatus` varchar(2) DEFAULT NULL COMMENT '锁定状态',
  `SPR_LockDate` datetime DEFAULT NULL COMMENT '锁定时间',
  `SPR_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SPR_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SPR_CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `SPR_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SPR_LastEditDate` datetime DEFAULT NULL COMMENT '修改时间',
  `SPR_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SPR_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SPR_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SPR_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务权限表';

-- ----------------------------
-- Records of sp_privilege_relation
-- ----------------------------
INSERT INTO `sp_privilege_relation` VALUES ('402881dd4c6e8dc9014c727c114a0017', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881dd4c6980d5014c69aa8952001b', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-04-01 08:57:56', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881dd4c6e8dc9014c727c114a0018', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881dd4c691360014c693e536a0010', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-04-01 08:57:56', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881dd4c6e8dc9014c727c114a0019', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881dd4c6e8dc9014c6f2facbb000e', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-04-01 08:57:56', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881dd4c6e8dc9014c727c114a001a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c5a102a014c5a118c370000', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-04-01 08:57:56', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881ee4c697ab2014c697ba7160001', 'role', '402881dd4c685acd014c686261f90002', null, '402881dd4c691360014c693e536a0010', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-03-30 15:00:54', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881ee4c697ab2014c697ba7160002', 'role', '402881dd4c685acd014c686261f90002', null, '402881ee4c5a102a014c5a118c370000', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-03-30 15:00:54', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881ee4c697ab2014c697ba7160003', 'role', '402881dd4c685acd014c686261f90002', null, '402881dd4c691360014c691cd4700005', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-03-30 15:00:54', null, null, null, null, null, null);
INSERT INTO `sp_privilege_relation` VALUES ('402881ee4c697ab2014c697ba7160004', 'role', '402881dd4c685acd014c686261f90002', null, '402881dd4c691360014c695a7da9001a', 'F', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-03-30 15:00:54', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sp_resource_ui`
-- ----------------------------
DROP TABLE IF EXISTS `sp_resource_ui`;
CREATE TABLE `sp_resource_ui` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SRU_Name` varchar(64) DEFAULT NULL COMMENT '名称',
  `SRU_Type` varchar(64) DEFAULT NULL COMMENT '类型',
  `SRU_Code` varchar(64) DEFAULT NULL COMMENT '编号',
  `SRU_ParentID` varchar(64) DEFAULT NULL COMMENT '上级资源ID',
  `SRU_Operate` varchar(64) DEFAULT NULL COMMENT '操作',
  `SRU_Icon` varchar(64) DEFAULT NULL COMMENT '图标',
  `SRU_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编号',
  `SRU_RecStatus` varchar(2) DEFAULT NULL COMMENT '数据状态',
  `SRU_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SRU_LockStatus` varchar(2) DEFAULT NULL COMMENT '锁定状态',
  `SRU_LockDate` datetime DEFAULT NULL COMMENT '锁定时间',
  `SRU_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SRU_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SRU_CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `SRU_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SRU_LastEditDate` datetime DEFAULT NULL COMMENT '修改时间',
  `SRU_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SRU_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SRU_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SRU_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='UI资源表';

-- ----------------------------
-- Records of sp_resource_ui
-- ----------------------------
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c691360014c693e536a0010', '角色管理', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysRolePageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'gaobing', '2015-03-30 13:53:55', 'admin', '2015-03-30 15:52:14', null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6980d5014c69aa8952001b', '系统管理', 'menu', null, '', '#', null, '402881dd4b763c1a014b768878050018', null, '1', null, null, null, 'admin', '2015-03-30 15:52:06', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f2facbb000e', '部门管理', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysDepartmentPageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:35:38', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f2febbf000f', '数据字典', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysDataDictionaryPageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:35:54', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f3030af0010', '资源列表', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'allResourcePageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:36:11', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f3069a70011', '资源权限', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysPrivilegePage.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:36:26', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f30a2200012', '日志管理', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysLogPageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:36:40', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f30f2920013', '菜单管理', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysMenuPageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:37:01', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881dd4c6e8dc9014c6f31290d0014', '菜单权限', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'menuPrivilegePageCache.do', null, '402881dd4b763c1a014b768878050018', null, '10', null, null, null, 'admin', '2015-03-31 17:37:15', null, null, null, null, null, null);
INSERT INTO `sp_resource_ui` VALUES ('402881ee4c5a102a014c5a118c370000', '用户管理', 'menu', null, '402881dd4c6980d5014c69aa8952001b', 'sysUserPageCache.do', null, '402881dd4b763c1a014b768878050018', null, '1', null, null, null, 'mupeng', '2015-03-27 15:10:42', 'admin', '2015-03-30 15:52:20', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_agency`
-- ----------------------------
DROP TABLE IF EXISTS `sys_agency`;
CREATE TABLE `sys_agency` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SA_Name` varchar(64) DEFAULT NULL COMMENT '机构名称',
  `SA_AccessToken` varchar(64) DEFAULT NULL COMMENT '令牌',
  `SA_Alias` varchar(64) DEFAULT NULL COMMENT '机构别名',
  `SA_Banner` varchar(255) DEFAULT NULL COMMENT '横幅logo',
  `SA_Level` varchar(64) DEFAULT NULL COMMENT '机构级别',
  `SA_Country` varchar(64) DEFAULT NULL COMMENT '国家代码',
  `SA_Address` varchar(255) DEFAULT NULL COMMENT '地址',
  `SA_ExpirationTime` datetime DEFAULT NULL COMMENT '到期时间',
  `SA_LegalPerson` varchar(64) DEFAULT NULL COMMENT '企业法人',
  `SA_LegalMobile` varchar(64) DEFAULT NULL COMMENT '企业法人联系手机',
  `SA_BusinessHoursStart` datetime DEFAULT NULL COMMENT '营业开始时间',
  `SA_BusinessHoursEnd` datetime DEFAULT NULL COMMENT '营业结束时间',
  `SA_License` varchar(64) DEFAULT NULL COMMENT '企业营业号',
  `SA_AdminID` varchar(64) DEFAULT NULL COMMENT '管理员ID',
  `SA_AdminPwd` varchar(255) DEFAULT NULL COMMENT '管理员密码',
  `SA_AdminPhone` varchar(64) DEFAULT NULL COMMENT '管理员联系电话',
  `SA_Order` varchar(64) DEFAULT NULL,
  `SA_RecStatus` varchar(1) DEFAULT NULL COMMENT '数据状态',
  `SA_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SA_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SA_CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `SA_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SA_LastEditDate` datetime DEFAULT NULL COMMENT '修改时间',
  `SA_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SA_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SA_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构信息表';

-- ----------------------------
-- Records of sys_agency
-- ----------------------------
INSERT INTO `sys_agency` VALUES ('402881dd4b763c1a014b768878050018', '西安众擎电子科技有限公司', '75f05661-78e6-455b-9ac5-fa5968646594', '众擎电子', null, null, null, '高新路25号', '2015-02-28 11:27:39', '刘怀亮', '15023654578', null, null, null, 'admin', '324:ab02eadf0b911acf28ecac8c27fc45e6c717ed7cbda69928:9cfb43127d52d7d1172609c369095364e1971f02006e7b81', null, null, '0', null, 'tk', '2015-02-11 10:47:10', null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_datadictionaryitem`
-- ----------------------------
DROP TABLE IF EXISTS `sys_datadictionaryitem`;
CREATE TABLE `sys_datadictionaryitem` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SDDI_TypeID` varchar(64) DEFAULT NULL COMMENT '类型ID',
  `SDDI_ItemName` varchar(255) DEFAULT NULL COMMENT '条目名称',
  `SDDI_Weight` int(11) DEFAULT NULL COMMENT '权重',
  `SDDI_Description` varchar(255) DEFAULT NULL COMMENT '描述',
  `SDDI_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编号',
  `SDDI_RecStatus` varchar(2) DEFAULT NULL COMMENT '数据状态',
  `SDDI_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SDDI_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SDDI_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SDDI_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SDDI_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SDDI_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SDDI_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SDDI_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SDDI_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SDDI_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SDDI_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SDDI_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典条目';

-- ----------------------------
-- Records of sys_datadictionaryitem
-- ----------------------------
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c58b672014c58bbf3b6000b', '402881dd4c58b672014c58b95d340003', '条目1', '1111', '11111', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'futianbo', '2015-03-30', null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a25b5df0034', '402881dd4c58b672014c58b95d340003', '1211', '21121', '12112', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a50ad400038', '402881dd4c58b672014c58b95d340003', '1', '1', '1', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'futianbo', '2015-03-30', null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a50c23c003a', '402881dd4c58b672014c58b95d340003', '2', '2', '2', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'futianbo', '2015-03-30', null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a50d77c003c', '402881dd4c58b672014c58b95d340003', '3', '3', '3', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a50fa5e0040', '402881dd4c58b672014c58b95d340003', '5', '5', '5', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a526b6f0042', '402881dd4c58b672014c58b95d340003', '七', '7', '七', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a9024c9004a', '402881dd4c58b672014c58b95d340003', '8', '8', '8', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a9039aa004c', '402881dd4c58b672014c58b95d340003', '9', '9', '9', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'futianbo', '2015-03-30', null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c59cf8f014c5a9056be004e', '402881dd4c58b672014c58b95d340003', '10', '10', '10', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'futianbo', '2015-03-30', null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b4e9670005', '402881dd4c59cf8f014c59d655a00009', '31', '1', '1', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b5026c0007', '402881dd4c59cf8f014c59d655a00009', '32', '1', '1', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b529400009', '402881dd4c59cf8f014c59d655a00009', '33', '2', '2', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b54daa000b', '402881dd4c59cf8f014c59d655a00009', '34', '2', '2', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b6fcac000d', '402881dd4c59cf8f014c59d62e850007', '22', '22', '22', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b72323000f', '402881dd4c59cf8f014c59d7205d000c', '333', '333', '333', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b7437f0011', '402881dd4c59cf8f014c59d7411d000e', '33', '33', '33', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b75b330013', '402881dd4c59cf8f014c59e7abc30018', '44', '44', '44', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b76f240015', '402881dd4c59cf8f014c59f7e76d0025', '44', '44', '44', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b789050017', '402881dd4c59cf8f014c59f8b7030027', '44', '44', '4', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c687973014c68b7a54c0019', '402881dd4c59cf8f014c59f8d0620029', '55', '55', '55', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionaryitem` VALUES ('402881dd4c68c985014c68cacda90001', '402881dd4c58b672014c58b95d340003', '11', '1', '11', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_datadictionarytype`
-- ----------------------------
DROP TABLE IF EXISTS `sys_datadictionarytype`;
CREATE TABLE `sys_datadictionarytype` (
  `ID` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `SDDT_TypeName` varchar(255) DEFAULT NULL COMMENT '类型名称',
  `SDDT_Code` varchar(255) DEFAULT NULL COMMENT '编码',
  `SDDT_Weight` int(11) DEFAULT NULL COMMENT '权重',
  `SDDT_Description` varchar(255) DEFAULT NULL COMMENT '描述',
  `SDDT_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构编号',
  `SDDT_RecStatus` varchar(2) DEFAULT NULL COMMENT '数据状态',
  `SDDT_Order` varchar(64) DEFAULT NULL COMMENT '排序',
  `SDDT_LockStatus` varchar(1) DEFAULT NULL COMMENT '锁定状态',
  `SDDT_LockDate` date DEFAULT NULL COMMENT '锁定时间',
  `SDDT_LockUserID` varchar(64) DEFAULT NULL COMMENT '锁定人ID(fk)',
  `SDDT_CreateBy` varchar(64) DEFAULT NULL COMMENT '创建者(fk)',
  `SDDT_CreateDate` date DEFAULT NULL COMMENT '创建时间',
  `SDDT_LastEditBy` varchar(64) DEFAULT NULL COMMENT '修改者(fk)',
  `SDDT_LastEditDate` date DEFAULT NULL COMMENT '修改时间',
  `SDDT_Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `SDDT_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SDDT_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SDDT_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类型';

-- ----------------------------
-- Records of sys_datadictionarytype
-- ----------------------------
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c58b672014c58b95d340003', 'test1', '1', '1', 'test1描述', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', 'caoxiaowei', '2015-03-27', null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59d62e850007', '222', '2', '2', '2', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59d655a00009', '333', '333', '3', '3', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59d7205d000c', '444', '444', '44', '4', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59d7411d000e', '555', '5', '5', '5', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59e7abc30018', '44', '44', '4', '4', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59f7e76d0025', '一', '一', '1', '一', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59f8b7030027', '11', '11', '11', '11', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c59cf8f014c59f8d0620029', '22', '22', '22', '22', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-27', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c6980d5014c699c431a000a', '111', '1111', '1111', '1111', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);
INSERT INTO `sys_datadictionarytype` VALUES ('402881dd4c6980d5014c699cf058000c', '2222', '222', '2', '2', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'caoxiaowei', '2015-03-30', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_department`
-- ----------------------------
DROP TABLE IF EXISTS `sys_department`;
CREATE TABLE `sys_department` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SD_Name` varchar(64) DEFAULT NULL COMMENT '部门名称',
  `SD_Code` varchar(64) DEFAULT NULL COMMENT '部门编码',
  `SD_Category` varchar(64) DEFAULT NULL COMMENT '部门类别',
  `SD_IsOnlineReport` varchar(2) DEFAULT NULL COMMENT '是否网上申报',
  `SD_IsStation` varchar(2) DEFAULT NULL COMMENT '是否驻厅',
  `SD_IsContact` varchar(2) DEFAULT NULL COMMENT '是否允许联系',
  `SD_Tel` varchar(64) DEFAULT NULL COMMENT '联系电话',
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
-- Records of sys_department
-- ----------------------------
INSERT INTO `sys_department` VALUES ('402881dd4b763c1a014b768878060019', '陕西省网信办中心管理办公室', 'DEFAULT_DEPARMENT', null, null, null, null, null, '默认部门，请勿删除.', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'tk', '2015-02-11', null, null, null, null, null, null);
INSERT INTO `sys_department` VALUES ('402881ee4b7be527014b7be7bc40006a', '陕西省教育厅', null, null, null, null, null, null, '陕西省教育厅', '402881dd4b763c1a014b768878060019', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', 'admin', '2015-03-31', null, null, null, null);
INSERT INTO `sys_department` VALUES ('402881ee4b7be527014b7be7ee21121c', '陕西省工信厅', null, null, null, null, null, null, '陕西省工信厅', '402881dd4b763c1a014b768878060019', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', 'admin', '2015-03-31', null, null, null, null);
INSERT INTO `sys_department` VALUES ('402881ee4b7be527014b7be7ee24006c', '陕西省环保厅', null, null, null, null, null, null, '陕西省环保厅', '402881dd4b763c1a014b768878060019', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', 'admin', '2015-03-31', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `ID` varchar(64) NOT NULL,
  `SL_UserID` varchar(64) DEFAULT NULL COMMENT '用户ID',
  `SL_UserName` varchar(255) DEFAULT NULL COMMENT '用户真实姓名',
  `SL_OperationType` varchar(64) DEFAULT NULL COMMENT '操作类型 如：更新、添加、删除',
  `SL_ResourceName` varchar(64) DEFAULT NULL COMMENT '资源名称',
  `SL_ResourceId` text COMMENT '资源ID',
  `SL_StartTime` date DEFAULT NULL COMMENT '开始时间',
  `SL_EndTime` date DEFAULT NULL COMMENT '结束时间',
  `SL_SpendTime` int(11) DEFAULT NULL COMMENT '消耗时间，单位：毫秒',
  `SL_TargetMethod` varchar(255) DEFAULT NULL COMMENT '执行的方法名  某个类的某个方法',
  `SL_Args` text COMMENT '执行参数',
  `SL_Comment` text COMMENT '日志简短简述',
  `SL_Ip` varchar(64) DEFAULT NULL COMMENT '发请求的IP地址',
  `SL_Url` text COMMENT '请求的URL',
  `SL_Key1` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key2` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key3` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key4` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key5` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key6` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_Key7` varchar(255) DEFAULT NULL COMMENT '操作的资源属性名。具体映射关系由具体资源的log类决定',
  `SL_JsonText` text COMMENT '该表所有字段和值的完整映射，以json的形式存储',
  `SL_AgencyCode` varchar(64) DEFAULT NULL COMMENT '机构代码',
  `SL_Extend1` varchar(255) DEFAULT NULL COMMENT '扩展字段1',
  `SL_Extend2` varchar(255) DEFAULT NULL COMMENT '扩展字段2',
  `SL_Extend3` varchar(255) DEFAULT NULL COMMENT '扩展字段3',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('402881dd4c6e8dc9014c6e92011e0001', 'admin', 'admin', 'update', 'role', '402881ee4b7be527014b7beab61f0077', '2015-03-31', '2015-03-31', '38', 'com.tk.apis.user.RoleResourceV1.updateRole', '{\"id\":\"402881ee4b7be527014b7beab61f0077\",\"code\":null,\"name\":\"项目经理1\",\"agencyCode\":null,\"agencyName\":null,\"agencyAlias\":null,\"recStatus\":null,\"orders\":null,\"lockStatus\":null,\"lockDate\":null,\"lockUserID\":null,\"createBy\":null,\"createDate\":null,\"lastEditBy\":null,\"lastEditDate\":null,\"remarks\":null,\"extend1\":null,\"extend2\":null,\"extend3\":null}\"402881ee4b7be527014b7beab61f0077\"', '更新一个机构角色。', '192.168.1.156', '/apis/1/roles/402881ee4b7be527014b7beab61f0077', '项目经理1', null, '402881dd4b763c1a014b768878050018', null, null, null, null, '{\"agencyCode\":\"402881dd4b763c1a014b768878050018\",\"args\":\"{\\\"id\\\":\\\"402881ee4b7be527014b7beab61f0077\\\",\\\"code\\\":null,\\\"name\\\":\\\"项目经理1\\\",\\\"agencyCode\\\":null,\\\"agencyName\\\":null,\\\"agencyAlias\\\":null,\\\"recStatus\\\":null,\\\"orders\\\":null,\\\"lockStatus\\\":null,\\\"lockDate\\\":null,\\\"lockUserID\\\":null,\\\"createBy\\\":null,\\\"createDate\\\":null,\\\"lastEditBy\\\":null,\\\"lastEditDate\\\":null,\\\"remarks\\\":null,\\\"extend1\\\":null,\\\"extend2\\\":null,\\\"extend3\\\":null}\\\"402881ee4b7be527014b7beab61f0077\\\"\",\"comment\":\"更新一个机构角色。\",\"endTime\":1427784204554,\"ip\":\"192.168.1.156\",\"key1\":\"项目经理1\",\"key3\":\"402881dd4b763c1a014b768878050018\",\"operationType\":\"update\",\"resourceId\":\"402881ee4b7be527014b7beab61f0077\",\"resourceName\":\"role\",\"spendTime\":38,\"startTime\":1427784204516,\"targetMethod\":\"com.tk.apis.user.RoleResourceV1.updateRole\",\"url\":\"/apis/1/roles/402881ee4b7be527014b7beab61f0077\",\"userId\":\"admin\",\"userName\":\"admin\"}', '402881dd4b763c1a014b768878050018', null, null, null);
INSERT INTO `sys_log` VALUES ('402881dd4c6e8dc9014c6edadaad0009', 'admin', 'admin', 'update', 'department', '402881ee4b7be527014b7be7bc40006a', '2015-03-31', '2015-03-31', '33', 'com.tk.apis.user.DepartmentResourceV1.updateDepartment', '{\"id\":\"402881ee4b7be527014b7be7bc40006a\",\"name\":\"陕西省教育厅\",\"code\":null,\"category\":null,\"isOnlineReport\":null,\"isStation\":null,\"isContact\":null,\"tel\":null,\"description\":\"陕西省教育厅\",\"parentID\":\"402881dd4b763c1a014b768878060019\",\"agencyCode\":null,\"recStatus\":null,\"orders\":null,\"lockStatus\":null,\"lockDate\":null,\"lockUserID\":null,\"createBy\":null,\"createDate\":null,\"lastEditBy\":null,\"lastEditDate\":null,\"remarks\":null,\"extend1\":null,\"extend2\":null,\"extend3\":null}\"402881ee4b7be527014b7be7bc40006a\"', '更新一个机构部门。', '192.168.1.114', '/apis/1/departments/402881ee4b7be527014b7be7bc40006a', '陕西省教育厅', null, '402881dd4b763c1a014b768878050018', null, null, null, null, '{\"agencyCode\":\"402881dd4b763c1a014b768878050018\",\"args\":\"{\\\"id\\\":\\\"402881ee4b7be527014b7be7bc40006a\\\",\\\"name\\\":\\\"陕西省教育厅\\\",\\\"code\\\":null,\\\"category\\\":null,\\\"isOnlineReport\\\":null,\\\"isStation\\\":null,\\\"isContact\\\":null,\\\"tel\\\":null,\\\"description\\\":\\\"陕西省教育厅\\\",\\\"parentID\\\":\\\"402881dd4b763c1a014b768878060019\\\",\\\"agencyCode\\\":null,\\\"recStatus\\\":null,\\\"orders\\\":null,\\\"lockStatus\\\":null,\\\"lockDate\\\":null,\\\"lockUserID\\\":null,\\\"createBy\\\":null,\\\"createDate\\\":null,\\\"lastEditBy\\\":null,\\\"lastEditDate\\\":null,\\\"remarks\\\":null,\\\"extend1\\\":null,\\\"extend2\\\":null,\\\"extend3\\\":null}\\\"402881ee4b7be527014b7be7bc40006a\\\"\",\"comment\":\"更新一个机构部门。\",\"endTime\":1427788978858,\"ip\":\"192.168.1.114\",\"key1\":\"陕西省教育厅\",\"key3\":\"402881dd4b763c1a014b768878050018\",\"operationType\":\"update\",\"resourceId\":\"402881ee4b7be527014b7be7bc40006a\",\"resourceName\":\"department\",\"spendTime\":33,\"startTime\":1427788978825,\"targetMethod\":\"com.tk.apis.user.DepartmentResourceV1.updateDepartment\",\"url\":\"/apis/1/departments/402881ee4b7be527014b7be7bc40006a\",\"userId\":\"admin\",\"userName\":\"admin\"}', '402881dd4b763c1a014b768878050018', null, null, null);
INSERT INTO `sys_log` VALUES ('402881dd4c6e8dc9014c6edb488a000a', 'admin', 'admin', 'update', 'department', '402881ee4b7be527014b7be7ee21121c', '2015-03-31', '2015-03-31', '25', 'com.tk.apis.user.DepartmentResourceV1.updateDepartment', '{\"id\":\"402881ee4b7be527014b7be7ee21121c\",\"name\":\"陕西省工信厅\",\"code\":null,\"category\":null,\"isOnlineReport\":null,\"isStation\":null,\"isContact\":null,\"tel\":null,\"description\":\"陕西省工信厅\",\"parentID\":\"402881dd4b763c1a014b768878060019\",\"agencyCode\":null,\"recStatus\":null,\"orders\":null,\"lockStatus\":null,\"lockDate\":null,\"lockUserID\":null,\"createBy\":null,\"createDate\":null,\"lastEditBy\":null,\"lastEditDate\":null,\"remarks\":null,\"extend1\":null,\"extend2\":null,\"extend3\":null}\"402881ee4b7be527014b7be7ee21121c\"', '更新一个机构部门。', '192.168.1.114', '/apis/1/departments/402881ee4b7be527014b7be7ee21121c', '陕西省工信厅', null, '402881dd4b763c1a014b768878050018', null, null, null, null, '{\"agencyCode\":\"402881dd4b763c1a014b768878050018\",\"args\":\"{\\\"id\\\":\\\"402881ee4b7be527014b7be7ee21121c\\\",\\\"name\\\":\\\"陕西省工信厅\\\",\\\"code\\\":null,\\\"category\\\":null,\\\"isOnlineReport\\\":null,\\\"isStation\\\":null,\\\"isContact\\\":null,\\\"tel\\\":null,\\\"description\\\":\\\"陕西省工信厅\\\",\\\"parentID\\\":\\\"402881dd4b763c1a014b768878060019\\\",\\\"agencyCode\\\":null,\\\"recStatus\\\":null,\\\"orders\\\":null,\\\"lockStatus\\\":null,\\\"lockDate\\\":null,\\\"lockUserID\\\":null,\\\"createBy\\\":null,\\\"createDate\\\":null,\\\"lastEditBy\\\":null,\\\"lastEditDate\\\":null,\\\"remarks\\\":null,\\\"extend1\\\":null,\\\"extend2\\\":null,\\\"extend3\\\":null}\\\"402881ee4b7be527014b7be7ee21121c\\\"\",\"comment\":\"更新一个机构部门。\",\"endTime\":1427789006983,\"ip\":\"192.168.1.114\",\"key1\":\"陕西省工信厅\",\"key3\":\"402881dd4b763c1a014b768878050018\",\"operationType\":\"update\",\"resourceId\":\"402881ee4b7be527014b7be7ee21121c\",\"resourceName\":\"department\",\"spendTime\":25,\"startTime\":1427789006958,\"targetMethod\":\"com.tk.apis.user.DepartmentResourceV1.updateDepartment\",\"url\":\"/apis/1/departments/402881ee4b7be527014b7be7ee21121c\",\"userId\":\"admin\",\"userName\":\"admin\"}', '402881dd4b763c1a014b768878050018', null, null, null);
INSERT INTO `sys_log` VALUES ('402881dd4c6e8dc9014c6edb7edf000b', 'admin', 'admin', 'update', 'department', '402881ee4b7be527014b7be7ee24006c', '2015-03-31', '2015-03-31', '50', 'com.tk.apis.user.DepartmentResourceV1.updateDepartment', '{\"id\":\"402881ee4b7be527014b7be7ee24006c\",\"name\":\"陕西省环保厅\",\"code\":null,\"category\":null,\"isOnlineReport\":null,\"isStation\":null,\"isContact\":null,\"tel\":null,\"description\":\"陕西省环保厅\",\"parentID\":\"402881dd4b763c1a014b768878060019\",\"agencyCode\":null,\"recStatus\":null,\"orders\":null,\"lockStatus\":null,\"lockDate\":null,\"lockUserID\":null,\"createBy\":null,\"createDate\":null,\"lastEditBy\":null,\"lastEditDate\":null,\"remarks\":null,\"extend1\":null,\"extend2\":null,\"extend3\":null}\"402881ee4b7be527014b7be7ee24006c\"', '更新一个机构部门。', '192.168.1.114', '/apis/1/departments/402881ee4b7be527014b7be7ee24006c', '陕西省环保厅', null, '402881dd4b763c1a014b768878050018', null, null, null, null, '{\"agencyCode\":\"402881dd4b763c1a014b768878050018\",\"args\":\"{\\\"id\\\":\\\"402881ee4b7be527014b7be7ee24006c\\\",\\\"name\\\":\\\"陕西省环保厅\\\",\\\"code\\\":null,\\\"category\\\":null,\\\"isOnlineReport\\\":null,\\\"isStation\\\":null,\\\"isContact\\\":null,\\\"tel\\\":null,\\\"description\\\":\\\"陕西省环保厅\\\",\\\"parentID\\\":\\\"402881dd4b763c1a014b768878060019\\\",\\\"agencyCode\\\":null,\\\"recStatus\\\":null,\\\"orders\\\":null,\\\"lockStatus\\\":null,\\\"lockDate\\\":null,\\\"lockUserID\\\":null,\\\"createBy\\\":null,\\\"createDate\\\":null,\\\"lastEditBy\\\":null,\\\"lastEditDate\\\":null,\\\"remarks\\\":null,\\\"extend1\\\":null,\\\"extend2\\\":null,\\\"extend3\\\":null}\\\"402881ee4b7be527014b7be7ee24006c\\\"\",\"comment\":\"更新一个机构部门。\",\"endTime\":1427789020893,\"ip\":\"192.168.1.114\",\"key1\":\"陕西省环保厅\",\"key3\":\"402881dd4b763c1a014b768878050018\",\"operationType\":\"update\",\"resourceId\":\"402881ee4b7be527014b7be7ee24006c\",\"resourceName\":\"department\",\"spendTime\":50,\"startTime\":1427789020843,\"targetMethod\":\"com.tk.apis.user.DepartmentResourceV1.updateDepartment\",\"url\":\"/apis/1/departments/402881ee4b7be527014b7be7ee24006c\",\"userId\":\"admin\",\"userName\":\"admin\"}', '402881dd4b763c1a014b768878050018', null, null, null);

-- ----------------------------
-- Table structure for `sys_privilege_relation`
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
-- Records of sys_privilege_relation
-- ----------------------------
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87d80001', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87d90002', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87d90003', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87d90004', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87d90005', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87da0006', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87da0007', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87da0008', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87da0009', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db000f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0010', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0011', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0012', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0013', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0014', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0015', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87db0016', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0017', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0018', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0019', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc001f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0020', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0021', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0022', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0023', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0024', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0025', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dc0026', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0027', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0028', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0029', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd002f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0030', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0031', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0032', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0033', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0034', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0035', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0036', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0037', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0038', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd0039', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87dd003a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de003b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de003c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de003d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de003e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de003f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0040', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0041', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0042', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0043', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0044', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0045', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0046', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0047', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87de0048', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0049', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df004f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0050', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0051', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0052', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0053', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0054', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0055', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0056', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0057', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0058', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df0059', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df005a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df005b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df005c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df005d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87df005e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87e0005f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87e00060', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87e00061', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87e00062', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5c87e00063', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb850066', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb850067', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb850068', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb850069', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb85006f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb850070', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860071', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860072', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860073', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860074', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860075', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860076', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860077', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860078', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb860079', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb86007a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb86007b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb86007c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87007d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87007e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87007f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870080', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870081', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870082', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870083', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870084', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870085', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870086', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870087', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870088', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb870089', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87008a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87008b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb87008c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88008d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88008e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88008f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880090', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880091', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880092', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880093', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880094', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880095', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880096', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880097', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880098', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb880099', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb88009f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900a9', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900aa', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900ab', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900ac', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900ad', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900ae', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900af', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900b0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900b1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8900b2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b9', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00ba', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bb', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bc', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bd', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00be', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bf', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204300c9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204300ca', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204300cb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204300cc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204300cd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400ce', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400cf', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400d9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400da', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400db', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400dc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400dd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400de', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204400df', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500e9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500ea', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500eb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500ec', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500ed', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500ee', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500ef', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500f0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500f1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204500f2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600f9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600fa', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600fb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600fc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600fd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600fe', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e204600ff', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460100', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460101', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460102', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460103', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460104', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460105', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460106', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460107', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20460108', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470109', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010c', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010d', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010e', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047010f', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470110', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470111', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470112', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470113', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470114', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470115', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470116', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470117', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470118', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470119', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011c', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011d', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011e', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2047011f', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470120', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470121', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20470122', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480123', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480124', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480125', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480126', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480127', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480128', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e20480129', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2048012a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e2048012b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3012c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3012d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3012e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3012f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30130', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30131', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30132', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30133', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30134', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30135', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30136', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30137', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30138', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c30139', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c3013f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40140', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40141', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40142', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40143', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40144', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40145', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40146', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40147', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40148', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40149', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c4014f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40150', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40151', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40152', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40153', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40154', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40155', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40156', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40157', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c40158', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50159', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5015f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50160', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50161', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50162', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50163', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50164', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50165', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50166', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50167', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50168', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50169', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c5016f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50170', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c50171', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60172', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60173', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60174', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60175', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60176', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60177', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60178', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60179', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6017f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60180', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60181', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60182', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60183', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60184', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60185', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60186', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60187', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60188', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c60189', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6018a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6018b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6018c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6018d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);
INSERT INTO `sys_privilege_relation` VALUES ('402881ee4c6d5b1c014c6d5e67c6018e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_resourceoperation`
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
-- Records of sys_resourceoperation
-- ----------------------------
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a00001', 'userManage', null, 'user', null, 'getAllUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10004', 'userManage', null, 'rsTemplate', null, 'deleteTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除资源模板.', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10005', 'userManage', null, 'user', null, 'pageGetUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10006', 'userManage', null, 'userrole', null, 'deleteSysUserRolesByRoleId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据角色ID删除用户角色关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10007', 'userManage', null, 'privilege', null, 'getResourceOpsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型查询资源操作集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10008', 'userManage', null, 'role', null, 'deleteRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除一个机构角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a10009', 'userManage', null, 'department', null, 'pageGetDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a1000a', 'userManage', null, 'privilege', null, 'pageGetResourceOpsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型分页查询资源操作集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a2000b', 'userManage', null, 'userrole', null, 'getSysUsersByRoleId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据角色ID查找用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a2000c', 'userManage', null, 'resop', null, 'createResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a2000d', 'userManage', null, 'privilege', null, 'getPmsByResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据资源操作和权限类型查询权限主体集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a2000e', 'userManage', null, 'userrole', null, 'deleteSysUserRolesByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID删除用户角色关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a2000f', 'userManage', null, 'role', null, 'getAllRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a20010', 'userManage', null, 'privilege', null, 'createPrivilege', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加权限。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a50011', 'userManage', null, 'department', null, 'deleteDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60012', 'userManage', null, 'user', null, 'updateUserPwd', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构用户的密码。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60013', 'userManage', null, 'rsTemplate', null, 'getTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '通过id查找资源模板.', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60014', 'userManage', null, 'privilege', null, 'getResourceOpsByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的资源操作集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60015', 'userManage', null, 'user', null, 'updateUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60016', 'userManage', null, 'privilege', null, 'addResourceOps4PM', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '为权限主体分配资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60018', 'userManage', null, 'department', null, 'createDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a60019', 'userManage', null, 'user', null, 'deleteUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a6001a', 'userManage', null, 'userrole', null, 'getSysRolesByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID查找角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a6001b', 'userManage', null, 'userrole', null, 'deleteUserRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除用户角色关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a6001c', 'userManage', null, 'log', null, 'deleteLogs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构日志信息', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a7001d', 'userManage', null, 'role', null, 'createRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a7001e', 'userManage', null, 'userrole', null, 'createUserRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加用户角色关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a7001f', 'userManage', null, 'privilege', null, 'deletePrivileges', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除权限。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70020', 'userManage', null, 'rsTemplate', null, 'createTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '创建资源模板.', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70021', 'userManage', null, 'log', null, 'getLog', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构日志信息。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70022', 'userManage', null, 'privilege', null, 'getPrivilegesByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的权限集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70023', 'userManage', null, 'log', null, 'getLogAndCompare', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构日志信息并进行对比。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70024', 'userManage', null, 'resop', null, 'getResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70025', 'userManage', null, 'department', null, 'updateDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70026', 'userManage', null, 'rsTemplate', null, 'updateTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新资源模板.', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70027', 'userManage', null, 'resop', null, 'deleteResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70028', 'userManage', null, 'user', null, 'getUserByUserID', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户账号查询机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a70029', 'userManage', null, 'role', null, 'updateRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a7002a', 'userManage', null, 'user', null, 'createUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a8002b', 'userManage', null, 'user', null, 'getUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构用户。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a8002c', 'userManage', null, 'department', null, 'getAllDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a8002d', 'userManage', null, 'department', null, 'getDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构部门。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a8002e', 'userManage', null, 'log', null, 'pageGetLogs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构日志信息。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a8002f', 'userManage', null, 'resop', null, 'getAllResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找所有资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a80030', 'userManage', null, 'role', null, 'pageGetRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a80031', 'userManage', null, 'privilege', null, 'deletePrivilegeByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型删除权限。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a80032', 'userManage', null, 'role', null, 'getRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '通过ID查找机构角色。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a80033', 'userManage', null, 'agency', null, 'updateAgency', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构信息。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4b7be527014b7be584a80034', 'userManage', null, 'resop', null, 'pageGetResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830001', 'userManage', null, 'datadictionaryType', null, 'getAllDatatictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830002', 'userManage', null, 'datadictionaryItem', null, 'deleteDataDictionaryItems', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除数据字典条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830003', 'sp', null, 'attachment', null, 'updateAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830004', 'sp', null, 'itemDefinition', null, 'lockItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '禁用一个机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830005', 'sp', null, 'attachment', null, 'pageGetAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830006', 'userManage', null, 'datadictionaryItem', null, 'updateDatadictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个数据字典条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830007', 'sp', null, 'attachment', null, 'getAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830008', 'userManage', null, 'datadictionaryType', null, 'deleteDataDictionaryTypes', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830009', 'sp', null, 'itemDefinition', null, 'getItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000a', 'userManage', null, 'datadictionaryItem', null, 'pageGetDataDictionaryItemsByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询数据字典类型下的项目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000b', 'userManage', null, 'datadictionaryType', null, 'updateDatadictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000c', 'sp', null, 'itemDefinition', null, 'pageGetItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000d', 'sp', null, 'processViewRelation', null, 'getProcessViewRelationsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000e', 'sp', null, 'itemDefinition', null, 'updateItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683000f', 'sp', null, 'itemDefinition', null, 'unlockItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '启用一个机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830010', 'sp', null, 'attachment', null, 'getAttachmentsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830011', 'sp', null, 'processViewRelation', null, 'getProcessViewRelationByProcessNode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据流程定义和流程节点查询流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830012', 'sp', null, 'processViewRelation', null, 'getAllProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830013', 'sp', null, 'attachment', null, 'getAllAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830014', 'sp', null, 'itemDefinition', null, 'deleteItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830015', 'userManage', null, 'datadictionaryType', null, 'pageGetDataDictionaryTypes', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830016', 'sp', null, 'itemDefinition', null, 'getAllItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830017', 'sp', null, 'processViewRelation', null, 'getProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830018', 'userManage', null, 'rsTemplate', null, 'getAllTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '获取所有资源模板.', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830019', 'userManage', null, 'datadictionaryItem', null, 'createDataDictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个数据字典条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683001b', 'sp', null, 'itemDefinition', null, 'createItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683001c', 'sp', null, 'itemDefinition', null, 'getItemDefinitionsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构事项定义。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683001d', 'userManage', null, 'datadictionaryItem', null, 'getAllDatatictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有数据字典条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683001e', 'sp', null, 'processViewRelation', null, 'pageGetProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c00683001f', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItemsByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据typdId查出该数据字典类型下所有的条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830020', 'sp', null, 'processViewRelation', null, 'createProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830021', 'sp', null, 'processViewRelation', null, 'deleteProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830022', 'sp', null, 'processViewRelation', null, 'updateProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构流程视图关系。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830023', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830024', 'userManage', null, 'datadictionaryType', null, 'createDataDictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830025', 'sp', null, 'attachment', null, 'deleteAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830026', 'sp', null, 'attachment', null, 'uploadAndCreateAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '上传并添加一个机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c49bfd2014c49c006830027', 'sp', null, 'attachment', null, 'createAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构附件。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10001', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItemsByCode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据typdId查出该数据字典类型下所有的条目。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10004', 'resourceui', null, 'resourceUI', null, 'deleteResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10005', 'userManage', null, 'datadictionaryType', null, 'getDataDictionaryTypeByCode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10006', 'resourceui', null, 'resourceUI', null, 'getAllResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找所有UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10007', 'userManage', null, 'datadictionaryType', null, 'getDataDictionaryTypeByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典类型。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10008', 'resourceui', null, 'resourceUI', null, 'pageGetResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c10009', 'resourceui', null, 'resourceUI', null, 'createResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c1000a', 'resourceui', null, 'resourceUI', null, 'getResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c1000b', 'resourceui', null, 'resourceUIPrivilege', null, 'addResourceUIs4PM', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '为UI权限主体分配资源操作。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c555f41014c555fd4c1000c', 'resourceui', null, 'resourceUI', null, 'updateResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构UI资源。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c5563cb014c5563ee700001', 'resourceui', null, 'resourceUIPrivilege', null, 'getResourceUIsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型查询资源操作集。', null, null, null);
INSERT INTO `sys_resourceoperation` VALUES ('402881ee4c5563cb014c5563ee700002', 'resourceui', null, 'resourceUIPrivilege', null, 'getResourceUIPrivilegesByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的权限集。', null, null, null);

-- ----------------------------
-- Table structure for `sys_role`
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
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('402881dd4b763c1a014b76887806001a', 'DEFAULT_ROLE', '管理员', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'tk', '2015-02-11', null, null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('402881ee4b7be527014b7bea206d006f', null, '开发', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('402881ee4b7be527014b7bea320d0071', null, '测试', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_role` VALUES ('402881ee4b7be527014b7beab61f0077', null, '项目经理1', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', 'admin', '2015-03-31', null, null, null, null);

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SU_UserID` varchar(64) DEFAULT NULL COMMENT '用户ID',
  `SU_UserPwd` varchar(255) DEFAULT NULL COMMENT '用户密码',
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
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('402881dd4b763c1a014b76887809001c', 'admin', '324:ab02eadf0b911acf28ecac8c27fc45e6c717ed7cbda69928:9cfb43127d52d7d1172609c369095364e1971f02006e7b81', 'DEFAULT_USER', 'admin', '402881dd4b763c1a014b768878060019', '402881dd4b763c1a014b76887809001b', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'tk', '2015-02-11', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7bea92220074', 'caoxiaowei', '324:a1f7dc0994450b0451795369c2f7470b4fd24b468d67bf12:05ade52c757cb4c7b725f93234fa3a880fcfc8d6711fc793', null, '曹小伟', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7bea92220073', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, 'gaoweipeng', '2015-02-12', null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7beafd82007a', 'nieyanlong', '324:77d741a5e9a1921f07bfdcb8a344a94ee162ef01881862ad:833df26b92c9d73d3e6fbd1ca2bc05f20701dd3a23c40692', null, '聂彦龙', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7beafd810079', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7beb60b8007e', 'mupeng', '324:acf9888f00a850d998c27d301a78146212721e15fe77ace7:6afc7d3968b9aa31b43fdde0513debe8c51bbfee7f157c9f', null, '慕鹏', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7beb60b7007d', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7beb9fce0082', 'gaoweipeng', '324:4695a8182687306176bf2ce0a4abbf9bfaf47368d20428f6:63db434426abcab9a6dd97e846ed309fe16d87cd9f359653', null, '高伟鹏', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7beb9fce0081', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7bebd4fe0086', 'gaobing', '324:ead87a3026d932991cdc615dbd4d1e684525851f43106b4e:372f13c1137b02b2f25d9a678edefab2aacbb30fc36b30d2', null, '高冰', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7bebd4fd0085', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7bec371d008a', 'futianbo', '324:93faa9ad9e67595c5f807fab5791eb67b6dfd29718bd2315:a68ca59045a84cf1ad5ec0c11423d3e9bc97b49f96661089', null, '傅天博', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7bec371c0089', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7beca750008e', 'yangruoyang', '324:5dc63966429e2189d0a6937b883f92c822dec91ea93b67db:829d211bf1e4d6e676510a9047ab7a8cb5ab9910d79855eb', null, '杨若洋', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7beca750008d', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user` VALUES ('402881ee4b7be527014b7becdd540092', 'lincongyuan', '324:9dc9b67d4430811cfc791b14716ece4f92602f577019eaac:bb69690d2af6fb1f5a99711094e0d1b8345e54f82ab956e9', null, '林淙源', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7becdd540091', '2015-02-12', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_user_detail`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_detail`;
CREATE TABLE `sys_user_detail` (
  `ID` varchar(64) NOT NULL COMMENT '主键',
  `SUD_RealName` varchar(64) DEFAULT NULL COMMENT '姓名',
  `SUD_Sex` varchar(1) DEFAULT NULL COMMENT '性别',
  `SUD_PhotoURL` text COMMENT '照片URL',
  `SUD_Photo` longblob COMMENT '照片',
  `SUD_IDNumber` varchar(64) DEFAULT NULL COMMENT '身份证',
  `SUD_Birthday` date DEFAULT NULL COMMENT '出生日期',
  `SUD_IsMarried` varchar(1) DEFAULT NULL COMMENT '婚姻状况',
  `SUD_PositionLevel` varchar(64) DEFAULT NULL COMMENT '岗位级别',
  `SUD_BelongWindow` varchar(64) DEFAULT NULL COMMENT '归属窗口',
  `SUD_EducationLevel` varchar(64) DEFAULT NULL COMMENT '文化程度',
  `SUD_ContactWay` varchar(64) DEFAULT NULL COMMENT '联系方式',
  `SUD_Email` varchar(64) DEFAULT NULL COMMENT '电子邮件',
  `SUD_Nation` varchar(64) DEFAULT NULL COMMENT '民族',
  `SUD_Origin` varchar(255) DEFAULT NULL COMMENT '籍贯',
  `SUD_PoliticalStatus` varchar(64) DEFAULT NULL COMMENT '政治面貌',
  `SUD_Address` varchar(255) DEFAULT NULL COMMENT '地址',
  `SUD_Company` varchar(255) DEFAULT NULL COMMENT '所在公司',
  `SUD_Title` varchar(64) DEFAULT NULL COMMENT '职称',
  `SUD_Position` varchar(64) DEFAULT NULL COMMENT '职位',
  `SUD_Education` varchar(64) DEFAULT NULL COMMENT '学历',
  `SUD_Degree` varchar(64) DEFAULT NULL COMMENT '学位',
  `SUD_University` varchar(64) DEFAULT NULL COMMENT '毕业院校',
  `SUD_Major` varchar(64) DEFAULT NULL COMMENT '专业',
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
-- Records of sys_user_detail
-- ----------------------------
INSERT INTO `sys_user_detail` VALUES ('402881dd4b763c1a014b76887809001b', null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7bea92220073', null, null, null, null, null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7beafd810079', null, null, null, null, null, null, null, null, '3', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7beb60b7007d', null, null, null, null, null, null, null, null, '4', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7beb9fce0081', null, null, null, null, null, null, null, null, '5', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7bebd4fd0085', null, null, null, null, null, null, null, null, '6', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7bec371c0089', null, null, null, null, null, null, null, null, '7', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7beca750008d', null, null, null, null, null, null, null, null, '8', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_detail` VALUES ('402881ee4b7be527014b7becdd540091', null, null, null, null, null, null, null, null, '9', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sys_user_role_relation`
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
-- Records of sys_user_role_relation
-- ----------------------------
INSERT INTO `sys_user_role_relation` VALUES ('402881dd4b763c1a014b7688780a001d', '402881dd4b763c1a014b76887809001c', '402881dd4b763c1a014b76887806001a', '402881dd4b763c1a014b768878050018', null, null, null, null, 'tk', '2015-02-11', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881dd4b7c6922014b7c69d7730002', '402881ee4b7be527014b7bea92220074', '402881ee4b7be527014b7bea320d0071', '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7beafd82007b', '402881ee4b7be527014b7beafd82007a', '402881ee4b7be527014b7beab61f0077', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7beb60b8007f', '402881ee4b7be527014b7beb60b8007e', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7beb9fce0083', '402881ee4b7be527014b7beb9fce0082', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7bebd4fe0087', '402881ee4b7be527014b7bebd4fe0086', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7bec3720008b', '402881ee4b7be527014b7bec371d008a', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7beca750008f', '402881ee4b7be527014b7beca750008e', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
INSERT INTO `sys_user_role_relation` VALUES ('402881ee4b7be527014b7becdd540093', '402881ee4b7be527014b7becdd540092', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12', null, null, null, null, null, null);
