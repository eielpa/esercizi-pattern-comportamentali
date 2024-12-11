public class IdleState implements State {

    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Select your product");
        vendingMachine.setState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert a coin first");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

    @Override
    public void cancel() {
        System.out.println("No action to cancel");
    }

    @Override
    public void complete() {
        System.out.println("Impossible to complete. No coin inserted");
    }
}
