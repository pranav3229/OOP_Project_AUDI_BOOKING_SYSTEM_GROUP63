CREATE DATABASE  IF NOT EXISTS `userdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `userdb`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: userdb
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `table_user`
--

DROP TABLE IF EXISTS `table_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_user` (
  `idno` mediumint(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `eventname` varchar(45) NOT NULL,
  `ticketprice` double NOT NULL,
  `eventdescription` varchar(45) NOT NULL,
  PRIMARY KEY (`idno`),
  UNIQUE KEY `idno_UNIQUE` (`idno`),
  UNIQUE KEY `eventname_UNIQUE` (`eventname`),
  UNIQUE KEY `ticketprice_UNIQUE` (`ticketprice`),
  UNIQUE KEY `eventdescription_UNIQUE` (`eventdescription`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_user`
--

LOCK TABLES `table_user` WRITE;
/*!40000 ALTER TABLE `table_user` DISABLE KEYS */;
INSERT INTO `table_user` VALUES (0000000001,'changed',22,'asdsad'),(0000000002,'sndjansd',773,'jsnaflikuahbfiuabueifgbluayFJBfhBKHDslfkhb'),(0000000003,'hello',23,'asdasdasd'),(0000000004,'tgrg',34,'d ffk'),(0000000005,'event 1',200,'helloooooo'),(0000000006,'hehe',4545,'klnkln'),(0000000007,'event1',400,'desc'),(0000000009,'event',700,'jknadkjnv'),(0000000011,'halaa',30,'ms,ds'),(0000000016,'bruh',324,'jnkjn jk'),(0000000017,'lll',90,'jkbjhbjh'),(0000000018,'yo',300,' kjnkjfdnsf');
/*!40000 ALTER TABLE `table_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-30 18:55:41
