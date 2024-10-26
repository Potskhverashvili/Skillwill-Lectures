package com.example.Lecture_25.controller;

import com.example.Lecture_25.model.product.ProductEntity;
import com.example.Lecture_25.model.product.ProductRequest;
import com.example.Lecture_25.model.product.ProductResponse;
import com.example.Lecture_25.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> productResponse(
            @RequestParam("userId") Long userId,
            @RequestBody @Valid ProductRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(userId, request));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> view (@PathVariable("productId") Long productId){
        return ResponseEntity.status(HttpStatus.OK).body(productService.view(productId));
    }

    @GetMapping("/findById")
    public ProductEntity findById(@RequestParam Long id){
        return productService.findById(id);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> delete(@PathVariable("productId") Long productId){
        productService.delete(productId);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
