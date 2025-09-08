package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GetData {
    @GetMapping("/get-user-data")
    public String getUserData(@RequestParam String params) {
        return "Welcome to Spring boot Deepak";
    }
}
