package com.moneysupermarket.milestone3.time;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class TimeService {

    public String getTime() {
        Date date = new Date();
        String stringDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    public String getCanadaTime(){
        Date date = new Date();
        TimeZone tz = TimeZone.getTimeZone("Canada/Pacific");
        String stringDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
        dateFormat.setTimeZone(tz);
        String formattedDate = "The time in Canada (Pacific Daylight Time) is: " + dateFormat.format(date);
        return formattedDate;
    }




}
