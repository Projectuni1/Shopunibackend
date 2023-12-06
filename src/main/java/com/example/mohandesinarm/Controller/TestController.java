package com.example.mohandesinarm.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/getTest")
    String getTest(){
        return "Salam";
    }

    @GetMapping("/sayBye")
    String getTest2(){
        return "bye";
    }
}
