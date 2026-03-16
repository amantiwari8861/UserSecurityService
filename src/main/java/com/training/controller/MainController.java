package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/api/v1/user")
    public String user() {
        return "giving all users";
    }
}
