-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: db_banco
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `apellido_paterno` varchar(80) NOT NULL,
  `apellido_materno` varchar(80) NOT NULL,
  `edad` int NOT NULL,
  `email` varchar(80) NOT NULL,
  `nombre_cliente` varchar(80) NOT NULL,
  `id_credito` int DEFAULT NULL,
  `id_debito` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK95mcx0qrwn273uryc5lcyq181` (`id_credito`),
  KEY `FK5r3h1hww950pum0rvyfqr5obj` (`id_debito`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (1,'Ramirez','Hernandez',30,'Hramirez@outlook.com','Jose',1,1),(2,'Prieto','Fuenlabrada',28,'Fuenlabrada5@gmail.com','Arturo',2,2),(3,'Perez','Santos',25,'Perez_Santos@hotmail.es','Javier',3,3),(4,'Perusquia','Romero',18,'Perez_Santos@hotmail.es','Victor',4,4),(5,'Morales','Garcia',22,'Morales@outlook.com','Javier',5,5),(6,'Garcia','Romero',33,'Morales@outlook.com','Julian',6,6),(7,'Solano','Gutierres',35,'GermanG@outlook.com','German',7,7),(8,'Genaro','Angeles',40,'Jazmin_angeles@hotmail.com.mx','Jazmin',8,8),(9,'Rosales','Mendez',48,'RosalesM@outlook.com.mx','Maria',9,9),(10,'Fernandez','Gutierres',52,'Fernandez_Guti@outlook.com','Ana',10,10),(11,'Martinez','Juarez',38,'Juarez_M@outlook.com','Anacleta',NULL,NULL);
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-04 14:37:39
