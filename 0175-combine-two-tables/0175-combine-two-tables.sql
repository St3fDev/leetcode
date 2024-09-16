# Write your MySQL query statement below
SELECT p.firstName, p.lastName, ad.city, ad.state
FROM Person as p
LEFT JOIN Address as ad
ON p.personId = ad.personId;