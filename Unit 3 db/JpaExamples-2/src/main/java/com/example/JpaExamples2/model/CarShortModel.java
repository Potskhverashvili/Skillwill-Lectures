package com.example.JpaExamples2.model;


public class CarShortModel {

    private String brandName;
    private String modelName;

    public CarShortModel(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
    }


    public CarShortModel(String modelName) {
        this.modelName = modelName;
    }

    // ================== Getters and Setters ===========================
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    @Override
    public String toString() {
        return "CarShortModel{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
