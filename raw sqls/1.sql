select avg(value), item.id
from rate
inner join item on item.id = rate.item_id
where DATEDIFF(NOW(),rate.createdAt) < 7
group by item.id