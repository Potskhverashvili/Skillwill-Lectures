package com.example.GlobalExceptionHandlingLecture.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> exceptionHandler(MyCustomException ex){
        return ResponseEntity.status(ex.getHttpStatus()).body(new ErrorResponse(ex.getMsg(), ex.getHttpStatus()));
    }
}
