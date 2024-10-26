package com.example.Lecture_25.model.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CommentRequest {

    @NotBlank(message = "text can not be blank!")
    @Size(min = 1, max = 512, message = "text should be between 1-512")
    private String text;

    @Positive(message = "productId should be positive")
    private Long productId;
















    public CommentRequest(String text, Long productId) {
        this.text = text;
        this.productId = productId;
    }

    // -------------------------------- Constructors -----------------------------
    public CommentRequest() {
    }

    public CommentRequest(Long productId, String text) {
        this.productId = productId;
        this.text = text;
    }

    // ----------------------------- Setters and Getters --------------------------
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
