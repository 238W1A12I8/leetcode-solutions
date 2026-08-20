# Write your MySQL query statement below
select c.class as class from courses c group by class having count(*)>=5;