-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: reprografia_database
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `estudante`
--

DROP TABLE IF EXISTS `estudante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudante` (
  `id_estudante` int NOT NULL AUTO_INCREMENT,
  `turno` varchar(20) DEFAULT NULL,
  `turma` varchar(20) DEFAULT NULL,
  `curso` varchar(45) DEFAULT NULL,
  `semestre_de_ingresso` varchar(6) DEFAULT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id_estudante`,`id_pessoa`),
  KEY `fk_estudante_pessoa1_idx` (`id_pessoa`),
  CONSTRAINT `fk_estudante_pessoa1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudante`
--

LOCK TABLES `estudante` WRITE;
/*!40000 ALTER TABLE `estudante` DISABLE KEYS */;
INSERT INTO `estudante` VALUES (1,'Diurno','1','BSI','2021.1',1);
/*!40000 ALTER TABLE `estudante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `id_funcionario` int NOT NULL AUTO_INCREMENT,
  `setor` varchar(45) DEFAULT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id_funcionario`,`id_pessoa`),
  KEY `fk_funcionario_pessoa1_idx` (`id_pessoa`),
  CONSTRAINT `fk_funcionario_pessoa1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impressoes`
--

DROP TABLE IF EXISTS `impressoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `impressoes` (
  `id_impressoes` int NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `quantidade_impressa` int DEFAULT NULL,
  `id_pessoa` int DEFAULT NULL,
  PRIMARY KEY (`id_impressoes`),
  KEY `id_pessoa_idx` (`id_pessoa`),
  CONSTRAINT `id_pessoa` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impressoes`
--

LOCK TABLES `impressoes` WRITE;
/*!40000 ALTER TABLE `impressoes` DISABLE KEYS */;
INSERT INTO `impressoes` VALUES (1,'2023-11-13',10,1),(2,'2023-11-13',23,1);
/*!40000 ALTER TABLE `impressoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa` (
  `id_pessoa` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `matricula` varchar(20) NOT NULL,
  PRIMARY KEY (`id_pessoa`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`),
  UNIQUE KEY `matricula_UNIQUE` (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'Wesley','09966655520','20211ITA00B012');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa_tem_impressoes`
--

DROP TABLE IF EXISTS `pessoa_tem_impressoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoa_tem_impressoes` (
  `id_pessoa` int NOT NULL,
  `id_impressoes` int NOT NULL,
  `quantidade_impressa` int DEFAULT NULL,
  `quantidade_disponivel` int DEFAULT NULL,
  `limite_de_impressoes` int DEFAULT NULL,
  PRIMARY KEY (`id_pessoa`,`id_impressoes`),
  KEY `fk_pessoa_has_impressoes_impressoes1_idx` (`id_impressoes`),
  KEY `fk_pessoa_has_impressoes_pessoa1_idx` (`id_pessoa`),
  CONSTRAINT `fk_pessoa_has_impressoes_impressoes1` FOREIGN KEY (`id_impressoes`) REFERENCES `impressoes` (`id_impressoes`),
  CONSTRAINT `fk_pessoa_has_impressoes_pessoa1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`id_pessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_tem_impressoes`
--

LOCK TABLES `pessoa_tem_impressoes` WRITE;
/*!40000 ALTER TABLE `pessoa_tem_impressoes` DISABLE KEYS */;
/*!40000 ALTER TABLE `pessoa_tem_impressoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `tipo_usuario` varchar(45) NOT NULL,
  `id_funcionario` int NOT NULL,
  `id_pessoa` int NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_funcionario`,`id_pessoa`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_usuario_funcionario1_idx` (`id_funcionario`,`id_pessoa`),
  CONSTRAINT `fk_usuario_funcionario1` FOREIGN KEY (`id_funcionario`, `id_pessoa`) REFERENCES `funcionario` (`id_funcionario`, `id_pessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-13 23:13:21
