package com.exemple.keeper.repositories;

import com.exemple.keeper.domain.User;
import com.exemple.keeper.exceptions.KeeperAuthException;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepositoryImpl implements UserRepository{


    @Override
    public int create(String firstname, String lastname, String pseudo, String email, String password) throws KeeperAuthException {
        return 0;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws KeeperAuthException {
        return null;
    }

    @Override
    public int getCountByEmail(String email) throws KeeperAuthException {
        return 0;
    }

    @Override
    public User findById(int id) throws KeeperAuthException {
        return null;
    }

}
