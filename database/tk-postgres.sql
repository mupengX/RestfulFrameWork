/*
Navicat PGSQL Data Transfer

Source Server         : 82
Source Server Version : 90401
Source Host           : 192.168.1.82:5432
Source Database       : tk_back
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90401
File Encoding         : 65001

Date: 2015-06-08 17:08:07
*/


-- ----------------------------
-- Table structure for esso_sessions
-- ----------------------------
DROP TABLE IF EXISTS "public"."esso_sessions";
CREATE TABLE "public"."esso_sessions" (
"agency_code" text COLLATE "default",
"sso_session_id" varchar(32) COLLATE "default" NOT NULL,
"sso_user_name" varchar(16) COLLATE "default" NOT NULL,
"action_by_product" varchar(16) COLLATE "default" DEFAULT ''::character varying NOT NULL,
"action_by_ip" varchar(20) COLLATE "default" NOT NULL,
"rec_date" timestamp(6) NOT NULL,
"rec_status" text COLLATE "default" NOT NULL,
"rec_user_id" varchar(16) COLLATE "default" NOT NULL,
"sso_session_expiration" varchar(32) COLLATE "default" NOT NULL,
"sso_session_status" text COLLATE "default" NOT NULL,
"sso_session_creation" timestamp(6) NOT NULL,
"userid" varchar(45) COLLATE "default" DEFAULT ''::character varying NOT NULL,
"sso_session_creation_millis" int8
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of esso_sessions
-- ----------------------------

-- ----------------------------
-- Table structure for sp_privilege_relation
-- ----------------------------
DROP TABLE IF EXISTS "public"."sp_privilege_relation";
CREATE TABLE "public"."sp_privilege_relation" (
"id" text COLLATE "default" NOT NULL,
"spr_pmtype" text COLLATE "default",
"spr_pmid" text COLLATE "default",
"spr_resoptype" text COLLATE "default",
"spr_resopid" text COLLATE "default",
"spr_permission" text COLLATE "default",
"spr_agencycode" text COLLATE "default",
"spr_recstatus" text COLLATE "default",
"spr_order" text COLLATE "default",
"spr_lockstatus" text COLLATE "default",
"spr_lockdate" timestamp(6),
"spr_lockuserid" text COLLATE "default",
"spr_createby" text COLLATE "default",
"spr_createdate" timestamp(6),
"spr_lasteditby" text COLLATE "default",
"spr_lasteditdate" timestamp(6),
"spr_remarks" text COLLATE "default",
"spr_extend1" text COLLATE "default",
"spr_extend2" text COLLATE "default",
"spr_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sp_privilege_relation
-- ----------------------------

-- ----------------------------
-- Table structure for sp_resource_ui
-- ----------------------------
DROP TABLE IF EXISTS "public"."sp_resource_ui";
CREATE TABLE "public"."sp_resource_ui" (
"id" text COLLATE "default" NOT NULL,
"sru_name" text COLLATE "default",
"sru_type" text COLLATE "default",
"sru_code" text COLLATE "default",
"sru_parentid" text COLLATE "default",
"sru_operate" text COLLATE "default",
"sru_icon" text COLLATE "default",
"sru_agencycode" text COLLATE "default",
"sru_recstatus" text COLLATE "default",
"sru_order" text COLLATE "default",
"sru_lockstatus" text COLLATE "default",
"sru_lockdate" timestamp(6),
"sru_lockuserid" text COLLATE "default",
"sru_createby" text COLLATE "default",
"sru_createdate" timestamp(6),
"sru_lasteditby" text COLLATE "default",
"sru_lasteditdate" timestamp(6),
"sru_remarks" text COLLATE "default",
"sru_extend1" text COLLATE "default",
"sru_extend2" text COLLATE "default",
"sru_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sp_resource_ui
-- ----------------------------


-- ----------------------------
-- Table structure for sys_agency
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_agency";
CREATE TABLE "public"."sys_agency" (
"id" text COLLATE "default" NOT NULL,
"sa_name" text COLLATE "default",
"sa_accesstoken" text COLLATE "default",
"sa_alias" text COLLATE "default",
"sa_banner" text COLLATE "default",
"sa_level" text COLLATE "default",
"sa_country" text COLLATE "default",
"sa_address" text COLLATE "default",
"sa_expirationtime" timestamp(6),
"sa_legalperson" text COLLATE "default",
"sa_legalmobile" text COLLATE "default",
"sa_businesshoursstart" timestamp(6),
"sa_businesshoursend" timestamp(6),
"sa_license" text COLLATE "default",
"sa_adminid" text COLLATE "default",
"sa_adminpwd" text COLLATE "default",
"sa_adminphone" text COLLATE "default",
"sa_order" text COLLATE "default",
"sa_recstatus" text COLLATE "default",
"sa_remarks" text COLLATE "default",
"sa_createby" text COLLATE "default",
"sa_createdate" timestamp(6),
"sa_lasteditby" text COLLATE "default",
"sa_lasteditdate" timestamp(6),
"sa_extend1" text COLLATE "default",
"sa_extend2" text COLLATE "default",
"sa_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_agency
-- ----------------------------


-- ----------------------------
-- Table structure for sys_datadictionaryitem
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_datadictionaryitem";
CREATE TABLE "public"."sys_datadictionaryitem" (
"id" text COLLATE "default" NOT NULL,
"sddi_typeid" text COLLATE "default",
"sddi_itemname" text COLLATE "default",
"sddi_weight" int4,
"sddi_description" text COLLATE "default",
"sddi_agencycode" text COLLATE "default",
"sddi_recstatus" text COLLATE "default",
"sddi_order" text COLLATE "default",
"sddi_lockstatus" text COLLATE "default",
"sddi_lockdate" timestamp(6),
"sddi_lockuserid" text COLLATE "default",
"sddi_createby" text COLLATE "default",
"sddi_createdate" timestamp(6),
"sddi_lasteditby" text COLLATE "default",
"sddi_lasteditdate" timestamp(6),
"sddi_remarks" text COLLATE "default",
"sddi_extend1" text COLLATE "default",
"sddi_extend2" text COLLATE "default",
"sddi_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_datadictionaryitem
-- ----------------------------

-- ----------------------------
-- Table structure for sys_datadictionarytype
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_datadictionarytype";
CREATE TABLE "public"."sys_datadictionarytype" (
"id" text COLLATE "default" NOT NULL,
"sddt_typename" text COLLATE "default",
"sddt_code" text COLLATE "default",
"sddt_weight" int4,
"sddt_description" text COLLATE "default",
"sddt_agencycode" text COLLATE "default",
"sddt_recstatus" text COLLATE "default",
"sddt_order" text COLLATE "default",
"sddt_lockstatus" text COLLATE "default",
"sddt_lockdate" timestamp(6),
"sddt_lockuserid" text COLLATE "default",
"sddt_createby" text COLLATE "default",
"sddt_createdate" timestamp(6),
"sddt_lasteditby" text COLLATE "default",
"sddt_lasteditdate" timestamp(6),
"sddt_remarks" text COLLATE "default",
"sddt_extend1" text COLLATE "default",
"sddt_extend2" text COLLATE "default",
"sddt_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_datadictionarytype
-- ----------------------------

-- ----------------------------
-- Table structure for sys_department
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_department";
CREATE TABLE "public"."sys_department" (
"id" text COLLATE "default" NOT NULL,
"sd_name" text COLLATE "default",
"sd_code" text COLLATE "default",
"sd_category" text COLLATE "default",
"sd_isonlinereport" text COLLATE "default",
"sd_isstation" text COLLATE "default",
"sd_iscontact" text COLLATE "default",
"sd_tel" text COLLATE "default",
"sd_description" text COLLATE "default",
"sd_parentid" text COLLATE "default",
"sd_agencycode" text COLLATE "default",
"sd_recstatus" text COLLATE "default",
"sd_order" text COLLATE "default",
"sd_lockstatus" text COLLATE "default",
"sd_lockdate" timestamp(6),
"sd_lockuserid" text COLLATE "default",
"sd_createby" text COLLATE "default",
"sd_createdate" timestamp(6),
"sd_lasteditby" text COLLATE "default",
"sd_lasteditdate" timestamp(6),
"sd_remarks" text COLLATE "default",
"sd_extend1" text COLLATE "default",
"sd_extend2" text COLLATE "default",
"sd_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_department
-- ----------------------------

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_log";
CREATE TABLE "public"."sys_log" (
"id" text COLLATE "default" NOT NULL,
"sl_userid" text COLLATE "default",
"sl_username" text COLLATE "default",
"sl_operationtype" text COLLATE "default",
"sl_resourcename" text COLLATE "default",
"sl_resourceid" text COLLATE "default",
"sl_starttime" timestamp(6),
"sl_endtime" timestamp(6),
"sl_spendtime" int4,
"sl_targetmethod" text COLLATE "default",
"sl_args" text COLLATE "default",
"sl_comment" text COLLATE "default",
"sl_ip" text COLLATE "default",
"sl_url" text COLLATE "default",
"sl_key1" text COLLATE "default",
"sl_key2" text COLLATE "default",
"sl_key3" text COLLATE "default",
"sl_key4" text COLLATE "default",
"sl_key5" text COLLATE "default",
"sl_key6" text COLLATE "default",
"sl_key7" text COLLATE "default",
"sl_jsontext" text COLLATE "default",
"sl_agencycode" text COLLATE "default",
"sl_extend1" text COLLATE "default",
"sl_extend2" text COLLATE "default",
"sl_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_privilege_relation
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_privilege_relation";
CREATE TABLE "public"."sys_privilege_relation" (
"id" text COLLATE "default" NOT NULL,
"sp_pmtype" text COLLATE "default",
"sp_pmid" text COLLATE "default",
"sp_resoptype" text COLLATE "default",
"sp_resopid" text COLLATE "default",
"sp_permission" text COLLATE "default",
"sp_agencycode" text COLLATE "default",
"sp_recstatus" text COLLATE "default",
"sp_createby" text COLLATE "default",
"sp_createdate" timestamp(6),
"sp_lasteditby" text COLLATE "default",
"sp_lasteditdate" timestamp(6),
"sp_remarks" text COLLATE "default",
"sp_extend1" text COLLATE "default",
"sp_extend2" text COLLATE "default",
"sp_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_privilege_relation
-- ----------------------------
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87d80001', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87d90002', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87d90003', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87d90004', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87d90005', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87da0006', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87da0007', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87da0008', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87da0009', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db000f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0010', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0011', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0012', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0013', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0014', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0015', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87db0016', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0017', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0018', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0019', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc001f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0020', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0021', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0022', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0023', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0024', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0025', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dc0026', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0027', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0028', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0029', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd002f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0030', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0031', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0032', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0033', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0034', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0035', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0036', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0037', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0038', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd0039', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87dd003a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de003b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de003c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de003d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de003e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de003f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0040', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0041', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0042', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0043', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0044', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0045', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0046', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0047', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87de0048', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0049', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df004f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0050', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0051', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0052', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0053', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0054', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0055', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0056', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0057', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0058', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df0059', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df005a', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df005b', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df005c', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df005d', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87df005e', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87e0005f', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87e00060', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87e00061', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87e00062', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5c87e00063', 'role', '402881dd4b763c1a014b76887806001a', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb850066', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb850067', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb850068', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb850069', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb85006f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb850070', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860071', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860072', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860073', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860074', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860075', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860076', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860077', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860078', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb860079', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb86007a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb86007b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb86007c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87007d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87007e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87007f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870080', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870081', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870082', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870083', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870084', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870085', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870086', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870087', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870088', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb870089', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87008a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87008b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb87008c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88008d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88008e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88008f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880090', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880091', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880092', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880093', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880094', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880095', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880096', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880097', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880098', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb880099', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009a', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009b', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009c', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009d', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009e', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb88009f', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900a9', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900aa', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900ab', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900ac', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900ad', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900ae', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900af', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900b0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900b1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8900b2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00b9', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00ba', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bb', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bc', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bd', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00be', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00bf', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c0', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c1', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c2', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c3', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c4', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c5', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c6', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c7', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5ddb8a00c8', 'role', '402881ee4b7be527014b7beab61f0077', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204300c9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204300ca', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204300cb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204300cc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204300cd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400ce', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400cf', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400d9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400da', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400db', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400dc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400dd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400de', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204400df', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500e9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500ea', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500eb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500ec', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500ed', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500ee', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500ef', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500f0', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500f1', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204500f2', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f3', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f4', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f5', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f6', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f7', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f8', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600f9', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600fa', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600fb', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600fc', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600fd', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600fe', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e204600ff', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460100', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460101', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460102', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460103', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460104', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460105', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460106', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460107', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20460108', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470109', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010c', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010d', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010e', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047010f', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470110', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470111', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470112', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470113', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470114', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470115', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470116', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470117', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470118', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470119', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011c', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011d', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011e', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2047011f', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470120', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470121', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20470122', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480123', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480124', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480125', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480126', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480127', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480128', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e20480129', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2048012a', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e2048012b', 'role', '402881ee4b7be527014b7bea320d0071', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3012c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80033', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3012d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830003', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3012e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3012f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30130', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30131', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30132', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30133', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30134', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30135', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30136', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30137', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30138', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c30139', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c3013f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40140', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40141', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40142', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40143', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40144', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40145', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a50011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40146', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40147', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70025', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40148', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40149', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c4014f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40150', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40151', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40152', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40153', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40154', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40155', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70023', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40156', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40157', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10007', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c40158', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50159', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a20010', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60014', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60016', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5015f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80031', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50160', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683000d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50161', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830011', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50162', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50163', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830017', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50164', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c00683001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50165', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50166', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830021', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50167', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830022', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50168', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50169', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70024', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70027', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80034', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c5016f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50170', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c10009', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c50171', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60172', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000c', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60173', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c555f41014c555fd4c1000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60174', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c5563cb014c5563ee700001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60175', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c5563cb014c5563ee700002', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60176', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10008', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60177', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000f', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60178', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001d', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60179', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70029', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80030', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a80032', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10004', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60013', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70020', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6017f', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70026', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60180', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4c49bfd2014c49c006830018', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60181', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a00001', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60182', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10005', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60183', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60012', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60184', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60015', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60185', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a60019', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60186', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a70028', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60187', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7002a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60188', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a8002b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c60189', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a10006', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6018a', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6018b', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a2000e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6018c', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001a', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6018d', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a6001b', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_privilege_relation" VALUES ('402881ee4c6d5b1c014c6d5e67c6018e', 'role', '402881ee4b7be527014b7bea206d006f', null, '402881ee4b7be527014b7be584a7001e', 'F', '402881dd4b763c1a014b768878050018', null, 'tk', '2015-03-31 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_resourceoperation
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_resourceoperation";
CREATE TABLE "public"."sys_resourceoperation" (
"id" text COLLATE "default" NOT NULL,
"sro_modulecode" text COLLATE "default",
"sro_modulename" text COLLATE "default",
"sro_resourcecode" text COLLATE "default",
"sro_resourcename" text COLLATE "default",
"sro_operatecode" text COLLATE "default",
"sro_operatename" text COLLATE "default",
"sro_operatelevelcode" text COLLATE "default",
"sro_operatelevel" text COLLATE "default",
"sro_agencycode" text COLLATE "default",
"sro_recstatus" text COLLATE "default",
"sro_order" text COLLATE "default",
"sro_lockstatus" text COLLATE "default",
"sro_lockdate" timestamp(6),
"sro_lockuserid" text COLLATE "default",
"sro_createby" text COLLATE "default",
"sro_createdate" timestamp(6),
"sro_lasteditby" text COLLATE "default",
"sro_lasteditdate" timestamp(6),
"sro_remarks" text COLLATE "default",
"sro_extend1" text COLLATE "default",
"sro_extend2" text COLLATE "default",
"sro_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_resourceoperation
-- ----------------------------
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a00001', 'userManage', null, 'user', null, 'getAllUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10004', 'userManage', null, 'rsTemplate', null, 'deleteTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除资源模板.', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10005', 'userManage', null, 'user', null, 'pageGetUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10006', 'userManage', null, 'userrole', null, 'deleteSysUserRolesByRoleId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据角色ID删除用户角色关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10007', 'userManage', null, 'privilege', null, 'getResourceOpsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型查询资源操作集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10008', 'userManage', null, 'role', null, 'deleteRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除一个机构角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a10009', 'userManage', null, 'department', null, 'pageGetDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a1000a', 'userManage', null, 'privilege', null, 'pageGetResourceOpsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型分页查询资源操作集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a2000b', 'userManage', null, 'userrole', null, 'getSysUsersByRoleId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据角色ID查找用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a2000c', 'userManage', null, 'resop', null, 'createResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a2000d', 'userManage', null, 'privilege', null, 'getPmsByResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据资源操作和权限类型查询权限主体集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a2000e', 'userManage', null, 'userrole', null, 'deleteSysUserRolesByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID删除用户角色关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a2000f', 'userManage', null, 'role', null, 'getAllRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a20010', 'userManage', null, 'privilege', null, 'createPrivilege', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加权限。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a50011', 'userManage', null, 'department', null, 'deleteDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60012', 'userManage', null, 'user', null, 'updateUserPwd', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构用户的密码。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60013', 'userManage', null, 'rsTemplate', null, 'getTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '通过id查找资源模板.', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60014', 'userManage', null, 'privilege', null, 'getResourceOpsByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的资源操作集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60015', 'userManage', null, 'user', null, 'updateUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60016', 'userManage', null, 'privilege', null, 'addResourceOps4PM', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '为权限主体分配资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60018', 'userManage', null, 'department', null, 'createDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a60019', 'userManage', null, 'user', null, 'deleteUsers', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a6001a', 'userManage', null, 'userrole', null, 'getSysRolesByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID查找角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a6001b', 'userManage', null, 'userrole', null, 'deleteUserRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除用户角色关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a6001c', 'userManage', null, 'log', null, 'deleteLogs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构日志信息', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a7001d', 'userManage', null, 'role', null, 'createRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a7001e', 'userManage', null, 'userrole', null, 'createUserRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加用户角色关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a7001f', 'userManage', null, 'privilege', null, 'deletePrivileges', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除权限。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70020', 'userManage', null, 'rsTemplate', null, 'createTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '创建资源模板.', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70021', 'userManage', null, 'log', null, 'getLog', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构日志信息。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70022', 'userManage', null, 'privilege', null, 'getPrivilegesByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的权限集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70023', 'userManage', null, 'log', null, 'getLogAndCompare', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构日志信息并进行对比。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70024', 'userManage', null, 'resop', null, 'getResourceOp', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70025', 'userManage', null, 'department', null, 'updateDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70026', 'userManage', null, 'rsTemplate', null, 'updateTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新资源模板.', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70027', 'userManage', null, 'resop', null, 'deleteResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70028', 'userManage', null, 'user', null, 'getUserByUserID', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户账号查询机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a70029', 'userManage', null, 'role', null, 'updateRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a7002a', 'userManage', null, 'user', null, 'createUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a8002b', 'userManage', null, 'user', null, 'getUser', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构用户。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a8002c', 'userManage', null, 'department', null, 'getAllDepartments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a8002d', 'userManage', null, 'department', null, 'getDepartment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构部门。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a8002e', 'userManage', null, 'log', null, 'pageGetLogs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构日志信息。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a8002f', 'userManage', null, 'resop', null, 'getAllResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找所有资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a80030', 'userManage', null, 'role', null, 'pageGetRoles', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a80031', 'userManage', null, 'privilege', null, 'deletePrivilegeByUserId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型删除权限。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a80032', 'userManage', null, 'role', null, 'getRole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '通过ID查找机构角色。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a80033', 'userManage', null, 'agency', null, 'updateAgency', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构信息。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4b7be527014b7be584a80034', 'userManage', null, 'resop', null, 'pageGetResourceOps', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830001', 'userManage', null, 'datadictionaryType', null, 'getAllDatatictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830002', 'userManage', null, 'datadictionaryItem', null, 'deleteDataDictionaryItems', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除数据字典条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830003', 'sp', null, 'attachment', null, 'updateAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830004', 'sp', null, 'itemDefinition', null, 'lockItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '禁用一个机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830005', 'sp', null, 'attachment', null, 'pageGetAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830006', 'userManage', null, 'datadictionaryItem', null, 'updateDatadictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个数据字典条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830007', 'sp', null, 'attachment', null, 'getAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830008', 'userManage', null, 'datadictionaryType', null, 'deleteDataDictionaryTypes', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830009', 'sp', null, 'itemDefinition', null, 'getItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000a', 'userManage', null, 'datadictionaryItem', null, 'pageGetDataDictionaryItemsByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询数据字典类型下的项目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000b', 'userManage', null, 'datadictionaryType', null, 'updateDatadictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000c', 'sp', null, 'itemDefinition', null, 'pageGetItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000d', 'sp', null, 'processViewRelation', null, 'getProcessViewRelationsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000e', 'sp', null, 'itemDefinition', null, 'updateItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683000f', 'sp', null, 'itemDefinition', null, 'unlockItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '启用一个机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830010', 'sp', null, 'attachment', null, 'getAttachmentsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830011', 'sp', null, 'processViewRelation', null, 'getProcessViewRelationByProcessNode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据流程定义和流程节点查询流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830012', 'sp', null, 'processViewRelation', null, 'getAllProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830013', 'sp', null, 'attachment', null, 'getAllAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830014', 'sp', null, 'itemDefinition', null, 'deleteItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830015', 'userManage', null, 'datadictionaryType', null, 'pageGetDataDictionaryTypes', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830016', 'sp', null, 'itemDefinition', null, 'getAllItemDefinitions', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830017', 'sp', null, 'processViewRelation', null, 'getProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830018', 'userManage', null, 'rsTemplate', null, 'getAllTemplate', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '获取所有资源模板.', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830019', 'userManage', null, 'datadictionaryItem', null, 'createDataDictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个数据字典条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683001b', 'sp', null, 'itemDefinition', null, 'createItemDefinition', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683001c', 'sp', null, 'itemDefinition', null, 'getItemDefinitionsByAttr', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据属性及对应的值查询机构事项定义。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683001d', 'userManage', null, 'datadictionaryItem', null, 'getAllDatatictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找机构下的所有数据字典条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683001e', 'sp', null, 'processViewRelation', null, 'pageGetProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c00683001f', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItemsByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据typdId查出该数据字典类型下所有的条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830020', 'sp', null, 'processViewRelation', null, 'createProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830021', 'sp', null, 'processViewRelation', null, 'deleteProcessViewRelations', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830022', 'sp', null, 'processViewRelation', null, 'updateProcessViewRelation', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构流程视图关系。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830023', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItem', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830024', 'userManage', null, 'datadictionaryType', null, 'createDataDictionaryType', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830025', 'sp', null, 'attachment', null, 'deleteAttachments', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830026', 'sp', null, 'attachment', null, 'uploadAndCreateAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '上传并添加一个机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c49bfd2014c49c006830027', 'sp', null, 'attachment', null, 'createAttachment', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个机构附件。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10001', 'userManage', null, 'datadictionaryItem', null, 'getDataDictionaryItemsByCode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据typdId查出该数据字典类型下所有的条目。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10004', 'resourceui', null, 'resourceUI', null, 'deleteResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '删除UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10005', 'userManage', null, 'datadictionaryType', null, 'getDataDictionaryTypeByCode', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10006', 'resourceui', null, 'resourceUI', null, 'getAllResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '查找所有UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10007', 'userManage', null, 'datadictionaryType', null, 'getDataDictionaryTypeByTypeId', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询数据字典类型。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10008', 'resourceui', null, 'resourceUI', null, 'pageGetResourceUIs', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '分页查询UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c10009', 'resourceui', null, 'resourceUI', null, 'createResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '添加一个UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c1000a', 'resourceui', null, 'resourceUI', null, 'getResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据ID查询UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c1000b', 'resourceui', null, 'resourceUIPrivilege', null, 'addResourceUIs4PM', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '为UI权限主体分配资源操作。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c555f41014c555fd4c1000c', 'resourceui', null, 'resourceUI', null, 'updateResourceUI', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '更新一个机构UI资源。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c5563cb014c5563ee700001', 'resourceui', null, 'resourceUIPrivilege', null, 'getResourceUIsByPm', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据权限主体和权限类型查询资源操作集。', null, null, null);
INSERT INTO "public"."sys_resourceoperation" VALUES ('402881ee4c5563cb014c5563ee700002', 'resourceui', null, 'resourceUIPrivilege', null, 'getResourceUIPrivilegesByUserrole', null, 'AGENCY', null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, '根据用户ID和权限类型查询用户所扮演的角色的权限集。', null, null, null);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_role";
CREATE TABLE "public"."sys_role" (
"id" text COLLATE "default" NOT NULL,
"sr_code" text COLLATE "default",
"sr_name" text COLLATE "default",
"sr_agencycode" text COLLATE "default",
"sr_recstatus" text COLLATE "default",
"sr_order" text COLLATE "default",
"sr_lockstatus" text COLLATE "default",
"sr_lockdate" timestamp(6),
"sr_lockuserid" text COLLATE "default",
"sr_createby" text COLLATE "default",
"sr_createdate" timestamp(6),
"sr_lasteditby" text COLLATE "default",
"sr_lasteditdate" timestamp(6),
"sr_remarks" text COLLATE "default",
"sr_extend1" text COLLATE "default",
"sr_extend2" text COLLATE "default",
"sr_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO "public"."sys_role" VALUES ('402881dd4b763c1a014b76887806001a', 'DEFAULT_ROLE', '管理员', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'tk', '2015-02-11 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_role" VALUES ('402881ee4b7be527014b7bea206d006f', null, '开发', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_role" VALUES ('402881ee4b7be527014b7bea320d0071', null, '测试', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_role" VALUES ('402881ee4b7be527014b7beab61f0077', null, '项目经理', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_user";
CREATE TABLE "public"."sys_user" (
"id" text COLLATE "default" NOT NULL,
"su_userid" text COLLATE "default",
"su_userpwd" text COLLATE "default",
"su_code" text COLLATE "default",
"su_name" text COLLATE "default",
"su_deptid" text COLLATE "default",
"su_userdetail" text COLLATE "default",
"su_regdate" timestamp(6),
"su_agencycode" text COLLATE "default",
"su_recstatus" text COLLATE "default",
"su_order" text COLLATE "default",
"su_lockstatus" text COLLATE "default",
"su_lockdate" timestamp(6),
"su_lockuserid" text COLLATE "default",
"su_createby" text COLLATE "default",
"su_createdate" timestamp(6),
"su_lasteditby" text COLLATE "default",
"su_lasteditdate" timestamp(6),
"su_remarks" text COLLATE "default",
"su_extend1" text COLLATE "default",
"su_extend2" text COLLATE "default",
"su_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO "public"."sys_user" VALUES ('402881dd4b763c1a014b76887809001c', 'admin', '324:ab02eadf0b911acf28ecac8c27fc45e6c717ed7cbda69928:9cfb43127d52d7d1172609c369095364e1971f02006e7b81', 'DEFAULT_USER', 'admin', '402881dd4b763c1a014b768878060019', '402881dd4b763c1a014b76887809001b', '2015-02-12 00:00:00', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'tk', '2015-02-11 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user" VALUES ('402881ee4b7be527014b7bea92220074', 'xiaohong', '324:a1f7dc0994450b0451795369c2f7470b4fd24b468d67bf12:05ade52c757cb4c7b725f93234fa3a880fcfc8d6711fc793', null, '小红', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7bea92220073', '2015-02-12 00:00:00', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', 'admin', '2015-02-12 00:00:00', null, null, null, null);
INSERT INTO "public"."sys_user" VALUES ('402881ee4b7be527014b7beafd82007a', 'xiaoming', '324:77d741a5e9a1921f07bfdcb8a344a94ee162ef01881862ad:833df26b92c9d73d3e6fbd1ca2bc05f20701dd3a23c40692', null, '小明', '402881ee4b7be527014b7be7bc40006a', '402881ee4b7be527014b7beafd810079', '2015-02-12 00:00:00', '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_user_detail
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_user_detail";
CREATE TABLE "public"."sys_user_detail" (
"id" text COLLATE "default" NOT NULL,
"sud_realname" text COLLATE "default",
"sud_sex" text COLLATE "default",
"sud_photourl" text COLLATE "default",
"sud_photo" bytea,
"sud_idnumber" text COLLATE "default",
"sud_birthday" timestamp(6),
"sud_ismarried" text COLLATE "default",
"sud_positionlevel" text COLLATE "default",
"sud_belongwindow" text COLLATE "default",
"sud_educationlevel" text COLLATE "default",
"sud_contactway" text COLLATE "default",
"sud_email" text COLLATE "default",
"sud_nation" text COLLATE "default",
"sud_origin" text COLLATE "default",
"sud_politicalstatus" text COLLATE "default",
"sud_address" text COLLATE "default",
"sud_company" text COLLATE "default",
"sud_title" text COLLATE "default",
"sud_position" text COLLATE "default",
"sud_education" text COLLATE "default",
"sud_degree" text COLLATE "default",
"sud_university" text COLLATE "default",
"sud_major" text COLLATE "default",
"sud_agencycode" text COLLATE "default",
"sud_recstatus" text COLLATE "default",
"sud_order" text COLLATE "default",
"sud_lockstatus" text COLLATE "default",
"sud_lockdate" timestamp(6),
"sud_lockuserid" text COLLATE "default",
"sud_createby" text COLLATE "default",
"sud_createdate" timestamp(6),
"sud_lasteditby" text COLLATE "default",
"sud_lasteditdate" timestamp(6),
"sud_remarks" text COLLATE "default",
"sud_extend1" text COLLATE "default",
"sud_extend2" text COLLATE "default",
"sud_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_user_detail
-- ----------------------------
INSERT INTO "public"."sys_user_detail" VALUES ('402881dd4b763c1a014b76887809001b', null, null, null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7bea92220073', null, null, null, null, null, null, null, null, '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7beafd810079', null, null, null, null, null, null, null, null, '3', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7beb60b7007d', null, null, null, null, null, null, null, null, '4', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7beb9fce0081', null, null, null, null, null, null, null, null, '5', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7bebd4fd0085', null, null, null, null, null, null, null, null, '6', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7bec371c0089', null, null, null, null, null, null, null, null, '7', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7beca750008d', null, null, null, null, null, null, null, null, '8', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_detail" VALUES ('402881ee4b7be527014b7becdd540091', null, null, null, null, null, null, null, null, '9', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '402881dd4b763c1a014b768878050018', null, null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_user_role_relation
-- ----------------------------
DROP TABLE IF EXISTS "public"."sys_user_role_relation";
CREATE TABLE "public"."sys_user_role_relation" (
"id" text COLLATE "default" NOT NULL,
"sur_userid" text COLLATE "default" NOT NULL,
"sur_roleid" text COLLATE "default",
"sur_agencycode" text COLLATE "default",
"sur_recstatus" text COLLATE "default",
"sur_lockstatus" text COLLATE "default",
"sur_lockdate" timestamp(6),
"sur_lockuserid" text COLLATE "default",
"sur_createby" text COLLATE "default",
"sur_createdate" timestamp(6),
"sur_lasteditby" text COLLATE "default",
"sur_lasteditdate" timestamp(6),
"sur_remarks" text COLLATE "default",
"sur_extend1" text COLLATE "default",
"sur_extend2" text COLLATE "default",
"sur_extend3" text COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of sys_user_role_relation
-- ----------------------------
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881dd4b763c1a014b7688780a001d', '402881dd4b763c1a014b76887809001c', '402881dd4b763c1a014b76887806001a', '402881dd4b763c1a014b768878050018', null, null, null, null, 'tk', '2015-02-11 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881dd4b7c6922014b7c69d7730002', '402881ee4b7be527014b7bea92220074', '402881ee4b7be527014b7bea320d0071', '402881dd4b763c1a014b768878050018', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7beafd82007b', '402881ee4b7be527014b7beafd82007a', '402881ee4b7be527014b7beab61f0077', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7beb60b8007f', '402881ee4b7be527014b7beb60b8007e', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7beb9fce0083', '402881ee4b7be527014b7beb9fce0082', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7bebd4fe0087', '402881ee4b7be527014b7bebd4fe0086', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7bec3720008b', '402881ee4b7be527014b7bec371d008a', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7beca750008f', '402881ee4b7be527014b7beca750008e', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);
INSERT INTO "public"."sys_user_role_relation" VALUES ('402881ee4b7be527014b7becdd540093', '402881ee4b7be527014b7becdd540092', '402881ee4b7be527014b7bea206d006f', '402881dd4b763c1a014b768878050018', null, null, null, null, 'admin', '2015-02-12 00:00:00', null, null, null, null, null, null);

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table esso_sessions
-- ----------------------------
ALTER TABLE "public"."esso_sessions" ADD PRIMARY KEY ("sso_session_id");

-- ----------------------------
-- Primary Key structure for table sp_privilege_relation
-- ----------------------------
ALTER TABLE "public"."sp_privilege_relation" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sp_resource_ui
-- ----------------------------
ALTER TABLE "public"."sp_resource_ui" ADD PRIMARY KEY ("id");



-- ----------------------------
-- Primary Key structure for table sys_agency
-- ----------------------------
ALTER TABLE "public"."sys_agency" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_datadictionaryitem
-- ----------------------------
ALTER TABLE "public"."sys_datadictionaryitem" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_datadictionarytype
-- ----------------------------
ALTER TABLE "public"."sys_datadictionarytype" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_department
-- ----------------------------
ALTER TABLE "public"."sys_department" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_log
-- ----------------------------
ALTER TABLE "public"."sys_log" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_privilege_relation
-- ----------------------------
ALTER TABLE "public"."sys_privilege_relation" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_resourceoperation
-- ----------------------------
ALTER TABLE "public"."sys_resourceoperation" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_role
-- ----------------------------
ALTER TABLE "public"."sys_role" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_user
-- ----------------------------
ALTER TABLE "public"."sys_user" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_user_detail
-- ----------------------------
ALTER TABLE "public"."sys_user_detail" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table sys_user_role_relation
-- ----------------------------
ALTER TABLE "public"."sys_user_role_relation" ADD PRIMARY KEY ("id");
