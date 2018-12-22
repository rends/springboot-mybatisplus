CREATE TABLE `t_author` (
  `author_id` varchar(64) NOT NULL COMMENT '主键',
  `name` varchar(64) NOT NULL,
  `age` tinyint(2) unsigned NOT NULL,
  `id_card` varchar(18) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;