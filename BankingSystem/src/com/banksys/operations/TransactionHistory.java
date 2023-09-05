package com.banksys.operations;

import java.util.ArrayList;

public class TransactionHistory {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransactionToHistory(Transaction transaction){
        this.transactions.add(transaction);
    }
}
