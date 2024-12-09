public class MasterOperator extends BaseOperator {

    public MasterOperator(Operator nextOperator) {
        super(nextOperator);
    }

    @Override
    public boolean canHandle(int errorType) {
        if(errorType==3){
            return true;
        }
        System.out.println("We couldn't find a solution to your problem, you're DOOMED");
        return false;
    }

    @Override
    public void output() {
        System.out.println("Problem Solved by MasterOperator");
    }
}
