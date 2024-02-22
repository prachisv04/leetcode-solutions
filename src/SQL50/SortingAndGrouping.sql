-- 2356. Number of Unique Subjects Taught by Each Teacher
select teacher_id , count(distinct subject_id) as cnt from Teacher group by teacher_id;

--1141. User Activity for the Past 30 Days I
select activity_date as day, count(distinct user_id) as active_users from Activity
WHERE (activity_date > "2019-06-27" AND activity_date <= "2019-07-27")
group by activity_date;

-- 1070. Product Sales Analysis III
select product_id, year as first_year, quantity, price
from Sales
where (product_id, year) in (select product_id, min(year) from Sales group by product_id);

-- 596. Classes More Than 5 Students
select class from Courses 
group by class
having count(student) >= 5;

-- 1729. Find Followers Count
select user_id , count(follower_id) as followers_count
from Followers
group by user_id
order by user_id;

-- 619. Biggest Single Number
SELECT MAX(num) AS num
FROM ( SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num) = 1) AS unique_numbers;

-- 1045. Customers Who Bought All Products
SELECT customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product);