package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.*;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create-user")
    public Map<String, Object> createUser(@RequestParam String source, @RequestBody User user) {
        Map<String, Object> response = new HashMap<>();
        response.put("source", source);
        response.put("username", user.getUserName());
        response.put("age", user.getAge());
        response.put("message", "User created successfully");
        return response;
    }

    @PostMapping("/create-new-user")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User created successfully with username: " + user.getUserName();
    }
}
