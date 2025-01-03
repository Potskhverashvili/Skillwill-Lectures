package com.example.Unit.Testing2;

import com.example.Unit.Testing2.model.Product;
import com.example.Unit.Testing2.service.DataService;
import com.example.Unit.Testing2.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
class UnitTesting2ApplicationTests {

    private ProductService productService;

    @Mock
    private DataService dataService;

    @BeforeEach
    void setUp() {
        productService = new ProductService(dataService);
    }

    @Test
    void testGetProduct() {
        Mockito.when(dataService.getProductName(1)).thenReturn("Apple");
        Product productObject = productService.getProductObject(1);
        Assertions.assertEquals("Apple", productObject.getProductName());
        Assertions.assertEquals("Fruit", productObject.getProductType());
    }

    // ------------- Test for arguments --------------
    @Test
    void test_dataservice_takes_valid_arguments() {
        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);
        productService.getProductObject(5);
        Mockito.verify(dataService).getProductName(captor.capture());
        Integer value = captor.getValue();
        Assertions.assertEquals(5, value);
    }
}
