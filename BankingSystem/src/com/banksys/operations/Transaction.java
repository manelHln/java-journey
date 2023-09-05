package com.banksys.operations;

import com.banksys.bank.Bank;
import com.banksys.auth.User;
import com.banksys.validations.ValidateOperation;

public class Transaction implements TransactionOperation, ValidateOperation {
    private String transactionType;
    private double amount;

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void deposit(double amount) {
        User user = Bank.getCurrentUser();
        double userAccountBalance = user.getUserAccount().getBalance();
        user.getUserAccount().setBalance( userAccountBalance + amount);
        user.displayUserInfo();
    }

    @Override
    public void send(double amount, String pseudo) {
        User userToCredit = Bank.findUser(pseudo);
        double userToCreditBalance = userToCredit.getUserAccount().getBalance();
        userToCredit.getUserAccount().setBalance(userToCreditBalance + amount);
        userToCredit.displayUserInfo();
    }


    @Override
    public void withdraw(double amount) {
        User user = Bank.getCurrentUser();
        double userAccountBalance = user.getUserAccount().getBalance();
        user.getUserAccount().setBalance( userAccountBalance - amount);
        user.displayUserInfo();
    }

    @Override
    public boolean validateWithdraw(double amountToWithdraw, double accountBalance) {
        return accountBalance >= amountToWithdraw;
    }

    @Override
    public boolean validateTransfer(double accountBalance, double amountToTransfer) {
        return accountBalance >= amountToTransfer;
    }
}
