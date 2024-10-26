package com.example.Lecture_25.model.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CommentResponse {

    private Long id;

    @NotNull(message = "text could not be null" )
    @NotBlank(message = "text could not be blank")
    private String text;

    @NotNull(message = "productName could not be null")
    private String productName;











    // ----------------------------- Constructors -------------------------------
    public CommentResponse() {
    }

    public CommentResponse(Long id, String productName, String text) {
        this.id = id;
        this.productName = productName;
        this.text = text;
    }

    // -------------------------- Setters and Getters ---------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
