DROP TABLE IF EXISTS `vehiculo`;
CREATE TABLE `vehiculo` (
  `id_Vehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `id_Usuario` int(10) NOT NULL,
  `Placa` varchar(20) NOT NULL,
  `id_TipoVehiculo` int(10) NOT NULL,
  `id_Soat` int(10) NOT NULL,
  `Mantenimiento` varchar(20) NOT NULL,
  `Cilindraje` int(10) NOT NULL,
  `Aceite` int(10) NOT NULL,
  `id_Ubicacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Vehiculo`),
  FOREIGN KEY (`id_Usuario`) REFERENCES usuario(`id_Usuario`),
  FOREIGN KEY (`id_Ubicacion`) REFERENCES ubicacion(`id_Ubicacion`)
) TYPE= INNODB;