
-- if user didnt add any item to the cart at all
INSERT INTO order (customer_id, orderstatus_id)
VALUES (value1, value2, value3, ...);

INSERT INTO order_item  (order_id, supplier_item_id, quantity)
VALUES (value1, value2, value3, ...);