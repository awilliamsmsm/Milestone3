package com.moneysupermarket.milestone3.time;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TimeControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private TimeService timeService;

    private DateFormat dateFormat;

    @Before
    public void initMocks() {
        this.dateFormat = new SimpleDateFormat("hh:mm:ss a");
    }

    @Test
    public void getCurrentTimeTest() {
        when(dateFormat.format(any())).thenReturn("00:00:00 am");
        mvc.perform(get("/getTime").contentType(MediaType.ALL_VALUE))
                .andExpect(status().isOk());
    }
}


































}