CREATE TABLE academic(
   academic_registration INT PRIMARY KEY,
   academic_password VARCHAR2(50) NOT NULL,
   academic_name VARCHAR2(50) NOT NULL
);

CREATE TABLE organizer(
   organizer_registration INT PRIMARY KEY,
   organizer_password VARCHAR2(50) NOT NULL,
   organizer_name VARCHAR2(50) NOT NULL
);

CREATE TABLE campus(
   id_campus INT PRIMARY KEY,
   organizer_registration INT NOT NULL,
   campus_name VARCHAR(50) NOT NULL,
   field VARCHAR(200) NOT NULL,
   FOREIGN KEY (organizer_registration) REFERENCES organizer(organizer_registration) 
);

CREATE TABLE event(
   id_event INT PRIMARY KEY,
   id_campus INT NOT NULL,
   start_date DATE,
   end_date DATE,
   event_details VARCHAR2(500),
   event_folder BLOB,
   avg_event_rate FLOAT DEFAULT 0,
   FOREIGN KEY (id_campus) REFERENCES campus(id_campus) 
);

CREATE TABLE event_academic(
   id_event_academic INT PRIMARY KEY,
   academic_registration INT NOT NULL,
   id_event INT NOT NULL,
   event_precense VARCHAR2(10),
   FOREIGN KEY (academic_registration) REFERENCES academic(academic_registration),
   FOREIGN KEY (id_event) REFERENCES event(id_event)
);


CREATE TABLE event_review(
   id_event_review INT PRIMARY KEY,
   academic_registration INT NOT NULL,
   id_event INT NOT NULL,
   review_date DATE,
   review_text VARCHAR2(500),
   event_rate FLOAT DEFAULT 0,
   FOREIGN KEY (academic_registration) REFERENCES academic(academic_registration),
   FOREIGN KEY (id_event) REFERENCES event(id_event)
);

CREATE TABLE certificate(
   id_certificate INT PRIMARY KEY,
   organizer_registration INT NOT NULL,
   academic_registration INT NOT NULL,
   certificate_file BLOB,
   FOREIGN KEY (academic_registration) REFERENCES academic(academic_registration),
   FOREIGN KEY (organizer_registration) REFERENCES organizer(organizer_registration) 
);

CREATE TABLE event_organizer(
   id_event_organizer INT PRIMARY KEY,
   organizer_registration INT NOT NULL,
   id_event INT NOT NULL,
   FOREIGN KEY (organizer_registration) REFERENCES organizer(organizer_registration),
   FOREIGN KEY (id_event) REFERENCES event(id_event)
);










