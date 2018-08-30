CREATE TABLE product 
(
id INT(10),
 name VARCHAR(50), 
 cost int(10),
 discount INT(10) 
); 

ALTER TABLE product
ADD PRIMARY KEY (id);

ALTER TABLE product  
MODIFY cost int(20);  

INSERT INTO product(id,name,cost,discount) VALUES (1,'Scanner',1000,10); 
INSERT INTO product(id,name,cost,discount) VALUES (2,'laptop',4000,10); 
INSERT INTO product(id,name,cost,discount) VALUES (3,'Mouse',500,10); 
INSERT INTO product(id,name,cost,discount) VALUES (4,'Printer',2000,10); 


delete from product
where id=1;

select * from product;

ALTER TABLE  product  
CHANGE COLUMN id prodID  
int(10) NOT NULL;  