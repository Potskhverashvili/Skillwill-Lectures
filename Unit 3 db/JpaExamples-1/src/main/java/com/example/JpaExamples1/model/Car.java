package com.example.JpaExamples1.model;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    Long id;

    @Column(name = "brand_name")
    private String brandName;

    @Column(name = "model_name", length = 400)
    private String modelName;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    Person person;

    // Setters and Getters
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                ", person=" + person +
                '}';
    }
}
