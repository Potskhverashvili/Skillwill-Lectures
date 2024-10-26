package com.example.Lecture26.response;

import com.example.Lecture26.model.Support;
import com.example.Lecture26.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MultipleUserResponse {
    private Integer page;

    @JsonProperty("per_pages")
    private Integer size;

    private Integer total;

    @JsonProperty("total_pages")
    private Integer totalPages;

    List<User> data;

    private Support support;
}
