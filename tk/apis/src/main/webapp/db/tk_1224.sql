/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2014/12/24 11:29:38                          */
/*==============================================================*/


drop table if exists Sys_Privilege;

drop table if exists Sys_ResourceOperation;

drop table if exists Sys_Role;

drop table if exists Sys_User;

drop table if exists Sys_UserRole;

/*==============================================================*/
/* Table: Sys_Privilege                                         */
/*==============================================================*/
create table Sys_Privilege
(
   ID                   varchar(64) not null comment '主键',
   SP_PmType            varchar(64) comment '权限主体类型',
   SP_PmID              varchar(64) comment '权限主体ID(fk)',
   SP_ResOpType         varchar(64) comment '资源操作类型',
   SP_ResOpID           varchar(64) comment '资源操作ID(fk)',
   SP_Permission        varchar(1) comment '权限：F/N/R',
   SP_AgencyCode        varchar(64) comment '机构编码(fk)',
   SP_RecStatus         varchar(1) comment '数据状态',
   SP_RecUserID         varchar(64) comment '创建者(fk)',
   SP_RecDate           date comment '创建时间',
   SP_LastEditBy        varchar(64) comment '修改者(fk)',
   SP_LastEditDate      date comment '修改时间',
   SP_Remarks           varchar(255) comment '备注',
   SP_Extend1           varchar(64) comment '扩展字段1',
   SP_Extend2           varchar(64) comment '扩展字段2',
   SP_Extend3           varchar(64) comment '扩展字段3',
   primary key (ID)
);

alter table Sys_Privilege comment '权限表';

/*==============================================================*/
/* Table: Sys_ResourceOperation                                 */
/*==============================================================*/
create table Sys_ResourceOperation
(
   ID                   varchar(64) not null comment '主键',
   SRO_ModuleCode       varchar(64) comment '模块代码，程序中的注解',
   SRO_ModuleName       varchar(64) comment '模块名称',
   SRO_ResourceCode     varchar(64) comment '资源代码，程序中的注解',
   SRO_ResourceName     varchar(64) comment '资源名称',
   SRO_OperateCode      varchar(64) comment '操作代码，程序中的注解',
   SRO_OperateName      varchar(64) comment '操作名称',
   SRO_OperateLevelCode varchar(64) comment '操作级别代码，程序中的注解',
   SRO_OperateLevel     varchar(64) comment '操作级别',
   SRO_AgencyCode       varchar(64) comment '机构编码(fk)',
   SRO_RecStatus        varchar(1) comment '数据状态',
   SRO_Order            varchar(64) comment '排序',
   SRO_LockStatus       varchar(1) comment '锁定状态',
   SRO_LockDate         date comment '锁定时间',
   SRO_LockUserID       varchar(64) comment '锁定人ID外键(fk)',
   SRO_RecUserID        varchar(64) comment '创建者(fk)',
   SRO_RecDate          date comment '创建时间',
   SRO_LastEditBy       varchar(64) comment '修改者(fk)',
   SRO_LastEditDate     date comment '修改时间',
   SRO_Remarks          varchar(255) comment '备注',
   SRO_Extend1          varchar(64) comment '扩展字段1',
   SRO_Extend2          varchar(64) comment '扩展字段2',
   SRO_Extend3          varchar(64) comment '扩展字段3',
   primary key (ID)
);

alter table Sys_ResourceOperation comment '资源操作表';

/*==============================================================*/
/* Table: Sys_Role                                              */
/*==============================================================*/
create table Sys_Role
(
   ID                   varchar(64) not null comment '主键',
   SR_Code              varchar(64) comment '角色编码',
   SR_Name              varchar(64) comment '角色名称',
   SR_AgencyCode        varchar(64) comment '机构编码(fk)',
   SR_RecStatus         varchar(1) comment '数据状态',
   SR_Order             varchar(64) comment '排序',
   SR_LockStatus        varchar(1) comment '锁定状态',
   SR_LockDate          date comment '锁定时间',
   SR_LockUserID        varchar(64) comment '锁定人ID外键(fk)',
   SR_RecUserID         varchar(64) comment '创建者(fk)',
   SR_RecDate           date comment '创建时间',
   SR_LastEditBy        varchar(64) comment '修改者(fk)',
   SR_LastEditDate      date comment '修改时间',
   SR_Remarks           varchar(255) comment '备注',
   SR_Extend1           varchar(64) comment '扩展字段1',
   SR_Extend2           varchar(64) comment '扩展字段2',
   SR_Extend3           varchar(64) comment '扩展字段3',
   primary key (ID)
);

alter table Sys_Role comment '角色表';

/*==============================================================*/
/* Table: Sys_User                                              */
/*==============================================================*/
create table Sys_User
(
   ID                   varchar(64) not null comment '主键',
   SU_UserID            varchar(64) comment '用户ID',
   SU_UserPwd           varchar(64) comment '用户密码',
   SU_UserName          varchar(64) comment '用户名称',
   SU_RegDate           date comment '注册日期',
   SU_AgencyCode        varchar(64) comment '机构编码(fk)',
   SU_RecStatus         varchar(1) comment '数据状态',
   SU_Order             varchar(64) comment '排序',
   SU_LockStatus        varchar(1) comment '锁定状态',
   SU_LockDate          date comment '锁定时间',
   SU_LockUserID        varchar(64) comment '锁定人ID(fk)',
   SU_RecUserID         varchar(64) comment '创建者(fk)',
   SU_RecDate           date comment '创建时间',
   SU_LastEditBy        varchar(64) comment '修改者(fk)',
   SU_LastEditDate      date comment '修改时间',
   SU_Remarks           varchar(255) comment '备注',
   SU_Extend1           varchar(64) comment '扩展字段1',
   SU_Extend2           varchar(64) comment '扩展字段2',
   SU_Extend3           varchar(64) comment '扩展字段3',
   primary key (ID)
);

alter table Sys_User comment '用户表';

/*==============================================================*/
/* Table: Sys_UserRole                                          */
/*==============================================================*/
create table Sys_UserRole
(
   ID                   varchar(64) not null comment '主键',
   SUR_UserID           varchar(64) not null comment '用户ID(fk)',
   SUR_RoleID           varchar(64) comment '角色ID(fk)',
   SUR_AgencyCode       varchar(64) comment '机构编码(fk)',
   SUR_RecStatus        varchar(1) comment '数据状态',
   SUR_LockStatus       varchar(1) comment '锁定状态',
   SUR_LockDate         date comment '锁定时间',
   SUR_LockUserID       varchar(64) comment '锁定人ID外键(fk)',
   SUR_RecUserID        varchar(64) comment '创建者(fk)',
   SUR_RecDate          date comment '创建时间',
   SUR_LastEditBy       varchar(64) comment '修改者(fk)',
   SUR_LastEditDate     date comment '修改时间',
   SUR_Remarks          varchar(255) comment '备注',
   SUR_Extend1          varchar(64) comment '扩展字段1',
   SUR_Extend2          varchar(64) comment '扩展字段2',
   SUR_Extend3          varchar(64) comment '扩展字段3',
   primary key (ID)
);

alter table Sys_UserRole comment '用户角色关系表';

