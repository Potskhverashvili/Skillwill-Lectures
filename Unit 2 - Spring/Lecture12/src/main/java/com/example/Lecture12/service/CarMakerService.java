package com.example.Lecture12.service;
import jakarta.annotation.PostConstruct;

public class CarMakerService {

    String brand;
    String model;

    // ------------------------- Setters -------------------------------
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @PostConstruct
    public void makeCar() {
        System.out.println("Maker Car - >  " + brand);
    }
}
