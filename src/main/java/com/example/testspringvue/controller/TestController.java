package com.example.testspringvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "1234";
    }
    public String testA() {
        return "4567";
    }
    public String testB(){
        return "891011";
    }
}
