package org.example.springdatajpa2.service;

import org.example.springdatajpa2.mappingEntity.Course;
import org.example.springdatajpa2.mappingEntity.Student;
import org.example.springdatajpa2.repository.CourseRepository;
import org.example.springdatajpa2.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentService(StudentRepository studentRepository,
                          CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addCourseToStudent(Long studentId, Long courseId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        student.getCourses().add(course);
        course.getStudents().add(student); // sync both sides

        return studentRepository.save(student);
    }
}
