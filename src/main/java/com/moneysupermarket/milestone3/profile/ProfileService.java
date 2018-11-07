package com.moneysupermarket.milestone3.profile;

import jdk.nashorn.internal.ir.PropertyKey;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProfileService {

    private ProfileRepository profileRepository;

    public String generateUniqueIDForProfile(ProfileMaker profileMaker){
        String uuID = UUID.randomUUID().toString();
        profileMaker.setProfileID(uuID);

        profileRepository.save(profileMaker);

        String fName = profileMaker.getFirstName();
        String lName = profileMaker.getLastName();
        String profileID = profileMaker.getProfileID();
        System.out.println(fName + " " + lName + "     id = " + profileID);
        return fName + " " + lName + "     id = " + profileID;
    }

    public List<ProfileMaker> getAll(){
        return profileRepository.findAll();
    }

    public ProfileMaker findProfileById(String profileID) {
        ProfileMaker profile = profileRepository.findByProfileID(profileID);
        return profile;

    }

}
