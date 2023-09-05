package com.banksys.account;

import com.banksys.bank.Bank;

public class Account {
    private double balance;
    private int userId;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
