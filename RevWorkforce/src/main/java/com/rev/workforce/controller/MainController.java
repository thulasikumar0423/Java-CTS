package com.rev.workforce.controller;

import com.rev.workforce.model.Employee;

import java.util.Scanner;

public class MainController {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        AuthController authController = new AuthController();

        while (true) {
            System.out.println("\n=== REV WORKFORCE HRM ===");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                Employee employee = authController.login(scanner);
                if (employee != null) {
                    authController.redirectByRole(employee, scanner);
                }
            } else {
                System.out.println("Exiting system.");
                break;
            }
        }
    }
}
