package com.moneysupermarket.milestone3;

import com.moneysupermarket.milestone3.time.TimeService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeComponent {

    @Scheduled(fixedRate = 180000)
    public void getRegularTime(){
        TimeService time = new TimeService();
        System.out.println("The time is: " + time.getTime());
    }
}
