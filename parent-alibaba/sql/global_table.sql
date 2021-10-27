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

 Date: 04/08/2021 09:35:08
*/


-- ----------------------------
-- Table structure for global_table
-- ----------------------------
DROP TABLE IF EXISTS "public"."global_table";
CREATE TABLE "public"."global_table" (
  "xid" varchar(128) COLLATE "pg_catalog"."default" NOT NULL,
  "transaction_id" int8,
  "status" int4 NOT NULL,
  "application_id" varchar(32) COLLATE "pg_catalog"."default",
  "transaction_service_group" varchar(32) COLLATE "pg_catalog"."default",
  "transaction_name" varchar(128) COLLATE "pg_catalog"."default",
  "timeout" int4,
  "begin_time" int8,
  "application_data" varchar(2000) COLLATE "pg_catalog"."default",
  "gmt_create" date,
  "gmt_modified" date
)
;

-- ----------------------------
-- Indexes structure for table global_table
-- ----------------------------
CREATE INDEX "idx_gmt_modified_status" ON "public"."global_table" USING btree (
  "status" "pg_catalog"."int4_ops" ASC NULLS LAST,
  "gmt_modified" "pg_catalog"."date_ops" ASC NULLS LAST
);
CREATE INDEX "idx_transaction_id" ON "public"."global_table" USING btree (
  "transaction_id" "pg_catalog"."int8_ops" ASC NULLS LAST
);

-- ----------------------------
-- Primary Key structure for table global_table
-- ----------------------------
ALTER TABLE "public"."global_table" ADD CONSTRAINT "global_table_pkey" PRIMARY KEY ("xid");
