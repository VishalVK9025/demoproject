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

    @GetMapping("/say")
    public String stay(){
        return "Welcome to spring boot for rapid development";
    }

    @GetMapping("/ask")
    public String tay(){
        return "Interested candids can book a slot";
    }

//    I hope this entire course will provide a strong foundation

}









































