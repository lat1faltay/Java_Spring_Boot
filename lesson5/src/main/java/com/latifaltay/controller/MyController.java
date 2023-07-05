package com.latifaltay.controller;

import com.latifaltay.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        //int salt = 12345;
        System.out.println("User saved!");
        //System.out.println("Password 1 : " + user.getPassword());
        //user.setPassword(user.getPassword() + salt);
        System.out.println("Password 2 : " + user.getPassword());
        user.setPassword("");
        System.out.println("Password 3 : " + user.getPassword());
        return user;
    }


    @PostMapping("allusers")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All user saved");

        users.forEach(user -> user.setPassword(""));

        return users;
    }


}
