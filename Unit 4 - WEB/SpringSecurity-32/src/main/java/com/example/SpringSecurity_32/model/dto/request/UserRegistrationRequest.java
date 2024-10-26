package com.example.SpringSecurity_32.model.dto.request;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}