package com.example.Lecture12.service;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class PlaneMakerService {

    private CarMakerService carMakerService;

    public PlaneMakerService(CarMakerService carMakerService) {
        this.carMakerService = carMakerService;
    }


    @PostConstruct
    public void makePlane(){
        System.out.println("Make Plane - > ");
    }
}
