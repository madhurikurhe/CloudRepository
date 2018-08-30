CREATE TABLE employee    
(empID int(10),    
 empName varchar(50)
);    

ALTER TABLE employee
ADD PRIMARY KEY (empID);

INSERT INTO employee(empID,empName) VALUES (201, 'Madhu');    

INSERT INTO employee(empID,empName) VALUES (202, 'Varshil');

INSERT INTO employee(empID,empName) VALUES (203, 'Manoj');

select * from employee;

ALTER TABLE employee  
ADD dept_ID int(10)  NULL  
AFTER empName;  

ALTER TABLE employee
ADD CONSTRAINT FK_deptID
 FOREIGN KEY (dept_ID)
REFERENCES department(deptID);

show tables;