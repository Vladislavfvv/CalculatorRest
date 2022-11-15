package com.example.calculatorrest.storage;

import com.example.calculatorrest.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Component("inMemoryUserStorage")
public class InMemoryUserStorage extends Storage<User, Long> {
    List<User> userList = new ArrayList<>();
    private final AtomicLong atomicLong = new AtomicLong();

    @Override
    public User save(User user) {
        user.setId(atomicLong.incrementAndGet());
        userList.add(user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        for (User u : userList) {
            if (u.getId() == id)
                return Optional.of(u);
        }
        return Optional.empty();
    }

    @Override
    public Optional<User> findEntity(String email) {
        for (User u : userList) {
            if (u.getEmail().equals(email)) {
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }
}
