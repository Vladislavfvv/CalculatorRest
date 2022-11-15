package com.example.calculatorrest.controller;

import com.example.calculatorrest.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/user")
public class UserController {
    private final List<User> userList = new ArrayList<>();
    private final AtomicLong atomicLong = new AtomicLong();

    @PostMapping("/save")
    public User save(@RequestBody User user){
        user.setId(atomicLong.incrementAndGet());
        userList.add(user);
        return user;
    }
    @GetMapping("/findAll")
    public List<User> findAll() {return userList;}

}
