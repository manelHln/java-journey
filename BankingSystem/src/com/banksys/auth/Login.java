package com.banksys.auth;

import com.banksys.bank.Bank;

import java.util.Scanner;

public interface Login {

    public void initLogin();

    public void loginUser(String pseudo, String password);

}
