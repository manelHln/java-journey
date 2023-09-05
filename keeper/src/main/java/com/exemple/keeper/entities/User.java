package com.exemple.keeper.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private long id;
    private String firstname;
    private String lastname;
    private String pseudo;
    private String email;
    private String password;
}
