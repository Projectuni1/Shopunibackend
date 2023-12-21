select
    item.*,
    category.title,
    supplier_item.discountPercentage,

from supplierItem
inner join item on item.id = supplierItem.item_id
inner join category on category.id = item.category_id
where item.id = 0 --<replace-with-val>
      and supplier_item.is_active = TRUE and
      now() >= supplier_item.from and
      now() <= supplier_item.end