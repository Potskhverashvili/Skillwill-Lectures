package com.example.Lecture_25.model.product;

import com.example.Lecture_25.model.user.UserEntity;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "count")
    private Integer count;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_user_id")
    private UserEntity ownerUser;

    // Constructors
    public ProductEntity() {
    }

    public ProductEntity(Integer count, String description, Long id, String name, UserEntity ownerUser) {
        this.count = count;
        this.description = description;
        this.id = id;
        this.name = name;
        this.ownerUser = ownerUser;
    }

    // Setters and Getters
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserEntity getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(UserEntity ownerUser) {
        this.ownerUser = ownerUser;
    }
}
