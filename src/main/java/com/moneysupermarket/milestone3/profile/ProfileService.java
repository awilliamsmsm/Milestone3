package com.moneysupermarket.milestone3.profile;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileService {
    public String generateUniqueIDForProfile(Profile profile){
        String uuID = UUID.randomUUID().toString();
        profile.setProfileID(uuID);

        String fName = profile.getFirstName();
        String lName = profile.getLastName();
        String profileID = profile.getProfileID();
        System.out.println(fName + " " + lName + "     id = " + profileID);
        return fName + " " + lName + "     id = " + profileID;


    }

}
