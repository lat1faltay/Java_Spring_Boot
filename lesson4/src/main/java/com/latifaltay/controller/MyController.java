package com.latifaltay.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api")
public class MyController {

    @GetMapping("/message1/{message}")
    public String getMyMessageWithVariable(@PathVariable(name = "message") String message){
        return "Your message is : " + message;
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message") String message){
        return "Your message is : " + message;
    }


}
