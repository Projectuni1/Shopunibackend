DELETE order_item
FROM order_item
JOIN [order] ON order_item.order_id = [order].order_id
WHERE orders.customer = '<replace-with-val>';
