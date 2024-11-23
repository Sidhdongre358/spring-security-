//package com.example.controller;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SpringSecurityConttroller {
//
//    @PreAuthorize("hasRole('USER')")
//    @GetMapping("/api/user")
//    public String helloUser() {
//        return "Hello, User!";
//    }
//
//    @PreAuthorize("hasRole('ADMIN')")
//    @GetMapping("/api/admin")
//    public String helloAdmin() {
//        return "Hello, Admin!";
//    }
//}
