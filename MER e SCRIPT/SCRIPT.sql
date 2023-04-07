  CREATE TABLE "EDUCAMEET"."EVENT" 
   (	
    "ID" NUMBER(19,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"CAMPUS" VARCHAR2(255 CHAR), 
	"DETAILS" VARCHAR2(255 CHAR), 
	"END_DATE" DATE, 
	"FOLDER" VARCHAR2(255 CHAR), 
	"NAME" VARCHAR2(255 CHAR), 
	"SCORE" FLOAT(53), 
	"START_DATE" DATE
   ) ;

  CREATE TABLE "EDUCAMEET"."PARTICIPANTE" 
   (	
    "ID" NUMBER(19,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"EMAIL" VARCHAR2(255 CHAR), 
	"NAME" VARCHAR2(255 CHAR), 
	"PASSWORD" VARCHAR2(255 CHAR), 
	"TIPO" VARCHAR2(255 CHAR)
   ) ;

  CREATE TABLE "EDUCAMEET"."EVENT_REVIEW" 
   (	"ID" NUMBER(19,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"RATE_VALUE" FLOAT(53), 
	"REVIEW_DATE" DATE, 
	"TEXT" VARCHAR2(255 CHAR), 
	"EVENT_ID" NUMBER(19,0), 
	"PARTICIPANTE_ID" NUMBER(19,0)
   ) ;

  CREATE TABLE "EDUCAMEET"."ROLE" 
   (	
    "ID" NUMBER(19,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"ROLE" VARCHAR2(255 CHAR)
   ) ;
   
  Insert into EDUCAMEET.ROLE (ID,ROLE) values ('1','ROLE_ADMIN');
  Insert into EDUCAMEET.ROLE (ID,ROLE) values ('2','ROLE_ACADEMICO');
  Insert into EDUCAMEET.ROLE (ID,ROLE) values ('3','ROLE_ORGANIZADOR');

  CREATE TABLE "EDUCAMEET"."PARTICIPANTE_ROLE" 
   (	
    "PARTICIPANTE_ID" NUMBER(19,0), 
	"ROLE_ID" NUMBER(19,0)
   ) ;

  CREATE TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" 
   (	
    "EVENT_ID" NUMBER(19,0), 
	"PARTICIPANTE_ID" NUMBER(19,0)
   ) ;

  CREATE UNIQUE INDEX "EDUCAMEET"."UK_B6K3SIT220SKTC8JKFT8JI968" ON "EDUCAMEET"."PARTICIPANTE" ("EMAIL") 
  ;

  ALTER TABLE "EDUCAMEET"."EVENT" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."EVENT" MODIFY ("SCORE" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."EVENT" ADD PRIMARY KEY ("ID")
  USING INDEX  ENABLE;

  ALTER TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" MODIFY ("EVENT_ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" MODIFY ("PARTICIPANTE_ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" ADD PRIMARY KEY ("EVENT_ID", "PARTICIPANTE_ID")
  USING INDEX  ENABLE;

  ALTER TABLE "EDUCAMEET"."EVENT_REVIEW" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."EVENT_REVIEW" MODIFY ("RATE_VALUE" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."EVENT_REVIEW" ADD PRIMARY KEY ("ID")
  USING INDEX  ENABLE;

  ALTER TABLE "EDUCAMEET"."ROLE" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."ROLE" ADD PRIMARY KEY ("ID")
  USING INDEX  ENABLE;

  ALTER TABLE "EDUCAMEET"."PARTICIPANTE_ROLE" MODIFY ("PARTICIPANTE_ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."PARTICIPANTE_ROLE" MODIFY ("ROLE_ID" NOT NULL ENABLE);

  ALTER TABLE "EDUCAMEET"."PARTICIPANTE" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "EDUCAMEET"."PARTICIPANTE" ADD PRIMARY KEY ("ID")
  USING INDEX  ENABLE;
  ALTER TABLE "EDUCAMEET"."PARTICIPANTE" ADD CONSTRAINT "UK_B6K3SIT220SKTC8JKFT8JI968" UNIQUE ("EMAIL")
  USING INDEX  ENABLE;

  ALTER TABLE "EDUCAMEET"."EVENT_REVIEW" ADD CONSTRAINT "FK2OFTUXRUMNAOFYVOQGC1KDQB2" FOREIGN KEY ("EVENT_ID")
	  REFERENCES "EDUCAMEET"."EVENT" ("ID") ENABLE;
  ALTER TABLE "EDUCAMEET"."EVENT_REVIEW" ADD CONSTRAINT "FK4R8H3BSM9BCF44EUDBE4FQWSY" FOREIGN KEY ("PARTICIPANTE_ID")
	  REFERENCES "EDUCAMEET"."PARTICIPANTE" ("ID") ENABLE;

  ALTER TABLE "EDUCAMEET"."PARTICIPANTE_ROLE" ADD CONSTRAINT "FKJ9O6R0C5EF7UDT8J1YJQOGKE2" FOREIGN KEY ("ROLE_ID")
	  REFERENCES "EDUCAMEET"."ROLE" ("ID") ENABLE;
  ALTER TABLE "EDUCAMEET"."PARTICIPANTE_ROLE" ADD CONSTRAINT "FKHR5BL8FDSPU0LELMRH8P20P6K" FOREIGN KEY ("PARTICIPANTE_ID")
	  REFERENCES "EDUCAMEET"."PARTICIPANTE" ("ID") ENABLE;

  ALTER TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" ADD CONSTRAINT "FKK29WC94IC1R6HD25K1KO4YULQ" FOREIGN KEY ("PARTICIPANTE_ID")
	  REFERENCES "EDUCAMEET"."PARTICIPANTE" ("ID") ENABLE;
  ALTER TABLE "EDUCAMEET"."PARTICIPANTES_EVENTS" ADD CONSTRAINT "FK3FQ9AARSMA18B4GDDD1G53H8H" FOREIGN KEY ("EVENT_ID")
	  REFERENCES "EDUCAMEET"."EVENT" ("ID") ENABLE;
