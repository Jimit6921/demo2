package com.example.offline;

import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @GetMapping("/")
    public String home() {
        return "Backend is running";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        return "OK";
    }
}
