public class Order {

    private int totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(){
        if(paymentStrategy != null){
            paymentStrategy.collectPaymentDetails();
            if(paymentStrategy.pay(totalAmount)){
                System.out.println("Order processed successfully");
            }
            else{
                System.out.println("Order failed to process");
            }
        }
    }

}
