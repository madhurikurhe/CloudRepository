CREATE TABLE department    
(deptID int(10),    
 deptName varchar(50)
);    

ALTER TABLE department
ADD PRIMARY KEY (deptID);

INSERT INTO department(deptID,deptName) VALUES (101, 'IT');    

INSERT INTO department(deptID,deptName) VALUES (102, 'CIVIL');    

INSERT INTO department(deptID,deptName) VALUES (103, 'COMP');    

select * from department;


ALTER TABLE department  
ADD clg_ID int(10)  NULL  
AFTER deptName;  

ALTER TABLE department
ADD CONSTRAINT FK_clgID
 FOREIGN KEY (clg_ID)
REFERENCES college(id);
