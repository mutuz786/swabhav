select * from student;
select * from stud_log;
drop table stud_log;
delete from student;

create table stud_log(log_info varchar(100),count integer);

insert into stud_log values('insertion',0);
insert into stud_log values('deletion',0);
insert into stud_log values('updation',0);

create trigger addLogs
before insert
on student
for each row 
update stud_log set stud_log.count=stud_log.count+1 where log_info='insertion';


create trigger delLogs
before delete
on student
for each row 
update stud_log set stud_log.count=stud_log.count+1 where log_info='deletion';


create trigger updlogs
before update
on student
for each row 
update stud_log set stud_log.count=stud_log.count+1 where log_info='updation';


insert into student values(4,'murtaza','mumbai',7.12,12,101);
