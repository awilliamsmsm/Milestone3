package com.moneysupermarket.milestone3.profile;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataMongoTest
@AutoConfigureTestEntityManager
public class ProfileRepositoryTest {

    @Autowired
    ProfileRepository profileRepository;

    public ProfileMaker profile1, profile2, profile3;

    @Before
    public void initMocks() {
        this.profile1 = new ProfileMaker("1", "a", "b");
        createProfile(profile1);
        this.profile2 = new ProfileMaker("2", "c", "d");
        createProfile(profile2);
        this.profile3 = new ProfileMaker("3", "e", "f");
        createProfile(profile3);

    }

    @Test
    public void testFindByProfileId(){
        ProfileMaker profile = profileRepository.findByProfileID("1");
        assertEquals(profile1, profile);
    }


    private ProfileMaker createProfile(ProfileMaker profile){
        profileRepository.save(profile);
        return profile;


    }


}