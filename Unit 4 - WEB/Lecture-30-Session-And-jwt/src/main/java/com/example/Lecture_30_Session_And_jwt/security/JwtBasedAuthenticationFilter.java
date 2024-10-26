package com.example.Lecture_30_Session_And_jwt.security;

import com.example.Lecture_30_Session_And_jwt.service.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component
@RequiredArgsConstructor
@Qualifier("JwtBasedAuthenticationFilter")
public class JwtBasedAuthenticationFilter extends OncePerRequestFilter {

    private final UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {


        String authenticationHolder = request.getHeader("authorization");

        if(authenticationHolder == null || !authenticationHolder.startsWith("Bearer ")){
            filterChain.doFilter(request,response);
            return;
        }

        String token = authenticationHolder.replace("Bearer ", "");


        Authentication authenticate = userService.authentication(token);
        System.out.println("doFilterInternal - return Authentication");
        SecurityContextHolder.getContext().setAuthentication(authenticate);

        filterChain.doFilter(request,response);
    }
}
