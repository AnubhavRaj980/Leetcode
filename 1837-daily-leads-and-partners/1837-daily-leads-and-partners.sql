# Write your MySQL query statement below
select date_id,make_name,count(distinct lead_id) AS unique_leads, Count(distinct partner_id) as unique_partners from DailySales
Group by  date_id, make_name;