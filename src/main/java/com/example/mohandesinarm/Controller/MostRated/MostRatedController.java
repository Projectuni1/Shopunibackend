package com.example.mohandesinarm.Controller.MostRated;


import com.example.mohandesinarm.Controller.MostRated.Models.MostRatedRequest;
import com.example.mohandesinarm.DBEntity.ItemEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MostRatedController {

    private final MostRatedService service;

    @GetMapping("/mostrated")
    public List<ItemEntity> getMostRated(@RequestBody MostRatedRequest request){
        return service.getMostRated(request);
    }
}
