--------------------------------------------------------
--  Arquivo criado - sexta-feira-fevereiro-17-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EVENTO
--------------------------------------------------------

  CREATE TABLE "EVENTO" 
   (	"IDEVENTO" NUMBER(*,0), 
	"NOMEEVENTO" VARCHAR2(45 BYTE), 
	"DATAINICIO" DATE, 
	"DATATERMINO" DATE, 
	"LOCALEVENTO" VARCHAR2(15 BYTE), 
	"ORGANIZADORES" VARCHAR2(45 BYTE), 
	"DETALHES" VARCHAR2(300 BYTE), 
	"FOLDER" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PARTICIPANTEEVENTO
--------------------------------------------------------

  CREATE TABLE "PARTICIPANTEEVENTO" 
   (	"IDPARTICIPANTE" NUMBER(*,0), 
	"IDEVENTO" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PARTICIPANTES
--------------------------------------------------------

  CREATE TABLE "PARTICIPANTES" 
   (	"IDPARTICIPANTE" NUMBER(*,0), 
	"NUMEROMATRICULA" VARCHAR2(10 BYTE), 
	"SENHA" VARCHAR2(8 BYTE), 
	"NOME" VARCHAR2(45 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
