# Write your MySQL query statement below
select S.name from SalesPerson S 
where S.sales_id not in ( select O.sales_id from Orders O 
                          where O.com_id=(select T.com_id from Company T
                          where name='RED'));