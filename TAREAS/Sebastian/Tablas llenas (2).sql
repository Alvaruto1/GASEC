CREATE DATABASE  IF NOT EXISTS `gacet` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `gacet`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: gacet
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
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
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `combustiblee` (
  `id_CombustibleE` int(11) NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(20) NOT NULL,
  `Caracteristica` varchar(20) NOT NULL,
  `Precio` double NOT NULL,
  `id_Estacion` int(10) NOT NULL,
  PRIMARY KEY (`id_CombustibleE`),
  KEY `combustiblee_ibfk_1_idx` (`id_Estacion`),
  CONSTRAINT `combustiblee_ibfk_1` FOREIGN KEY (`id_Estacion`) REFERENCES `estacion` (`id_estacion`)
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
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `comentario` (
  `id_Comentario` int(11) NOT NULL AUTO_INCREMENT,
  `id_Usuario` int(10) NOT NULL,
  `id_Estacion` int(10) NOT NULL,
  `Comentario` varchar(20) NOT NULL,
  `Calificacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Comentario`),
  KEY `id_Usuario` (`id_Usuario`),
  KEY `id_Estacion` (`id_Estacion`),
  CONSTRAINT `comentario_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `comentario_ibfk_2` FOREIGN KEY (`id_Estacion`) REFERENCES `estacion` (`id_estacion`)
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `estacion` (
  `id_Estacion` int(11) NOT NULL AUTO_INCREMENT,
  `Marca` varchar(80) NOT NULL,
  `Puestos` int(10) NOT NULL,
  `Valoracion` int(10) DEFAULT NULL,
  `id_Ubicacion` int(10) NOT NULL,
  PRIMARY KEY (`id_Estacion`),
  KEY `id_Ubicacion` (`id_Ubicacion`),
  CONSTRAINT `estacion_ibfk_1` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacion` (`id_ubicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacion`
--

LOCK TABLES `estacion` WRITE;
/*!40000 ALTER TABLE `estacion` DISABLE KEYS */;
INSERT INTO `estacion` VALUES (1,'ATESA SA',4,NULL,1),(2,'AUTO CENTRO INTERNACIONAL DORADO LTDA',4,NULL,2),(3,'AUTOCENTRO SANTANA LTDA',6,NULL,3),(4,'GRUPO EDS AUTOGAS SAS',8,NULL,4),(5,'CENCOSUD COLOMBIA SA',8,NULL,5),(6,'BAVARIA',2,NULL,6),(7,'COMBUSTIBLES DE COLOMBIA SA - COMBUSCOL',4,NULL,7),(8,'GNE SOLUCIONES SAS',4,NULL,8),(9,'GNE SOLUCIONES SAS',4,NULL,9),(10,'GNE SOLUCIONES SAS',4,NULL,10),(11,'GNE SOLUCIONES SAS',4,NULL,11),(12,'INVERSIONES DE COLOMBIA S&M LTDA',4,NULL,12),(13,'ESTACION DE SERVICIO ARGELIA ',4,NULL,13),(14,'INVERSIONES FAJARDO RONCANCIO LTDA',6,NULL,14),(15,'O Y S ASOCIADOS Y CIA S EN C',4,NULL,15),(16,'MAYA DURAN ALBERTO',4,NULL,16),(17,'GNE SOLUCIONES SAS',6,NULL,17),(18,'BRIO DE COLOMBIA SA',8,NULL,18),(19,'BRIO DE COLOMBIA SA',8,NULL,19),(20,'INVERSORA TRES GUTIERREZ LIMITADA',8,NULL,20),(21,'INVERSORA TRES GUTIERREZ LIMITADA',6,NULL,21),(22,'SERVICERON LTDA',6,NULL,22),(23,'BRIO DE COLOMBIA SA',6,NULL,23),(24,'GRUPO LOMA LIMITADA.',6,NULL,24),(25,'INVERSORA TRES GUTIERREZ LIMITADA',2,NULL,25),(26,'BRIO DE COLOMBIA SA',4,NULL,26),(27,'COMDISCOM LTDA',4,NULL,27),(28,'BRIO DE COLOMBIA SA',2,NULL,28),(29,'INVERSIONES BELTRAN A WO SAS',4,NULL,29),(30,'GNE SOLUCIONES SAS',8,NULL,30),(31,'GNE SOLUCIONES SAS',6,NULL,31),(32,'BAGUT GROUP JURIDICA SAS',2,NULL,32),(33,'INVERSIONES SAMORES SAS',2,NULL,33),(34,'COMERCIALIZADORA SABRE EMPRESA UNIPERSONAL',4,NULL,34),(35,'SERVICIOS Y COMBUSTIBLES LTDA',4,NULL,35),(36,'INVERSIONES COMBITA SAS',4,NULL,36),(37,'INVERSIONES R&R LTDA',4,NULL,37),(38,'AMPARO BARRENECHE ARIAS CENTRAL DE COMBUSTIBLES Y LUBRICANTES CIAS EN C',4,NULL,38),(39,'SEDETRANS SERVICIOS ESPECIALIZADOS DE TRANSPORTE SA',8,NULL,39),(40,'TAVERA RODRIGUEZ MARTIN ALONSO',8,NULL,40),(41,'COLOMBIANA DE COMBUSTIBLES CODECO LTDA',8,NULL,41),(42,'DISTRIBUIDORA DE COMBUSTIBLES LURIGER LTDA',8,NULL,42),(43,'CENCOSUD COLOMBIA SA',4,NULL,43),(44,'GRANDES SUPERFICIES DE COLOMBIA SA',4,NULL,44),(45,'CENCOSUD COLOMBIA SA',2,NULL,45),(46,'CENCOSUD COLOMBIA SA',2,NULL,46),(47,'CENCOSUD COLOMBIA SA',4,NULL,47),(48,'CENCOSUD COLOMBIA SA',4,NULL,48),(49,'CENCOSUD COLOMBIA SA',4,NULL,49),(50,'CENCOSUD COLOMBIA SA',8,NULL,50),(51,'CEMEX COLOMBIA SA',6,NULL,51);
/*!40000 ALTER TABLE `estacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kilometros`
--

DROP TABLE IF EXISTS `kilometros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `kilometros` (
  `id_Kilometros` int(11) NOT NULL AUTO_INCREMENT,
  `id_Vehiculo` int(10) NOT NULL,
  PRIMARY KEY (`id_Kilometros`),
  KEY `id_Vehiculo` (`id_Vehiculo`),
  CONSTRAINT `kilometros_ibfk_1` FOREIGN KEY (`id_Vehiculo`) REFERENCES `vehiculo` (`id_vehiculo`)
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
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ubicacion` (
  `id_Ubicacion` int(11) NOT NULL AUTO_INCREMENT,
  `Latitud` double NOT NULL,
  `Longitud` double NOT NULL,
  `Direccion` varchar(60) NOT NULL,
  PRIMARY KEY (`id_Ubicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
INSERT INTO `ubicacion` VALUES (1,4.6884899,-74.1640124,'CALLE 17 No.. 124-81'),(2,4.6705757,-74.1169044,'AVENIDA EL DORADO No..75-28'),(3,4.6903625,-74.0366248,'CARRERA 7 No.. 108B-23'),(4,4.6098947,-74.1819336,'AVENIDA CARRERA 80 No. 58L-15 SUR'),(5,4.6078841,-74.1083384,'AVENIDA CALLE 3 No.. 34 A-82'),(6,4.6392838,-74.1378119,'AVENIDA BOYACA No. 9-02'),(7,4.5787212,-74.1087554,'CALLE 27 SUR No.. 15-05'),(8,4.5803093,-74.0900641,'CARRERA 79 No.. 74D-11 SUR'),(9,4.673718,-74.1008482,'CARRERA 70 No.. 64-39'),(10,4.6737145,-74.1687006,'AC 54 SUR No. 89 A -53'),(11,4.7079529,-74.0991482,'AVENIDA CIUDAD DE CALI No. 99-10'),(12,4.5786831,-74.1274151,'CALLE 44 SUR No.  24-10'),(13,4.6277185,-74.0778229,'CARRERA 72 F No. 39-07 SUR'),(14,4.5766476,-74.1210608,'TRANSVERSAL 38 No. 19-16'),(15,4.6627366,-74.0694515,'CARRERA 24 No. 71A-68'),(16,4.6999949,-74.0348978,'AVENIDA 9 No. 123-46'),(17,4.7042391,-74.0569655,'AVENIDA AUTOPISTA NORTE 45 No. 232-35'),(18,4.6291018,-74.1977354,'CARRERA 91 No. 62A-01 SUR'),(19,4.6878464,-74.0637931,'AVENIDA CALLE 100 No. 49-25'),(20,4.7067411,-74.1468019,'CALLE 64 No. 112C-40'),(21,4.6018923,-74.0742284,'CARRERA 88 No. 85-20 SUR'),(22,4.7472923,-74.0669742,'CARRERA 72 No. 163-10'),(23,4.7403571,-74.0901942,'AVENIDA CALLE 145 No. 94D-60'),(24,4.6835064,-74.0994418,'AVENIDA BOYACA No. 68B-72'),(25,4.7434887,-74.1202021,'CALLE 132 No. 144A-25'),(26,4.6075107,-74.20602,'DIAGONAL 74A SUR No.. 78I-19'),(27,4.7093107,-74.1411857,'CALLE 64 No.. 113A-95'),(28,4.6868511,-74.0467378,'AVENIDA CARRERA 9 No. 103-39'),(29,4.6943013,-74.1249111,'CARRERA 98 No. 63-39'),(30,4.6867929,-74.1289939,'AVENIDA EL DORADO No. 96J-60'),(31,4.6027245,-74.0752223,'CARRERA 7 No. 169-65'),(32,4.597887,-74.078944,'CARRERA 78 N BIS B No. 53-39'),(33,4.587291,-74.1253378,'CARRERA 31 No. 38A-51 SUR'),(34,4.7061202,-74.0537033,'AC  127 No. 20-85'),(35,4.673046,-74.1071068,'CARRERA 72 No. 55-41'),(36,4.6231953,-74.1346919,'CARRERA 70B No. 24-08 SUR'),(37,4.5596895,-74.1273618,'CARRERA 53 SUR No. 52B-11'),(38,4.644832,-74.1329564,'CALLE 12 BIS No. 71G-37'),(39,4.7162266,-74.1206088,'CARRERA 110 No. 79-21'),(40,4.7021699,-74.0514581,'AVENIDA 19 No. 122-33'),(41,4.6249367,-74.1040461,'CALLE 14 No. 43-82'),(42,4.6416237,-74.074279,'CARRERA 21 No. 53-15'),(43,4.5969864,-74.1785591,'AUTOPISTA SUR No. 77 A-18'),(44,4.6266144,-74.2060254,'CARRERA 92 No. 60-90 SUR'),(45,4.757068,-74.0667147,'CALLE 170 No. 64-47'),(46,4.6877604,-74.0833561,'CALLE 80 No. 69 Q-50'),(47,4.6192757,-74.0922819,'CARRERA 32 No. 18-10'),(48,4.6384937,-74.1606964,'CARRERA 86 No. 19 A-50'),(49,4.5681231,-74.127637,'DIAGONAL 49A No. 17-59/89'),(50,4.6771707,-74.1179317,'CALLE 46 A No. 85 A-51'),(51,4.6694096,-74.0943218,'AVENIDA CARRERA 45 No. 235-91');
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
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
 SET character_set_client = utf8mb4 ;
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
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuario` (`id_usuario`),
  CONSTRAINT `vehiculo_ibfk_4` FOREIGN KEY (`id_Aceite`) REFERENCES `aceite` (`id_aceite`),
  CONSTRAINT `vehiculo_ibfk_5` FOREIGN KEY (`id_Soat`) REFERENCES `soat` (`id_soat`),
  CONSTRAINT `vehiculo_ibfk_6` FOREIGN KEY (`id_CombustibleV`) REFERENCES `combustiblev` (`id_combustiblev`),
  CONSTRAINT `vehiculo_ibfk_7` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacion` (`id_ubicacion`)
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

-- Dump completed on 2018-05-29 19:51:31
