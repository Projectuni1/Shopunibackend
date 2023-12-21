select supplierItem.item_id, order_item.quantity
from order_item
         inner join order on order.id = order_item.order_id
        inner join supplierItem on supplierItem.id = order_item.item_id
where order.status_id = '<replace-with-val>'
  and customer_id = '<replace-with-val>'
-- referred to const value table
-- where order status is shopping cart
-- customer id must fed