package com.moneysupermarket.milestone3.profile;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
//@Builder
//@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Test user")
public class ProfileMaker {
    @Id
    private String profileID;

    @Field(value = "FirstName")
    private String firstName;

    @Field(value = "LastName")
    private String lastName;

}
