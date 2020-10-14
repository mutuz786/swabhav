select * from emp;

DELIMITER //
create procedure swabhav.salinc()
begin
update emp set sal = sal+(sal*0.10) where deptno=20;
end//
DELIMITER;

call salinc;

select * from emp;