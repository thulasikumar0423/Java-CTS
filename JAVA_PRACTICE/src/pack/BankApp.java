package pack;

import java.util.Scanner;

class BankApp {

    static String[] names;
    static int[] accNos;
    static double[] balances;
    static String[] emails;
    static int userCount = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nList menus :");
            System.out.println("1) Create account");
            System.out.println("2) Withdraw money");
            System.out.println("3) Deposit money");
            System.out.println("4) Display by user");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the number of users: ");
                    userCount = sc.nextInt();

                    names = new String[userCount];
                    accNos = new int[userCount];
                    balances = new double[userCount];
                    emails = new String[userCount];

                    for (int i = 0; i < userCount; i++) {
                        System.out.println("\nEnter details of user " + (i + 1));
                        System.out.print("Name: ");
                        names[i] = sc.next();

                        System.out.print("Account Number: ");
                        accNos[i] = sc.nextInt();

                        System.out.print("Initial Amount: ");
                        balances[i] = sc.nextDouble();

                        System.out.print("Email: ");
                        emails[i] = sc.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter user id (1 to " + userCount + "): ");
                    int wid = sc.nextInt() - 1;

                    if (wid >= 0 && wid < userCount) {
                        System.out.print("Enter withdraw amount: ");
                        double wamt = sc.nextDouble();

                        if (wamt <= 0) {
                            System.out.println("Invalid amount!");
                        } else if (wamt > balances[wid]) {
                            System.out.println("Insufficient balance!");
                        } else {
                            balances[wid] -= wamt;
                            System.out.println("Withdraw successful. Balance: " + balances[wid]);
                        }
                    } else {
                        System.out.println("Invalid user id!");
                    }
                    break;

                case 3:
                    System.out.print("Enter user id (1 to " + userCount + "): ");
                    int did = sc.nextInt() - 1;

                    if (did >= 0 && did < userCount) {
                        System.out.print("Enter deposit amount: ");
                        double damt = sc.nextDouble();

                        if (damt <= 0) {
                            System.out.println("Invalid amount!");
                        } else {
                            balances[did] += damt;
                            System.out.println("Deposit successful.");
                            System.out.println("Final Balance: " + balances[did]);
                        }
                    } else {
                        System.out.println("Invalid user id!");
                    }
                    break;

                case 4:
                    System.out.print("Enter user id (1 to " + userCount + "): ");
                    int uid = sc.nextInt() - 1;

                    if (uid >= 0 && uid < userCount) {
                        System.out.println("\nUser Details:");
                        System.out.println("Name: " + names[uid]);
                        System.out.println("Account Number: " + accNos[uid]);
                        System.out.println("Email: " + emails[uid]);
                        System.out.println("Balance Amount: " + balances[uid]);
                    } else {
                        System.out.println("Invalid user id!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
