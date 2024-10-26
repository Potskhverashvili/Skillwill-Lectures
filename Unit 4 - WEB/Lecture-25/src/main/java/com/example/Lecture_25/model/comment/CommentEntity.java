package com.example.Lecture_25.model.comment;

import com.example.Lecture_25.model.product.ProductEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    // --------------------------- Constructors -----------------------------
    public CommentEntity() {
    }

    public CommentEntity(Long id, ProductEntity productEntity, String text) {
        this.id = id;
        this.productEntity = productEntity;
        this.text = text;
    }

    // ------------------------ Setters and Getters ----------------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
