-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: gacet
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aceite`
--

DROP TABLE IF EXISTS `aceite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aceite` (
  `id_Aceite` int(11) NOT NULL AUTO_INCREMENT,
  `TipoAceite` varchar(45) NOT NULL,
  `Marca` varchar(45) NOT NULL,
  `KmMaximo` int(11) NOT NULL,
  `Caracteristica` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Aceite`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aceite`
--

LOCK TABLES `aceite` WRITE;
/*!40000 ALTER TABLE `aceite` DISABLE KEYS */;
INSERT INTO `aceite` VALUES (1,'Carro','mobil',120,'ssdasd'),(2,'Carro','mobil',120,'ssdasd'),(3,'Carro','mobil',120,'ssdasd'),(4,'Carro','mobil',120,'ssdasd'),(5,'Carro','mobil',120,'ssdasd'),(6,'Moto','mobil',120,'una refe'),(7,'Camion','oLIVA',200,'EL MEJOR'),(8,'Moto','mobil',2000,'sdsdsad'),(9,'Moto','auteco',500,'xcxc'),(10,'Carro','mobil',45000,'220'),(11,'Camion','ace',45,'dd'),(12,'Carro','ace',2000,'as'),(13,'Camion','ace',5666,'335'),(14,'Carro','SDFSDF',2000,'sadasda'),(15,'Moto','ace',555,'455'),(16,'Camion','auteco',2114,'asas'),(17,'Camion','ace',45,'asas'),(18,'Carro','mobil',111555441,'fgdf'),(19,'Camion','SDFSDF',25454,'dssda'),(20,'Camion','ace',45545,'rtgyt'),(21,'Camion','ace',45545,'rtgyt'),(22,'Camion','ace',45545,'rtgyt'),(23,'Camion','ace',45545,'rtgyt'),(24,'Camion','ace',45545,'rtgyt'),(25,'Camion','mobil',41,'fgfg'),(26,'Carro','asda',4545,'dsfdsf'),(27,'Carro','asda',4545,'dsfdsf'),(28,'Carro','dasd',224,'dasd'),(29,'Carro','fgd',444,'124'),(30,'Carro','fgd',444,'124'),(31,'Carro','fgd',444,'124'),(32,'Moto','vcxv',1222,'asdasd'),(33,'Carro','ace',45,'');
/*!40000 ALTER TABLE `aceite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combustiblee`
--

DROP TABLE IF EXISTS `combustiblee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `combustiblee` (
  `id_CombustibleE` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) NOT NULL,
  `Caracteristica` varchar(20) NOT NULL,
  `Precio` double NOT NULL,
  `id_Estacion` int(10) NOT NULL,
  PRIMARY KEY (`id_CombustibleE`),
  KEY `combustiblee_ibfk_1_idx` (`id_Estacion`),
  CONSTRAINT `combustiblee_ibfk_1` FOREIGN KEY (`id_Estacion`) REFERENCES `estacion` (`id_Estacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combustiblee`
--

LOCK TABLES `combustiblee` WRITE;
/*!40000 ALTER TABLE `combustiblee` DISABLE KEYS */;
/*!40000 ALTER TABLE `combustiblee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combustiblev`
--

DROP TABLE IF EXISTS `combustiblev`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `combustiblev` (
  `id_CombustibleV` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) NOT NULL,
  `Caracteristica` varchar(50) NOT NULL,
  PRIMARY KEY (`id_CombustibleV`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combustiblev`
--

LOCK TABLES `combustiblev` WRITE;
/*!40000 ALTER TABLE `combustiblev` DISABLE KEYS */;
INSERT INTO `combustiblev` VALUES (1,'ACPM','Es el gasóleo extraído del petróleo. '),(2,'Gasolina','La gasolina es una mezcla de hidrocarburo'),(3,'Gas','Un gas combustible');
/*!40000 ALTER TABLE `combustiblev` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentario` (
  `id_Comentario` int(11) NOT NULL AUTO_INCREMENT,
  `id_Usuario` int(10) NOT NULL,
  `id_Estacion` int(10) NOT NULL,
  `Comentario` varchar(20) NOT NULL,
  `Calificacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Comentario`),
  KEY `id_Usuario` (`id_Usuario`),
  KEY `id_Estacion` (`id_Estacion`),
  CONSTRAINT `comentario_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_Usuario`),
  CONSTRAINT `comentario_ibfk_2` FOREIGN KEY (`id_Estacion`) REFERENCES `estacion` (`id_Estacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estacion`
--

DROP TABLE IF EXISTS `estacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estacion` (
  `id_Estacion` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(20) NOT NULL,
  `Puestos` int(10) NOT NULL,
  `Valoracion` int(10) NOT NULL,
  `id_Ubicacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Estacion`),
  KEY `id_Ubicacion` (`id_Ubicacion`),
  CONSTRAINT `estacion_ibfk_1` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacion` (`id_Ubicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacion`
--

LOCK TABLES `estacion` WRITE;
/*!40000 ALTER TABLE `estacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `estacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kilometros`
--

DROP TABLE IF EXISTS `kilometros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kilometros` (
  `id_Kilometros` int(11) NOT NULL AUTO_INCREMENT,
  `id_Vehiculo` int(10) NOT NULL,
  PRIMARY KEY (`id_Kilometros`),
  KEY `id_Vehiculo` (`id_Vehiculo`),
  CONSTRAINT `kilometros_ibfk_1` FOREIGN KEY (`id_Vehiculo`) REFERENCES `vehiculo` (`id_Vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kilometros`
--

LOCK TABLES `kilometros` WRITE;
/*!40000 ALTER TABLE `kilometros` DISABLE KEYS */;
/*!40000 ALTER TABLE `kilometros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `soat`
--

DROP TABLE IF EXISTS `soat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `soat` (
  `id_Soat` int(11) NOT NULL AUTO_INCREMENT,
  `TipoSoat` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  `Ciudad` varchar(45) NOT NULL,
  `Fecha` varchar(45) NOT NULL,
  `id_TipoServicio` int(11) NOT NULL,
  `Precio` double NOT NULL,
  PRIMARY KEY (`id_Soat`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soat`
--

LOCK TABLES `soat` WRITE;
/*!40000 ALTER TABLE `soat` DISABLE KEYS */;
INSERT INTO `soat` VALUES (1,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(2,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(3,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(4,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(5,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(6,'class Logica.SOAT.SOATMoto','Empresa','Fontiobn','14-07-2018',1,0),(7,'class Logica.SOAT.SOATCamion','empresa soat2','Bogota','01-06-2018',2,0),(8,'class Logica.SOAT.SOATMoto','empresa soat','Ibague','09-06-2018',2,0),(9,'class Logica.SOAT.SOATBus','empresa soat','Cali','10-05-2018',0,0),(10,'class Logica.SOAT.SOATCarro','soat3','Cali','08-06-2018',0,0),(11,'class Logica.SOAT.SOATCamion','chco','Barranquilla','01-06-2018',2,0),(12,'class Logica.SOAT.SOATCarro','DSDFSDF','Cali','01-05-2018',2,0),(13,'class Logica.SOAT.SOATCamion','DSDFSDF','Cali','04-03-2018',0,0),(14,'class Logica.SOAT.SOATCarro','empresa soat2','Ibague','28-02-2018',0,0),(15,'class Logica.SOAT.SOATMoto','DSDFSDF','Cali','12-05-2018',0,0),(16,'class Logica.SOAT.SOATCamion','DSDFSDF','carsta','31-12-2017',0,0),(17,'class Logica.SOAT.SOATCamion','empresa soat2','Cali','05-03-2018',0,0),(18,'class Logica.SOAT.SOATCarro','757','Cali','07-05-2018',3,0),(19,'class Logica.SOAT.SOATCamion','empresa soat2','dsdad','05-05-2018',0,0),(20,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(21,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(22,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(23,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(24,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(25,'class Logica.SOAT.SOATCamion','empresa','Cali','16-06-2018',1,0),(26,'class Logica.SOAT.SOATCarro','empresa','Cali','07-06-2018',1,0),(27,'class Logica.SOAT.SOATCarro','empresa','Cali','07-06-2018',1,0),(28,'class Logica.SOAT.SOATCarro','dsadsa','sadasd','30-04-2018',1,0),(29,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(30,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(31,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(32,'class Logica.SOAT.SOATMoto','cvxvc','vxcvxc','30-04-2018',2,0),(33,'class Logica.SOAT.SOATCarro','Empresa','Cali','04-06-2018',1,0);
/*!40000 ALTER TABLE `soat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposervicio`
--

DROP TABLE IF EXISTS `tiposervicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiposervicio` (
  `id_TipoServicio` int(11) NOT NULL AUTO_INCREMENT,
  `TipoServicio` varchar(45) NOT NULL,
  PRIMARY KEY (`id_TipoServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposervicio`
--

LOCK TABLES `tiposervicio` WRITE;
/*!40000 ALTER TABLE `tiposervicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiposervicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipovehiculo`
--

DROP TABLE IF EXISTS `tipovehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipovehiculo` (
  `id_TipoVehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `NombreVehiculo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_TipoVehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipovehiculo`
--

LOCK TABLES `tipovehiculo` WRITE;
/*!40000 ALTER TABLE `tipovehiculo` DISABLE KEYS */;
INSERT INTO `tipovehiculo` VALUES (1,'Carro'),(2,'Moto'),(3,'Camion'),(4,'Bus');
/*!40000 ALTER TABLE `tipovehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubicacion`
--

DROP TABLE IF EXISTS `ubicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ubicacion` (
  `id_Ubicacion` int(11) NOT NULL AUTO_INCREMENT,
  `Latitud` double NOT NULL,
  `Longitud` double NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Ubicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
INSERT INTO `ubicacion` VALUES (1,0,0,'no registrada'),(2,0,0,'no registrada'),(3,0,0,'no registrada'),(4,0,0,'no registrada'),(5,0,0,'no registrada'),(6,0,0,'no registrada'),(7,0,0,'no registrada'),(8,0,0,'no registrada'),(9,0,0,'no registrada'),(10,0,0,'no registrada'),(11,0,0,'no registrada'),(12,0,0,'no registrada'),(13,0,0,'no registrada'),(14,0,0,'no registrada'),(15,0,0,'no registrada'),(16,0,0,'no registrada'),(17,0,0,'no registrada'),(18,0,0,'no registrada'),(19,0,0,'no registrada'),(20,0,0,'no registrada'),(21,0,0,'no registrada'),(22,0,0,'no registrada'),(23,0,0,'no registrada'),(24,0,0,'no registrada'),(25,0,0,'no registrada'),(26,0,0,'no registrada'),(27,0,0,'no registrada'),(28,0,0,'no registrada'),(29,0,0,'no registrada'),(30,0,0,'no registrada'),(31,0,0,'no registrada'),(32,0,0,'no registrada');
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) NOT NULL,
  `Alias` varchar(20) NOT NULL,
  `Edad` int(10) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Contrasenia` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'alvaro','al81',21,'alvaruto@gmail.com','4545'),(2,'sebastian','sebaschb',18,'Sebas20_95@hotmail.c','Hola12345'),(3,'sebas','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(4,'nicola','niko',18,'as@sd.chgom','1234547'),(5,'nicola','niko',18,'as@sd.chgom','45587'),(6,'Nicolas','Herrera',18,'nyko07herr@gmail.com','12345'),(7,'Nicolas','Herrera',18,'nyko07herr@gmail.com','12545'),(8,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(9,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(10,'Herrera','niko',18,'nyko07herr@gmail.com','12345'),(11,'Sebastian','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(12,'hayy','potter',54,'as@sd.chgom','123abc'),(13,'alasas','com4',21,'asass@s.coms','123'),(14,'andres','Alvaruto',21,'alvaruto@gmail.com','abc'),(15,'andres','Alvaruto',21,'alvaruto@gmail.com','abc123'),(16,'anda','Ands',21,'alvaruto@gmail.com5','123'),(17,'Caludia','claudia',45,'al@ss.com','123'),(18,'Alvaro','Alvaruto',21,'alvaruto@gmail.com','abc123'),(19,'Lizeth','Lizz',22,'lnlope@gm.com','1234'),(20,'Juancho','Juanchito',12,'juan@gm.com','asd'),(21,'Andres','Alvaruto10',21,'al@ss.com','123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vehiculo` (
  `id_Vehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `id_Usuario` int(10) NOT NULL,
  `Placa` varchar(20) NOT NULL,
  `id_Soat` int(10) NOT NULL,
  `Mantenimiento` varchar(20) NOT NULL,
  `Cilindraje` int(10) NOT NULL,
  `id_Aceite` int(10) NOT NULL,
  `id_CombustibleV` int(10) NOT NULL,
  `id_Ubicacion` int(10) NOT NULL,
  `id_TipoVehiculo` int(11) NOT NULL,
  PRIMARY KEY (`id_Vehiculo`),
  KEY `id_Usuario` (`id_Usuario`),
  KEY `vehiculo_ibfk_4_idx` (`id_Aceite`),
  KEY `vehiculo_ibfk_5_idx` (`id_Soat`),
  KEY `vehiculo_ibfk_5_idx1` (`id_CombustibleV`),
  KEY `vehiculo_ibfk_7_idx` (`id_Ubicacion`),
  KEY `vehiculo_ibfk_7_idx1` (`id_TipoVehiculo`),
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_Usuario`),
  CONSTRAINT `vehiculo_ibfk_4` FOREIGN KEY (`id_Aceite`) REFERENCES `aceite` (`id_Aceite`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_5` FOREIGN KEY (`id_Soat`) REFERENCES `soat` (`id_Soat`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_6` FOREIGN KEY (`id_CombustibleV`) REFERENCES `combustiblev` (`id_CombustibleV`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_7` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacion` (`id_Ubicacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (6,15,'LQC96C',6,'04-10-2017',135,6,2,6,2),(7,15,'LER34A',7,'01-06-2018',100,7,1,7,3),(8,20,'ARD254',8,'15-06-2018',12,8,3,8,2),(9,15,'XXX555',9,'29-07-2018',45,9,1,9,2),(10,1,'RTV45S',10,'07-06-2018',120,10,2,10,1),(11,2,'TRV22A',11,'14-06-2018',150,11,2,11,3),(12,15,'LVP000',12,'01-06-2018',135,12,2,12,1),(13,15,'HGH25A',13,'30-04-2018',200,13,3,13,3),(14,15,'PRU354',14,'30-04-2018',4551,14,2,14,1),(15,4,'PRU001',15,'30-04-2018',14,15,2,15,2),(16,15,'PRU002',17,'05-05-2018',2554,17,2,16,3),(17,15,'PRU004',18,'30-04-2018',8,18,3,17,1),(18,15,'PRU002',19,'14-05-2018',44,19,1,18,3),(19,15,'LER34A',20,'06-05-2018',444,20,1,19,3),(20,15,'LER34A',21,'06-05-2018',444,21,1,20,3),(21,15,'LER34A',22,'06-05-2018',444,22,1,21,3),(22,15,'LER34A',23,'06-05-2018',444,23,1,22,3),(23,15,'LER34A',24,'06-05-2018',444,24,1,23,3),(24,15,'PRU002',25,'14-06-2018',224,25,3,24,3),(25,15,'PRU002',26,'07-06-2018',42,26,2,25,1),(26,15,'PRU002',27,'07-06-2018',42,27,2,26,1),(27,15,'PRU002',28,'13-05-2018',250,28,1,27,1),(28,15,'LER34A',29,'13-05-2018',24,29,1,28,1),(29,15,'LER34A',30,'13-05-2018',24,30,1,29,1),(30,15,'LER34A',31,'13-05-2018',24,31,1,30,1),(31,21,'WDE25S',32,'05-05-2018',12132,32,3,31,2),(32,15,'PRU002',33,'04-06-2018',2554,33,1,32,1);
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-31 16:31:04
