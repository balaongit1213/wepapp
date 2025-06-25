package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@SpringBootApplication
//@RestController
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
 @GetMapping("/")
    public String hello() {
        return "home"; // home.html
    }
 
 @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    
 @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("Username".equals(username) && "Password".equals(password)) {
            return "success";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }

}
