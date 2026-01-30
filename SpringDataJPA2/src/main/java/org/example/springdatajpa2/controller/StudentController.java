package org.example.springdatajpa2.controller;

import org.example.springdatajpa2.mappingEntity.Student;
import org.example.springdatajpa2.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @PostMapping("/{studentId}/courses/{courseId}")
    public Student assignCourse(
            @PathVariable Long studentId,
            @PathVariable Long courseId) {
        return studentService.addCourseToStudent(studentId, courseId);
    }
}
