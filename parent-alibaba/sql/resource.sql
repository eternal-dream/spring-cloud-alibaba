/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : PostgreSQL
 Source Server Version : 100004
 Source Host           : localhost:5432
 Source Catalog        : innocence
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 100004
 File Encoding         : 65001

 Date: 04/08/2021 09:33:58
*/


-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS "public"."resource";
CREATE TABLE "public"."resource" (
  "id" int8 NOT NULL,
  "menu" bool,
  "menu_url" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "permission" varchar(255) COLLATE "pg_catalog"."default",
  "sort" varchar(255) COLLATE "pg_catalog"."default",
  "parent_id" int8,
  "menu_icon" varchar(255) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."resource"."menu_url" IS '给前端做路由识别的路径字段';
COMMENT ON COLUMN "public"."resource"."menu_icon" IS '用于存放图标class名';

-- ----------------------------
-- Records of resource
-- ----------------------------
INSERT INTO "public"."resource" VALUES (1306532388910936065, 't', 'eBook/', '电子图书', 'admin:eBook:*', '30300', 1306530925518270466, NULL);
INSERT INTO "public"."resource" VALUES (1306532002275799042, 't', 'electronicJournals/', '电子期刊', 'admin:electronicJournals:*', '30200', 1306530925518270466, '');
INSERT INTO "public"."resource" VALUES (1306533091813371905, 't', 'dissertation/', '学位论文', 'admin:dissertation:*', '30600', 1306530925518270466, NULL);
INSERT INTO "public"."resource" VALUES (1306532747792363522, 't', 'paperPeriodicals/', '纸质期刊', 'admin:paperPeriodicals:*', '30400', 1306530925518270466, '');
INSERT INTO "public"."resource" VALUES (1306532929535750145, 't', 'paperBook/', '纸质图书', 'admin:paperBook:*', '30500', 1306530925518270466, '');
INSERT INTO "public"."resource" VALUES (1305780814681063425, 't', 'log', '工作日志', 'log', '600', NULL, 'el-icon-info');
INSERT INTO "public"."resource" VALUES (1305782812906209281, 't', 'accessLog/', '资源访问', 'admin:accessLog:*', '60200', 1305780814681063425, NULL);
INSERT INTO "public"."resource" VALUES (1305782413587496962, 't', 'operlog/', '操作日志', 'admin:operlog:*', '60100', 1305780814681063425, '');
INSERT INTO "public"."resource" VALUES (1306766294629236737, 't', 'statisticalAnalysis', '统计分析', 'statisticalAnalysis', '500', NULL, 'el-icon-s-data');
INSERT INTO "public"."resource" VALUES (1302897403247312898, 't', 'collegeAccount/', '学院账号', 'admin:collegeAccount:*', '20200', 1302814672551227393, '');
INSERT INTO "public"."resource" VALUES (1306530925518270466, 't', 'dataResource', '资源管理', 'dataResource', '300', NULL, 'el-icon-s-management');
INSERT INTO "public"."resource" VALUES (1302816424734306306, 't', 'librarian/', '学科馆员', 'admin:librarian:*', '20100', 1302814672551227393, '');
INSERT INTO "public"."resource" VALUES (1302897654406430721, 't', 'studentList/', '学生列表', 'admin:studentList:*', '20300', 1302814672551227393, '');
INSERT INTO "public"."resource" VALUES (1302897947034632193, 't', 'role/', '用户组设置', 'admin:role:*', '20400', 1302814672551227393, '');
INSERT INTO "public"."resource" VALUES (1305783308299649025, 't', 'downloadLog/', '下载统计', 'admin:downloadLog:*', '60300', 1305780814681063425, NULL);
INSERT INTO "public"."resource" VALUES (1306766882108620802, 't', 'resourcesReport/', '专业资源报告', 'admin:resourcesReport:*', '50200', 1306766294629236737, NULL);
INSERT INTO "public"."resource" VALUES (1306780069344329729, 't', 'annualReport/', '年度统计报告', 'admin:annualReport:*', '50100', 1306766294629236737, NULL);
INSERT INTO "public"."resource" VALUES (1305329399596658690, 't', 'subjectList/', '专业列表', 'admin:subject:*', '40100', 1305328820153561090, NULL);
INSERT INTO "public"."resource" VALUES (1306531525941276674, 't', 'databaseList/', '数据库列表', 'admin:sourceDatabase:*', '30100', 1306530925518270466, NULL);
INSERT INTO "public"."resource" VALUES (1305330784484536321, 't', 'fundingSimulation/', '经费模拟', 'admin:fundingSimulation:*', '40400', 1305328820153561090, NULL);
INSERT INTO "public"."resource" VALUES (1323510599070826497, 't', 'generalEduCLC', '通识分类', 'admin:generalEduCLC:*', '40300', 1305328820153561090, NULL);
INSERT INTO "public"."resource" VALUES (1323856925927211010, 't', 'paramSetting', '参数设置', 'admin:paramSetting:*', '50400', 1306766294629236737, NULL);
INSERT INTO "public"."resource" VALUES (1302814672551227393, 't', 'user', '用户管理', 'adminuser', '200', NULL, 'el-icon-user');
INSERT INTO "public"."resource" VALUES (1305328820153561090, 't', 'subject', '专业管理', 'adminsubject', '400', NULL, 'el-icon-s-grid');
INSERT INTO "public"."resource" VALUES (1334073852314304513, 't', 'subjectStudentReport/', '专业学生报告', 'admin:subjectStudentReport:*', '50350', 1306766294629236737, NULL);
INSERT INTO "public"."resource" VALUES (1306767257255559169, 't', 'studentUseReport/', '学生使用查询', 'admin:studentUseReport:*', '50300', 1306766294629236737, NULL);
INSERT INTO "public"."resource" VALUES (1305329919166066690, 't', 'CLC/', '专业分类', 'admin:CLC:*', '40200', 1305328820153561090, '');

-- ----------------------------
-- Primary Key structure for table resource
-- ----------------------------
ALTER TABLE "public"."resource" ADD CONSTRAINT "resource_pkey" PRIMARY KEY ("id");
