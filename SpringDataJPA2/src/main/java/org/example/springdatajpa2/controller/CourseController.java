package org.example.springdatajpa2.controller;

import org.example.springdatajpa2.mappingEntity.Course;
import org.example.springdatajpa2.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }


    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
