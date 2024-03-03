-- 1667. Fix Names in a Table
SELECT user_id, CONCAT(UPPER(LEFT(name, 1)), LCASE(SUBSTRING(name, 2))) AS name
FROM Users
ORDER BY user_id;

-- 1527. Patients With a Condition
SELECT * FROM patients WHERE conditions REGEXP '\\bDIAB1';

-- 196. Delete Duplicate Emails
delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;

-- 176. Second Highest Salary
select Max(E1.salary) as SecondHighestSalary from Employee E1 
where E1.salary < (select Max(E2.salary) from Employee E2 );

                -- or --

select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;

-- 1484. Group Sold Products By The Date
select sell_date , count(distinct product) as num_sold ,
GROUP_CONCAT( DISTINCT product order by product ASC separator ',' ) as products from Activities 
GROUP BY sell_date order by sell_date ASC;

-- 1327. List the Products Ordered in a Period
select p.product_name , sum(o.unit) as unit
from Products p 
join Orders o
on p.product_id = o.product_id
where o.order_date like '2020-02%'
group by p.product_id
having sum(o.unit) >= 100;

-- 1517. Find Users With Valid E-Mails
select user_id , name , mail from Users
where mail regexp '^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$';