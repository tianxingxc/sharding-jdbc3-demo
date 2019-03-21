SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=315550786413133826 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Procedure structure for bb
-- ----------------------------
DROP PROCEDURE IF EXISTS `bb`;
DELIMITER ;;
CREATE PROCEDURE `bb`(IN `a` int,IN `b` int,OUT `c` int)
BEGIN
	set c = a + b;
END
;;
DELIMITER ;
