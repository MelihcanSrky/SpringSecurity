package com.sarikaya.security.in_memory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String HelloWorld() {
        return "Hello world from private";
    }

    @GetMapping("/user")
//    @PreAuthorize("hasRole('USER')")
    public String HelloWorldUser() {
        return "Hello world from user private";
    }

    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ADMIN')")
    public String HelloWorldAdmin() {
        return "Hello world from admin private";
    }
}
