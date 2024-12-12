public class Main {
    public static void main(String[] args) {
        System.out.println("Credit Card Payment:");
        PaymentProcessor creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment();

        System.out.println("\nPayPal Payment:");
        PaymentProcessor payPalPayment = new PayPalPayment();
        payPalPayment.processPayment();
    }
}