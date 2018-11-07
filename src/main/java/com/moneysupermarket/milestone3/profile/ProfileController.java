package com.moneysupermarket.milestone3.profile;

import com.moneysupermarket.milestone3.ErrorHandling.ProfileNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @RequestMapping(value = "/JSONprofile", method = RequestMethod.POST)
    public String postJSONProfile(@RequestBody ProfileMaker profileMaker){
        return profileService.generateUniqueIDForProfile(profileMaker);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profiles")
    public List<ProfileMaker> profiles(){
        return profileService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profiles/{profileID}")
    public ProfileMaker getOneProfile(@PathVariable String profileID){
        return Optional.ofNullable(profileService.findProfileById(profileID)).orElseThrow(ProfileNotFoundException::new);
    }


}
