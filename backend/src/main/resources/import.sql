 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 1','FURB','2022-03-10','2022-03-10','Detalhes Evento 1', 'Folder Evento 1', 0.0);
 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 2','Uniasselvi','2022-03-09','2022-03-10','Detalhes Evento 2', 'Folder Evento 2', 0.0);
 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 3','lugar nenhum','2022-03-08','2022-03-10','Detalhes Evento 3', 'Folder Evento 3', 0.0);
 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 4','lugar nenhum','2022-03-07','2022-03-10','Detalhes Evento 4', 'Folder Evento 4', 0.0);
 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 5','','2022-03-06','2022-03-10','Detalhes Evento 5', 'Folder Evento 5', 0.0);
 insert into event (name, campus, start_Date, end_Date, details, folder, score) values ('Evento 6','IFCE Bahia','2022-03-11','2022-03-12','Detalhes Evento 6', 'Folder Evento 6', 0.0);

 insert into academic (name, password) values ('Jonny Quest','1234');
 insert into academic (name, password) values ('Bill Murray','1234');
 insert into academic (name, password) values ('Bruce Yoaness','1234');
 insert into academic (name, password) values ('Dave Cobrero','1234');
 insert into academic (name, password) values ('Steve Guttemberg','1234');

insert into organizer (name, password) values ('Organizador 1','1234');
insert into organizer (name, password) values ('Organizador 2','1234');
insert into organizer (name, password) values ('Organizador 3','1234');
insert into organizer (name, password) values ('Organizador 4','1234');
insert into organizer (name, password) values ('Organizador 5','1234');
insert into organizer (name, password) values ('Organizador 6','1234');

insert into events_academics (academic_id, event_id) values (1,1);
insert into events_academics (academic_id, event_id) values (5,1);
insert into events_academics (academic_id, event_id) values (5,2);
insert into events_academics (academic_id, event_id) values (2,3);
insert into events_academics (academic_id, event_id) values (4,3);
insert into events_academics (academic_id, event_id) values (2,4);
insert into events_academics (academic_id, event_id) values (3,4);
insert into events_academics (academic_id, event_id) values (4,4);
insert into events_academics (academic_id, event_id) values (1,5);
insert into events_academics (academic_id, event_id) values (3,5);
insert into events_academics (academic_id, event_id) values (4,5);

insert into events_organizers (organizer_id, event_id) values (1,1);
insert into events_organizers (organizer_id, event_id) values (3,1);
insert into events_organizers (organizer_id, event_id) values (5,1);
insert into events_organizers (organizer_id, event_id) values (3,2);
insert into events_organizers (organizer_id, event_id) values (3,4);

--insert into event_review (date) values ('2022-03-18');
--insert into event_review (date, rate) values ('2022-03-18', 8);
-- insert into event_review (date, rate, text) values ('2022-03-18', 8,'teste de teste');
--insert into event_review (date, rate, text, academic_id) values ('2022-03-18', 8, 'teste de teste', 1)
insert into event_review (date, text, rate_value, academic_id, event_id) values ('2022-03-18', 'teste de teste', 8, 1, 1)
insert into event_review (date, text, rate_value, academic_id, event_id) values ('2022-03-20', 'avaliação dia 20/3', 9, 2, 1)
