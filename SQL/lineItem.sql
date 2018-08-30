CREATE TABLE lineItem 
(
lineItemID INT(10),
 quantity int(20),
 prodID int(20)  
);


ALTER TABLE lineItem
ADD PRIMARY KEY (lineItemID);

select * from lineItem;

Insert into lineItem(lineItemID,quantity) values(101,5);
Insert into lineItem(lineItemID,quantity) values(102,7);
Insert into lineItem(lineItemID,quantity) values(103,6);
Insert into lineItem(lineItemID,quantity) values(104,8);

ALTER TABLE lineItem
ADD order_ID int(20)   
AFTER prodID;  

ALTER TABLE lineItem
ADD CONSTRAINT FK_orderID
FOREIGN KEY (order_ID)
REFERENCES order1(orderID);

