package com.example.GlobalExceptionHandlingLecture.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MyCustomException extends RuntimeException {

    private final String msg;
    private final HttpStatus httpStatus;


    public MyCustomException(ErrorMessage errorMessage){
        this.msg = errorMessage.getMessage();
        this.httpStatus = errorMessage.getHttpStatus();
    }
    public MyCustomException(String msg, org.springframework.http.HttpStatus httpStatus) {
        this.msg = msg;
        this.httpStatus = httpStatus;
    }
}
