/*
Navicat MySQL Data Transfer

Source Server         : LocalMysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-05-23 15:17:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `position_id` int(11) NOT NULL COMMENT '职位ID',
  `position_name` varchar(255) NOT NULL COMMENT '职位名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '1', '领导');
INSERT INTO `position` VALUES ('2', '2', '员工');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键ID',
  `name` varchar(255) NOT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `Induction_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '入职时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('22', 'xiaoxiao', '1234', '24', '女', '1', '2017-05-18 14:58:01');
INSERT INTO `user` VALUES ('31', 'larry', '1234', '24', '女', '2', '2017-05-18 15:14:33');
INSERT INTO `user` VALUES ('32', 'lanlan', '1234', '24', '女', '1', '2017-05-18 16:50:57');
INSERT INTO `user` VALUES ('33', 'tony', '1234', '24', '男', '1', '2017-05-18 16:50:57');
INSERT INTO `user` VALUES ('34', 'jack', '1234', '24', '男', '1', '2017-04-05 16:50:57');
INSERT INTO `user` VALUES ('36', 'linghuchong', '1234', '26', '男', '1', '2016-12-21 16:59:44');
INSERT INTO `user` VALUES ('37', 'renyingtying', '1234', '26', '女', '1', '2016-12-23 16:59:44');
INSERT INTO `user` VALUES ('38', 'tiantian', '1234', '24', '女', '1', '2016-12-23 16:59:44');
INSERT INTO `user` VALUES ('39', 'jingjing', '1234', '18', '女', '1', '2016-11-08 16:59:44');
INSERT INTO `user` VALUES ('40', 'zhiruuo', '1234', '20', '女', '1', '2016-10-07 16:59:44');
INSERT INTO `user` VALUES ('41', 'xiaoqiang', '1234', '20', '女', '1', '2017-05-18 17:02:17');
INSERT INTO `user` VALUES ('42', 'ronger', '1234', '20', '女', '1', '2017-01-02 17:02:17');
INSERT INTO `user` VALUES ('43', 'renwoxing', '1234', '45', '男', '1', '2017-05-18 18:46:02');
