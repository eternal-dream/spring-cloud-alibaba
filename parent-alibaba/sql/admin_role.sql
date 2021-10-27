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

 Date: 04/08/2021 09:33:24
*/


-- ----------------------------
-- Table structure for admin_role
-- ----------------------------
DROP TABLE IF EXISTS "public"."admin_role";
CREATE TABLE "public"."admin_role" (
  "admin_id" int8 NOT NULL,
  "role_id" int8
)
;

-- ----------------------------
-- Records of admin_role
-- ----------------------------
INSERT INTO "public"."admin_role" VALUES (1297788745416626178, 1298144993051885569);
INSERT INTO "public"."admin_role" VALUES (1333239260303343617, 1302784266632241154);
INSERT INTO "public"."admin_role" VALUES (1334410655255355394, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1334411559446634497, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1334412961636016129, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1334413117609598978, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1334413267388194817, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1334413388301590529, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1336261979257188354, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1337184691249057793, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1341621962291294210, 1302784266632241154);
INSERT INTO "public"."admin_role" VALUES (1341930197346955265, 1302783457324453889);
INSERT INTO "public"."admin_role" VALUES (1412973882340892673, 1302784266632241154);

-- ----------------------------
-- Foreign Keys structure for table admin_role
-- ----------------------------
ALTER TABLE "public"."admin_role" ADD CONSTRAINT "admin_role_admin_id_fkey" FOREIGN KEY ("admin_id") REFERENCES "public"."admin" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."admin_role" ADD CONSTRAINT "admin_role_role_id_fkey" FOREIGN KEY ("role_id") REFERENCES "public"."role" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;
