package com.example.Lecture_25.repositories;

import com.example.Lecture_25.model.comment.CommentEntity;
import com.example.Lecture_25.model.product.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {



}
