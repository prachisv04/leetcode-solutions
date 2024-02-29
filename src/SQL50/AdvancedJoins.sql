-- 1731 The Number of Employees which reports to Each Employee (Manager)
SELECT E2.employee_id , E2.name, COUNT(E1.reports_to) AS reports_count , round(AVG(E1.age)) AS average_age
FROM EMPLOYEES E1 , EMPLOYEES E2
WHERE E1.REPORTS_TO = E2.EMPLOYEE_ID
GROUP BY E2.employee_id
order by E2.employee_id;


-- 1789. Primary Department for each employee
select employee_id , department_id from employee 
group by employee_id
having count(employee_id)=1
union
select employee_id , department_id from employee 
where primary_flag='Y'
order by employee_id;

-- 610. Triangle Judgement
select x , y , z , 
    case 
    when x+y <= z then 'No' 
    when x+z <= y then 'No'
    when y+z <= x then 'No'
    else 'Yes'
    end as triangle
from Triangle;

-- 180. Consecutive Numbers
select distinct L1.num as ConsecutiveNums
from Logs L1 , Logs L2 , Logs L3
where (L1.id + 1 = L2.id and L2.id+1=L3.id) and ( L1.num = L2.num and L2.num=L3.num );
        -- or
with cte as (
    select num,
    lead(num,1) over() num1,
    lead(num,2) over() num2
    from logs

)
select distinct num ConsecutiveNums from cte where (num=num1) and (num=num2)

-- 1164. Product Price in Given date
select distinct product_id, 10 as price from Products where product_id not in(select distinct product_id from Products where change_date <='2019-08-16' )
union 
select product_id, new_price as price from Products where (product_id,change_date) 
in (select product_id , max(change_date) as date from Products where change_date <='2019-08-16' 
group by product_id)


-- 1204. Last Person to fit in Bus
with cte as (
    select person_id , person_name , weight ,
    sum(weight) over(order by turn) as rolling_sum
    from Queue
)
select person_name from cte where rolling_sum <=1000 order by rolling_sum desc limit 1;

-- 1907. Count Salary Categories
(select 
"Low Salary" as category,
(select count(*)  from Accounts where income < 20000) as accounts_count)
union all
(select 
"Average Salary" as category,
(select count(*) from Accounts where income >= 20000 and income <= 50000) as accounts_count)
union all 
(select 
"High Salary" as category,
(select count(*) from Accounts where income > 50000) as accounts_count)

