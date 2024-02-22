-- 620. Not Boring Movies
select * from Cinema 
where id%2 <> 0 and description <> 'boring'
order by rating desc;

-- 1251. Average Selling Price
SELECT p.product_id, IFNULL(round(SUM(p.price*u.units)/sum(u.units),2),0) as average_price
FROM Prices p 
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND 
u.purchase_date BETWEEN p.Start_date and p.end_date
GROUP BY p.product_id;

-- 1075. Project Employees I
select project_id , Round(Avg(experience_years),2) as average_years
from Project P inner join Employee E
on P.employee_id = E.employee_id
group by project_id;

-- 1633. Percentage of Users Attended a Contest
SELECT contest_id,
ROUND(COUNT(DISTINCT user_id) * 100 / (SELECT COUNT(user_id) FROM Users), 2) as percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage desc, contest_id;

-- 1211. Queries Quality and Percentage
select query_name, Round(SUM(rating/position) / Count(query_name),2) as quality , 
Round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(*), 2) as  poor_query_percentage
from Queries 
where query_name is not null
group by query_name;

-- 1193. Monthly Transactions I
select SUBSTR(trans_date,1,7) as month, country,
count(*) as trans_count , 
sum(case when state='approved' then 1 else 0 end) as approved_count,
sum(amount) as trans_total_amount,
sum(case when state='approved' then amount else 0 end) as approved_total_amount
from Transactions
group by month, country;

-- 1174. Immediate Food Delivery II
Select 
    round(avg(order_date = customer_pref_delivery_date)*100, 2) as immediate_percentage
from Delivery
where (customer_id, order_date) in (
  Select customer_id, min(order_date) 
  from Delivery
  group by customer_id
);

-- 550. Game Play Analysis IV
SELECT ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) as fraction
FROM Activity
WHERE (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
IN (SELECT player_id, MIN(event_date) AS first_login FROM ACTIVITY GROUP BY player_id);