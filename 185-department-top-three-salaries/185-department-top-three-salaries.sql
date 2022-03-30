select d1.name as Department ,e1.name as Employee ,e1.salary as Salary 
from employee e1 join Department d1 
on e1.departmentid=d1.id 
where salary>=
    (select salary from 
        (select salary from employee where departmentId=e1.departmentid group by salary order by salary desc limit 3) as topsalary order by salary asc limit 1)