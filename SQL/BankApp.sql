use swabhav;

CREATE TABLE bankCustomer    
(userid varchar(10),    
  pass varchar(10),    
 balance int(30), 
 creationDate date,
 name varchar( 30)  
);    

ALTER TABLE bankCustomer
ADD PRIMARY KEY (userid);

CREATE TABLE TRANSACTION1(
	userid varchar(10),
	type varchar (10),
	amount int(30),
	transDate date
);

select * from bankCustomer;
select *from transaction1;


ALTER TABLE TRANSACTION1
ADD CONSTRAINT FK_trans
FOREIGN KEY (userid)
REFERENCES bankCustomer(userid);
