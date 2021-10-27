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

 Date: 04/08/2021 09:33:16
*/


-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS "public"."admin";
CREATE TABLE "public"."admin" (
  "id" int8 NOT NULL,
  "create_time" timestamp(6),
  "modify_time" timestamp(6) DEFAULT CURRENT_TIMESTAMP,
  "name" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "pass_word" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "salt" varchar(255) COLLATE "pg_catalog"."default",
  "locked" bool NOT NULL DEFAULT true,
  "real_name" varchar(255) COLLATE "pg_catalog"."default" NOT NULL,
  "phone" int8 NOT NULL,
  "last_visit_time" date,
  "acc_number" varchar(255) COLLATE "pg_catalog"."default",
  "sex" varchar(10) COLLATE "pg_catalog"."default",
  "email" varchar(255) COLLATE "pg_catalog"."default",
  "qq" varchar(255) COLLATE "pg_catalog"."default",
  "weixin" varchar(255) COLLATE "pg_catalog"."default",
  "college_id" int8
)
;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO "public"."admin" VALUES (1334413267388194817, '2020-12-03 16:24:49', '2021-01-07 14:00:34.888', 'xxh199400012', 'cd6e809cf615929a2703735fdbfcccba', 'xxh199400012salt', 't', '199400012', 52251670, '2021-01-07', '199400012', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1336261979257188354, '2020-12-08 18:50:57', '2020-12-08 18:51:33.33', 'test', 'db09028eaee63f807dc00ae9729290d9', 'testsalt', 't', 'test', 123, '2020-12-08', 'test123', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1334413388301590529, '2020-12-03 16:25:18', '2021-01-07 15:01:50.788', 'yxx199000221', '49aafc5beb605a57e673f769d9234922', 'yxx199000221salt', 't', '199000221', 199000221, '2021-01-07', '199000221', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1334413117609598978, '2020-12-03 16:24:14', '2021-01-08 09:14:37.535', 'gym201200042', 'c0722befe13fda189819b9af9b3e6054', 'gym201200042salt', 't', 'gym201200042', 552552222, '2021-01-08', '201200042', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1334411559446634497, '2020-12-03 16:18:02', '2021-01-04 09:21:07.491', 'zhy199200014', '6dfe5a65cb2fe8866e5b0c55a4b7048d', 'zhy199200014salt', 't', 'zhy199200014', 52251670, '2021-01-04', '199200014', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1337184691249057793, '2020-12-11 07:57:28', '2021-01-11 10:31:00.201', 'wyx200500038', 'ff87fb3253da89ef4a6a1ddca3015354', 'wyx200500038salt', 't', 'wyx200500038', 522516700, '2021-01-11', 'wyx200500038', 'male', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1334412961636016129, '2020-12-03 16:23:36', '2021-01-11 10:33:17.843', 'ls201800080', 'e181e347b157b7d8ac5e9db44eb6a771', 'ls201800080salt', 't', 'ls201800080', 52251666, '2021-01-11', '201800080', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1341930197346955265, '2020-12-24 10:14:25.563', '2021-01-12 08:40:15.126', 'cyj201000049', '42360025596b973098828bf15241f89b', 'cyj201000049salt', 't', '成永娟', 13812813215, '2021-01-12', '201000049', 'female', NULL, NULL, NULL, NULL);
INSERT INTO "public"."admin" VALUES (1341621962291294210, '2020-12-23 13:49:36.597', NULL, 'JX01', '0410bc27233e11eb91c80f65b0a27537', 'JX01salt', 't', 'JX', 5225167055, NULL, '4622544', 'male', NULL, NULL, NULL, 4);
INSERT INTO "public"."admin" VALUES (1334410655255355394, '2020-12-03 16:14:27', '2021-01-07 12:58:44.673', 'yf201300006', 'a751c10b1fdf1522fa30eec8e08bf2dd', 'yf201300006salt', 't', 'yf201300006', 636564133, '2021-01-07', '201300006', 'female', '', '', '', NULL);
INSERT INTO "public"."admin" VALUES (1412973882340892673, '2021-07-08 11:16:39.992', NULL, 'testxy', '15293854b8587d84e9d9b602b263aa8b', 'testxysalt', 't', 'test', 15611412331, NULL, '11011', 'male', NULL, NULL, NULL, 21);
INSERT INTO "public"."admin" VALUES (1333239260303343617, '2020-11-30 10:39:44.702', '2021-07-08 13:51:09.203', 'xycslg', 'da833ec040e0924305b05c1530de15ab', 'xycslgsalt', 't', 'zgf', 18812345678, '2021-07-08', '20201234', 'male', NULL, NULL, NULL, 1);
INSERT INTO "public"."admin" VALUES (1297788745416626178, '2020-08-24 14:52:03', '2021-07-08 14:47:54.94', 'admin', 'd2a14b3e06596c26deb8f0a486fa5b23', 'adminsalt', 't', '管理员', 123123123, '2021-07-08', '1', 'male', ' 1@qq.com', '49456123233123', ' 123555', NULL);

-- ----------------------------
-- Primary Key structure for table admin
-- ----------------------------
ALTER TABLE "public"."admin" ADD CONSTRAINT "admin_pkey" PRIMARY KEY ("id");
