CREATE DATABASE  IF NOT EXISTS `gacet` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gacet`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: gacet
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.32-MariaDB

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
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aceite`
--

LOCK TABLES `aceite` WRITE;
/*!40000 ALTER TABLE `aceite` DISABLE KEYS */;
INSERT INTO `aceite` VALUES (1,'Carro','mobil',120,'ssdasd'),(2,'Carro','mobil',120,'ssdasd'),(3,'Carro','mobil',120,'ssdasd'),(4,'Carro','mobil',120,'ssdasd'),(5,'Carro','mobil',120,'ssdasd'),(6,'Carro','mobil',120,'efdf'),(7,'Camion','oLIVA',200,'EL MEJOR'),(8,'Moto','mobil',2000,'sdsdsad'),(9,'Moto','auteco',500,'xcxc'),(10,'Carro','mobil',45000,'220'),(11,'Camion','ace',45,'dd'),(12,'Carro','ace',2000,'as'),(13,'Camion','ace',5666,'335'),(14,'Carro','SDFSDF',2000,'sadasda'),(15,'Moto','ace',555,'455'),(16,'Camion','auteco',2114,'asas'),(17,'Camion','ace',45,'asas'),(18,'Carro','mobil',111555441,'fgdf'),(19,'Camion','SDFSDF',25454,'dssda'),(20,'Camion','ace',45545,'rtgyt'),(21,'Camion','ace',45545,'rtgyt'),(22,'Camion','ace',45545,'rtgyt'),(23,'Camion','ace',45545,'rtgyt'),(24,'Camion','ace',45545,'rtgyt'),(25,'Camion','mobil',41,'fgfg'),(26,'Carro','asda',4545,'dsfdsf'),(27,'Carro','asda',4545,'dsfdsf'),(28,'Carro','dasd',224,'dasd'),(29,'Carro','fgd',444,'124'),(30,'Carro','fgd',444,'124'),(31,'Carro','fgd',444,'124'),(32,'Moto','vcxv',1222,'asdasd'),(33,'Carro','ace',45,''),(34,'Carro','sdfsdf',234,'sfdsf'),(35,'Carro','dgfg',324,'dgdg'),(36,'Carro','dadsd',233,'asdasd'),(37,'Carro','LAMEJOR',5000,'ghf'),(38,'Carro','ADDS',200000,'RELINDOPASPI'),(39,'Carro','Turbo',34,'asasas'),(40,'Carro','Diesel',232,'afdf'),(41,'Carro','DSG',45,'SDSDSD'),(42,'Carro','GHG',77,'JH'),(43,'Carro','dadsd',4,'nICE');
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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
INSERT INTO `comentario` VALUES (1,15,37,'nicolas ',3),(2,15,37,'otro mas',3),(3,15,37,'prueba 2',1),(4,15,37,'Alvaro',4),(5,15,37,'ghfghfg',1),(6,15,49,'sil',4),(7,6,15,'bien',4),(8,6,22,'bien',4),(9,6,23,'bien',5),(10,25,36,'bueno',5),(11,26,36,'Malo',5);
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
  KEY `estacion_ibfk_1_idx` (`id_Ubicacion`),
  CONSTRAINT `estacion_ibfk_1` FOREIGN KEY (`id_Ubicacion`) REFERENCES `ubicacionmapa` (`id_UbicacionMapa`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacion`
--

LOCK TABLES `estacion` WRITE;
/*!40000 ALTER TABLE `estacion` DISABLE KEYS */;
INSERT INTO `estacion` VALUES (1,'ATESA SA',4,0,1),(2,'AUTO CENTRO INTERNAC',4,0,2),(3,'AUTOCENTRO SANTANA L',6,0,3),(4,'GRUPO EDS AUTOGAS SA',8,0,4),(5,'CENCOSUD COLOMBIA SA',8,0,5),(6,'BAVARIA',2,0,6),(7,'COMBUSTIBLES DE COLO',4,0,7),(8,'GNE SOLUCIONES SAS',4,0,8),(9,'GNE SOLUCIONES SAS',4,0,9),(10,'GNE SOLUCIONES SAS',4,0,10),(11,'GNE SOLUCIONES SAS',4,0,11),(12,'INVERSIONES DE COLOM',4,0,12),(13,'ESTACION DE SERVICIO',4,0,13),(14,'INVERSIONES FAJARDO ',6,0,14),(15,'O Y S ASOCIADOS Y CI',4,0,15),(16,'MAYA DURAN ALBERTO',4,0,16),(17,'GNE SOLUCIONES SAS',6,0,17),(18,'BRIO DE COLOMBIA SA',8,0,18),(19,'BRIO DE COLOMBIA SA',8,0,19),(20,'INVERSORA TRES GUTIE',8,0,20),(21,'INVERSORA TRES GUTIE',6,0,21),(22,'SERVICERON LTDA',6,0,22),(23,'BRIO DE COLOMBIA SA',6,0,23),(24,'GRUPO LOMA LIMITADA.',6,0,24),(25,'INVERSORA TRES GUTIE',2,0,25),(26,'BRIO DE COLOMBIA SA',4,0,26),(27,'COMDISCOM LTDA',4,0,27),(28,'BRIO DE COLOMBIA SA',2,0,28),(29,'INVERSIONES BELTRAN ',4,0,29),(30,'GNE SOLUCIONES SAS',8,0,30),(31,'GNE SOLUCIONES SAS',6,0,31),(32,'BAGUT GROUP JURIDICA',2,0,32),(33,'INVERSIONES SAMORES ',2,0,33),(34,'COMERCIALIZADORA SAB',4,0,34),(35,'SERVICIOS Y COMBUSTI',4,0,35),(36,'INVERSIONES COMBITA ',4,0,36),(37,'INVERSIONES R&R LTDA',4,0,37),(38,'AMPARO BARRENECHE AR',4,0,38),(39,'SEDETRANS SERVICIOS ',8,0,39),(40,'TAVERA RODRIGUEZ MAR',8,0,40),(41,'COLOMBIANA DE COMBUS',8,0,41),(42,'DISTRIBUIDORA DE COM',8,0,42),(43,'CENCOSUD COLOMBIA SA',4,0,43),(44,'GRANDES SUPERFICIES ',4,0,44),(45,'CENCOSUD COLOMBIA SA',2,0,45),(46,'CENCOSUD COLOMBIA SA',2,0,46),(47,'CENCOSUD COLOMBIA SA',4,0,47),(48,'CENCOSUD COLOMBIA SA',4,0,48),(49,'CENCOSUD COLOMBIA SA',4,0,49),(50,'CENCOSUD COLOMBIA SA',8,0,50),(51,'CEMEX COLOMBIA SA',6,0,51);
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
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soat`
--

LOCK TABLES `soat` WRITE;
/*!40000 ALTER TABLE `soat` DISABLE KEYS */;
INSERT INTO `soat` VALUES (1,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(2,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(3,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(4,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(5,'class Logica.SOAT.SOATCarro','empresa soat','Bogota','08-06-2018',0,0),(6,'class Logica.SOAT.SOATCarro','Empresa','Fontiobn','03-11-2017',1,0),(7,'class Logica.SOAT.SOATCamion','empresa soat2','Bogota','01-06-2018',2,0),(8,'class Logica.SOAT.SOATMoto','empresa soat','Ibague','09-06-2018',2,0),(9,'class Logica.SOAT.SOATBus','empresa soat','Cali','10-05-2018',0,0),(10,'class Logica.SOAT.SOATCarro','soat3','Cali','08-06-2018',0,0),(11,'class Logica.SOAT.SOATCamion','chco','Barranquilla','01-06-2018',2,0),(12,'class Logica.SOAT.SOATCarro','DSDFSDF','Cali','01-05-2018',2,0),(13,'class Logica.SOAT.SOATCamion','DSDFSDF','Cali','04-03-2018',0,0),(14,'class Logica.SOAT.SOATCarro','empresa soat2','Ibague','28-02-2018',0,0),(15,'class Logica.SOAT.SOATMoto','DSDFSDF','Cali','12-05-2018',0,0),(16,'class Logica.SOAT.SOATCamion','DSDFSDF','carsta','31-12-2017',0,0),(17,'class Logica.SOAT.SOATCamion','empresa soat2','Cali','05-03-2018',0,0),(18,'class Logica.SOAT.SOATCarro','757','Cali','07-05-2018',3,0),(19,'class Logica.SOAT.SOATCamion','empresa soat2','dsdad','05-05-2018',0,0),(20,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(21,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(22,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(23,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(24,'class Logica.SOAT.SOATCamion','tt','Cali','06-05-2018',1,0),(25,'class Logica.SOAT.SOATCamion','empresa','Cali','16-06-2018',1,0),(26,'class Logica.SOAT.SOATCarro','empresa','Cali','07-06-2018',1,0),(27,'class Logica.SOAT.SOATCarro','empresa','Cali','07-06-2018',1,0),(28,'class Logica.SOAT.SOATCarro','dsadsa','sadasd','30-04-2018',1,0),(29,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(30,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(31,'class Logica.SOAT.SOATCarro','fgfdg','fgfd','08-05-2018',0,0),(32,'class Logica.SOAT.SOATMoto','cvxvc','vxcvxc','30-04-2018',2,0),(33,'class Logica.SOAT.SOATCarro','Empresa','Cali','04-06-2018',1,0),(34,'class Logica.SOAT.SOATCarro','sdfsds','Barranquilla','04-06-2018',0,0),(35,'class Logica.SOAT.SOATCarro','gdgf','Bogota','12-06-2018',1,0),(36,'class Logica.SOAT.SOATCarro','ASDA','Ibague','29-05-2018',1,0),(37,'class Logica.SOAT.SOATCarro','Empresa','Bogota','11-07-2018',1,0),(38,'class Logica.SOAT.SOATCarro','DASDDASDSA','Bogota','21-06-2018',0,0),(39,'class Logica.SOAT.SOATCarro','Casacada','Viani','27-05-2018',1,0),(40,'class Logica.SOAT.SOATCarro','asdasda','Bogota','03-06-2018',1,0),(41,'class Logica.SOAT.SOATCarro','DSF','Bogota','04-06-2018',1,0),(42,'class Logica.SOAT.SOATCarro','GV','Bogota','18-06-2018',2,0),(43,'class Logica.SOAT.SOATCarro','ASDA','Bogota','25-05-2018',1,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
INSERT INTO `ubicacion` VALUES (1,0,0,'no registrada'),(2,0,0,'no registrada'),(3,0,0,'no registrada'),(4,0,0,'no registrada'),(5,0,0,'no registrada'),(6,0,0,'no registrada'),(7,0,0,'no registrada'),(8,0,0,'no registrada'),(9,0,0,'no registrada'),(10,0,0,'no registrada'),(11,0,0,'no registrada'),(12,0,0,'no registrada'),(13,0,0,'no registrada'),(14,0,0,'no registrada'),(15,0,0,'no registrada'),(16,0,0,'no registrada'),(17,0,0,'no registrada'),(18,0,0,'no registrada'),(19,0,0,'no registrada'),(20,0,0,'no registrada'),(21,0,0,'no registrada'),(22,0,0,'no registrada'),(23,0,0,'no registrada'),(24,0,0,'no registrada'),(25,0,0,'no registrada'),(26,0,0,'no registrada'),(27,0,0,'no registrada'),(28,0,0,'no registrada'),(29,0,0,'no registrada'),(30,0,0,'no registrada'),(31,0,0,'no registrada'),(32,0,0,'no registrada'),(33,0,0,'no registrada'),(34,0,0,'no registrada'),(35,0,0,'no registrada'),(36,0,0,'no registrada'),(37,0,0,'no registrada'),(38,0,0,'no registrada'),(39,0,0,'no registrada'),(40,0,0,'no registrada'),(41,0,0,'no registrada'),(42,0,0,'no registrada');
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubicacionmapa`
--

DROP TABLE IF EXISTS `ubicacionmapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ubicacionmapa` (
  `id_UbicacionMapa` int(11) NOT NULL AUTO_INCREMENT,
  `Latitud` double NOT NULL,
  `Longitud` double NOT NULL,
  `Direccion` varchar(45) NOT NULL,
  PRIMARY KEY (`id_UbicacionMapa`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacionmapa`
--

LOCK TABLES `ubicacionmapa` WRITE;
/*!40000 ALTER TABLE `ubicacionmapa` DISABLE KEYS */;
INSERT INTO `ubicacionmapa` VALUES (1,4.6884899,-74.1640124,'CALLE 17 No.. 124-81'),(2,4.6705757,-74.1169044,'AVENIDA EL DORADO No..75-28'),(3,4.6903625,-74.0366248,'CARRERA 7 No.. 108B-23'),(4,4.6098947,-74.1819336,'AVENIDA CARRERA 80 No. 58L-15 SUR'),(5,4.6078841,-74.1083384,'AVENIDA CALLE 3 No.. 34 A-82'),(6,4.6392838,-74.1378119,'AVENIDA BOYACA No. 9-02'),(7,4.5787212,-74.1087554,'CALLE 27 SUR No.. 15-05'),(8,4.5803093,-74.0900641,'CARRERA 79 No.. 74D-11 SUR'),(9,4.673718,-74.1008482,'CARRERA 70 No.. 64-39'),(10,4.6737145,-74.1687006,'AC 54 SUR No. 89 A -53'),(11,4.7079529,-74.0991482,'AVENIDA CIUDAD DE CALI No. 99-10'),(12,4.5786831,-74.1274151,'CALLE 44 SUR No.  24-10'),(13,4.6277185,-74.0778229,'CARRERA 72 F No. 39-07 SUR'),(14,4.5766476,-74.1210608,'TRANSVERSAL 38 No. 19-16'),(15,4.6627366,-74.0694515,'CARRERA 24 No. 71A-68'),(16,4.6999949,-74.0348978,'AVENIDA 9 No. 123-46'),(17,4.7042391,-74.0569655,'AVENIDA AUTOPISTA NORTE 45 No. 232-35'),(18,4.6291018,-74.1977354,'CARRERA 91 No. 62A-01 SUR'),(19,4.6878464,-74.0637931,'AVENIDA CALLE 100 No. 49-25'),(20,4.7067411,-74.1468019,'CALLE 64 No. 112C-40'),(21,4.6018923,-74.0742284,'CARRERA 88 No. 85-20 SUR'),(22,4.7472923,-74.0669742,'CARRERA 72 No. 163-10'),(23,4.7403571,-74.0901942,'AVENIDA CALLE 145 No. 94D-60'),(24,4.6835064,-74.0994418,'AVENIDA BOYACA No. 68B-72'),(25,4.7434887,-74.1202021,'CALLE 132 No. 144A-25'),(26,4.6075107,-74.20602,'DIAGONAL 74A SUR No.. 78I-19'),(27,4.7093107,-74.1411857,'CALLE 64 No.. 113A-95'),(28,4.6868511,-74.0467378,'AVENIDA CARRERA 9 No. 103-39'),(29,4.6943013,-74.1249111,'CARRERA 98 No. 63-39'),(30,4.6867929,-74.1289939,'AVENIDA EL DORADO No. 96J-60'),(31,4.6027245,-74.0752223,'CARRERA 7 No. 169-65'),(32,4.597887,-74.078944,'CARRERA 78 N BIS B No. 53-39'),(33,4.587291,-74.1253378,'CARRERA 31 No. 38A-51 SUR'),(34,4.7061202,-74.0537033,'AC  127 No. 20-85'),(35,4.673046,-74.1071068,'CARRERA 72 No. 55-41'),(36,4.6231953,-74.1346919,'CARRERA 70B No. 24-08 SUR'),(37,4.5596895,-74.1273618,'CARRERA 53 SUR No. 52B-11'),(38,4.644832,-74.1329564,'CALLE 12 BIS No. 71G-37'),(39,4.7162266,-74.1206088,'CARRERA 110 No. 79-21'),(40,4.7021699,-74.0514581,'AVENIDA 19 No. 122-33'),(41,4.6249367,-74.1040461,'CALLE 14 No. 43-82'),(42,4.6416237,-74.074279,'CARRERA 21 No. 53-15'),(43,4.5969864,-74.1785591,'AUTOPISTA SUR No. 77 A-18'),(44,4.6266144,-74.2060254,'CARRERA 92 No. 60-90 SUR'),(45,4.757068,-74.0667147,'CALLE 170 No. 64-47'),(46,4.6877604,-74.0833561,'CALLE 80 No. 69 Q-50'),(47,4.6192757,-74.0922819,'CARRERA 32 No. 18-10'),(48,4.6384937,-74.1606964,'CARRERA 86 No. 19 A-50'),(49,4.5681231,-74.127637,'DIAGONAL 49A No. 17-59/89'),(50,4.6771707,-74.1179317,'CALLE 46 A No. 85 A-51'),(51,4.6694096,-74.0943218,'AVENIDA CARRERA 45 No. 235-91');
/*!40000 ALTER TABLE `ubicacionmapa` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'alvaro','al81',21,'alvaruto@gmail.com','4545'),(2,'sebastian','sebaschb',18,'Sebas20_95@hotmail.c','Hola12345'),(3,'sebas','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(4,'nicola','niko',18,'as@sd.chgom','1234547'),(5,'nicola','niko',18,'as@sd.chgom','45587'),(6,'Nicolas','Herrera',18,'nyko07herr@gmail.com','asas'),(7,'Nicolas','Herrera',18,'nyko07herr@gmail.com','12545'),(8,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(9,'Sebastina','Laloca',18,'nyko07herr@gmail.com','12345'),(10,'Herrera','niko',18,'nyko07herr@gmail.com','12345'),(11,'Sebastian','sebaschb',18,'Sebas19_95@hotmail.com','Hola12345'),(12,'hayy','potter',54,'as@sd.chgom','123abc'),(13,'alasas','com4',21,'asass@s.coms','123'),(14,'andres','Alvaruto',21,'alvaruto@gmail.com','abc'),(15,'andres','Alvaruto',21,'alvaruto@gmail.com','abc123'),(16,'anda','Ands',21,'alvaruto@gmail.com5','123'),(17,'Caludia','claudia',45,'al@ss.com','123'),(18,'Alvaro','Alvaruto',21,'alvaruto@gmail.com','abc123'),(19,'Lizeth','Lizz',22,'lnlope@gm.com','1234'),(20,'Juancho','Juanchito',12,'juan@gm.com','asd'),(21,'Andres','Alvaruto10',21,'al@ss.com','123'),(22,'lucho','lulo25',12,'sebas195fd@hptmail.com','Hola12345'),(23,'perrin','perrote',5,'sebasghfg@hotmail.com','1234'),(24,'Gacet','perroteg',5,'sebas195fd@hptmail.com','12345'),(25,'stevenTGTGTGGT','STRE',22,'jsjs@gmail.com','12345678'),(26,'Kevin','Kevin',18,'kabo@g.c','asas');
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
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
INSERT INTO `vehiculo` VALUES (6,15,'LQC96C',6,'03-11-2017',135,6,1,6,1),(7,15,'LER34A',7,'01-06-2018',100,7,1,7,3),(8,20,'ARD254',8,'15-06-2018',12,8,3,8,2),(9,15,'XXX555',9,'29-07-2018',45,9,1,9,2),(10,1,'RTV45S',10,'07-06-2018',120,10,2,10,1),(11,2,'TRV22A',11,'14-06-2018',150,11,2,11,3),(12,15,'LVP000',12,'01-06-2018',135,12,2,12,1),(13,15,'HGH25A',13,'30-04-2018',200,13,3,13,3),(14,15,'PRU354',14,'30-04-2018',4551,14,2,14,1),(15,4,'PRU001',15,'30-04-2018',14,15,2,15,2),(16,15,'PRU002',17,'05-05-2018',2554,17,2,16,3),(17,15,'PRU004',18,'30-04-2018',8,18,3,17,1),(18,15,'PRU002',19,'14-05-2018',44,19,1,18,3),(19,15,'LER34A',20,'06-05-2018',444,20,1,19,3),(20,15,'LER34A',21,'06-05-2018',444,21,1,20,3),(21,15,'LER34A',22,'06-05-2018',444,22,1,21,3),(22,15,'LER34A',23,'06-05-2018',444,23,1,22,3),(23,15,'LER34A',24,'06-05-2018',444,24,1,23,3),(24,15,'PRU002',25,'14-06-2018',224,25,3,24,3),(25,15,'PRU002',26,'07-06-2018',42,26,2,25,1),(26,15,'PRU002',27,'07-06-2018',42,27,2,26,1),(27,15,'PRU002',28,'13-05-2018',250,28,1,27,1),(28,15,'LER34A',29,'13-05-2018',24,29,1,28,1),(29,15,'LER34A',30,'13-05-2018',24,30,1,29,1),(30,15,'LER34A',31,'13-05-2018',24,31,1,30,1),(31,21,'WDE25S',32,'05-05-2018',12132,32,3,31,2),(32,15,'PRU002',33,'04-06-2018',2554,33,1,32,1),(33,15,'ABC132',34,'29-05-2018',232,34,1,33,1),(34,15,'ABC124',35,'28-05-2018',345,35,1,34,1),(35,15,'ABC132',36,'29-05-2018',343234,36,1,35,1),(36,22,'CMP354',37,'11-07-2018',2000,37,1,36,1),(37,23,'BMS456',38,'12-06-2018',12000,38,2,37,1),(38,6,'ABS345',39,'02-06-2018',343,39,1,38,1),(39,6,'DMN562',40,'10-06-2018',232,40,1,39,1),(40,25,'SER345',41,'20-06-2018',23,41,2,40,1),(41,25,'ABC132',42,'12-06-2018',76,42,1,41,1),(42,26,'HBZ287',43,'15-05-2018',5,43,3,42,1);
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

-- Dump completed on 2018-06-13 13:24:57
