package com.theyellowpug.meskit.controller;

import com.theyellowpug.meskit.TestDataRepository;
import com.theyellowpug.meskit.entity.TestData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestDataRepository testDataRepository;

    @GetMapping("/test")
    public String testEndpoint(){
        Random random=new Random();
        return "Works and a random int: "+random.nextInt(10);
    }

    @PostMapping("/")
    public ResponseEntity postData(@RequestParam("text") String text){
        TestData testData= TestData.builder().text(text).build();
        testDataRepository.save(testData);
        return ResponseEntity.ok(text + "saved to db");
    }

    @GetMapping("/")
    public ResponseEntity getData(){
        return ResponseEntity.ok(testDataRepository.findAll());
    }
}
