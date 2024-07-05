package com.example.Lecture13.controller;

import com.example.Lecture13.models.MyClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "myController")
public class MyController {

    /*@GetMapping("/hello")
    public String returnHelloMassage() {
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye!";
    }*/

    @GetMapping("/hi")
    public MyClass myClass(){
        return new MyClass("Jack");
    }
}

