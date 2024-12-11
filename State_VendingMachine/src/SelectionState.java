public class SelectionState implements State {

    private VendingMachine vendingMachine;

    public SelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted, wait for product dispensing");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected. Wait for dispensing");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing product...");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void cancel() {
        System.out.println("Operation canceled, coin ejected");
        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void complete() {
        System.out.println("Impossible to complete. No product dispensed");
    }
}
