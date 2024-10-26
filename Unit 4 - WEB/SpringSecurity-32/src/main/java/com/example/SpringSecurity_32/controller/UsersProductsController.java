package com.example.SpringSecurity_32.controller;

import com.example.SpringSecurity_32.model.dto.request.UserProductsRequest;
import com.example.SpringSecurity_32.model.dto.response.UserProductsResponse;
import com.example.SpringSecurity_32.service.UsersProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user-products")
public class UsersProductsController {
    public  final UsersProductsService userProductService;

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<Long> create (@RequestBody UserProductsRequest productsRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(userProductService.create(productsRequest));
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public  ResponseEntity<List<UserProductsResponse>>findAll(){
        return ResponseEntity.ok(userProductService.getWishList());
    }
}