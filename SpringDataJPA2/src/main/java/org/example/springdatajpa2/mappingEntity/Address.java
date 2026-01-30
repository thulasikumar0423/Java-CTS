package org.example.springdatajpa2.mappingEntity;

import jakarta.persistence.*;

@Embeddable
public class Address {

    private String street;
    private String city;
    private String state;
    private String pincode;
}
