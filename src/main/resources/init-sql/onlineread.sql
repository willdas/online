/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50522
Source Host           : localhost:3306
Source Database       : onlineread

Target Server Type    : MYSQL
Target Server Version : 50522
File Encoding         : 65001

Date: 2017-03-31 20:01:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for access_log
-- ----------------------------
DROP TABLE IF EXISTS `access_log`;
CREATE TABLE `access_log` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `ip_address` varchar(50) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `access_content` varchar(50) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `user_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=985520 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of access_log
-- ----------------------------
INSERT INTO `access_log` VALUES ('11433', '127.0.0.1', '2017-03-27 13:08:04', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('11814', '127.0.0.1', '2017-03-28 18:59:12', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('18161', '127.0.0.1', '2017-03-27 14:54:24', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('21234', '192.168.2.29', '2017-03-27 14:04:56', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('33955', '127.0.0.1', '2017-03-27 14:52:55', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('44535', '127.0.0.1', '2017-03-27 14:57:14', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('45996', '127.0.0.1', '2017-03-27 13:12:39', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('59841', '127.0.0.1', '2017-03-27 15:01:19', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('89838', '127.0.0.1', '2017-03-27 13:08:34', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('91940', '127.0.0.1', '2017-03-27 13:23:37', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('92500', '127.0.0.1', '2017-03-31 19:28:05', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('93196', '192.168.2.47', '2017-03-25 12:10:01', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('96176', '127.0.0.1', '2017-03-27 19:49:14', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('103197', '127.0.0.1', '2017-03-27 13:06:04', 'JAVA', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('105354', '127.0.0.1', '2017-03-31 19:28:15', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('117545', '127.0.0.1', '2017-03-27 13:10:22', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('124651', '127.0.0.1', '2017-03-28 18:55:49', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('132013', '192.168.2.29', '2017-03-27 20:43:01', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('140860', '127.0.0.1', '2017-03-27 14:20:03', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('142754', '127.0.0.1', '2017-03-27 15:09:21', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('145624', '192.168.2.29', '2017-03-27 13:20:01', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('149683', '127.0.0.1', '2017-03-27 09:06:32', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('154219', '127.0.0.1', '2017-03-28 18:58:38', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('154372', '127.0.0.1', '2017-03-27 12:49:22', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('163257', '127.0.0.1', '2017-03-27 15:01:44', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('165425', '127.0.0.1', '2017-03-27 14:19:25', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('168192', '127.0.0.1', '2017-03-27 12:50:49', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('178394', '127.0.0.1', '2017-03-31 19:48:20', 'PYTHON', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('184403', '127.0.0.1', '2017-03-27 09:06:06', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('209885', '127.0.0.1', '2017-03-27 13:06:16', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('214849', '127.0.0.1', '2017-03-28 18:49:21', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('217461', '127.0.0.1', '2017-03-27 20:35:29', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('219248', '127.0.0.1', '2017-03-27 14:57:30', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('229478', '127.0.0.1', '2017-03-27 14:17:59', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('237529', '192.168.2.29', '2017-03-27 11:46:52', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('253110', '127.0.0.1', '2017-03-27 17:05:07', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('255263', '127.0.0.1', '2017-03-27 14:04:24', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('265320', '127.0.0.1', '2017-03-27 14:57:50', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('283025', '192.168.2.29', '2017-03-27 13:13:18', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('290702', '127.0.0.1', '2017-03-27 19:50:27', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('293932', '127.0.0.1', '2017-03-27 13:05:53', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('298760', '192.168.2.29', '2017-03-27 12:51:53', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('303170', '127.0.0.1', '2017-03-27 14:17:20', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('318267', '127.0.0.1', '2017-03-27 14:57:21', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('327232', '127.0.0.1', '2017-03-27 14:30:09', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('333588', '127.0.0.1', '2017-03-28 18:50:58', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('341263', '127.0.0.1', '2017-03-27 15:08:40', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('358344', '127.0.0.1', '2017-03-28 18:50:06', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('364646', '127.0.0.1', '2017-03-27 14:54:28', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('374589', '127.0.0.1', '2017-03-31 19:42:44', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('382561', '127.0.0.1', '2017-03-31 19:43:47', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('385229', '192.168.2.29', '2017-03-27 20:42:42', 'JAVA', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('389022', '127.0.0.1', '2017-03-27 12:52:16', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('404542', '127.0.0.1', '2017-03-27 11:45:06', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('418286', '127.0.0.1', '2017-03-27 12:48:09', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('465534', '127.0.0.1', '2017-03-27 12:48:47', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('480219', '127.0.0.1', '2017-03-27 09:06:14', 'JAVA', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('484116', '127.0.0.1', '2017-03-31 19:48:26', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('485172', '127.0.0.1', '2017-03-27 14:10:58', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('500852', '127.0.0.1', '2017-03-27 14:54:17', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('513435', '127.0.0.1', '2017-03-27 19:48:49', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('541469', '127.0.0.1', '2017-03-31 19:44:14', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('547347', '127.0.0.1', '2017-03-28 19:00:47', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('555124', '127.0.0.1', '2017-03-27 14:58:45', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('580948', '127.0.0.1', '2017-03-27 20:13:06', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('584103', '127.0.0.1', '2017-03-27 09:05:53', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('585696', '127.0.0.1', '2017-03-27 13:24:53', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('588765', '127.0.0.1', '2017-03-27 13:01:31', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('589714', '127.0.0.1', '2017-03-27 14:59:18', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('603850', '127.0.0.1', '2017-03-31 19:43:12', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('606680', '127.0.0.1', '2017-03-27 13:12:02', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('637649', '127.0.0.1', '2017-03-27 13:24:08', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('646554', '127.0.0.1', '2017-03-27 15:10:27', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('649642', '127.0.0.1', '2017-03-31 19:28:26', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('663771', '127.0.0.1', '2017-03-27 09:06:18', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('666264', '127.0.0.1', '2017-03-27 13:19:44', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('670286', '127.0.0.1', '2017-03-27 13:13:31', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('676428', '127.0.0.1', '2017-03-27 13:06:10', 'JAVA', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('676828', '192.168.2.47', '2017-03-25 12:07:17', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('691063', '127.0.0.1', '2017-03-27 13:17:34', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('695480', '127.0.0.1', '2017-03-27 20:35:39', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('699973', '127.0.0.1', '2017-03-27 13:27:13', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('701484', '127.0.0.1', '2017-03-27 13:18:09', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('705666', '127.0.0.1', '2017-03-27 13:16:22', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('706653', '127.0.0.1', '2017-03-31 19:46:48', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('746234', '192.168.2.29', '2017-03-29 19:53:11', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('773206', '127.0.0.1', '2017-03-27 13:20:44', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('783813', '127.0.0.1', '2017-03-27 14:57:10', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('793061', '127.0.0.1', '2017-03-27 13:19:04', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('794925', '127.0.0.1', '2017-03-28 19:04:02', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('822446', '192.168.2.29', '2017-03-27 12:55:12', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('855771', '127.0.0.1', '2017-03-27 20:34:12', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('860732', '127.0.0.1', '2017-03-31 19:41:57', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('874755', '127.0.0.1', '2017-03-31 19:27:37', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('888690', '127.0.0.1', '2017-03-27 19:50:01', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('892982', '127.0.0.1', '2017-03-27 13:07:23', 'PHP', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('908538', '127.0.0.1', '2017-03-31 19:28:20', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('908811', '127.0.0.1', '2017-03-27 20:35:27', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('924026', '127.0.0.1', '2017-03-27 13:14:27', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('954234', '127.0.0.1', '2017-03-28 18:44:34', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('963559', '127.0.0.1', '2017-03-27 13:05:28', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('971068', '127.0.0.1', '2017-03-27 13:13:41', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('984771', '127.0.0.1', '2017-03-27 19:48:40', 'JAVASCRIPT', 'admin', null, '111');
INSERT INTO `access_log` VALUES ('985519', '127.0.0.1', '2017-03-27 13:04:43', 'JAVASCRIPT', 'admin', null, '111');

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
  `pdf_path` varchar(100) DEFAULT NULL,
  `pdf_url` varchar(100) DEFAULT NULL,
  `buy_link` varchar(100) DEFAULT NULL,
  `image_path` varchar(100) DEFAULT NULL,
  `image_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('123456', '撒', '苏打水', 'vxcvxcfcdsfds', '2017-03-01', 'JavaScript', '23.00', null, null, 'saadewewq', null, null);
INSERT INTO `books` VALUES ('32131', 'sacs', 'dsa', 'z小Z', '2017-03-06', 'CSS', '432.00', '\\root\\file\\pdfs\\JavaEE开发的颠覆者+Spring+Boot实战++完整版.pdf', 'http://127.0.0.1:8080\\root\\file\\pdfs\\JavaEE开发的颠覆者+Spring+Boot实战++完整版.pdf', 'fvdsfsfsfsf', null, null);
INSERT INTO `books` VALUES ('321321321', 'dsd', 'dsad', 'sadasd', '2017-03-08', 'JAVA', '3213.00', '\\root\\file\\pdf\\HTTP权威指南完整版.pdf', 'http://127.0.0.1:8080\\root\\file\\pdf\\HTTP权威指南完整版.pdf', 'vsfdfsf', null, null);
INSERT INTO `books` VALUES ('4214314', 'sadsa', 'dasd', 'csadsdsad', '2017-03-21', 'PHP', '432.00', 'JavaEE开发的颠覆者+Spring+Boot实战++完整版.pdf', 'http://127.0.0.1:8080JavaEE开发的颠覆者+Spring+Boot实战++完整版.pdf', 'gsdgsdggds', null, null);
INSERT INTO `books` VALUES ('423423', 'dsada', 'ddw', 'sasada', '2017-03-04', 'CSS', '32.00', '\\root\\file\\pdf\\', 'http://127.0.0.1:8080\\root\\file\\pdf\\', 'fsdfdfdsd', null, null);
INSERT INTO `books` VALUES ('423432', '21', 'rwq', 'vdfsd', '2017-03-15', 'HTML', '23.00', '\\root\\file\\pdf\\HTTP权威指南完整版.pdf', 'http://127.0.0.1:8080\\root\\file\\pdf\\HTTP权威指南完整版.pdf', 'fsdfsg', null, null);
INSERT INTO `books` VALUES ('4321', 'ds', 'dsa', 'fsd', '2017-03-10', 'PHP', '321.00', '\\root\\file\\pdfs\\HTTP权威指南完整版.pdf', 'http://127.0.0.1:8080\\root\\file\\pdfs\\HTTP权威指南完整版.pdf', 'vddfsdf', '\\root\\file\\images\\100和160.jpg', 'http://127.0.0.1:8080\\root\\file\\images\\100和160.jpg');
INSERT INTO `books` VALUES ('4323132', 'java', 'willads', '书籍', '2010-05-05', 'PHP', '32.10', null, 'http://127.0.0.1:8080\\root\\file\\pdf\\JavaEE开发的颠覆者+Spring+Boot实战++完整版.pdf', 'http://www.taobao.com', null, null);
INSERT INTO `books` VALUES ('4344215410', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', null, 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434431231', 'dsa', 'dada', 'cscascs', '2017-03-10', 'CSS', '23.00', null, 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434435454', 'dsq', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344356', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434437', 'ds', 'dada', 'cscascs', '2017-03-10', 'HTML', '23.00', null, 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344398', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455212', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455213', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455265', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('43445532', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455321', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344553213', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455410', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344554103', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455411', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344554121', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('4344554143', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455415', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455418', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455419', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455423', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455440', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455454', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455510', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('43445576', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('434455989', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('43445656', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('43445665', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);
INSERT INTO `books` VALUES ('53224', 'dsa', 'dada', 'cscascs', '2017-03-10', 'JAVASCRIPT', '23.00', '', 'http://127.0.0.1:8080\\root\\file\\pdf\\[Struts.2实战].pdf', 'http://www.360Buy.com', null, null);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(50) DEFAULT NULL,
  `permission_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) DEFAULT NULL,
  `role_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` int(20) DEFAULT NULL,
  `permission` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `sys_notice`;
CREATE TABLE `sys_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notice_content` varchar(200) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `release_time` datetime DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_notice
-- ----------------------------
INSERT INTO `sys_notice` VALUES ('1', '为积极践行社会主义核心价值观，大力弘扬孟子、孟母文化育人化人的重要意义，引导和鼓励青少年通过绘画、手抄报等形式，潜移默化中认知孟子文化和孟母教子的深刻意义，市委宣传部联合市文明办、市教育局，决定在全市中小学中开展“童画邹城·感恩小使者”评选活动，特制订本方案。', '紧急', '2017-03-29 19:29:05', 'admin');
INSERT INTO `sys_notice` VALUES ('2', 'cdsacecasc', '普通', '2017-03-29 13:51:09', 'admin');
INSERT INTO `sys_notice` VALUES ('3', 'fsadfadas', '普通', '2017-03-29 13:52:15', 'admin');
INSERT INTO `sys_notice` VALUES ('4', 'dscdsds', '紧急', '2017-03-29 13:52:22', 'admin');
INSERT INTO `sys_notice` VALUES ('5', 'shiro 权限', '普通', '2017-03-29 19:34:10', 'admin');
INSERT INTO `sys_notice` VALUES ('6', 'http://127.0.0.1:8080/onlineRead/eBookLogin/eb/loginManagement.html', '普通', '2017-03-29 19:34:01', 'admin');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` int(20) DEFAULT NULL,
  `role_id` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
