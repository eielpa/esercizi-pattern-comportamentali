public class Main {

    public static void main(String[] args) {

        Operator operatorChain= new JuniorOperator(
                new SeniorOperator(
                        new MasterOperator(null)));

        System.out.println("Can't connect my mouse to my pc");
        operatorChain.solve(1);
        System.out.println("Issues with wifi connection");
        operatorChain.solve(2);
        System.out.println("Issues with home firewall");
        operatorChain.solve(3);
        System.out.println("My PC is on fire");
        operatorChain.solve(4);

    }
}