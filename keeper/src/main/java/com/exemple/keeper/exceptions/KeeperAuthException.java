package com.exemple.keeper.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class KeeperAuthException extends RuntimeException{
    public KeeperAuthException(String message){
        super(message);
    }
}
