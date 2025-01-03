package com.example.Unit.Testing2;

import com.example.Unit.Testing2.service.CalculationService;
import com.example.Unit.Testing2.service.PrinterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculateServiceTest {

    private CalculationService calculationService;

    @Mock
    PrinterService printerService;

    @BeforeEach
    void setUp() {
        calculationService = new CalculationService(printerService);
    }


    // Test for whole functionality
    @Test
    void testSumMethod_printing_working_correctly() {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        calculationService.calculateSum(3, 4);
        Mockito.verify(printerService).printMessage(captor.capture());
        String value = captor.getValue();
        Assertions.assertEquals("7", value);
    }


    // Test for returned result
    @Test
    void testSumMethod_returned_value_is_correct() {
        Integer i = calculationService.calculateSum(5, 5);
        Assertions.assertEquals(10, i);
    }

}
