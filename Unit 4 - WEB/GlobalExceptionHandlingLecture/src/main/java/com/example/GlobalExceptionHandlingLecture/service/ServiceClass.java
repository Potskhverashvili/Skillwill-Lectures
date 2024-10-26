package com.example.GlobalExceptionHandlingLecture.service;

import com.example.GlobalExceptionHandlingLecture.exceptions.MyCustomException;
import com.example.GlobalExceptionHandlingLecture.exceptions.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public String findById(int id){

        if (id % 2 == 0){
            return "Even Number";
        } else {
            throw  new MyCustomException(ErrorMessage.NOT_VALID_NUMBER);
        }
    }
}
