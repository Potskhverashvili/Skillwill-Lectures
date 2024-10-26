package com.example.Lecture26.excaption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> globalExceptionHandler(CustomException ex){
        return ResponseEntity.status(ex.getHttpStatus()).body(new ErrorResponse(ex.getMessage(), ex.getHttpStatus()));
    }
}
