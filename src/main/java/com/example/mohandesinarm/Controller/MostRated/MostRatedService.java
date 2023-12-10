package com.example.mohandesinarm.Controller.MostRated;


import com.example.mohandesinarm.Controller.MostRated.Models.MostRatedRequest;
import com.example.mohandesinarm.DBEntity.ItemEntity;
import com.example.mohandesinarm.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MostRatedService {
    @Autowired
    private ItemRepository repository;

    public List<ItemEntity> getMostRated( MostRatedRequest request){
        return repository.findAllMostRated(request.getStartDate() , request.getEndDate());
    }

}
