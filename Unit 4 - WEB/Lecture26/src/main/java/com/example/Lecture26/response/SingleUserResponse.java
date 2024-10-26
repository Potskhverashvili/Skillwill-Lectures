package com.example.Lecture26.response;

import com.example.Lecture26.model.Support;
import com.example.Lecture26.model.User;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class SingleUserResponse {
    private User data;
    private Support support;

}
