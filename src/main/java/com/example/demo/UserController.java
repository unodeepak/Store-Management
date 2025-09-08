package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository UserRepository
    
    @PostMapping("create-user")
    public String postMethodName(@RequestParam String username, @RequestParam int age) {
        
        return "User with username: "+ username + " and age is : " + age;
    }

    @PostMapping("/create-new-user")
    public String createUser(@RequestBody )
    
}
