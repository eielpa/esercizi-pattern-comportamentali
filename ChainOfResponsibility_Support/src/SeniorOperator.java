public class SeniorOperator extends BaseOperator{

    public SeniorOperator(Operator nextOperator) {
        super(nextOperator);
    }

    @Override
    public boolean canHandle(int errorType) {
        if(errorType==2){
            return true;
        }
        return false;
    }

    @Override
    public void output() {
        System.out.println("Problem solved by Senior Operator");
    }
}
