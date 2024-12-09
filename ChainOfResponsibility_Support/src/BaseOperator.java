public abstract class BaseOperator implements Operator {

    protected Operator nextOperator;

    public BaseOperator(Operator nextOperator) {
        this.nextOperator = nextOperator;
    }

    @Override
    public void solve(int errorLevel){
        if(canHandle(errorLevel)){
            output();
        }
        else{
            if(nextOperator != null){
                nextOperator.solve(errorLevel);
            }
        }
    }

    public abstract boolean canHandle(int errorType);
    public abstract void output();


}
