# Write your MySQL query statement below
select Email from Person
Group by Email
Having Count(*) > 1 ;