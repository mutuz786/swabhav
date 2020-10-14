/* clustered index */ 

create table score(id integer primary key,stud varchar(20),coll varchar(20),cgpa float);
insert into score values(104,'murtaza','MGM',7.0);
insert into score values(106,'gaurav','MGM',5.8);
insert into score values(103,'sagar','KJSE',6.2);
select * from score;

/* non clustered index */ 

create table score(id integer primary key,stud varchar(20),coll varchar(20),cgpa float);
insert into score values(104,'murtaza','MGM',7.0);
insert into score values(106,'gaurav','MGM',5.8);
insert into score values(103,'sagar','KJSE',6.2);
create  index NCV on score(stud,coll);
select * from score where stud='murtaza' and coll='MGM';