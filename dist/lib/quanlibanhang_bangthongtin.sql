-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlibanhang
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `bangthongtin`
--

DROP TABLE IF EXISTS `bangthongtin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bangthongtin` (
  `STT` int NOT NULL,
  `LoaiHang` varchar(45) NOT NULL,
  `MaMatHang` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `GioiTinh` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Size` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Mau` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NoiSanXuat` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `SoLuongNhap` int NOT NULL,
  `SoLuongBan` int NOT NULL,
  `SoLuongCon` int NOT NULL,
  `GiaNhap` int NOT NULL,
  `GiaBan` int NOT NULL,
  `TienVon` int NOT NULL,
  `TienBan` int NOT NULL,
  `TienLoi` int NOT NULL,
  `ThoiGian` varchar(100) NOT NULL,
  PRIMARY KEY (`MaMatHang`,`ThoiGian`,`STT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bangthongtin`
--

LOCK TABLES `bangthongtin` WRITE;
/*!40000 ALTER TABLE `bangthongtin` DISABLE KEYS */;
INSERT INTO `bangthongtin` VALUES (1,'??o Croptop','AC1','N???','M','??en','Trung Qu???c',1000,42,958,50000,100000,50000000,900000,0,'15:58:19 6/1/2021'),(11,'??o Croptop','AC2','N???','M','H???ng','H??n Qu???c ',250,0,250,120000,250000,30000000,0,0,'10:52:53 10/1/2021'),(5,'??o d??i tay','ADT1','N???','M','X??m','?????c',600,15,585,60000,120000,36000000,360000,0,'21:4:43 8/1/2021'),(9,'??o d??i tay','ADT2','Nam','S','X??m','M???',120,0,120,60000,120000,7200000,0,0,'16:58:6 9/1/2021'),(4,'??o Hoodie','AH1','N???','M','X??m','?????c',600,30,570,60000,120000,36000000,720000,0,'21:4:34 8/1/2021'),(6,'??o kho??t len','AKL1','N???','L','V??ng','Ph??p',500,9,491,150000,320000,75000000,2880000,0,'16:56:30 9/1/2021'),(12,'??o kho??t len','AKL2','Nam','XS','Xanh l??','Vi???t Nam',1000,4,996,100000,190000,100000000,760000,0,'11:26:15 10/1/2021'),(8,'??o len','AL1','N???','M','H???ng','H??n Qu???c ',250,0,250,120000,250000,30000000,0,0,'16:57:31 9/1/2021'),(10,'??o s?? mi','ASM1','N???','M','V??ng','Nh???t B???n',400,0,400,110000,160000,44000000,0,0,'16:58:39 9/1/2021'),(13,'??o thun','AT1','Nam','M','Xanh l??','Vi???t Nam',2,0,2,10000,20000,20000,0,0,'10:46:15 22/1/2021'),(2,'??o Vest','AV1','Nam','M','X??m','Vi???t Nam',500,54,446,150000,350000,75000000,3850000,2100000,'15:58:54 6/1/2021'),(7,'G??ng tay','GT1','Nam','L','??en','Nh???t B???n',100,5,95,30000,55000,3000000,275000,0,'16:57:1 9/1/2021'),(3,'V??y d??i','VD1','N???','M','X??m','?????c',600,46,554,60000,120000,36000000,1560000,0,'15:59:27 6/1/2021');
/*!40000 ALTER TABLE `bangthongtin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-18 22:10:20
