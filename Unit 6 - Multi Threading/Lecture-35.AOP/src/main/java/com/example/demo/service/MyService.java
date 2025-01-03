package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    @MyLogger
    public void doingSomething(String s) {
        System.out.println("My Service Message " + s);
    }
}
