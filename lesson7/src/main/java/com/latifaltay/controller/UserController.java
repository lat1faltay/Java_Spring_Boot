package com.latifaltay.controller;


import com.latifaltay.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable Long userId){
        return null;
    }


}
