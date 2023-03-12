 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 1','2022-03-10','2022-03-10','Detalhes Evento 1', 'Folder Evento 1');
 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 2','2022-03-09','2022-03-10','Detalhes Evento 2', 'Folder Evento 2');
 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 3','2022-03-08','2022-03-10','Detalhes Evento 3', 'Folder Evento 3');
 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 4','2022-03-07','2022-03-10','Detalhes Evento 4', 'Folder Evento 4');
 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 5','2022-03-06','2022-03-10','Detalhes Evento 5', 'Folder Evento 5');
 insert into event (name, start_Date, end_Date, details, folder) values ('Evento 6','2022-03-11','2022-03-12','Detalhes Evento 6', 'Folder Evento 6');

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
