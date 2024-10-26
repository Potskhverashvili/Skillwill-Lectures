package com.example.Lecture._8.Spring.Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/login")
    public String login(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "password") String password
    ) {
        System.out.println("This is Login Endpoint");
        if (userName.equals("user1") && password.equals("password1"))
            return "successful login";

        if (userName.equals("user2") && password.equals("password2"))
            return "successful login";

        return "Authentication required";
    }


    @GetMapping("/transaction")
    public String makeTransaction(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "password") String password
    ) {

        System.out.println("This is Transaction Endpoint");
        if (userName.equals("user1") && password.equals("password1"))
            return "Successful Transaction";

        if (userName.equals("user2") && password.equals("password2"))
            return "You don't have access on this method";

        return "You are not authenticated to access this endpoint";
    }
}
