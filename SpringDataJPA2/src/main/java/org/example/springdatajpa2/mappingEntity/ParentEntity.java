package org.example.springdatajpa2.mappingEntity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ParentEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(
            mappedBy ="parent",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setParent(this);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setParent(null);
    }

}
