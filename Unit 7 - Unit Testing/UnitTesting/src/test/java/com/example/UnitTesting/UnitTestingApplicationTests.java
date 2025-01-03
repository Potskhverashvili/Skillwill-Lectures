package com.example.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingApplicationTests {
    private MyService myService = new MyService();

    @Test
    void sumTest() {
        double result = myService.divide(6.0, 2.0);
        Assertions.assertEquals(3.0, result);
    }

    @Test
    void exceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> myService.divide(2, 0));
    }
}
