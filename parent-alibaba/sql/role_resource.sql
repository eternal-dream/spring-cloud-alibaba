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

 Date: 04/08/2021 09:33:48
*/


-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS "public"."role_resource";
CREATE TABLE "public"."role_resource" (
  "role_id" int8 NOT NULL,
  "resource_id" int8 NOT NULL
)
;

-- ----------------------------
-- Records of role_resource
-- ----------------------------
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305780814681063425);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305782812906209281);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305782413587496962);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305783308299649025);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306766294629236737);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306766882108620802);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306780069344329729);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1323856925927211010);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1334073852314304513);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306767257255559169);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306530925518270466);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306532388910936065);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306532002275799042);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306533091813371905);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306532747792363522);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306532929535750145);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1306531525941276674);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1302814672551227393);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1302897403247312898);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1302816424734306306);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1302897654406430721);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1302897947034632193);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305328820153561090);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305329919166066690);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305329399596658690);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1305330784484536321);
INSERT INTO "public"."role_resource" VALUES (1298144993051885569, 1323510599070826497);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305780814681063425);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305782812906209281);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305782413587496962);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305783308299649025);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306766294629236737);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306766882108620802);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306780069344329729);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1323856925927211010);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1334073852314304513);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306767257255559169);
INSERT INTO "public"."role_resource" VALUES (1302784266632241154, 1306766294629236737);
INSERT INTO "public"."role_resource" VALUES (1302784266632241154, 1306766882108620802);
INSERT INTO "public"."role_resource" VALUES (1302784266632241154, 1306767257255559169);
INSERT INTO "public"."role_resource" VALUES (1302784266632241154, 1306780069344329729);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306530925518270466);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306532388910936065);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306532002275799042);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306533091813371905);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306532747792363522);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306532929535750145);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1306531525941276674);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305328820153561090);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305329919166066690);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305329399596658690);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1305330784484536321);
INSERT INTO "public"."role_resource" VALUES (1302783457324453889, 1323510599070826497);

-- ----------------------------
-- Foreign Keys structure for table role_resource
-- ----------------------------
ALTER TABLE "public"."role_resource" ADD CONSTRAINT "role_resource_resource_id_fkey" FOREIGN KEY ("resource_id") REFERENCES "public"."resource" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."role_resource" ADD CONSTRAINT "role_resource_role_id_fkey" FOREIGN KEY ("role_id") REFERENCES "public"."role" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
