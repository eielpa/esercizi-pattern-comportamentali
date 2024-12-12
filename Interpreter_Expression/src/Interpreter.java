public class Interpreter {

    public int interpret(String expression) {
        Expression expressionTree= buildExpressionTree(expression);

        return expressionTree.interpret();
    }

    private Expression buildExpressionTree(String expression) {
        return new AdditionExpression(
                new NumberExpression(2), new MultiplicationExpression(
                        new NumberExpression(3), new NumberExpression(4)
        ));
    }

}
