package com.banksys.Exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Wrong password! Try again!");
    }
}
