package com.example.Lecture_25.mappers;

import com.example.Lecture_25.model.product.ProductEntity;

import com.example.Lecture_25.model.product.ProductResponse;
import com.example.Lecture_25.model.user.UserEntity;
import com.example.Lecture_25.model.user.UserRequest;
import com.example.Lecture_25.model.user.UserResponse;


public class UserMapper {

    public static UserEntity mapRequestToEntity(UserRequest userRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequest.getName());
        userEntity.setUserName(userEntity.getUserName());
        return userEntity;
    }


    public static UserResponse mapEntityToResponse(UserEntity userEntity){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(userEntity.getId());
        userResponse.setName(userEntity.getName());
        userResponse.setUserName(userEntity.getUserName());
        return userResponse;
    }

}
