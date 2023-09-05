package com.banksys.auth;

public interface ModifyInfo {
    public void changeUserInfo(User user, String pseudo, String password);
    public void changeUserInfo(User user, String password);
}
