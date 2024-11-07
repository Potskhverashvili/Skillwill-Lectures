package com.example.Lecture_30_Session_And_jwt.controller;


import com.example.Lecture_30_Session_And_jwt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private final UserService userService;

    @PostMapping("/bla")
    public String loginWithJwt(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("gia") && password.equals("password")) {
            System.out.println("login endpoint");
            return userService.login(username, password);
        }
        return "Invalid Credentials";
    }

    @GetMapping("/hello")
    public String hello() {

        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        return authentication.getName();
    }
}
