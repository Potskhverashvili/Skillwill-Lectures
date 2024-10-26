package com.example.Lecture_25.exception;

import java.util.List;

public class ExceptionBody {

    private List<String>  message;

    private Long timeStamp;


    // ---------------- Constructors ----------------
    public ExceptionBody() {
    }

    // ----------------- Setters and Getters -------------------
    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
