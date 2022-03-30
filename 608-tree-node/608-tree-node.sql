select id as id , case when p_id is null then 'Root'
     else case when id not in (select distinct p_id from tree where p_id is not null)
     then 'Leaf' else 'Inner'end end as 'type'
      from tree