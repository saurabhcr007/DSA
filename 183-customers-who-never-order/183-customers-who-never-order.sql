select c.name as Customers from customers c  left join orders s on c.id = s.customerid where 
s.customerid is null