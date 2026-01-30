package org.example.springdatajpa2.service;

import org.example.springdatajpa2.mappingEntity.Course;
import org.example.springdatajpa2.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
