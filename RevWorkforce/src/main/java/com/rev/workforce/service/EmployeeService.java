package com.rev.workforce.service;

import com.rev.workforce.model.Employee;
import com.rev.workforce.repository.EmployeeRepository;
import com.rev.workforce.exception.EmployeeNotFoundException;


import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository = new EmployeeRepository();

    public void registerEmployee(Employee employee) {
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee cannot be null");
        }

        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployeeById(int employeeId) {
        return employeeRepository.getEmployeeById(employeeId);

    }
    public Employee authenticate(int employeeId, String password) {

        Employee employee = employeeRepository.getEmployeeById(employeeId);

        if (employee == null || !employee.isActive()) {
            throw new RuntimeException("Invalid employee ID");
        }

        if (!employee.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return employee;
    }


    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }


    public void deactivateEmployee(int employeeId) {
        employeeRepository.deactivateEmployee(employeeId);
    }
    public List<Employee> getTeamMembers(int managerId) {
        return employeeRepository.getEmployeesByManager(managerId);
    }
}
