package com.example.SpringSecurity_32.repository;

import com.example.SpringSecurity_32.model.entity.UserProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProductsRepository extends JpaRepository<UserProducts, Long> {
}
