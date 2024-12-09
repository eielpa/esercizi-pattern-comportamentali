public class JuniorOperator extends BaseOperator{

    public JuniorOperator(Operator nextOperator) {
        super(nextOperator);
    }

    @Override
    public boolean canHandle(int errorType) {
        if(errorType==1){
            return true;
        }
        return false;
    }

    @Override
    public void output() {
        System.out.println("Problem solved by Junior Operator");
    }


}
