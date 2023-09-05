package com.exemple.keeper.entities;

import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

public class Tag {
    private long id;
    private String tagName;
    @CreatedDate
    private LocalDateTime createdAt;
}
