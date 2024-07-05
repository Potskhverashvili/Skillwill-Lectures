package com.example.Lecture13.models;

import java.util.List;

public class Animal {

    private String name;

    private int age;

    private List<String> favouriteFoods;

    private double weight;

    public Animal(String name, int age, List<String> favouriteFoods, double weight) {
        this.name = name;
        this.age = age;
        this.favouriteFoods = favouriteFoods;
        this.weight = weight;
    }

    public void deleteListElement(int element) {
        favouriteFoods.remove(element);
    }

    // --------------------------- Getters and Setters ----------------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFavouriteFoods() {
        return favouriteFoods;
    }

    public void setFavouriteFoods(List<String> favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

