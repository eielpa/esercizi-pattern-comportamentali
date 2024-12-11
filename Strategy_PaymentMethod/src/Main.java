// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total amount for the order: ");
        int amount = Integer.parseInt(scanner.nextLine());
        Order order = new Order(amount);

        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                order.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                order.setPaymentStrategy(new PayPalPayment());
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        order.processOrder();
    }
}
