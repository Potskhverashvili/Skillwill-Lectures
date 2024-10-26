package com.example.Lecture24_GobalExceptionHandling.model;
import jakarta.validation.constraints.*;


public class PersonRequest {

    @NotNull(message = "First name can not be null! ")
    private String firstName;

    @NotBlank(message = "Last name can not be blank! ")
    @Size(min = 1, max = 12, message = "Lastname should be between 1-12")
    private String lastName;

    @Min(value = 0, message = "age should be greater or equal to 0")
    @Max(value = 12, message = "age should be less or equal to 12")
    private Integer age;

    // Constructor
    public PersonRequest() {}

    // Setters and Getters
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
