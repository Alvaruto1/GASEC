DROP TABLE IF EXISTS `comentario`;
CREATE TABLE `comentario` (
  `id_Comentario` int(11) NOT NULL AUTO_INCREMENT,
  `id_Usuario` int(10) NOT NULL,
  `id_Estacion` int(10) NOT NULL,
  `Comentario` varchar(20) NOT NULL,
  `Calificacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Comentario`)
  FOREIGN KEY (`id_Usuario`) REFERENCES usuario(`id_Usuario`),
  FOREIGN KEY (`id_Estacion`) REFERENCES estacion(`id_Estacion`)	
) TYPE = INNODB;