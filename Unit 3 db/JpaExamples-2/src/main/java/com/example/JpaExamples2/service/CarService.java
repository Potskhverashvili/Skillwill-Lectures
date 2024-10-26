package com.example.JpaExamples2.service;

import com.example.JpaExamples2.model.Car;
import com.example.JpaExamples2.model.CarShortModel;
import com.example.JpaExamples2.repository.CarRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void fetchData() {
        saveCar("Mazda", "RX8", 2012);
        saveCar("BMW", "F30", 2015);
        saveCar("Mercedes", "C300", 2017);
        saveCar("Mercedes", "S500", 2012);


        System.out.println("---------------- Page --------------------------");
        Page<Car> mercedes = carRepository.findCarByBrandNameAndReleaseYearPage(
                "Mercedes",
                2010,
                PageRequest.of(
                        1, 1,
                        Sort.Direction.ASC, "releaseYear")
        );
        System.out.println(mercedes.getContent() + "\n");

        System.out.println("-------------- Projection -------------------");
        List<CarShortModel> cars = carRepository.findCarShortModel("Mercedes", 2010);
        System.out.println(cars + "\n");


    }

    // ================================ Methods ======================================
    public void saveCar(String brandName, String modelName, Integer releaseYear) {
        Car car = new Car();
        car.setBrandName(brandName);
        car.setModelName(modelName);
        car.setReleaseYear(releaseYear);
        carRepository.save(car);
    }
}
