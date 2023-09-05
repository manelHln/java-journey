package com.exemple.keeper.services;

import com.exemple.keeper.exceptions.KeeperAuthException;
import com.exemple.keeper.entities.User;

public interface UserService {

    User loginUser(String email, String password) throws KeeperAuthException;

    User registerUser(String firstname, String lastname, String pseudo, String email, String password) throws KeeperAuthException;
}
