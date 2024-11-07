package com.example.SpringSecurity_32.mapper;

import com.example.SpringSecurity_32.model.entity.MyUser;
import com.example.SpringSecurity_32.model.dto.request.UserRegistrationRequest;

public class UserMapper {

    public static MyUser mapToEntity(UserRegistrationRequest request) {

        MyUser myUser = new MyUser();
        myUser.setFirstName(request.getFirstName());
        myUser.setLastName(request.getLastName());
        myUser.setUsername(request.getUsername());
        return myUser;

    }
}
