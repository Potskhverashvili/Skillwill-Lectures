package com.example.SpringSecurity_32.model.dto.response;

import com.example.SpringSecurity_32.model.entity.Products;
import lombok.Data;

@Data
public class ProductResponse {
    private long id;
    private String productName;
    private String createdBy;

    public ProductResponse(Products products) {
        this.id = products.getId();
        this.productName = products.getProductName();
        this.createdBy = products.getCreatedBy().getUsername();
    }
}
