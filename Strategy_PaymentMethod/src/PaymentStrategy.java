public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean pay(int amount);

}