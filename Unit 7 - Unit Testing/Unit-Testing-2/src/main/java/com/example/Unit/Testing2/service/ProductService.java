package com.example.Unit.Testing2.service;

import com.example.Unit.Testing2.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final DataService dataService;

    public Product getProductObject(Integer productNumber){
        String productName = dataService.getProductName(productNumber);
        return new Product(productName, "Fruit");
    }
}
