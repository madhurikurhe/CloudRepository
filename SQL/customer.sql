CREATE TABLE customer 
(
custID INT(10),
 name VARCHAR(50)  
);

Insert into customer(custID,name)values(101,"Madhu"); 
Insert into customer(custID,name)values(102,"Trisha"); 
Insert into customer(custID,name)values(103,"Varshil"); 
Insert into customer(custID,name)values(104,"Manoj"); 

select * from customer;

delete from customer
where custID=104;

ALTER TABLE customer
ADD PRIMARY KEY (custID);
