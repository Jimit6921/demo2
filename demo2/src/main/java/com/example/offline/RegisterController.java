package com.example.offline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    // 👉 Show register page
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // loads register.html
    }

    // 👉 Handle form submit
    @PostMapping("/register")
    @ResponseBody
    public String register(User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        return "Registration Successful";
    }
}
