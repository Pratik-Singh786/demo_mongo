package com.example.mongo.demomongo.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document//same as @Entity for the my-sql databases;
public class Address {
    private String street;
    private int house;
    private String city;
    private int  zipCode;
}
//mongo "mongodb+srv://cluster0.vleoc.mongodb.net/Sys" --username pratik
