package com.exemple.keeper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/note_tag")
public class NoteTagResource {
    @PostMapping("/")
    public String createNoteTag(){
        return "Note tag creation";
    }

    @GetMapping("/{id}")
    public String getNoteTag(){
        return "Get note tag";
    }

}
