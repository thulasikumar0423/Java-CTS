package org.example.springdatajpa2.mappingEntity;

import jakarta.persistence.*;

@Entity
@Table(name="empl")
public class Employee {
    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name="parent_id",nullable=false)
    private ParentEntity parent;

    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary= salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ParentEntity getParent() {
        return parent;
    }

    public void setParent(ParentEntity parent) {
        this.parent = parent;
    }
}
