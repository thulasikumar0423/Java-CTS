package org.example.springdatajpa2.mappingEntity;


import jakarta.persistence.*;
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String phone;

    @OneToOne (mappedBy ="profile")
    private User user;
}
