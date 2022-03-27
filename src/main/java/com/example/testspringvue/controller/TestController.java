package com.example.testspringvue.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    public String test() {
        return "1234";
    }
}
