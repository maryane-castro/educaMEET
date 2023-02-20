CREATE DATABASE sistemaEventos;

use sistemaEventos;

CREATE TABLE participantes (
  idParticipante int NOT NULL AUTO_INCREMENT,
  numeroMatricula varchar(10) COLLATE latin1_general_ci NOT NULL,
  senha varchar(8) COLLATE latin1_general_ci NOT NULL,
  nome varchar(45) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (idParticipante));

CREATE TABLE evento (
  idevento int NOT NULL AUTO_INCREMENT,
  NomeEvento varchar(45) NOT NULL,
  dataInicio datetime NOT NULL,
  dataTermino datetime NOT NULL,
  localEvento varchar(15) NOT NULL,
  organizadores varchar(45) NOT NULL,
  detalhes varchar(300) NOT NULL,
  folder varchar(100) NOT NULL,
  PRIMARY KEY (idevento));
  
  CREATE TABLE participanteevento (
  idParticipante int NOT NULL,
  idEvento int NOT NULL,
  KEY idParticipante_fk_idx (idParticipante),
  KEY idEvento_fk_idx (idEvento),
  CONSTRAINT idEvento_fk FOREIGN KEY (idEvento) REFERENCES evento (idevento),
  CONSTRAINT idParticipante_fk FOREIGN KEY (idParticipante) REFERENCES participantes (idParticipante));
 