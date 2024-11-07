package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.controller;

import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.request.UserLoginRequest;
import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.request.UserRegistrationRequest;
import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest request) {
        return userService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest userLoginRequest) {
        return userService.login(userLoginRequest);
    }


    @PostMapping("/hello")
    @PreAuthorize("hasRole('USER')")
    public String hello() {
        return "Success - Hello";
    }


    @PostMapping("/bye")
    @PreAuthorize("hasRole('USER')")
    public String bye() {
        return "Success";
    }
}
