package com.example.Lecture12;

import com.example.Lecture12.config.Config;
import com.example.Lecture12.model.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Lecture12Application {

	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	Company company = context.getBean("company", Company.class);
	void assertEquals("High Street",company.getAddress().getStreet());
	void assertEquals(1000,company.getAddress().getNumber());

	public static void main(String[] args) {
		SpringApplication.run(Lecture12Application.class, args);
	}

}
