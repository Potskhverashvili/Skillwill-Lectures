package com.example.SpringSecurity_32.service;

import com.example.SpringSecurity_32.model.dto.request.ProductCreatedRequest;
import com.example.SpringSecurity_32.model.dto.response.ProductResponse;
import com.example.SpringSecurity_32.model.entity.MyUser;
import com.example.SpringSecurity_32.model.entity.Products;
import com.example.SpringSecurity_32.repository.ProductRepository;
import com.example.SpringSecurity_32.repository.UserProductsRepository;
import com.example.SpringSecurity_32.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final UserProductsRepository userProductsRepository;

    public Long create(ProductCreatedRequest productCreatedRequest) {

        // Get Logged-in user Id
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        long principal = (long) authentication.getPrincipal();

        // Check in Base  and Get User
        MyUser user = userRepository.findById(principal)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));

        Products product = new Products();
        product.setCreatedBy(user); // Set created user
        product.setProductName(productCreatedRequest.getProductName()); // Set name
        return productRepository.save(product).getId(); // Set id and Save in base

    }

    public void delete(long id){
        userProductsRepository.deleteById(id);
        productRepository.deleteById(id);
        System.out.println("product Deleted");
    }


    public Page<ProductResponse> findAll(Integer page, Integer size){
        return productRepository.findAll(PageRequest.of(page,size)).map(x-> new ProductResponse(x));
    }
}
