package com.rev.workforce.controller;

import com.rev.workforce.model.Employee;
import com.rev.workforce.model.Role;
import com.rev.workforce.service.EmployeeService;
import com.rev.workforce.exception.EmployeeNotFoundException;


import java.util.Scanner;

public class AuthController {

    private final EmployeeService employeeService = new EmployeeService();

    public Employee login(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Employee employee;
        try {
            employee = employeeService.authenticate(empId, password);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }



        if (employee == null || !employee.isActive()) {
            System.out.println("Invalid credentials or inactive employee.");
            return null;
        }

        System.out.println("Login successful. Welcome " + employee.getName());
        return employee;
    }

    public void redirectByRole(Employee employee, Scanner scanner) {
        if (employee.getRole() == Role.ADMIN) {
            new AdminController().adminMenu(scanner);
        } else if (employee.getRole() == Role.MANAGER) {
            new ManagerController().managerMenu(employee, scanner);
        } else {
            new EmployeeController().employeeMenu(employee, scanner);
        }
    }
}
