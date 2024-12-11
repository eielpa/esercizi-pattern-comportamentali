import java.util.Scanner;

public class PayPalPayment implements PaymentStrategy{

    private String email;
    private String password;
    private boolean isLoggedIn;

    @Override
    public void collectPaymentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PayPal email: ");
        this.email = scanner.nextLine();
        System.out.print("Enter PayPal password: ");
        this.password = scanner.nextLine();
        this.isLoggedIn = authenticate();
    }

    private boolean authenticate() {
        System.out.print("Authenticating PayPal account...");
        return true;
    }

    @Override
    public boolean pay(int amount) {
        if(isLoggedIn) {
            System.out.println("Processing payment of "+amount+" using PayPal");
            return true;
        }
        System.out.print("PayPal authentication failed. Payment aborted.");
        return false;
    }
}
