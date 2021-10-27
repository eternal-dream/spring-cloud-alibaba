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

 Date: 04/08/2021 09:33:39
*/


-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS "public"."role";
CREATE TABLE "public"."role" (
  "id" int8 NOT NULL,
  "create_time" timestamp(6),
  "modify_time" timestamp(6) DEFAULT CURRENT_TIMESTAMP,
  "description" varchar(255) COLLATE "pg_catalog"."default",
  "name" varchar(255) COLLATE "pg_catalog"."default",
  "type" varchar(255) COLLATE "pg_catalog"."default"
)
;
COMMENT ON COLUMN "public"."role"."type" IS '角色类型';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO "public"."role" VALUES (1308293355802017794, '2020-09-22 14:33:37.596', '2020-09-22 14:33:45.33', '查看所属学院的资源分析报告和个人使用报告', '学生账号', 'studentList');
INSERT INTO "public"."role" VALUES (1302784266632241154, '2020-09-07 09:42:28.383', '2020-12-07 18:25:40.537', '查看所属学院的资源分析报告和学生使用报告', '学院账号', 'collegeAccount');
INSERT INTO "public"."role" VALUES (1298144993051885569, '2020-08-25 14:27:39.37', '2020-12-11 07:54:39.693', '管理后台数据和所有用户的权限', '超级管理员', 'admin');
INSERT INTO "public"."role" VALUES (1302783457324453889, '2020-09-07 09:39:15.441', '2020-12-23 13:48:23.627', '管理所属学科的数据和资源分析报告', '学科馆员', 'librarian');

-- ----------------------------
-- Primary Key structure for table role
-- ----------------------------
ALTER TABLE "public"."role" ADD CONSTRAINT "role_pkey" PRIMARY KEY ("id");
