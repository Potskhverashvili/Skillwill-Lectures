package com.example.Lecture_25.controller;


import com.example.Lecture_25.model.user.UserRequest;
import com.example.Lecture_25.model.user.UserResponse;
import com.example.Lecture_25.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse create(@RequestBody @Valid UserRequest userRequest){
        return userService.createUser(userRequest);
    }

    @GetMapping("/{userId}")
    public UserResponse view (@PathVariable("userId") Long userId){
        return userService.view(userId);
    }
}
