package com.rev.workforce.controller;

import com.rev.workforce.model.Employee;
import com.rev.workforce.model.Role;
import com.rev.workforce.service.EmployeeService;
import com.rev.workforce.exception.EmployeeNotFoundException;
import com.rev.workforce.exception.InvalidOperationException;


import java.util.Scanner;

public class AdminController {

    private final EmployeeService employeeService = new EmployeeService();

    public void adminMenu(Scanner scanner) {

        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Deactivate Employee");
            System.out.println("4. Logout");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addEmployee(scanner);
                case 2 -> employeeService.getAllEmployees().forEach(System.out::println);
                case 3 -> deactivateEmployee(scanner);
                case 4 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void addEmployee(Scanner scanner) {
        System.out.print("Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Role (EMPLOYEE/MANAGER/ADMIN): ");
        Role role = Role.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Password: ");
        String password = scanner.nextLine();



        Employee employee = new Employee(id, name, email, role);
        employee.setPassword(password);
        try {
            employeeService.registerEmployee(employee);
            System.out.println("Employee added successfully.");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }


    }

    private void deactivateEmployee(Scanner scanner) {
        System.out.print("Employee ID to deactivate: ");
        int id = scanner.nextInt();
        try {
            employeeService.deactivateEmployee(id);
            System.out.println("Employee deactivated.");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
