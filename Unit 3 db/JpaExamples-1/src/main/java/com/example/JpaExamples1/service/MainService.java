package com.example.JpaExamples1.service;

import com.example.JpaExamples1.model.Car;
import com.example.JpaExamples1.model.Person;
import com.example.JpaExamples1.repository.CarRepository;
import com.example.JpaExamples1.repository.PersonRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    private final CarRepository carRepository;
    private final PersonRepository personRepository;

    public MainService(CarRepository carRepository, PersonRepository personRepository) {
        this.carRepository = carRepository;
        this.personRepository = personRepository;
    }

    @PostConstruct
    public void mainMethod() {

        Person person = new Person();
        person.setName("John");
        person.setLastName("Doe");
        personRepository.save(person);

        saveCar("Toyota","Camry",25000.0, person);
        saveCar("Ford", "Mustang", 35000.0, person);

        findByBrandName("camry");
    }






    // ================================== Methods ===============================
    // Save Car
    public void saveCar(String brandName, String modelName, Double price, Person person) {
        Car car = new Car();
        car.setBrandName(brandName);
        car.setModelName(modelName);
        car.setPrice(price);
        car.setPerson(person);
        carRepository.save(car);
    }

    // Delete car by id
    public void deleteCarById(Long id) {
        carRepository.deleteById(id);
    }

    // Find All
    public void findAllCar() {
        List<Car> all = carRepository.findAll();
        System.out.println(all);
    }

    // Find by brand name
    public void findByBrandName(String brandName) {
        List<Car> car = carRepository.findAllByBrandNameLikeIgnoreCase(brandName);
        System.out.println(car);
    }

    // Find Car By id
    public void findCarById(Long id) {
        Optional<Car> carById = carRepository.findById(id);
        if (carById.isPresent()) {
            Car car = carById.get();
            System.out.println(car);
        } else {
            System.out.println("Car doesn't exist");
        }
    }
}
