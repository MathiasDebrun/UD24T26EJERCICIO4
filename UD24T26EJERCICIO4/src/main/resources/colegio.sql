DROP TABLE IF EXISTS facultad;

CREATE TABLE facultad (
  id int NOT NULL,
  nombre varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
) ;


--
-- Dumping data for table facultad
--

LOCK TABLES facultad WRITE;

INSERT INTO facultad VALUES (1,'Java Basics'),(2,'MS SQL'),(3,'VUE'),(4,'Angular'),(5,'BootsTrap');

UNLOCK TABLES;

--
-- Table structure for table investigador
--

DROP TABLE IF EXISTS investigador;


CREATE TABLE investigador (
  id varchar(8) NOT NULL,
  nomapels varchar(100) NOT NULL,
  facultad int,
  CONSTRAINT facultad_fk FOREIGN KEY (facultad) references facultad(id),
  PRIMARY KEY (id)
) ;


--
-- Dumping data for table investigador
--

LOCK TABLES investigador WRITE;

INSERT INTO investigador VALUES ('1234567A','Jose Marín',1),('2234567A','Oliver Ferrer',2),('3234567A','Joan Tenaud',3),('4234567A','Carles Lopez',4),('5234567A','Thorsten Fey',5);

UNLOCK TABLES;
--
-- Table structure for table equipo
--

DROP TABLE IF EXISTS equipo;


CREATE TABLE equipo (
  id char(4) NOT NULL,
  nomapels varchar(100) NOT NULL,
  facultad int,
  CONSTRAINT facultad_fk2 FOREIGN KEY (facultad) references facultad(id),
  PRIMARY KEY (id)
) ;


--
-- Dumping data for table equipo
--

LOCK TABLES equipo WRITE;

INSERT INTO equipo VALUES ('1','Equipo A',1),('2','Equipo B',2),('3','Equipo C',3),('4','Equipo D',4),('5','Equipo E',5);

UNLOCK TABLES;

--
-- Table structure for table reserva
--

DROP TABLE IF EXISTS reserva;


CREATE TABLE reserva (
  id int NOT NULL ,
  dni varchar(8),
  numserie char(4) NOT NULL,
  comienzo datetime,
  fin datetime,
  PRIMARY KEY (id),
  CONSTRAINT investigador_fk FOREIGN KEY (dni) references investigador(id),
  constraint equipo_fk Foreign key (numserie) references equipo(id)
  );

--
-- Dumping data for table asignado_a
--

LOCK TABLES reserva WRITE;

INSERT INTO reserva VALUES (1,'1234567A','1','2021-03-13 00:00:00','2021-03-14 00:00:00');

UNLOCK TABLES;
