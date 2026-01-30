package com.rev.workforce.controller;


import com.rev.workforce.model.Leave;
import com.rev.workforce.model.LeaveType;
import com.rev.workforce.model.Employee;
import com.rev.workforce.service.LeaveService;
import com.rev.workforce.exception.LeaveNotAllowedException;
import com.rev.workforce.exception.EmployeeNotFoundException;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeController {

    private final LeaveService leaveService = new LeaveService();

    public void employeeMenu(Employee employee, Scanner scanner) {

        while (true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Apply Leave");
            System.out.println("2. View My Leaves");
            System.out.println("3. Logout");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> applyLeave(employee, scanner);
                case 2 -> viewLeaves(employee);
                case 3 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void applyLeave(Employee employee, Scanner scanner) {
        System.out.println("Leave Type (CASUAL/SICK/PAID): ");
        LeaveType type = LeaveType.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Start Date (yyyy-mm-dd): ");
        LocalDate start = LocalDate.parse(scanner.nextLine());

        System.out.print("End Date (yyyy-mm-dd): ");
        LocalDate end = LocalDate.parse(scanner.nextLine());

        System.out.print("Reason: ");
        String reason = scanner.nextLine();

        Leave leave = new Leave(0, employee, type, start, end, reason);
        try {
            leaveService.applyLeave(leave);
            System.out.println("Leave applied successfully.");
        } catch (LeaveNotAllowedException e) {
            System.out.println(e.getMessage());
        }


    }

    private void viewLeaves(Employee employee) {
        try {
            leaveService.getLeavesForEmployee(employee.getEmployeeId())
                    .forEach(System.out::println);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
