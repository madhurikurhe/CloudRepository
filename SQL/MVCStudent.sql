use swabhav;
select * from users;

insert into student(id,name) values("","");

alter table student
modify id varchar(10) not null;
Drop table student;

CREATE TABLE student    
(id varchar(10),    
 name varchar(50)

);    

CREATE TABLE `stu1` (                   
          `userid` int(5) NOT NULL,              
          `firstname` varchar(20) DEFAULT NULL,  
          `lastname` varchar(20) DEFAULT NULL,   
          PRIMARY KEY (`userid`)                 
        );
        
        INSERT INTO user1(userid,firstName,lastName) VALUES (1, 'Trisha','Kurhe'); 
        Insert into col1(id,name,location)values(1,'SRES','KOPARGAON');
        Insert into col1(id,name,location)values(2,'VJTI','MATUNGA');
        
        select *from college;
        select *from student1;
        
CREATE TABLE `col1` (                   
          `id` int(5) NOT NULL,              
          `name` varchar(20) DEFAULT NULL,  
          `location` varchar(20) DEFAULT NULL,   
          PRIMARY KEY (`id`)                 
        );
        
ALTER TABLE stu1  
ADD collegeID int(5) NOT NULL  
AFTER lastname;  

select *from stu1;
select * from col1;
   use swabhav;
   select *from users;
   
ALTER TABLE stu1
ADD CONSTRAINT FK_ColID
FOREIGN KEY (collegeID)
REFERENCES col1(id);

select *from college1;
drop table col1;
drop table stu1;
drop table col1;   
   
   
   drop column 'dob';
   select *from users;
   `users`select *from college;