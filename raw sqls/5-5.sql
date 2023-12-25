select sum(supplierItem.price) as OrderTotalCost ,
       order.deliveryCost
from order_item
inner join order on order.id = order_item.order_id
inner join supplierItem on supplierItem.id = order_item.item_id
where order.order_id = '<replace-with-val>'