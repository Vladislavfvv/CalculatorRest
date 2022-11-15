package com.example.calculatorrest.service;

import com.example.calculatorrest.entity.User;
import com.example.calculatorrest.storage.InMemoryUserStorage;
import com.example.calculatorrest.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    @Qualifier("inMemoryUserStorage")
    private Storage<User, Long> storage;

    public User saveUser(User user){
        storage.save(user);
        return user;
    }

    public Optional<User> findUser(User user){
        return storage.findById(user.getId());
    }

    public Optional<User> findUserByEmail(String email){
        return storage.findEntity(email);
    }
}
