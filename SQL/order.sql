select *from order1;

CREATE TABLE order1 
(
dateofOrder date,
orderID int(20)
);

insert into order1(dateofOrder,orderID) values('1990-08-24',101);
insert into order1(dateofOrder,orderID) values('1990-08-25',102);
insert into order1(dateofOrder,orderID) values('1990-08-26',103);
insert into order1(dateofOrder,orderID) values('1990-08-27',105);


ALTER TABLE order1
ADD PRIMARY KEY (orderID);

ALTER TABLE order1
ADD custID int(10) NOT NULL  
AFTER orderID;  

ALTER TABLE order1  
MODIFY customerID int(10);  

ALTER TABLE order1  
DROP COLUMN custID;



ALTER TABLE order1
ADD CONSTRAINT FK_customerID
FOREIGN KEY (customerID)
REFERENCES customer(custID);
