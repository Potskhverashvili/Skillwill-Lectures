package com.example.GlobalExceptionHandlingLecture.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;


//TODO Write custom error messages
@Getter
public enum ErrorMessage {

    NOT_VALID_NUMBER("Number Is Not Valid", HttpStatus.BAD_REQUEST);

    private final String message;
    private final HttpStatus httpStatus;

    ErrorMessage(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
