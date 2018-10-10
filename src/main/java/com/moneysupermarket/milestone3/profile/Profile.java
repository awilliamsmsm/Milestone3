package com.moneysupermarket.milestone3.profile;

import lombok.Data;

@Data
public class Profile {

    private String firstName;
    private String lastName;
    private String profileID;

    public Profile(){}

    public Profile(String fName, String lName){
        this.setFirstName(fName);
        this.setLastName(lName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }

}
