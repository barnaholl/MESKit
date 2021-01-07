package com.theyellowpug.meskit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testEndpoint(){
        Random random=new Random();
        return "Works and a random int: "+random.nextInt(10);
    }
}
