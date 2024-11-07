package com.example.SpringSecurity_32.service;

import com.example.SpringSecurity_32.model.dto.request.UserProductsRequest;
import com.example.SpringSecurity_32.model.dto.response.UserProductsResponse;
import com.example.SpringSecurity_32.model.entity.MyUser;
import com.example.SpringSecurity_32.model.entity.Products;
import com.example.SpringSecurity_32.model.entity.UserProducts;
import com.example.SpringSecurity_32.repository.ProductRepository;
import com.example.SpringSecurity_32.repository.UserProductsRepository;
import com.example.SpringSecurity_32.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersProductsService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final UserProductsRepository userProductsRepository;


    public long create(UserProductsRequest userProductsRequest) {
        // Set Logged-in user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long principal = (Long) authentication.getPrincipal();
        MyUser user = userRepository.findById(principal)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));


        // Find Product
        Products product = productRepository.findById(userProductsRequest.getProductId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));

        // Save product in wish list
        UserProducts userProducts = new UserProducts();
        userProducts.setProducts(product);
        userProducts.setUser(user);
        return userProductsRepository.save(userProducts).getId();

    }

    public List<UserProductsResponse> getWishList() {
        return userProductsRepository.findAll().stream().map(x -> new UserProductsResponse(x)).toList();
    }

    public Page<UserProductsResponse> findAll(Integer page, Integer size) {
        return userProductsRepository.findAll(PageRequest.of(page, size)).map(x -> new UserProductsResponse(x));
    }

}
