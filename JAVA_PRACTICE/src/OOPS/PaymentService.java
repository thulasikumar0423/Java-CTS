package OOPS;

class PaymentService implements Payment {

    @Override
    public void processPayment(String paymentType, double amount) {

        if (paymentType.equalsIgnoreCase("CARD")) {
            processCreditCard(amount);
        }
        else if (paymentType.equalsIgnoreCase("PAYPAL")) {
            processPayPal(amount);
        }
        else if (paymentType.equalsIgnoreCase("CRYPTO")) {
            processCrypto(amount);
        }
        else {
            System.out.println("Invalid payment method");
        }
    }

    private void processCreditCard(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }

    private void processPayPal(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }

    private void processCrypto(double amount) {
        System.out.println("Processing Crypto payment of ₹" + amount);
    }
    public static void main(String[] args) {

        Payment payment = new PaymentService(); // interface reference

        payment.processPayment("CARD", 1000);
        payment.processPayment("PAYPAL", 2000);
        payment.processPayment("CRYPTO", 3000);
    }
}
