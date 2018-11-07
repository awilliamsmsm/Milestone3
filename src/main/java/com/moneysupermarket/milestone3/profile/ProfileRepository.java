package com.moneysupermarket.milestone3.profile;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProfileRepository extends MongoRepository<ProfileMaker, String> {

    ProfileMaker findByProfileID(String profileId);
}
