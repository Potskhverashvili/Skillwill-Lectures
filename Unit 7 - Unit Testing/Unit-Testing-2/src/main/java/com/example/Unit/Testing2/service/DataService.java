package com.example.Unit.Testing2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {
    public String getProductName(int a) {
        if (a == 1) {
            return "Peach";
        } else if (a == 2) {
            return "Apple";
        } else {
            return "Default";
        }
    }
}
