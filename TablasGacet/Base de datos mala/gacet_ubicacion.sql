DROP TABLE IF EXISTS `ubicacion`;
CREATE TABLE `ubicacion` (
  `id_Ubicacion` int(11) NOT NULL AUTO_INCREMENT,
  `Latitud` int(10) NOT NULL,
  `Longitud` int(10) NOT NULL,
  PRIMARY KEY (`id_Ubicacion`)  
) TYPE= INNODB;
 