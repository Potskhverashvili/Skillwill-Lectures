package com.example.Lecture_25.service;

import com.example.Lecture_25.mappers.ProductMapper;
import com.example.Lecture_25.model.product.ProductEntity;
import com.example.Lecture_25.model.product.ProductRequest;
import com.example.Lecture_25.model.product.ProductResponse;
import com.example.Lecture_25.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final UserService userService;

    public ProductService(ProductRepository productRepository, UserService userService) {
        this.productRepository = productRepository;
        this.userService = userService;
    }

    public ProductResponse create(Long userId, ProductRequest request) {

        ProductEntity productEntity = ProductMapper.mapRequestToEntity(request);
        productEntity.setOwnerUser(userService.findById(userId));
        ProductEntity save = productRepository.save(productEntity);

        return ProductMapper.mapEntityToResponse(save);
    }

    public ProductResponse view(Long productId) {
        ProductEntity productEntity = productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
        return ProductMapper.mapEntityToResponse(productEntity);
    }

    public void delete(Long productId) {
        productRepository.deleteById(productId);
    }

    public void doesProductExist(Long productId) {
        boolean b = productRepository.existsById(productId);
        if (!b) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product does not exist");
        }
    }


    public ProductEntity findById(Long productId){
       return productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));
    }
}
