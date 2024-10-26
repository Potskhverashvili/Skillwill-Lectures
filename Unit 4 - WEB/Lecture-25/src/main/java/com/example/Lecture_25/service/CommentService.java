package com.example.Lecture_25.service;

import com.example.Lecture_25.mappers.CommentMapper;
import com.example.Lecture_25.model.comment.CommentEntity;
import com.example.Lecture_25.model.comment.CommentRequest;
import com.example.Lecture_25.model.comment.CommentResponse;
import com.example.Lecture_25.model.product.ProductEntity;
import com.example.Lecture_25.repositories.CommentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final ProductService productService;

    public CommentService(CommentRepository commentRepository, ProductService productService) {
        this.commentRepository = commentRepository;
        this.productService = productService;
    }

    public CommentResponse create(CommentRequest request){
        ProductEntity productEntity = productService.findById(request.getProductId());
        CommentEntity commentEntity = CommentMapper.mapResponseToEntity(request);
        commentEntity.setProductEntity(productEntity);

        CommentEntity savedComment = commentRepository.save(commentEntity);

        return CommentMapper.mapEntityToResponse(savedComment);

    }

    public Page<CommentResponse> getCommentsForProduct(Long productId, Integer size, Integer page) {
        productService.doesProductExist(productId);
        return commentRepository
                .findCommentsForProduct(
                        productId,
                        PageRequest.of(page, size, Sort.Direction.DESC, "id")
                );

    }

}
