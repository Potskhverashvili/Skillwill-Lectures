package com.example.Lecture_25.model.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserRequest {

    @NotBlank(message = "name cannot be blank!")
    @Size(min = 2, max = 26, message = "name should be between 2-26!")
    private String name;

    @NotBlank(message = "userName cannot be blank!")
    @Size(min = 2, max = 32, message = "userName should be between 2-26!")
    private String userName;






    // ------------------------------ Setters and Getters ------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
