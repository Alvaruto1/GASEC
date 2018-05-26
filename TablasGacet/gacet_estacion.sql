DROP TABLE IF EXISTS `estacion`;
CREATE TABLE `estacion` (
  `id_Estacion` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(20) NOT NULL,
  `Puestos` int(10) NOT NULL,
  `Valoracion` int(10) NOT NULL,
  `id_Combustible` int(10) NOT NULL,
  `id_Ubicacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Estacion`),
  FOREIGN KEY (`id_Ubicacion`) REFERENCES ubicacion(`id_Ubicacion`),
  FOREIGN KEY (`id_Combustible`) REFERENCES ubicacion(`id_Combustible`)
) TYPE = INNODB;