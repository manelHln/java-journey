package com.banksys.auth;

import com.banksys.account.Account;

import java.util.Random;

public class User {
    private String userName;
    private String pseudo;
    private String password;
    private int userId;
    private Account userAccount = new Account();

    public Account getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Account userAccount) {
        this.userAccount = userAccount;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public User(){
        this.setUserId(new Random().nextInt(100));
        this.userAccount.setUserId(this.userId);
        this.userAccount.setBalance(0.00);
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void displayUserInfo(){
        System.out.println("************************************");
        System.out.printf("Full name: %s \n", this.getUserName());
        System.out.printf("Pseudo: %s \n", this.getPseudo());
        System.out.printf("Account Balance: %f \n", this.getUserAccount().getBalance());
        System.out.println("************************************");
    }
}
