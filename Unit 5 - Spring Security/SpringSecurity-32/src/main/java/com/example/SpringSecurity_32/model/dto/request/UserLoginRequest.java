package com.example.SpringSecurity_32.model.dto.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String userName;
    private String password;
}
