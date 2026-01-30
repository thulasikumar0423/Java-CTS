package com.rev.workforce.controller;

import com.rev.workforce.model.Employee;
import com.rev.workforce.service.EmployeeService;

import java.util.Scanner;

public class ManagerController {
    private final EmployeeService employeeService = new EmployeeService();


    public void managerMenu(Employee manager, Scanner scanner) {

        while (true) {
            System.out.println("\n--- Manager Menu ---");
            System.out.println("1. View Team (placeholder)");
            System.out.println("2. Logout");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> employeeService.getTeamMembers(manager.getEmployeeId())
                        .forEach(System.out::println);

                case 2 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
