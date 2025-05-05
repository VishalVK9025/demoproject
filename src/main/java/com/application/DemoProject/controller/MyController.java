package com.application.DemoProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getMessage(){
        return "Hello Vishal";
    }

    @GetMapping("/message")
    public String say(){
        return "Welcome to spring boot";
    }

}









































