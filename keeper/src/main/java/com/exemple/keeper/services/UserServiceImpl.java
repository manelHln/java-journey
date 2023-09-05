package com.exemple.keeper.services;

import com.exemple.keeper.entities.User;
import com.exemple.keeper.exceptions.KeeperAuthException;
import com.exemple.keeper.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User loginUser(String email, String password) throws KeeperAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstname, String lastname, String pseudo, String email, String password) throws KeeperAuthException {
        Pattern pattern = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?");
        if(email != null) email = email.toLowerCase();
        if(!pattern.matcher(email).matches()){
            throw new KeeperAuthException("Provide a valid email!!");
        }
        int count = userRepository.getCountByEmail(email);
        if(count > 0){
            throw new KeeperAuthException("Email is already used!!");
        }
        int userId = userRepository.create(firstname, lastname, pseudo, email, password);
        return userRepository.findById(userId);
    }
}
