package Exception;

import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {

        ATMClass atm = new ATMClass();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            atm.withdraw(amount);

        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Technical error occurred!");

        } finally {
            System.out.println("Transaction completed. Please collect your card.");
            sc.close();
        }
    }
}
