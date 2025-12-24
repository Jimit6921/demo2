package com.example.offline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {

    @GetMapping("/")
    public String home() {
        return "redirect:/register";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(User user) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        return "Registration Successful";
    }
}
