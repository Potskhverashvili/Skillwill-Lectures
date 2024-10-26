package com.example.Lecture26.response;

import com.example.Lecture26.model.User;
import lombok.Data;

@Data
public class MyUserResponse {
    private String name;
    private String lastName;
    private String email;

    public MyUserResponse(User user) {
        this.name = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }
}
