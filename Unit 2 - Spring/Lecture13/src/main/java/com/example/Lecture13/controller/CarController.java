package com.example.Lecture13.controller;

import com.example.Lecture13.models.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "car")
public class CarController {

    @GetMapping(value = "create-car/{brand}")
    public Car getCar(@PathVariable("brand") String brand) {
        Car car = new Car();
        car.setBrand(brand);
        car.setReleaseYear("2020");
        return car;
    }
}
