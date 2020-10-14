/* task2: write a stored procedure name it as salary increment ...
you have to write a logic inside it to increment salary of employees by 10% 
who is working in same dept as of  smith  */

SELECT * FROM emp;

DROP PROCEDURE salincSmith;

DELIMITER //

CREATE PROCEDURE salIncSmith() BEGIN

UPDATE emp SET emp.sal = emp.sal+(emp.sal*0.10)
WHERE emp.deptno IN (
SELECT *
FROM(
SELECT f.deptno
FROM emp f
INNER JOIN emp fa ON f.deptno = fa.deptno
WHERE fa.ename = 'smith')tblTmp);

END//

DELIMITER;

call salincsmith();
SELECT * FROM emp;
