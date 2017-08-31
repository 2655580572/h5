/*
MySQL Data Transfer
Source Host: localhost
Source Database: db16909
Target Host: localhost
Target Database: db16909
Date: 2016/12/1 14:42:51
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(20) DEFAULT NULL,
  `sex` char(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `pwd` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `stu` VALUES ('3', 'dd', '23');
INSERT INTO `stu` VALUES ('4', 'ss', '3');
INSERT INTO `stu` VALUES ('102', '小明', '10');
INSERT INTO `stu` VALUES ('200', '小明', '10');
INSERT INTO `teacher` VALUES ('1', 'ss', 's', '3', '3');
INSERT INTO `teacher` VALUES ('2', '3', '3', '3', '3');
INSERT INTO `teacher` VALUES ('3', '3', '3', '3', '3');
INSERT INTO `teacher` VALUES ('4', '小华', '女', '18', null);
INSERT INTO `teacher` VALUES ('6', '小华', '女', '18', null);
INSERT INTO `teacher` VALUES ('7', '王二', '女', '100', '234');
INSERT INTO `teacher` VALUES ('8', '王二', '女', '100', '234');
INSERT INTO `teacher` VALUES ('9', '周二', '男', '20', '1234');
INSERT INTO `teacher` VALUES ('10', '周二', '男', '20', '1234');
