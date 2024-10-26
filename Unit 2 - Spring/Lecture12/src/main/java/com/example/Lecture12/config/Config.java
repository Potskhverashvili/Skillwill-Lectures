package com.example.Lecture12.config;

import com.example.Lecture12.model.Address;
import com.example.Lecture12.model.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Bean
    public Address getAddress(){
        return new Address("Street", 254);
    }
}
