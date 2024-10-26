package com.example.Lecture_25.model.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserResponse {

    @NotNull(message = "id can not be null")
    private Long id;

    @NotBlank(message = "name cannot be blank!")
    @Size(min = 2, max = 26, message = "name should be between 2-26!")
    private String name;


    @NotBlank(message = "userName cannot be blank!")
    @Size(min = 6, max = 32, message = "userName should be between 2-26!")
    private String userName;


    // ------------------------------ Setters and Getters ------------------------------
    public @NotNull(message = "id can not be null") Long getId() {
        return id;
    }

    public void setId(@NotNull(message = "id can not be null") Long id) {
        this.id = id;
    }

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
