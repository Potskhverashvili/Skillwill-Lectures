package com.example.Lecture26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lecture26Application {

	public static void main(String[] args) {
		SpringApplication.run(Lecture26Application.class, args);
	}

	enum method {}
}
