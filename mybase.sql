CREATE SEQUENCE service_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 2000
  START 1
  CACHE 1;

CREATE SEQUENCE orders_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 2000
  START 1
  CACHE 1;
  
drop table Service_centr cascade;
drop table User_of_centr cascade;
drop table PROD cascade;
drop table Orders cascade;

create table Service_centr(Number_ int NOT NULL UNIQUE DEFAULT nextval('service_sequence'::regclass), Adress varchar, Name_ varchar(100),
PRIMARY KEY(Number_, Name_)  );
create table User_of_centr(fio varchar(100), phone char(10) UNIQUE, Date_of_birthsday date,
PRIMARY KEY(fio, phone )     );
create table PROD(Name_ varchar, SN char(5), Model varchar(15) CONSTRAINT notnullstr CHECK(Model != ''), 
Date_of_manufacture date, Manufacturer_country varchar(50),
fio varchar(100) , phone char(10), FOREIGN KEY (fio, phone) REFERENCES User_of_centr(fio, phone) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY(SN, Name_, Model)   );
create table  Orders(Number_ int UNIQUE DEFAULT nextval('orders_sequence'::regclass), Date_of_receipt date, Date_of_exec date, Varranty decimal NOT NULL, Type_repair varchar(100),
Price int, fio varchar(100) , phone char(10), Name_PROD varchar /*REFERENCES PROD(Name_)*/, SN_PROD char(5) /*REFERENCES PROD(SN_PROD)*/, 
Number_SC int NOT NULL UNIQUE, Name_SC varchar(100), PRIMARY KEY(Number_, fio, phone, Number_SC, Name_SC),
FOREIGN KEY(fio, phone) REFERENCES User_of_centr(fio, phone) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY(Number_SC, Name_SC) REFERENCES Service_centr(Number_, Name_) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into Service_centr (Number_, Adress, Name_) values (34, 'Centerpoint_31', 'Samsung');
insert into Service_centr (Number_, Adress, Name_) values (21, 'Centerpoint_31', 'Samsung');
insert into Service_centr (Number_, Adress, Name_) values (64, 'Centerpoint_35', 'HP');
insert into Service_centr (Number_, Adress, Name_) values (61, 'Centerpoint_35', 'Sony');
insert into Service_centr (Number_, Adress, Name_) values (62, 'Centerpoint_35', 'Lenovo');

insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Ivanov B.N.', '8913124543', '21.03.1991');
insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Ivanov B.S.', '8913675543', '22.03.1954');
insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Petrov B.N.', '8913124893', '21.03.1981');
insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Simonov B.S', '8913675563', '22.03.1984');
insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Petrov S.K.', '8913454543', '22.05.1988');
insert into User_of_centr(fio, phone, Date_of_birthsday) values ('Simonov D.S.', '8915124543', '22.10.1989');

insert into PROD(Name_,SN, Model,Date_of_manufacture, Manufacturer_country, fio, phone)  
values ('Phone', '45343', 'PH-64', '01.11.2017','Korea', 'Ivanov B.N.', '8913124543' ) ;
insert into PROD(Name_,SN, Model,Date_of_manufacture, Manufacturer_country, fio, phone)  
values ('Phone', '45356', 'PH-34', '01.11.2017','Japan', 'Petrov B.N.', '8913124893' ) ;
insert into PROD(Name_,SN, Model,Date_of_manufacture, Manufacturer_country, fio, phone)  
values ('Tablet', '45323', 'TB-14', '11.11.2014','China', 'Petrov S.K.', '8913454543' ) ;
insert into PROD(Name_,SN, Model,Date_of_manufacture, Manufacturer_country, fio, phone)  
values ('Computer', '45678', 'CS-34', '01.11.2019','USA', 'Petrov B.N.', '8913124893' ) ;
-- insert into PROD(Name_,SN, Model,Date_of_manufacture, Manufacturer_country, fio, phone)  
-- values ('Phone', '45343', 'PH-64', '01.11.2017','China', 'Simonov D.S.', '8915124543' ) ;

insert into Orders(Number_, Date_of_receipt, Date_of_exec, Varranty, Type_repair, Price, fio, phone, Name_PROD, SN_PROD, Number_SC, Name_SC)
values (1256, '12.08.2014', '12.09.2014', 128, 'Motherboard', 1500, 'Ivanov B.N.', '8913124543', 'Phone', '45343', 34, 'Samsung' );
insert into Orders(Number_, Date_of_receipt, Date_of_exec, Varranty, Type_repair, Price, fio, phone, Name_PROD, SN_PROD, Number_SC, Name_SC)
values (1257, '21.08.2014', '30.09.2014', 256, 'Camera', 2500, 'Ivanov B.S.', '8913675543', 'Phone1', '45356', 21 , 'Samsung' );
-- insert into Orders(Number_, Date_of_receipt, Date_of_exec, Varranty, Type_repair, Price, fio, phone, Name_PROD, SN_PROD, Number_SC, Name_SC)
-- values (1258, '14.08.2015', '14.09.2015', 128, 'Processor', 800, 'Petrov B.N.', '8913124893', 'Phone2s', '45343', 64, 'Samsung' );
INSERT INTO Orders (Number_, Date_of_receipt, Date_of_exec, Varranty, Type_repair, Price, fio, phone, Name_PROD, SN_PROD, Number_SC, Name_SC) 
	VALUES (1258, '2014-09-05', '2014-09-26', 124, 'Mouse', 3500, 'Petrov B.N.', '8913124893', 'Computer', '45678', 62, 'Lenovo');


