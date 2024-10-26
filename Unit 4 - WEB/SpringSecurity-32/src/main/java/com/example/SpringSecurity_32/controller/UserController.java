package com.example.SpringSecurity_32.controller;

import com.example.SpringSecurity_32.model.dto.request.UserLoginRequest;
import com.example.SpringSecurity_32.model.dto.request.UserRegistrationRequest;
import com.example.SpringSecurity_32.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest userLoginRequest){

        return userService.login(userLoginRequest);
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationRequest request) {

        return userService.register(request);
    }
}
