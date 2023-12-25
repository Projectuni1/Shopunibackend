package com.example.mohandesinarm.Controller.Items;


import com.example.mohandesinarm.Controller.Items.Models.*;
import com.example.mohandesinarm.DBEntity.ItemEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping("/item")
    public addItemResponse addItem(@RequestBody addItemRequest request){
        return service.addItem(request);
    }

    @GetMapping("/item")
    public List<ItemEntity> getItems(){
        return service.getItems();
    }


    @PutMapping("/item")
    public UpdateItemResponse updateItem(@RequestBody UpdateItemRequest request){
        return service.updateItem(request);
    }

    @DeleteMapping("/item")
    public DeleteItemResponse deleteItem(@RequestBody int id){
        return service.deleteItem(id);
    }
}
