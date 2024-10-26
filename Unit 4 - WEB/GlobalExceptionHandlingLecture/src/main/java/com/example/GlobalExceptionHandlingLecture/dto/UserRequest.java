package com.example.GlobalExceptionHandlingLecture.dto;

import com.example.GlobalExceptionHandlingLecture.groupAnotations.CreateInt;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotNull
    private Long userId;

    @NotBlank(message = "Not Blank", groups = {CreateInt.class})
    private String userName;

    @NotBlank
    private String email;

}
