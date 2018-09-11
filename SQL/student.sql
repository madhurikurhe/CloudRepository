CREATE TABLE student    
(roll_no varchar(30),    
 first_name varchar(50),    
 last_name varchar(50), 
 cgpa double,
 college_id varchar( 10)  
);    

select * from college1;
select *from student;
use swabhav;
INSERT INTO student(roll_no,first_name,last_name,cgpa,college_id) VALUES ("1", 'Madhu','Unde',7,"1");    
INSERT INTO student(roll_no,first_name,last_name,cgpa,college_id) VALUES ("2", 'Trisha','Unde',8,"2");    
INSERT INTO student(roll_no,first_name,last_name,cgpa,college_id) VALUES ("3", 'Prasad','Kurhe',9.5,"3");    

delete from student where roll_no=2;
INSERT INTO student(roll_no,first_name,last_name,cgpa,college_id) VALUES ("11", 'Aditi','Talsania',9,"3");    

select *from student;
select * from college where id=2;

INSERT INTO student(roll_no, first_name, last_name, cgpa, college_id) VALUES('2', 'Aditi', 'Talsania', 8.0, '2')

INSERT INTO student(roll_no, first_name, last_name, cgpa, college_id) VALUES('2', 'Kannan', 'Sudhakaran', 8.0, '2')

truncate table student;
drop table college;

INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (2, 'Varshil','Mehta','Male',7.9);    
INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (3, 'Manoj','Gupta','Male',7);    
INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (4, 'Trisha','Kurhe','Female',7.8);   
INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (5, 'Manoj','Gupta','Male',8.8);   
 

select * from student;

Drop table student;

UPDATE student1  
SET cgpa = 8.5  
WHERE rollNo = 3;

ALTER TABLE student1  
ADD cgpa int(10) NOT NULL  
AFTER gender;  

DELETE from student
where roll_no=3;

ALTER TABLE college  
MODIFY id varchar(30);  

drop table college;
  
ALTER TABLE student
ADD PRIMARY KEY (roll_no);

ALTER TABLE student1  
ADD collegeID int(10) NOT NULL  
AFTER cgpa;  

ALTER TABLE student
ADD CONSTRAINT FK_clg
FOREIGN KEY (college_id)
REFERENCES college1(id);


drop table college;

show fields from college;
show fields from student;

select * from student;
select * from college;

CREATE TABLE  college1    
(id varchar(10),    
 name varchar(50),    
 location varchar(50)
);    

create table user1(
username1 varchar(10),
password1 varchar(10)
);

drop table user1;
insert into user1(username1,password1)values("madhu","madhu");

select *from user1;