package com.example.Lecture12.configuration;

import com.example.Lecture12.service.CarMakerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public CarMakerService carMakerService (){
        CarMakerService carMakerService = new CarMakerService();

        carMakerService.setBrand("BMW");
        return carMakerService;
    }

}
