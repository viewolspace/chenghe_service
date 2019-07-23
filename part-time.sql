/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : part_time

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 20/07/2019 16:04:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '广告分类id',
  `image_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片地址',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '跳转地址',
  `num` int(11) NOT NULL COMMENT '顺序号',
  `status` int(11) NOT NULL COMMENT '状态 0 有效  -1 无效',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '广告表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `parent_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `type` int(11) NOT NULL COMMENT '1 职位分类  2广告位分类',
  `num` int(11) NOT NULL DEFAULT 0 COMMENT '顺序号 ， 默认0',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `c_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分类表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for category_seq
-- ----------------------------
DROP TABLE IF EXISTS `category_seq`;
CREATE TABLE `category_seq`  (
  `parent_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `seq` int(11) NOT NULL,
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`parent_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分类序列表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `logo` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `qq` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `wx` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `phone` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `des` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `star` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '商户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for idfa
-- ----------------------------
DROP TABLE IF EXISTS `idfa`;
CREATE TABLE `idfa`  (
  `idfa` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `os` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作系统',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`idfa`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for part_time
-- ----------------------------
DROP TABLE IF EXISTS `part_time`;
CREATE TABLE `part_time`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `company_id` int(11) NOT NULL COMMENT '商户id',
  `recommend` int(11) NOT NULL COMMENT '1 推荐 0 正常',
  `category_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位分类id',
  `category_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位分类名称',
  `top_num` int(11) NOT NULL DEFAULT 0 COMMENT '置顶顺序 数字越大越靠前',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `salary` int(11) NOT NULL COMMENT '薪水',
  `cycle` int(11) NOT NULL COMMENT '周期 0 小时 1 天 2 周 3 月 4 季度',
  `lable` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '多个标签空格分隔 例如：日结 长期 男女不限',
  `contact_type` int(11) NOT NULL COMMENT '联系方式类型  1 qq  2 微信 3 手机',
  `contact` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系方式',
  `content` varchar(8000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '详细内容',
  `num` int(11) NOT NULL COMMENT '招聘人数',
  `work_time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作时间',
  `work_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作地点',
  `status` int(11) NOT NULL COMMENT '状态 0 有效  -1 无效',
  `s_time` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `e_time` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `browse_num` int(11) NOT NULL COMMENT '浏览人数',
  `copy_num` int(11) NOT NULL COMMENT '复制人数',
  `join_num` int(11) NOT NULL COMMENT '参与人数',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '兼职职位表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for part_time_stat
-- ----------------------------
DROP TABLE IF EXISTS `part_time_stat`;
CREATE TABLE `part_time_stat`  (
  `part_time_id` int(11) NOT NULL,
  `stat_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `browse_num` int(11) NOT NULL COMMENT '浏览人数',
  `copy_num` int(11) NOT NULL COMMENT '复制人数',
  `join_num` int(11) NOT NULL COMMENT '参与人数',
  `c_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`stat_date`, `part_time_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '兼职职位统计' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `phone` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `pwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `nick_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '昵称',
  `idfa` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'idfa',
  `head_pic` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '头像',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user_join
-- ----------------------------
DROP TABLE IF EXISTS `user_join`;
CREATE TABLE `user_join`  (
  `user_id` int(11) NOT NULL,
  `part_time_id` int(11) NOT NULL DEFAULT 0 COMMENT '兼职id',
  `type` int(11) NOT NULL COMMENT '1 报名  2 复制 3 浏览',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`, `part_time_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户参与表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user_stat
-- ----------------------------
DROP TABLE IF EXISTS `user_stat`;
CREATE TABLE `user_stat`  (
  `stat_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `user_active` int(11) NOT NULL COMMENT '今日激活用户数',
  `user_register` int(11) NOT NULL COMMENT '今日注册用户数',
  `user_idfa` int(11) NOT NULL COMMENT '今日新增idfa',
  `browse_num` int(11) NOT NULL COMMENT '总浏览人数',
  `copy_num` int(11) NOT NULL COMMENT '总复制人数',
  `join_num` int(11) NOT NULL COMMENT '总参与人数',
  `c_time` datetime NULL DEFAULT NULL,
  `m_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`stat_date`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户统计表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

ALTER TABLE `part_time`.`user`
MODIFY COLUMN `user_id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID' FIRST;


#### 2019-07-23


ALTER TABLE `ad`
	ADD COLUMN `title` varchar(200) NULL AFTER `m_time`;


	ALTER TABLE `user`
	MODIFY COLUMN `pwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '密码' AFTER `phone`,
	MODIFY COLUMN `head_pic` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '头像' AFTER `idfa`;
