package com.banksys.operations;

public interface TransactionOperation {
    void deposit(double amount);
    void send(double amount, String pseudo);
    void withdraw(double amount);
}
