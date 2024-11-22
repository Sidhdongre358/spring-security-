package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityConttroller {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello this is for learning spring security module ";
    }
}
