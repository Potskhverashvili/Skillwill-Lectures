package com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.mapper;

import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.entity.MyUser;
import com.example.Lecrture_31_JDBC_Secured_Pre_And_Post_Autorize.model.request.UserRegistrationRequest;

public class UserMapper {

    public static MyUser mapToEntity(UserRegistrationRequest request) {

        MyUser myUser = new MyUser();
        myUser.setFirstName(request.getFirstName());
        myUser.setLastName(request.getLastName());
        myUser.setUsername(request.getUsername());
        return myUser;

    }
}
