/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : dbgirl

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2017-04-12 16:45:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(25) NOT NULL,
  `age` int(11) default NULL,
  `password` varchar(25) default NULL,
  UNIQUE KEY `id_indx` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'jack', '18', '123456');
INSERT INTO `user` VALUES ('2', 'kobi', '39', '123456');
