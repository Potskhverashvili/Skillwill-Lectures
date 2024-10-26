package com.example.Lecture26.excaption;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;


@EqualsAndHashCode(callSuper = true)
@Data
public class CustomException extends RuntimeException {

    private String  message;
    private HttpStatus httpStatus;

    public CustomException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public CustomException(ErrorMessages errorMessages){
        this.message = errorMessages.getMessage();
        this.httpStatus = errorMessages.getHttpStatus();
    }
}
