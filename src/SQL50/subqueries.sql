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

-- 