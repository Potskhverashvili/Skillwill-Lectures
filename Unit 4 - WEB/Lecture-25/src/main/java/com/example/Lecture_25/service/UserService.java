package com.example.Lecture_25.service;

import com.example.Lecture_25.mappers.UserMapper;
import com.example.Lecture_25.model.user.UserEntity;
import com.example.Lecture_25.model.user.UserRequest;
import com.example.Lecture_25.model.user.UserResponse;
import com.example.Lecture_25.repositories.ProductRepository;
import com.example.Lecture_25.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ----------------- Create User ------------------------
    public UserResponse createUser(UserRequest userRequest){
        UserEntity userEntity = UserMapper.mapRequestToEntity(userRequest);
        userEntity.setName(userRequest.getName());
        userEntity.setUserName(userRequest.getUserName());
        UserEntity save = userRepository.save(userEntity);
        return UserMapper.mapEntityToResponse(save);
    }


    // ------------------------ Find ---------------------
    public UserEntity findById(Long id) {
        Optional<UserEntity> byId = userRepository.findById(id);
        return byId.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

    public UserResponse view(Long id){
        return UserMapper.mapEntityToResponse(findById(id));
    }
}
