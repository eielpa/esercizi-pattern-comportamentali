public class Client {
    public static void main(String[] args) {

        String expression="2 + 3 * 4";

        Interpreter interpreter=new Interpreter();

        int result = interpreter.interpret(expression);
        System.out.println("Result: "+result);

    }
}
