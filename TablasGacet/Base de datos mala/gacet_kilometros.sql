DROP TABLE IF EXISTS `kilometros`;
CREATE TABLE `kilometros` (
  `id_Kilometros` int(11) NOT NULL AUTO_INCREMENT,
  `id_Vehiculo` int(10) NOT NULL,
  PRIMARY KEY (`id_Kilometros`),
  FOREIGN KEY (`id_Vehiculo`) REFERENCES vehiculo(`id_Vehiculo`)
) TYPE=INNODB;