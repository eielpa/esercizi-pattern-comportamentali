public class VendingMachine {

    private State idleState;
    private State coinInsertedState;
    private State selectionState;
    private State dispensingState;

    private State currentState;

    public VendingMachine() {
        idleState= new IdleState(this);
        coinInsertedState= new CoinInsertedState(this);
        selectionState= new SelectionState(this);
        dispensingState= new DispensingState(this);

        currentState= idleState;

    }

    public void setState(State state) {
        currentState= state;
    }

    public State getIdleState(){
        return idleState;
    }

    public State getCoinInsertedState() {
        return coinInsertedState;
    }

    public State getSelectionState() {
        return selectionState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct(){
        currentState.selectProduct();
    }

    public void dispense(){
        currentState.dispense();
    }

    public void cancel(){
        currentState.cancel();
    }


    public void complete() {
        currentState.complete();
    }
}
