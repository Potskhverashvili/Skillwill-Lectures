package com.example.Lecture26.excaption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;


@AllArgsConstructor
@Getter
public enum ErrorMessages {

    USER_NOT_FOUND("User Not Found", HttpStatus.NOT_FOUND);

    private final String message;
    private final HttpStatus httpStatus;
}
