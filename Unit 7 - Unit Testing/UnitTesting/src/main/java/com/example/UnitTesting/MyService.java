package com.example.UnitTesting;

import org.springframework.stereotype.Component;

public class MyService {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        MyService myService = new MyService();

        System.out.println(myService.divide(6.0, 0));
    }
}
