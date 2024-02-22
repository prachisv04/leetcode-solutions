-- 1378. Replace Employee ID With The Unique Identifier
select uni.unique_id , e.name
from Employees e 
left join EmployeeUNI uni
on e.id = uni.id;

-- 1068. Product Sales Analysis I
select p.product_name , s.year , s.price from sales as s inner join  product as p on s.product_id = p.product_id;
            -- or --
select p.product_name , s.year , s.price from sales as s, product as p where s.product_id = p.product_id;

-- 1581. Customer Who Visited but Did Not Make Any Transactions
select V.customer_id , count(V.visit_id) as count_no_trans
from Visits V 
left join Transactions T 
on V.visit_id = T.visit_id
where T.transaction_id is null
group by V.customer_id;

-- 197. Rising Temperature
select distinct W.id from Weather W, Weather T
where DATEDIFF(W.recordDate, T.recordDate) = 1 and
 W.temperature > T.temperature;

-- 1661. Average Time of Process per Machine
 SELECT 
    s.machine_id, 
    ROUND(AVG(e.timestamp-s.timestamp),3) as processing_time 
FROM Activity s
JOIN Activity e ON e.machine_id=s.machine_id
WHERE s.activity_type='start' AND e.activity_type='end'
GROUP BY s.machine_id;


-- 577. Employee Bonus
SELECT NAME , BONUS
FROM EMPLOYEE
LEFT JOIN BONUS
ON EMPLOYEE.EMPID = BONUS.EMPID
WHERE  BONUS.BONUS < 1000 OR BONUS.BONUS IS NULL;

-- 1280. Students and Examinations
SELECT S.student_id, S.student_name, SUB.subject_name, 
count(E.subject_name) AS attended_exams FROM Students S CROSS JOIN 
Subjects SUB LEFT JOIN Examinations E ON 
S.student_id = E.student_id AND SUB.subject_name = E.subject_name  
GROUP BY S.student_id, S.student_name,SUB.subject_name ORDER BY 
S.student_id, SUB.subject_name;

-- 570. Managers with at Least 5 Direct Reports
SELECT E.name FROM EMPLOYEE E 
LEFT JOIN EMPLOYEE EM 
ON E.id = EM.managerId
group by EM.managerId
having count(EM.id) >=5 ;

-- 1934. Confirmation Rate
select S.user_id , round(avg(if(C.action="confirmed",1,0)),2) as confirmation_rate
from Signups S left join Confirmations C
on S.user_id = C.user_id
group by user_id;