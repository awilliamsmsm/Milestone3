package com.moneysupermarket.milestone3;

import com.moneysupermarket.milestone3.time.TimeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
@EnableScheduling
@SpringBootApplication
public class Milestone3Application {

    public static void main(String[] args) {
        SpringApplication.run(Milestone3Application.class, args);
    }

//    Part1 part1;
//    TimeService timeService;
//    @Scheduled(fixedRate = 3000)
//    public void runJob() throws Exception {
//        part1.regularTime(timeService);
//    }
}
