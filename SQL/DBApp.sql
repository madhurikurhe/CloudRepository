select * from users;
DROP Database userdb;

create database UserDB;
use UserDB;
grant all on UserDB.* to 'admin'@'localhost' identified by 'test'; 

CREATE TABLE UserDB.`users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8

use swabhav;

create table student(id int(10),
name varchar(20);

select *from student;

CREATE TABLE student    
(id int(10),    
 name varchar(50)
);    

ALTER TABLE student  
MODIFY id varchar(30) NOT NULL;  

insert into student(id,name) values("1","Madhu");
insert into student(id,name) values("2","Prasad");
insert into student(id,name) values("3","Trisha");
insert into student(id,name) values("4","Aditi");

DELETE FROM student WHERE id="dd";

delete  from student
where id=4;

drop table student;

delete from student where id=null;