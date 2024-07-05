package com.example.Lecture12.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class PrinterService {

   private PlaneMakerService planeMakerService;

   public PrinterService(PlaneMakerService planeMakerService){
       this.planeMakerService = planeMakerService;
   }

   @PostConstruct
   public void printService(){
       System.out.println("Print Service..");
   }
}
