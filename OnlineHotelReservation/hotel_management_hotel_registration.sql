-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel_management
-- ------------------------------------------------------
-- Server version	8.0.16

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
-- Table structure for table `hotel_registration`
--

DROP TABLE IF EXISTS `hotel_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hotel_registration` (
  `hotel_id` int(11) NOT NULL,
  `hotel_room_no` varchar(45) DEFAULT NULL,
  `hotel_room_floor` varchar(45) DEFAULT NULL,
  `hotel_user_name` varchar(45) DEFAULT NULL,
  `hotel_user_card_id` varchar(45) DEFAULT NULL,
  `hotel_user_phone` varchar(45) DEFAULT NULL,
  `hotel_user_status` varchar(45) DEFAULT NULL,
  `hotel_user_country` varchar(45) DEFAULT NULL,
  `hotel_user_city` varchar(45) DEFAULT NULL,
  `hotel_user_price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel_registration`
--

LOCK TABLES `hotel_registration` WRITE;
/*!40000 ALTER TABLE `hotel_registration` DISABLE KEYS */;
INSERT INTO `hotel_registration` VALUES (1,'1001','1','JACK','123133231232312','132343232','Available','CHINA','SHANGHAI','400'),(2,'1002','1','DAVID','4343432443432432','12121233','Available',NULL,NULL,NULL),(3,'2005','2','AUSTIN','6546546546546546','1232234333','Not Available',NULL,NULL,NULL),(4,'4002','4','JJ','6464634564354','75675475465','Available',NULL,NULL,NULL);
/*!40000 ALTER TABLE `hotel_registration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-16 22:31:46
