package com.example.Lecture13.controller;

import com.example.Lecture13.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController(value = "animal")
public class AnimalController {

    @GetMapping(value = "/say-my-name")
    public String sayMyName() {
        return "My Name Is Rex";
    }

    @GetMapping("/get-animal/{name}")
    public Animal getAnimal(@PathVariable("name") String name) {
        List<String> foodsList = new ArrayList<>(List.of("Meat", "Bone", "chicken"));
        return new Animal(name, 4, foodsList, 20);
    }
}

