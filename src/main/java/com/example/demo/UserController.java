package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.*;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /* writing for swagger doc */
    @PostMapping("/create-user")
    public Map<String, Object> createUser(@RequestBody User user) {
        Map<String, Object> response = new HashMap<>();

        userRepository.save(user);

        response.put("username", user.getUserName());
        response.put("age", user.getAge());
        response.put("message", "User created successfully");
        return response;
    }

    @GetMapping("/get-users")
    public List<User> getUsers(@RequestBody User user) {
        return userRepository.findAll();
    }
}
