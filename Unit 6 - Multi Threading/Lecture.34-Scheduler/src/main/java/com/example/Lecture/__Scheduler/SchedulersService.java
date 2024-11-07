package com.example.Lecture.__Scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SchedulersService {

   private final JobService jobService;

    @Scheduled(fixedDelay = 3000)
    public void myJob() throws InterruptedException {
        System.out.println("Entry Time: " + LocalDateTime.now());
        jobService.heavyJob();
        System.out.println("Out Time: " + LocalDateTime.now());
        System.out.println("--------------------------------");
    }
}
