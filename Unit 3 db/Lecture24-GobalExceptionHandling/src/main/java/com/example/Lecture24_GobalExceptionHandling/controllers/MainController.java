package com.example.Lecture24_GobalExceptionHandling.controllers;

import com.example.Lecture24_GobalExceptionHandling.model.PersonRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @PostMapping("/save-person")
    public String savePerson(@RequestBody @Valid PersonRequest request) {
       return "Successfully";
    }
}
