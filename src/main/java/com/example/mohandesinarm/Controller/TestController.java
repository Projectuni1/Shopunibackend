package com.example.mohandesinarm.Controller;


import com.example.mohandesinarm.DBEntity.ItemEntity;
import com.example.mohandesinarm.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/demo-controller")
@RequiredArgsConstructor
public class TestController {

    private final ItemRepository repository;
    @GetMapping("/getitems")
    List<ItemEntity> getItems(){
        return repository.findAll();
    }

    @GetMapping("/sayBye")
    String getTest2(){
        return "bye";
    }
}
