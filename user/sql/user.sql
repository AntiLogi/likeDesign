/*
Navicat MySQL Data Transfer

Source Server         : cxb
Source Server Version : 50617
Source Host           : 127.0.0.1:3306
Source Database       : like

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2019-02-22 18:20:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'mike', '123456', 'ayyovei', '18606932408', 'qq@gmail.com');
