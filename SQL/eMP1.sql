use swabhav;
SELECT * FROM EMP;

--All Employee by ascending order of salary
SELECT * 
FROM EMP 
ORDER BY SAL ASC;

--display employee details "Scott"
SELECT *
FROM EMP 
WHERE ENAME='SCOTT';

--display employee in dept number 10
SELECT *
FROM EMP 
WHERE DEPTNO=10;

--display employee in dept 10 and 20
SELECT * 
FROM EMP 
WHERE DEPTNO=10 OR DEPTNO=20;

--DISPLAY EMPLOYEE WHOSE NAME ENDS WITH 'n'
SELECT ENAME 
FROM EMP 
WHERE ENAME 
LIKE '%N';

--display all employees in dept 10 and manager
SELECT * FROM 
EMP WHERE  
DEPTNO=10 AND JOB='MANAGER';

--display all employees whose commision is null
SELECT * 
FROM EMP 
WHERE COMM IS NULL;

--display annual ctc of all emp
SELECT ENAME,
SUM((SAL*12)) 
AS 'ANNUAL CTC' 
FROM EMP;

--display all employees who has same salary of scott
SELECT * 
FROM EMP 
WHERE SAL IN
(SELECT SAL 
FROM EMP 
WHERE ENAME='SCOTT');

--display all employees who workS in same dept of scott
SELECT * 
FROM EMP 
WHERE DEPTNO IN
(SELECT DEPTNO 
FROM EMP 
WHERE ENAME='SCOTT');

--TOP 5 SALARIED EMPLOYEE
SELECT * 
FROM EMP 
ORDER BY SAL DESC 
LIMIT 5;
 
--second highest salaried employee in employee
SELECT MAX(SAL)
 FROM EMP
  WHERE SAL < ( SELECT MAX(SAL) 
FROM EMP);

--sum of salaries of all employee
SELECT SUM(SAL) 
FROM EMP;

--display current date
SELECT CURDATE() 
AS 'CURRENT DATE';

--count number of employees
SELECT COUNT(ENAME)
FROM EMP;

--department wise number of employee
SELECT COUNT(DEPTNO)
AS COUNT,DEPTNO 
FROM EMP 
GROUP BY DEPTNO;

--job wise number of employees
SELECT COUNT(JOB)
AS COUNT,JOB 
FROM EMP 
GROUP BY JOB;

--department wise and job wise employee
SELECT DEPTNO "Department No", JOB, 
COUNT(JOB) "Total Employees" 
FROM  EMP 
GROUP BY  DEPTNO,JOB;

--number of departments having count>2
SELECT DEPTNO "Department No", JOB, 
COUNT(JOB) "Total Employees" 
FROM  EMP 
GROUP BY  DEPTNO,JOB
HAVING COUNT(JOB)>=2;

--DISPLAY EMP NAME DEPT NAME
SELECT DEPT.DNAME,EMP.ENAME
FROM EMP    Full outer JOIN DEPT;

SELECT DEPT.DNAME,EMP.ENAME
FROM DEPT
JOIN EMP;

SELECT E.ENAME, D.DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO (+) = D.DEPTNO;

SELECT EMP.ENAME,DEPT.DNAME
FROM EMP
LEFT JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;

--DISPLAY ALL DEPTS WITH No employees IF ANY


--department wise number of employee