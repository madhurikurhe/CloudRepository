CREATE TABLE  college    
(id int(10),    
 name varchar(50),    
 location varchar(50)
);    

INSERT INTO college(id,name,location) VALUES (1, 'SRES','Kopargaon');  

INSERT INTO college(id,name,location) VALUES (2, 'VJTI','Mumbai');  

INSERT INTO college(id,name,location) VALUES (3, 'IIT','Madras');  

INSERT INTO college(id,name,location) VALUES (4, 'SGGS','Nanded');  
  
SELECT * from college;

ALTER TABLE college
ADD PRIMARY KEY (id);

ALTER TABLE college  
MODIFY id int(10);