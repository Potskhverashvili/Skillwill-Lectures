package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.request;

import lombok.Data;

@Data
public class UserRegistrationRequest {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
