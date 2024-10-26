package com.example.Lecture12.model;

import org.springframework.stereotype.Component;

@Component
public class Company {

    private Address address;

    public Company(Address address) {
        this.address = address;
    }
}
