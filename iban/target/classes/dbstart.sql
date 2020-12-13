 
  CREATE DATABASE `casestudyiban` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `IBAN` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `user_id_idx` (`id`),
  CONSTRAINT `user_id` FOREIGN KEY (`id`) REFERENCES `iban` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

  
  CREATE TABLE `iban` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `iban` varchar(34) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `id_user` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgdwdq3ku1x7wppyjbescdph6f` (`id_user`),
  CONSTRAINT `FKafy283guc9tq4nmb7cn6aktdl` FOREIGN KEY (`id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKgdwdq3ku1x7wppyjbescdph6f` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


