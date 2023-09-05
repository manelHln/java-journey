package com.banksys.Exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(){
        super("Insufficient account balance!! Please credit your account and try again!");
    }
}
