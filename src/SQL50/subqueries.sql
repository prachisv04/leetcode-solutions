-- 1978. Employees Whose Manager Left the Company
select employee_id from Employees E 
where E.manager_id not in (select employee_id from Employees)
and E.salary < 30000
order by employee_id;

-- 626. Exchange Seat
SELECT CASE
           WHEN s.id % 2 <> 0 AND s.id = (SELECT COUNT(*) FROM Seat) THEN s.id
           WHEN s.id % 2 = 0 THEN s.id - 1
           ELSE
               s.id + 1
           END AS id,
       student
FROM Seat AS s
ORDER BY id

-- 1341. Movie Rating
select at.name Results from 
(
select u.user_id , u.name ,count(m.movie_id) as movie_count 
from Users u, MovieRating m 
where u.user_id = m.user_id
group by u.user_id
order by movie_count desc, name limit 1
) at

union all

select mrt.title Results from (
    select mr.movie_id , m.title , avg(rating) as rating 
    from MovieRating mr , Movies m
    where mr.movie_id = m.movie_id and created_at like '2020-02%'
    group by m.movie_id
    order by rating desc, m.title asc limit 1
) mrt

-- 1321. Restaurant Growth
WITH Each_Day AS (
    SELECT
        visited_on,
        SUM(amount) amount
    FROM
        Customer
    GROUP BY
        visited_on
)

SELECT 
    c1.visited_on,
    SUM(c2.amount) amount,
    ROUND(AVG(c2.amount), 2) average_amount
FROM
    Each_Day AS c1
JOIN
    Each_Day AS c2 ON 
        c2.visited_on <= c1.visited_on AND
        DATEDIFF(c1.visited_on, c2.visited_on) < 7
GROUP BY
    c1.visited_on
HAVING
    COUNT(*) = 7
ORDER BY
    visited_on ASC;

-- 602. Friend Requests II: Who Has the Most Friends
with base as(
select requester_id id from RequestAccepted
union all
select accepter_id id from RequestAccepted
)
select id, count(*) num from base group by id order by num desc limit 1;

-- 585. Investments in 2016
SELECT ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN (
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(*) > 1
)
AND (lat, lon) IN (
    SELECT lat, lon
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
)

-- 185. Department Top Three Salaries
with report as (
select departmentId, name ,Salary,
DENSE_RANK() over(partition by departmentId order by salary desc ) as rowNum
from Employee
)
select D.name as Department, R.name as Employee, R.salary as Salary
from report R , Department D
where R.departmentId = D.id and R.rowNum <=3
order by Salary desc;

