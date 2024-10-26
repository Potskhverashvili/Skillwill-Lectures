package com.example.Lecture24_GobalExceptionHandling.exceptions;

public class ExceptionBody {

    String message;
    Long timestamp;


    public ExceptionBody(String message, Long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public ExceptionBody(String message) {
        this.message = message;
    }

    // Getters and Setters


    public String getMessage() {
        return message;
    }

}
