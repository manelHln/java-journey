package com.banksys.Exceptions;

public class NoUserFoundException extends Exception{
    public NoUserFoundException(){
        super("User doesn't exist!! Create a new account and retry!!");
    }
}
