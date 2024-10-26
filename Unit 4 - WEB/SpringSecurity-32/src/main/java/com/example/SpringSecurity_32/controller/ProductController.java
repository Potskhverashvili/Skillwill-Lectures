package com.example.SpringSecurity_32.controller;


import com.example.SpringSecurity_32.model.dto.request.ProductCreatedRequest;
import com.example.SpringSecurity_32.model.dto.response.ProductResponse;
import com.example.SpringSecurity_32.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Long> create(@RequestBody ProductCreatedRequest productCreatedRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(productCreatedRequest));
    }


    @DeleteMapping("{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<Page<ProductResponse>> findAll(
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size
    ) {
        return ResponseEntity.ok(productService.findAll(page, size));
    }
}
