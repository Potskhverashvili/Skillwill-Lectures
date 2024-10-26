package com.example.Lecture_25.repositories;

import com.example.Lecture_25.model.comment.CommentEntity;
import com.example.Lecture_25.model.comment.CommentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {


    @Query("""
            select new com.example.Lecture_25.model.comment.CommentResponse(c.id, c.text, c.productEntity.name) from CommentEntity c
            where c.productEntity.id = :productId
            """)
    Page<CommentResponse> findCommentsForProduct(Long productId, Pageable pageable);
}
