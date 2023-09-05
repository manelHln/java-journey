package com.exemple.keeper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note_tag")
public class TagResource {
    @PostMapping("/")
    public String createTag(){
        return "Tag creation";
    }

    @GetMapping("/{id}")
    public String getTag(){
        return "Get tag";
    }

}
