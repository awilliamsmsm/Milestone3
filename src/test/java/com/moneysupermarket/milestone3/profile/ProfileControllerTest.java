package com.moneysupermarket.milestone3.profile;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(ProfileController.class)
public class ProfileControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProfileService profileService;

    public ProfileMaker profile1, profile2, profile3;

    private String profileID;

    //private ProfileController profileController;

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
        //this.profileController = new ProfileController(profileService);
        this.profile1 = new ProfileMaker("1", "a", "b");
        this.profile2 = new ProfileMaker("2", "c", "d");
        this.profile3 = new ProfileMaker("3", "e", "f");
        this.profileID = "89";
    }

    @Test
    public void getAllProfilesTest() throws Exception{
        Mockito.when(profileService.getAll()).thenReturn(Arrays.asList(profile1, profile2, profile3));
        mvc.perform(get("/profiles").contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
    }

    @Test
    public void getProfileByIdTest() throws Exception{
        Mockito.when(profileService.findProfileById(profileID)).thenReturn(profile1);
        mvc.perform(get("/profiles/"+ profileID).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
    @Test
    public void getProfileByIdNotFoundTest() throws Exception{
        when(profileService.findProfileById(profileID)).thenReturn(null);
        mvc.perform(get("/profiles/" + profileID).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

}