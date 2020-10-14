create table customer(id integer primary key,name varchar(20),address varchar(20));
create table orderc(id integer primary key,deliverydate date,custid integer,foreign key(custid) references customer(id));
create table product(id integer primary key,name varchar(20),price integer,discount float);
create table lineitem(orderid integer,quantity integer,prodid integer,foreign key(orderid) references orderc(id),foreign key(prodid) references product(id));

insert into customer values(1,'murtaza','mumbai');
insert into customer values(2,'jay','mumbai');
insert into customer values(3,'vinit','pune');
insert into customer values(4,'pawan','delhi');

insert into orderc values(1,'2020-11-01',2);
insert into orderc values(2,'2021-01-03',2);
insert into orderc values(3,'2020-12-13',1);
insert into orderc values(4,'2020-08-01',3);

insert into product values(1,'pen',10,0.2);
insert into product values(2,'book',100,0.1);
insert into product values(3,'bag',250,0.3);
insert into product values(4,'ruler',30,0.1);

insert into lineitem values(2,2,1);
insert into lineitem values(3,5,3);
insert into lineitem values(1,3,3);
insert into lineitem values(4,2,4);


/* query1:- find all order details of customer who have name="abc"; */

select * from customer,orderc,lineitem,product 
where customer.id=orderc.custid 
and orderc.id=lineitem.orderid 
and lineitem.prodid=product.id 
and customer.name="jay";


/* query 2:- print details of all customers which is sorted by there order no */

select custid,customer.name,address,orderid,orderc.deliverydate 
from customer,orderc,lineitem,product 
where customer.id=orderc.custid 
and orderc.id=lineitem.orderid 
and lineitem.prodid=product.id 
order by deliverydate;


/* query3:- find total cost of each customer who have ordered; */

select customer.name,sum((price*quantity)- discount*(price*quantity)) as 'total amount' from customer,orderc,lineitem,product 
where customer.id=orderc.custid 
and orderc.id=lineitem.orderid 
and lineitem.prodid=product.id 
group by custid;


/* query4:- find all the pending delevery order and customer; */

select * from customer,orderc 
where customer.id=orderc.custid 
and deliverydate > curdate();


/* query5:- find all the product customer has ordered; */

select customer.name,product.name from customer,orderc,lineitem,product 
where customer.id=orderc.custid 
and orderc.id=lineitem.orderid 
and lineitem.prodid=product.id 
order by customer.name;