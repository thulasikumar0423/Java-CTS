package org.example.auditingdemo.model;

import jakarta.persistence.*;

@Entity

@NamedQuery(
        name ="User.findByName",
        query ="SELECT u FROM User u WHERE u.name =:name"
)
public class User extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
