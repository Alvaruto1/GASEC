DROP TABLE IF EXISTS `combustible`;
CREATE TABLE `combustible` (
  `id_Combustible` int(11) NOT NULL AUTO_INCREMENT,
  `ACPM` int(10) NOT NULL,
  `GAS` int(10) NOT NULL,
  `GASOLINA` int(10) NOT NULL,
  PRIMARY KEY (`id_Combustible`)
) TYPE = INNODB;
