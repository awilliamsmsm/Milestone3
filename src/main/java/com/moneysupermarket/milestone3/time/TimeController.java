package com.moneysupermarket.milestone3.time;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @RequestMapping("/getTime")
    public String getCurrentTime() {
        return timeService.getTime();
    }

    @RequestMapping("/getCanadaTime")
    public String getCurrentCanadaTime() {
        return timeService.getCanadaTime();
    }



}
