package com.example.mongo.demomongo.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection ="my_user")//@Entity is present in spring data jpa
public class User {
    private String name;
    private int age;
    private double bmi;
    private Address address;
}
