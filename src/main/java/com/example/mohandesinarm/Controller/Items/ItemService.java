package com.example.mohandesinarm.Controller.Items;

import com.example.mohandesinarm.Controller.Items.Models.*;
import com.example.mohandesinarm.DBEntity.ItemEntity;
import com.example.mohandesinarm.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private ItemRepository repository;

    public addItemResponse addItem(addItemRequest request){

        var item = ItemEntity.builder()
                .itemDesc(request.getItemDesc())
                .title(request.getTitle())
                .categoryId(request.getCategoryId())
                .image(request.getImage())
                .build();

        try{
            repository.save(item);
            return addItemResponse.builder()
                    .status("Item Add Successfully.")
                    .build();

        }catch (Exception exception){
            return addItemResponse.builder()
                    .status(exception.getMessage())
                    .build();
        }
    }

    public List<ItemEntity> getItems(){
        return repository.findAll();
    }

    public UpdateItemResponse updateItem(UpdateItemRequest request){
        var item = repository.findById(request.getId());
        if (item == null){
            return UpdateItemResponse.builder()
                    .status("Item NotFound")
                    .build();
        }

        item.categoryId = request.getCategoryId();
        item.itemDesc = request.getItemDesc();
        item.title = request.getTitle();
        item.itemDesc = request.getItemDesc();

        try{
            repository.save(item);
            return UpdateItemResponse.builder()
                    .status("Item Added Successfully.")
                    .build();

        }catch (Exception exception){
            return UpdateItemResponse.builder()
                    .status(exception.getMessage())
                    .build();
        }
    }

    public DeleteItemResponse deleteItem(int id){
        var item = repository.findById(id);
        if (item == null){
            return DeleteItemResponse.builder()
                    .status("Item NotFound")
                    .build();
        }

        try{
            repository.delete(item);
            return DeleteItemResponse.builder()
                    .status("Item Deleted Successfully.")
                    .build();

        }catch (Exception exception){
            return DeleteItemResponse.builder()
                    .status(exception.getMessage())
                    .build();
        }
    }
}
