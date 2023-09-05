package com.banksys.bank;

import com.banksys.Exceptions.InsufficientBalanceException;
import com.banksys.auth.Auth;
import com.banksys.auth.User;
import com.banksys.operations.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static ArrayList<User> users = new ArrayList<>();
    private static User currentUser = new User();
    private static Bank instance;

    public static  User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User user) {
        currentUser.setUserName(user.getUserName());
        currentUser.setPassword(user.getPassword());
        currentUser.setPseudo(user.getPseudo());
        currentUser.setUserId(user.getUserId());
        currentUser.setUserAccount(user.getUserAccount());
    }

    static {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        user1.setUserName("John Doe");
        user1.setPassword("12345678");
        user1.setPseudo("John");
        user2.setUserName("Elliot Alderson");
        user2.setPassword("12345678");
        user2.setPseudo("Elliot");
        user3.setUserName("Monkey D Luffy");
        user3.setPassword("12345678");
        user3.setPseudo("Luffy");
        user4.setUserName("Roronoa Zoro");
        user4.setPassword("12345678");
        user4.setPseudo("Zoro");
        user5.setUserName("Kiyotaka Ayanokodji");
        user5.setPassword("12345678");
        user5.setPseudo("Kiyotaka");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public void init() throws InsufficientBalanceException {
        boolean isBankActive = false;
        Auth auth = new Auth();
        System.out.println("Welcome!! /n/t Create an account or login to continue \n\t");
        System.out.println("1-Login \n2-Register");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        try{
            switch (choice) {
                case 1 -> {
                    auth.initLogin();
                    isBankActive = true;
                }
                case 2 -> {
                    auth.initAccountCreation();
                    isBankActive = true;
                }
            }
        }catch (IllegalStateException e){
            System.out.println("Unexpected value: " + choice);
        }
        currentUser.displayUserInfo();
        Transaction transaction = new Transaction();

        while (isBankActive){
            System.out.println("Which operation do you want to do today?");
            System.out.println("Deposit (1)");
            System.out.println("Withdraw (2)");
            System.out.println("Transfer (3)");
            System.out.println("Update your information (4)");
            System.out.println("Get your transactions history (5)");
            System.out.println("Logout (6)");
            System.out.println("Quit (7)");

            int operation = sc.nextInt();
            sc.nextLine();

            switch (operation) {
                case 1 -> {
                    System.out.println("How much do you want to deposit?");
                    double depositAmount = sc.nextDouble();
                    transaction.deposit(depositAmount);
                }
                case 2 -> {
                    System.out.println("How much do you want to withdraw?");
                    double withdrawAmount = sc.nextDouble();
                    if(!transaction.validateWithdraw(withdrawAmount, currentUser.getUserAccount().getBalance())){
                        throw new InsufficientBalanceException();
                    }
                    transaction.withdraw(withdrawAmount);
                }
                case 3 -> {
                    System.out.println("Enter the pseudo of the receiver");
                    String receiverPseudo = sc.nextLine();
                    System.out.println("How much do you want to send?");
                    double amountToSend = sc.nextDouble();
                    if(!transaction.validateTransfer(currentUser.getUserAccount().getBalance(), amountToSend)) {
                        throw new InsufficientBalanceException();
                    }
                    transaction.send(amountToSend, receiverPseudo);
                }
                case 4 -> {
                    System.out.println("Update");
                }
                case 5 -> {
                    System.out.println("History");
                }
                case 6 -> {
                    auth.logoutUser();
                }
                case 7 -> {
                    System.out.println("Bye!!");
                    isBankActive = false;
                }
            }
        }
    }

    public static Bank getInstance(){
        if(instance == null){
            return instance = new Bank();
        }
        return instance;
    }


    public static void addNewUser(User user){
        users.add(user);
    }

    public static User findUser(String pseudo){
        for(User user : users){
            if(user.getPseudo().equals(pseudo)){
                return user;
            }
        }
        return null;
    }
}
