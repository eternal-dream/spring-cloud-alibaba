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

 Date: 04/08/2021 09:35:24
*/


-- ----------------------------
-- Table structure for branch_table
-- ----------------------------
DROP TABLE IF EXISTS "public"."branch_table";
CREATE TABLE "public"."branch_table" (
  "branch_id" int8 NOT NULL,
  "xid" varchar(128) COLLATE "pg_catalog"."default" NOT NULL,
  "transaction_id" int8,
  "resource_group_id" varchar(32) COLLATE "pg_catalog"."default",
  "resource_id" varchar(256) COLLATE "pg_catalog"."default",
  "lock_key" varchar(128) COLLATE "pg_catalog"."default",
  "branch_type" varchar(8) COLLATE "pg_catalog"."default",
  "status" int4,
  "client_id" varchar(64) COLLATE "pg_catalog"."default",
  "application_data" varchar(2000) COLLATE "pg_catalog"."default",
  "gmt_create" date,
  "gmt_modified" date
)
;

-- ----------------------------
-- Indexes structure for table branch_table
-- ----------------------------
CREATE INDEX "idx_xid" ON "public"."branch_table" USING btree (
  "xid" COLLATE "pg_catalog"."default" "pg_catalog"."text_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table branch_table
-- ----------------------------
ALTER TABLE "public"."branch_table" ADD CONSTRAINT "branch_table_pkey" PRIMARY KEY ("branch_id");
