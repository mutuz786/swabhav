/* Student College Department Professor relationship */

create table college(id integer primary key,cname varchar(20),address varchar(20));
create table department(id integer primary key,dname varchar(20));
create table student(id integer primary key,sname varchar(20),address varchar(20),cgpa float,deptid integer,foreign key(deptid) references department(id),collid integer, foreign key(collid) references college(id));
create table professor(id integer primary key,pname varchar(20),subject varchar(20),deptid integer,foreign key(deptid) references department(id),collid integer, foreign key(collid) references college(id));

insert into college values(101,'IIT', 'mumbai');
insert into college values(102,'VJTI', 'mumbai');
insert into college values(103,'MGM', 'mumbai');
insert into college values(104,'COEP', 'pune');
insert into college values(105,'RVCE', 'banglore');

insert into department values(12,'Computer');
insert into department values(34,'IT');
insert into department values(23,'Mechanical');
insert into department values(27,'Electrical');
insert into department values(73,'EXTC');

insert into student values(1,'murtaza','mumbai',7.3,12,103);
insert into student values(2,'jay','mumbai',6.7,12,102);
insert into student values(3,'vinit','delhi',8.2,34,102);
insert into student values(4,'pawan','delhi',7.8,23,104);
insert into student values(5,'prasad','pune',6.4,27,101);

insert into professor values(1,'bhosle','DBMS',12,103);
insert into professor values(2,'vilas','ML',12,103);
insert into professor values(3,'ravi','AI',34,102);
insert into professor values(4,'vikas','NLP',34,102);
insert into professor values(5,'sachin','DC',23,102);

select * from student s left join professor p on s.deptid=p.deptid order by s.id;