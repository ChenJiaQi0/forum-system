/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : forum_system

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 09/11/2023 19:57:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `post_id` int NULL DEFAULT NULL COMMENT '帖子id',
  `user_id` int NULL DEFAULT NULL COMMENT '评论者id',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '评论内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, 1, 867024897, '非常好');
INSERT INTO `comment` VALUES (11, 2, 867024897, '非常好');
INSERT INTO `comment` VALUES (12, 2, 867024897, '非常好');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '帖子id',
  `user_id` int NULL DEFAULT NULL COMMENT '用户id',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1003 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES (3, 867024897, '修改测试1231', '修改测试修改测试修改测试修改测试修改测试修改测试修改测试');
INSERT INTO `post` VALUES (4, 867024897, '巴拉圭', 'If opportunity doesn’t knock, build a door.');
INSERT INTO `post` VALUES (5, 867024897, '索马里', 'The Navigation pane employs tree                  ');
INSERT INTO `post` VALUES (6, 867024897, '俄罗斯联邦', 'A comfort zone is a beautiful place,              ');
INSERT INTO `post` VALUES (7, 867024897, '古巴', 'To successfully establish a new                   ');
INSERT INTO `post` VALUES (8, 867024897, '葡萄牙', 'To successfully establish a new                   ');
INSERT INTO `post` VALUES (9, 867024897, '德国', 'Import Wizard allows you to import                ');
INSERT INTO `post` VALUES (10, 867024897, '哥伦比亚', 'Success consists of going from                    ');
INSERT INTO `post` VALUES (11, 867024897, '奥地利', 'To clear or reload various internal               ');
INSERT INTO `post` VALUES (12, 867024897, '哥斯达黎加', 'Monitored servers include MySQL,                  ');
INSERT INTO `post` VALUES (13, 867024897, '尼加拉瓜', 'Always keep your eyes open. Keep                  ');
INSERT INTO `post` VALUES (14, 867024897, '瑞士', 'Navicat Monitor is a safe, simple                 ');
INSERT INTO `post` VALUES (15, 867024897, '印度', 'A query is used to extract data                   ');
INSERT INTO `post` VALUES (16, 867024897, '南非', 'In other words, Navicat provides                  ');
INSERT INTO `post` VALUES (17, 867024897, '阿富汗', 'Import Wizard allows you to import                ');
INSERT INTO `post` VALUES (18, 867024897, '黎巴嫩', 'Navicat is a multi-connections                    ');
INSERT INTO `post` VALUES (19, 867024897, '斯里兰卡', 'A comfort zone is a beautiful place,              ');
INSERT INTO `post` VALUES (20, 867024897, '阿尔及利亚', 'It is used while your ISPs do not                 ');
INSERT INTO `post` VALUES (21, 867024897, '哈萨克斯坦', 'Navicat provides powerful tools                   ');
INSERT INTO `post` VALUES (22, 867024897, '斐济', 'Sometimes you win, sometimes you learn.');
INSERT INTO `post` VALUES (23, 867024897, '奥地利', 'Creativity is intelligence having fun.');
INSERT INTO `post` VALUES (24, 867024897, '坦桑尼亚联合共和国', 'Navicat Monitor can be installed                  ');
INSERT INTO `post` VALUES (25, 867024897, '柬埔寨', 'It wasn’t raining when Noah built the ark.');
INSERT INTO `post` VALUES (26, 867024897, '拉脱维亚', 'Navicat allows you to transfer                    ');
INSERT INTO `post` VALUES (27, 867024897, '尼泊尔', 'It collects process metrics such                  ');
INSERT INTO `post` VALUES (28, 867024897, '坦桑尼亚联合共和国', 'If it scares you, it might be a good thing to try.');
INSERT INTO `post` VALUES (29, 867024897, '伯利兹', 'A query is used to extract data                   ');
INSERT INTO `post` VALUES (30, 867024897, '安提瓜和巴布达', 'What you get by achieving your                    ');
INSERT INTO `post` VALUES (31, 867024897, '孟加拉国', 'If your Internet Service Provider                 ');
INSERT INTO `post` VALUES (32, 867024897, '奈及利亚', 'To open a query using an external                 ');
INSERT INTO `post` VALUES (33, 867024897, '芬兰', 'The past has no power over the present moment.');
INSERT INTO `post` VALUES (34, 867024897, '摩洛哥', 'Sometimes you win, sometimes you learn.');
INSERT INTO `post` VALUES (35, 867024897, '冈比亚', 'Flexible settings enable you to                   ');
INSERT INTO `post` VALUES (36, 867024897, '黎巴嫩', 'It collects process metrics such                  ');
INSERT INTO `post` VALUES (37, 867024897, '爱尔兰', 'The Synchronize to Database function              ');
INSERT INTO `post` VALUES (38, 867024897, '塞浦路斯', 'To successfully establish a new                   ');
INSERT INTO `post` VALUES (39, 867024897, '喀麦隆', 'Anyone who has never made a mistake               ');
INSERT INTO `post` VALUES (40, 867024897, '汤加', 'After logged in the Navicat Cloud                 ');
INSERT INTO `post` VALUES (41, 867024897, '中国', 'Navicat authorizes you to make                    ');
INSERT INTO `post` VALUES (42, 867024897, '黎巴嫩', 'Actually it is just in an idea                    ');
INSERT INTO `post` VALUES (43, 867024897, '印度', 'Success consists of going from                    ');
INSERT INTO `post` VALUES (44, 867024897, '马里', 'Navicat Cloud could not connect                   ');
INSERT INTO `post` VALUES (45, 867024897, '马达加斯加', 'What you get by achieving your                    ');
INSERT INTO `post` VALUES (46, 867024897, '帛硫', 'With its well-designed Graphical                  ');
INSERT INTO `post` VALUES (47, 867024897, '乌兹别克斯坦', 'The Navigation pane employs tree                  ');
INSERT INTO `post` VALUES (48, 867024897, '乌干达', 'Sometimes you win, sometimes you learn.');
INSERT INTO `post` VALUES (49, 867024897, '葡萄牙', 'Typically, it is employed as an                   ');
INSERT INTO `post` VALUES (1002, 867024897, 'Java开发22', 'Spring 是一个轻量级的 Java 开发框架，现在已经是最受欢迎的企业级 Java 应用程序开发框架，目前已经更新到 Spring5');
INSERT INTO `post` VALUES (1003, 867024897, 'Java开发2233', 'Spring 是一个轻量级的 Java 开发框架，现在已经是最受欢迎的企业级 Java 应用程序开发框架，目前已经更新到 Spring5');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 867024899 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, '测试用户', '123123');
INSERT INTO `user` VALUES (867024897, 'chen', '123123');
INSERT INTO `user` VALUES (867024898, 'chen1', '123');
INSERT INTO `user` VALUES (867024899, 'chen123', '123');

SET FOREIGN_KEY_CHECKS = 1;
