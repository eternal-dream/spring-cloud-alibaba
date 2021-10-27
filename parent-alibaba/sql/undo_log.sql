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

 Date: 04/08/2021 09:34:57
*/


-- ----------------------------
-- Table structure for undo_log
-- ----------------------------
DROP TABLE IF EXISTS "public"."undo_log";
CREATE TABLE "public"."undo_log" (
  "id" int8 NOT NULL,
  "branch_id" int8 NOT NULL,
  "xid" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
  "context" varchar(128) COLLATE "pg_catalog"."default" NOT NULL,
  "rollback_info" bytea NOT NULL,
  "log_status" int4 NOT NULL,
  "log_created" timestamp(0) NOT NULL,
  "log_modified" timestamp(0) NOT NULL,
  "ext" varchar(100) COLLATE "pg_catalog"."default" DEFAULT NULL::character varying
)
;

-- ----------------------------
-- Uniques structure for table undo_log
-- ----------------------------
ALTER TABLE "public"."undo_log" ADD CONSTRAINT "ux_undo_log" UNIQUE ("branch_id", "xid");

-- ----------------------------
-- Primary Key structure for table undo_log
-- ----------------------------
ALTER TABLE "public"."undo_log" ADD CONSTRAINT "undo_log_pkey" PRIMARY KEY ("id");
