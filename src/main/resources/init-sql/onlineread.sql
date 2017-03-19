/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50547
Source Host           : localhost:3366
Source Database       : onlineread

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2017-03-19 15:09:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` varchar(200) NOT NULL,
  `book_name` varchar(50) NOT NULL,
  `author` varchar(20) DEFAULT NULL,
  `describes` varchar(100) DEFAULT NULL,
  `publish_date` date DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `price` double(20,2) DEFAULT NULL,
  `file_path` varchar(50) DEFAULT NULL,
  `file_url` varchar(100) DEFAULT NULL,
  `buy_link` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('32432221', '数度', 'sda', 'sadasfs', '2017-03-14', 'PHP', '23.50', '\\root\\file\\pdf\\[从Java走向Java.EE].吴超.扫描版.pdf', 'http://127.0.0.1:8080\\root\\file\\pdf\\[从Java走向Java.EE].吴超.扫描版.pdf', null);
INSERT INTO `books` VALUES ('4123123', 'struts2', '到处都是的', 'ssss', '2017-03-04', 'CSS', '23.10', null, 'http://www.baidu.com', null);
INSERT INTO `books` VALUES ('4344', 'dsa', 'dada', 'cscascs', '2017-03-16', 'JavaScript', '23.00', '\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com');
