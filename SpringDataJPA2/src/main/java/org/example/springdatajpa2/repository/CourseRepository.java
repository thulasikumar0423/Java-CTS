package org.example.springdatajpa2.repository;

import org.example.springdatajpa2.mappingEntity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
