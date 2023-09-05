package com.banksys.auth;


public interface CreateAccount {

    public void initAccountCreation();
    public void createAccount(String username, String pseudo, String password);
}
