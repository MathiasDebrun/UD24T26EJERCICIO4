DROP TABLE IF EXISTS `proyecto`;

CREATE TABLE `proyecto` (
  `id` char(4) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `horas` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;


--
-- Dumping data for table `proyecto`
--

LOCK TABLES `proyecto` WRITE;

INSERT INTO `proyecto` VALUES ('1','Java Basics',150),('2','MS SQL',50),('3','VUE',50),('4','Angular',100),('5','BootsTrap',30);

UNLOCK TABLES;

--
-- Table structure for table `cientifico`
--

DROP TABLE IF EXISTS `cientifico`;


CREATE TABLE `cientifico` (
  `id` varchar(8) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ;


--
-- Dumping data for table `cientifico`
--

LOCK TABLES `cientifico` WRITE;

INSERT INTO `cientifico` VALUES ('1234567A','Jose Marín'),('2234567A','Oliver Ferrer'),('3234567A','Joan Tenaud'),('4234567A','Carles Lopez'),('5234567A','Thorsten Fey');

UNLOCK TABLES;

--
-- Table structure for table `asignado_a`
--

DROP TABLE IF EXISTS `asignado_a`;


CREATE TABLE `asignado_a` (
  `id` varchar(8) NOT NULL ,
  `proyecto` char(4) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT id_fk FOREIGN KEY (id) references cientifico(id),
  constraint proyecto_fk Foreign key (proyecto) references proyecto(id)
  );

--
-- Dumping data for table `asignado_a`
--

LOCK TABLES `asignado_a` WRITE;

INSERT INTO `asignado_a` VALUES ('1234567A','1');

UNLOCK TABLES;