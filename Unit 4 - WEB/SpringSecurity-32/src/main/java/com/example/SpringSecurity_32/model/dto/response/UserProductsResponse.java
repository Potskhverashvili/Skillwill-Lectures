package com.example.SpringSecurity_32.model.dto.response;

import com.example.SpringSecurity_32.model.entity.UserProducts;
import lombok.Data;

@Data
public class UserProductsResponse {

    private long id;
    private String productName;
    private String userName;
    private String createdBy;

    public UserProductsResponse(UserProducts userProducts){
        this.id= userProducts.getId();
        this.userName = userProducts.getUser().getUsername();
        this.productName= userProducts.getProducts().getProductName();
        this.createdBy= userProducts.getProducts().getCreatedBy().getUsername();
    }
}
