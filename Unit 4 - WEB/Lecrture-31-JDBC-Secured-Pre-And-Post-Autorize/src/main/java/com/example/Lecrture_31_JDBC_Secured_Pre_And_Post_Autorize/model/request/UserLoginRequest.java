package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    String userName;
    String password;
}
