package org.example.springdatajpa2.repository;

import org.example.springdatajpa2.mappingEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
