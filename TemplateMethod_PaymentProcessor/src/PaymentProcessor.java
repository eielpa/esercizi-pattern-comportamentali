public abstract class PaymentProcessor {

    //Template method
    public final void processPayment() {

        authenticateUser();
        validatePaymentDetails();
        processTransaction();
        sendReceipt();

    }

    private void authenticateUser() {
        System.out.println("Authenticating user...");
    }

    private void sendReceipt() {
        System.out.println("Sending receipt...");
    }

    protected abstract void validatePaymentDetails();
    protected abstract void processTransaction();

}
