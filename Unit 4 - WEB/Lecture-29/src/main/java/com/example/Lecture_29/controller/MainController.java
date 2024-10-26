package com.example.Lecture_29.controller;

import com.example.Lecture_29.security.CustomAuthentication;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/login")
    public String login(
            @RequestParam("userName") String userName,
            @RequestParam("password") String password,
            HttpServletRequest request
    ){
        if (userName.equals("user") && password.equals("password")){
            HttpSession session = request.getSession();
            session.setAttribute("isAuthenticated", Boolean.TRUE);
            session.setAttribute("userName", userName);
            session.setAttribute("role", "USER");

            System.out.println("login - Controller");
        }
        return "Success";
    }


    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello - Controller");
        SecurityContext context = SecurityContextHolder.getContext();
        CustomAuthentication authentication = (CustomAuthentication) context.getAuthentication();
        return authentication.getName();
    }

}
