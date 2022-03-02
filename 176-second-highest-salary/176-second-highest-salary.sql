select max(s.salary) as SecondHighestSalary from Employee s 
where s.salary < (select max(e.salary) from Employee e)