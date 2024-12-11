public class CoinInsertedState implements State {

    private VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Already inserted coin. Select a product");
    }

    @Override
    public void selectProduct() {
        System.out.println("Selected product, dispensing...");
        vendingMachine.setState(vendingMachine.getSelectionState());
    }

    @Override
    public void dispense() {
        System.out.println("No product selected");
    }

    @Override
    public void cancel() {
        System.out.println("Operation cancelled. Coin ejected");
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void complete() {
        System.out.println("Impossible to complete. No product dispensed yet");
    }
}
