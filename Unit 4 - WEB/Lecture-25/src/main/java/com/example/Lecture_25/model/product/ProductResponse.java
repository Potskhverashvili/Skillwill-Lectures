package com.example.Lecture_25.model.product;

import com.example.Lecture_25.model.user.UserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

public class ProductResponse {

    @NotNull(message = "id can not be null")
    private Long id;

    @NotNull(message = "count not be null")
    private Integer count;

    @NotNull(message = "name can not be null")
    private String name;

    private String description;













    // ------------------------------ Setters and Getters ------------------------------------
    public @NotNull(message = "count not be null") Integer getCount() {
        return count;
    }

    public void setCount(@NotNull(message = "count not be null") Integer count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @NotNull(message = "id can not be null") Long getId() {
        return id;
    }

    public void setId(@NotNull(message = "id can not be null") Long id) {
        this.id = id;
    }

    public @NotNull(message = "name can not be null") String getName() {
        return name;
    }

    public void setName(@NotNull(message = "name can not be null") String name) {
        this.name = name;
    }
}
