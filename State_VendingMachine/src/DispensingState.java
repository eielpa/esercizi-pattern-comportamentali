public class DispensingState implements State {

    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait for completion of dispensing");
    }

    @Override
    public void selectProduct() {
        System.out.println("Wait for completion of dispensing");
    }

    @Override
    public void dispense() {
        System.out.println("Already dispensing");
    }

    @Override
    public void cancel() {
        System.out.println("Impossible to cancel while dispensing");
    }

    @Override
    public void complete() {
        System.out.println("Product dispensed successfully");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
}
