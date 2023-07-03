package com.lat1faltay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    // localhost:8080/hello

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World!";
    }
 
}
