package com.moneysupermarket.milestone3.profile;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    private final ProfileService profileService;



    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @RequestMapping(value = "/JSONprofile", method = RequestMethod.POST)
    public String postJSONProfile(@RequestBody Profile profile){

        return profileService.generateUniqueIDForProfile(profile);

        //Profile profile = new Profile(input);
//        String fName = profile.getFirstName();
//        String lName = profile.getLastName();
//        System.out.println(fName + " " + lName);
//        return fName + " " + lName;
    }


}
