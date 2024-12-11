import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{


    private String cardNumber;
    private String cardHolder;
    private String expirationDate;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Card Holder: ");
        cardHolder = scanner.nextLine();
        System.out.print("Enter card number: ");
        cardNumber = scanner.nextLine();
        System.out.print("Enter Expiration Date (MM/YY): ");
        expirationDate = scanner.nextLine();

    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Processing payment of "+amount+" using credit card");
        return true;
    }
}
