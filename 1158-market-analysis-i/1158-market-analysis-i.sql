select u1.user_id as buyer_id, 
    u1.join_date,
    count(case when year(o1.order_date) = 2019 then 1 end) as orders_in_2019 
    from users u1 
    left join orders o1 
    on u1.user_id=o1.buyer_id 
    group by u1.user_id,u1.join_date
    
