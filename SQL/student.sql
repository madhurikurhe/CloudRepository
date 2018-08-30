CREATE TABLE student1    
(rollNo int(10),    
 firstName varchar(50),    
 lastName varchar(50), 
 gender varchar(50)   
);    

INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (1, 'Madhu','Unde','Female',7);    

INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (2, 'Varshil','Mehta','Male',7.9);    

INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (3, 'Manoj','Gupta','Male',7);    

INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (4, 'Trisha','Kurhe','Female',7.8);   
INSERT INTO student1(rollNo,firstName,lastName,gender,cgpa) VALUES (5, 'Manoj','Gupta','Male',8.8);   
 

select * from student1;

UPDATE student1  
SET cgpa = 8.5  
WHERE rollNo = 3;

ALTER TABLE student1  
ADD cgpa int(10) NOT NULL  
AFTER gender;  

DELETE from student1
where rollNo=4;

ALTER TABLE student1  
MODIFY collegeID int(10);  
  
ALTER TABLE student1
ADD PRIMARY KEY (rollNO);

ALTER TABLE student1  
ADD collegeID int(10) NOT NULL  
AFTER cgpa;  

ALTER TABLE student1
ADD CONSTRAINT FK_collegeID
FOREIGN KEY (collegeID)
REFERENCES college(id);
