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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aceite`
--

LOCK TABLES `aceite` WRITE;
/*!40000 ALTER TABLE `aceite` DISABLE KEYS */;
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
  `Caracteristica` varchar(20) NOT NULL,
  PRIMARY KEY (`id_CombustibleV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combustiblev`
--

LOCK TABLES `combustiblev` WRITE;
/*!40000 ALTER TABLE `combustiblev` DISABLE KEYS */;
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
  `TipoSoat` varchar(20) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  `Ciudad` varchar(45) NOT NULL,
  `Fecha` varchar(45) NOT NULL,
  `id_TipoServicio` int(11) NOT NULL,
  `Precio` double NOT NULL,
  PRIMARY KEY (`id_Soat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soat`
--

LOCK TABLES `soat` WRITE;
/*!40000 ALTER TABLE `soat` DISABLE KEYS */;
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
  `Latitud` int(10) NOT NULL,
  `Longitud` int(10) NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_Ubicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'alvaro','al81',21,'alvaruto@gmail.com','4545'),(2,'sebastian','sebaschb',18,'Sebas20_95@hotmail.c','Hola12345'),(3,'sebas','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(4,'nicola','niko',18,'as@sd.chgom','1234547'),(5,'nicola','niko',18,'as@sd.chgom','45587'),(6,'Nicolas','Herrera',18,'nyko07herr@gmail.com','12345'),(7,'Nicolas','Herrera',18,'nyko07herr@gmail.com','12545'),(8,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(9,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(10,'Herrera','niko',18,'nyko07herr@gmail.com','12345'),(11,'Sebastian','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(12,'hayy','potter',54,'as@sd.chgom','123abc'),(13,'alasas','com4',21,'asass@s.coms','123'),(14,'andres','Alvaruto',21,'alvaruto@gmail.com','abc'),(15,'andres','Alvaruto',21,'alvaruto@gmail.com','abc123'),(16,'anda','Ands',21,'alvaruto@gmail.com5','123'),(17,'Caludia','claudia',45,'al@ss.com','123'),(18,'Alvaro','Alvaruto',21,'alvaruto@gmail.com','abc123'),(19,'Lizeth','Lizz',22,'lnlope@gm.com','1234');
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
  PRIMARY KEY (`id_Vehiculo`),
  KEY `id_Usuario` (`id_Usuario`),
  KEY `vehiculo_ibfk_4_idx` (`id_Aceite`),
  KEY `vehiculo_ibfk_5_idx` (`id_Soat`),
  KEY `vehiculo_ibfk_5_idx1` (`id_CombustibleV`),
  KEY `vehiculo_ibfk_7_idx` (`id_Ubicacion`),
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_Usuario`),
  CONSTRAINT `vehiculo_ibfk_4` FOREIGN KEY (`id_Aceite`) REFERENCES `aceite` (`id_Aceite`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_5` FOREIGN KEY (`id_Soat`) REFERENCES `soat` (`id_Soat`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_6` FOREIGN KEY (`id_CombustibleV`) REFERENCES `combustiblev` (`id_CombustibleV`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vehiculo_ibfk_7` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacion` (`id_Ubicacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
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

-- Dump completed on 2018-05-29 14:02:19
