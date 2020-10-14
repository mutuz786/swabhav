/* partial Dependency */

create table score(stud varchar(20),coll varchar(20),cgpa float);
insert into score values('murtaza','MGM',7.0);
insert into score values('gaurav','MGM',5.8);
insert into score values('sagar','KJSE',6.2);
select cgpa from score where stud='murtaza' and coll='MGM';
select cgpa from score where stud='murtaza'


/* Transitive Dependency */

create table score(stud varchar(20),coll varchar(20),cgpa float);
insert into score values('murtaza','MGM',7.0);
insert into score values('gaurav','MGM',5.8);
insert into score values('sagar','KJSE',6.2);
select coll from score where stud='murtaza';
select stud from score where coll='MGM';
select cgpa from score where stud='murtaza'