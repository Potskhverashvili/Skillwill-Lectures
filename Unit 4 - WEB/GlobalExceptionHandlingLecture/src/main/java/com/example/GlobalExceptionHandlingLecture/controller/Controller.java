package com.example.GlobalExceptionHandlingLecture.controller;

import com.example.GlobalExceptionHandlingLecture.dto.UserRequest;
import com.example.GlobalExceptionHandlingLecture.exceptions.MyCustomException;
import com.example.GlobalExceptionHandlingLecture.groupAnotations.CreateInt;
import com.example.GlobalExceptionHandlingLecture.service.ServiceClass;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ServiceClass serviceClass;

    @GetMapping("/{id}")
    public String get(@PathVariable int id) {
        return serviceClass.findById(id);
    }

    @PostMapping("/")
    public String post(@RequestBody @Validated(CreateInt.class) UserRequest userRequest){
        return "post";
    }

    @PutMapping("/")
    public String put(@RequestBody @Valid UserRequest userRequest){
        return "update";
    }
}
