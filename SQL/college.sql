CREATE TABLE  college1    
(id varchar(10),    
 name varchar(50),    
 location varchar(50)
);    

use swabhav;
INSERT INTO college1(id,name,location) VALUES ("1", 'SRES','Kopargaon');  

INSERT INTO college1(id,name,location) VALUES ("2", 'VJTI','Mumbai');  

INSERT INTO college1(id,name,location) VALUES ("3", 'IIT','Madras');  

INSERT INTO college1(id,name,location) VALUES ("4", 'SGGS','Nanded');  
  
SELECT * from college1;

ALTER TABLE college1
ADD PRIMARY KEY (id);

ALTER TABLE college  
MODIFY id varchar(10);

drop table college;

select *from users;

ALTER TABLE users
ADD CONSTRAINT FK_collegeID
FOREIGN KEY (college_id)
REFERENCES college1(id);
