package com.exemple.keeper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note")
public class NoteController {
    @PostMapping("/")
    public String createNote(){
        return "Note creation";
    }

    @GetMapping(value = "/{userId}")
    public String getUserNote(){
        return "Get authenticated user note";
    }

    @GetMapping("/")
    public String searchNote(){
        return "Searching note...";
    }
}
