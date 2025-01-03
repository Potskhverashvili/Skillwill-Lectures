package com.example.Unit.Testing2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculationService {

    private final PrinterService printerService;

    public Integer calculateSum(int a, int b) {
        int i = a + b;
        printerService.printMessage(String.valueOf(i));
        return i;
    }

}
