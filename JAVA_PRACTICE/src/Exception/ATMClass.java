package Exception;

class ATMClass {

    private double balance = 10000; // initial balance

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        System.out.println("\n➡️ Processing withdrawal...");

        if (amount <= 0) {
            throw new InvalidAmountException(" Invalid amount! Enter amount greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(" Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: ₹" + balance);
    }
}
