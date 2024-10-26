package com.example.Lecture_25.controller;

import com.example.Lecture_25.model.comment.CommentRequest;
import com.example.Lecture_25.model.comment.CommentResponse;
import com.example.Lecture_25.service.CommentService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<CommentResponse> create(@RequestBody @Valid CommentRequest commentRequest) {
        CommentResponse commentResponse = commentService.create(commentRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(commentResponse);
    }

    @GetMapping
    public ResponseEntity<Page<CommentResponse>> findByProductId(
            @RequestParam("productId") Long productId,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size
    ) {

        Page<CommentResponse> commentForProduct = commentService.getCommentsForProduct(productId, size, page);
        return ResponseEntity.status(HttpStatus.OK).body(commentForProduct);
    }
}
