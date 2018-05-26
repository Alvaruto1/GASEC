DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  `Alias` varchar(20) NOT NULL,
  `Edad` int(10) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Usuario`)
) TYPE= INNODB;