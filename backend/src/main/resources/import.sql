insert into participante (name, email, tipo, password) values ('Participante 1','email1@teste.com','ACADEMICO','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante (name, email, tipo, password) values ('Participante 2','email2@teste.com','ACADEMICO','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante (name, email, tipo, password) values ('Participante 3','email3@teste.com','ORGANIZADOR','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');
insert into participante (name, email, tipo, password) values ('Participante 4','email4@teste.com','ORGANIZADOR','$2a$12$r2kzbWrMIFbl2.J9MAVtVOT83gFpdfz4BMjVlXrv6OdMc7dlvp9qW');

insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 1','Lugar 1','2023-04-04','2023-04-05','Detalhes Evento 1', 'Folder Evento 1', 0.0);
insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 2','Lugar 2','2023-04-10','2023-04-15','Detalhes Evento 2', 'Folder Evento 2', 0.0);

insert into participantes_events (event_id, participante_id) values (1,1);
insert into participantes_events (event_id, participante_id) values (1,2);
insert into participantes_events (event_id, participante_id) values (1,3);
insert into participantes_events (event_id, participante_id) values (2,2);
insert into participantes_events (event_id, participante_id) values (2,3);

insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia', 8, 1, 1);
insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia 20/3', 7, 1, 2);
insert into event_review (text, rate_value, event_id, participante_id) values ('avaliação dia 20/3', 10, 1, 3);


-- insert into participantes_events (event_id, participante_id) values (3,1);
-- insert into participantes_events (event_id, participante_id) values (3,2);
-- insert into participantes_events (event_id, participante_id) values (3,4);




 


-- insert into events_academics (academic_id, event_id) values (5,1);
-- insert into events_academics (academic_id, event_id) values (5,2);
-- insert into events_academics (academic_id, event_id) values (2,3);
-- insert into events_academics (academic_id, event_id) values (4,3);
-- insert into events_academics (academic_id, event_id) values (2,4);
-- insert into events_academics (academic_id, event_id) values (3,4);
-- insert into events_academics (academic_id, event_id) values (4,4);
-- insert into events_academics (academic_id, event_id) values (1,5);
-- insert into events_academics (academic_id, event_id) values (3,5);
-- insert into events_academics (academic_id, event_id) values (4,5);

--insert into event_review (date) values ('2022-03-18');
--insert into event_review (date, rate) values ('2022-03-18', 8);
-- insert into event_review (date, rate, text) values ('2022-03-18', 8,'teste de teste');
--insert into event_review (date, rate, text, academic_id) values ('2022-03-18', 8, 'teste de teste', 1)
-- insert into event_review (date, text, rate_value, academic_id, event_id) values ('2022-03-18', 'teste de teste', 8, 1, 1)
-- insert into event_review (date, text, rate_value, academic_id, event_id) values ('2022-03-20', 'avaliação dia 20/3', 9, 2, 1)
