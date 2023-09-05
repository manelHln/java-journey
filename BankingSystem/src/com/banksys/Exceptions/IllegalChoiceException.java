package com.banksys.Exceptions;

public class IllegalChoiceException extends Exception{
    public IllegalChoiceException(){
        super("Wrong choice! Please enter a valid option!!!");
    }
}
