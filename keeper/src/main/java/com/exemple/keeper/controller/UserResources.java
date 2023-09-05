package com.exemple.keeper.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserResources {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> userDetails){
        return "Register route is working properly";
    }
    @PostMapping("/login")
    public String login(@RequestBody Map<String, Object> userDetails){
        return "Login route is working properly";
    }
}
