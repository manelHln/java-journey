package com.exemple.keeper.repositories;

import com.exemple.keeper.entities.User;
import com.exemple.keeper.exceptions.KeeperAuthException;

public interface UserRepository {
    int create(String firstname, String lastname, String pseudo, String email, String password) throws KeeperAuthException;

    User findByEmailAndPassword(String email, String password) throws KeeperAuthException;

    int getCountByEmail(String email) throws KeeperAuthException;

    User findById(int id) throws KeeperAuthException;
}
