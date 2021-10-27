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

 Date: 04/08/2021 09:35:15
*/


-- ----------------------------
-- Table structure for lock_table
-- ----------------------------
DROP TABLE IF EXISTS "public"."lock_table";
CREATE TABLE "public"."lock_table" (
  "row_key" varchar(128) COLLATE "pg_catalog"."default" NOT NULL,
  "xid" varchar(96) COLLATE "pg_catalog"."default",
  "transaction_id" int8,
  "branch_id" int8,
  "resource_id" varchar(256) COLLATE "pg_catalog"."default",
  "table_name" varchar(32) COLLATE "pg_catalog"."default",
  "pk" varchar(36) COLLATE "pg_catalog"."default",
  "gmt_create" date,
  "gmt_modified" date
)
;

-- ----------------------------
-- Primary Key structure for table lock_table
-- ----------------------------
ALTER TABLE "public"."lock_table" ADD CONSTRAINT "lock_table_pkey" PRIMARY KEY ("row_key");
