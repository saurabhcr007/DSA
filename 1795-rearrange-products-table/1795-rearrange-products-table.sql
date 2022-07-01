# Write your MySQL query statement below
select product_id,store1 as store,price from
(SELECT product_id,'store1',store1 as price from Products
union
SELECT product_id,'store2',store2 as price from Products
union
SELECT product_id,'store3',store3 as price from Products
)as T
where price is not NULL
;