package com.example.Lecture_25.mappers;

import com.example.Lecture_25.model.product.ProductEntity;
import com.example.Lecture_25.model.product.ProductRequest;
import com.example.Lecture_25.model.product.ProductResponse;

public class ProductMapper {

    public static ProductEntity mapRequestToEntity(ProductRequest productRequest) {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setName(productRequest.getName());
        productEntity.setCount(productRequest.getCount());
        productEntity.setDescription(productRequest.getDescription());

        return productEntity;
    }

    public static ProductResponse mapEntityToResponse(ProductEntity productEntity) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(productEntity.getId());
        productResponse.setName(productEntity.getName());
        productResponse.setCount(productEntity.getCount());
        productResponse.setDescription(productEntity.getDescription());
        return productResponse;
    }
}
