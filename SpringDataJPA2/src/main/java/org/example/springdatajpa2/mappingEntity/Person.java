package org.example.springdatajpa2.mappingEntity;

import jakarta.persistence.*;
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "temp_street")),
            @AttributeOverride(name = "city", column = @Column(name = "temp_city"))
    })
    private Address address;
}