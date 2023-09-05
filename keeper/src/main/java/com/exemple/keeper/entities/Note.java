package com.exemple.keeper.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    private long id;
    private String note;
    private long userId;
    private String noteTitle;
    @CreatedDate
    private LocalDateTime createdAt;
}
