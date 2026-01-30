package com.rev.workforce.service;

import com.rev.workforce.model.Department;
import com.rev.workforce.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {

    private final DepartmentRepository departmentRepository = new DepartmentRepository();

    public void addDepartment(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null");
        }
        departmentRepository.addDepartment(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }
}
