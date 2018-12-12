http://qa.geeksforgeeks.org/3588/qa.geeksforgeeks.org/3588/employees-who-earn-more-than-their-managers

 Q1) how-to-get-the-employees-with-their-managers
 
 empno | ename |    job    | deptno | mgr  
-------+-------+-----------+--------+------
  7839 | king  | president |     10 |     
  7698 | blake | manager   |     30 | 7839
  
  
 
 SOLUTIONS:
 ---------- 
  select e.ename, m.ename from Employee e innerjoin Employee m on e.empno=m.mgr
  
  SELECT e.ename, e.empno, m.ename as manager, e.mgr FROM emp e, emp m WHERE e.mgr = m.empno;
  
  
 Q2) Employees who earn more than their managers
 
 The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.

 +----+-------+--------+-----------+
| Id | Name  | Salary | ManagerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |
+----+-------+--------+-----------+
Given the Employee table, write a SQL query that finds out employees who earn more than their managers. For the above table, Joe is the only employee who earns more than his manager.

 +----------+
| Employee |
+----------+
| Joe      |
+----------+

SOLUTIONS:
 ---------- 
 
 Select emp.Name from
Employee emp inner join Employee manager
on emp.ManagerId = manager.Id
where emp.Salary > manager.Salary
 
 
 
 
 
 
 
 
 
 
 
 
 

  