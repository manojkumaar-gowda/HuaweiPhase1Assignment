create table students(id integer PRIMARY key AUTOINCREMENT,name varchar(50) NOT NULL,age INTEGER NOT NULL, mobile_number VARCHAR(11), registration_number VARCHAR(10) NOT NULL, year_of_batch INTEGER, UNIQUE(registration_number));

create table teachers(id integer PRIMARY key AUTOINCREMENT,name varchar(50) NOT NULL, domain varchar(40) not NULL,department varchar(20) not NULL);


INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Peyton List",19,"7853694127","22IT047",2022);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Harry",18,"08642359186","21CS049",2021);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Bebe Rexha",17,"6383452127","22EE015",2023);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Halsey",18,"06425896153","21ME196",2021);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Shawn",19,"07536241053","22BM075",2022);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Bieber",19,"08634529753","21IS045",2021);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Alex",19,"09562067538","22RA035",2021);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Khalid",19,"7568234862","21AE123",2021);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Drake",19,"9997586754","22CI121",2022);
INSERT into students(name,age,mobile_number,registration_number,year_of_batch) VALUES ("Weekend",18,"6583275862","21EC111",2023);



INSERT into teachers(name,domain,department) values ("Robert","Web technology","IT");
INSERT into teachers(name,domain,department) values ("Mary","Digital Logics","ECE");
INSERT into teachers(name,domain,department) values ("John","Software Engineering","CSE");
INSERT into teachers(name,domain,department) values ("Shawn","Automation and machine vision","EI");
INSERT into teachers(name,domain,department) values ("Riley","Android app technology","CSE");
INSERT into teachers(name,domain,department) values ("Susan","Nano technology","Physics");
INSERT into teachers(name,domain,department) values ("Mathew","Circuits","ECE");
INSERT into teachers(name,domain,department) values ("Michael","HealthCare Technologies","BME");
INSERT into teachers(name,domain,department) values ("Michaela","Artificial Intelligence","IT");
INSERT into teachers(name,domain,department) values ("William","Data Science","IT");


select * from students where year_of_batch = 2022
select * from teachers where department = "CSE"

UPDATE students set mobile_number = "8563429654" where registration_number = "22IT047";
UPDATE students set age = 20 where registration_number = "22BM075";
UPDATE students set year_of_batch = 2022 where registration_number = "21IS045";


delete from teachers where name = "Robert";
delete from teachers where name = "Mary";
delete from teachers where name = "William";

select * from students;
select * from teachers;

