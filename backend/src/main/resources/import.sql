alter table participante MODIFY(id generated as identity (start with 1));
alter table event MODIFY(id generated as identity (start with 1));
alter table event_review MODIFY(id generated as identity (start with 1));
alter table ROLE MODIFY(id generated as identity (start with 1));

INSERT INTO ROLE (ROLE) values ('ROLE_ADMIN');
INSERT INTO ROLE (ROLE) values ('ROLE_ACADEMICO');
INSERT INTO ROLE (ROLE) values ('ROLE_ORGANIZADOR');

insert into participante (name, email, tipo, password) values ('Participante 1','email1@teste.com','ACADEMICO','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante_role (participante_id, role_id) values (1,2);

insert into participante (name, email, tipo, password) values ('Participante 2','email2@teste.com','ACADEMICO','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante_role (participante_id, role_id) values (2,2);

insert into participante (name, email, tipo, password) values ('Participante 3','email3@teste.com','ORGANIZADOR','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante_role (participante_id, role_id) values (3,3);

insert into participante (name, email, tipo, password) values ('Participante 4','email4@teste.com','ORGANIZADOR','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante_role (participante_id, role_id) values (4,3);

insert into participante (name, email, tipo, password) values ('Darlan','dcpoffo@gmail.com','ORGANIZADOR','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante_role (participante_id, role_id) values (5,1);

--(TO_DATE('2023-03-01', 'yyyy-mm-dd'))
insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 1','Lugar 1', TO_DATE('2023-04-04','yyyy-mm-dd'),TO_DATE('2023-04-05','yyyy-mm-dd'),'Detalhes Evento 1', 'Folder Evento 1', 0.0);
insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 2','Lugar 2',TO_DATE('2023-04-10','yyyy-mm-dd'),TO_DATE('2023-04-15','yyyy-mm-dd'),'Detalhes Evento 2', 'Folder Evento 2', 0.0);

insert into participantes_events (event_id, participante_id) values (1,1);
insert into participantes_events (event_id, participante_id) values (1,2);
insert into participantes_events (event_id, participante_id) values (1,3);
insert into participantes_events (event_id, participante_id) values (2,2);
insert into participantes_events (event_id, participante_id) values (2,3);

insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia', 8, 1, 1);
insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia 20/3', 7, 1, 2);
insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia 20/3', 10, 1, 3);