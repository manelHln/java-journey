package com.banksys.auth;

import com.banksys.bank.Bank;
import java.util.Scanner;

public class Auth implements Logout, Login, CreateAccount, AuthVerification, ModifyInfo
{
    @Override
    public void logoutUser() {
        Bank.setCurrentUser(null);
    }
    @Override
    public Boolean checkUserInfo(String pseudo, String password) {
        User toLogin = Bank.findUser(pseudo);
        return toLogin.getPassword().equals(password);
    }
    @Override
    public void initLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your credentials to proceed!!");
        System.out.println("Type your pseudo!");
        String pseudo = sc.nextLine();
        System.out.println("Enter your password!");
        String password = sc.nextLine();
        this.loginUser(pseudo, password);
    }

    @Override
    public void loginUser(String pseudo, String password){
        if(checkUserInfo(pseudo, password)){
            User toLogin = Bank.findUser(pseudo);
            Bank.setCurrentUser(toLogin);
        }
    }

    @Override
    public void initAccountCreation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Complete your information to proceed!");
        System.out.println("Enter your full name!");
        String fullName = sc.nextLine();
        System.out.println("Choose a pseudo!!");
        String pseudo = sc.nextLine();
        System.out.println("Choose a password!!");
        String password = sc.nextLine();
        this.createAccount(fullName, pseudo, password);
    }

    @Override
    public void createAccount(String username, String pseudo, String password){
        User newUser = new User();
        newUser.setUserName(username);
        newUser.setPseudo(pseudo);
        newUser.setPassword(password);
        Bank.addNewUser(newUser);
        Bank.setCurrentUser(newUser);
    }

    @Override
    public void changeUserInfo(User user, String pseudo, String password) {

    }

    @Override
    public void changeUserInfo(User user, String password) {

    }
}
