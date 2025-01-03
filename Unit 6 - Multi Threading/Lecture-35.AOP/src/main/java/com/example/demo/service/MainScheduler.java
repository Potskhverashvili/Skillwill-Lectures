package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainScheduler {

    private final MyService myService;

    @Scheduled(fixedDelay = 3000)
    public void doSomething() {

        System.out.println("Scheduled Massage");
        myService.doingSomething("String a");
    }
}
