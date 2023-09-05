package com.banksys.auth;

@FunctionalInterface
public interface AuthVerification {
    Boolean checkUserInfo(String username, String password);
}
