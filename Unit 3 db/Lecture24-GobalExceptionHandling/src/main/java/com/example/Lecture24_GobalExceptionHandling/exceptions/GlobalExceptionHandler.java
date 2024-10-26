package com.example.Lecture24_GobalExceptionHandling.exceptions;

import org.aspectj.apache.bcel.generic.FieldOrMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler()
    protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex) {
        ExceptionBody exceptionBody = new ExceptionBody(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionBody);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Object> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        List<FieldError> fieldErrors = ex.getFieldErrors();

        Map<String, String> errorMessages = new HashMap<>();

        for (FieldError fieldError : fieldErrors) {
            errorMessages.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessages);
    }

    /*@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        List<FieldError> fieldErrors = ex.getFieldErrors();

        // Create a map to store error messages for each field
        Map<String, String> errorMessages = new HashMap<>();
        for (FieldError fieldError : fieldErrors) {
            errorMessages.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        // Return a ResponseEntity with the error messages and a 400 status code
        return ResponseEntity.badRequest().body(errorMessages);
    }*/
}
