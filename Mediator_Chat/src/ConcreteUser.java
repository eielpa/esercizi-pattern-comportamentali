public class ConcreteUser extends User {

    public ConcreteUser(String name, ChatMediator mediator) {
        super(name, mediator);

    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name+" sent: "+message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name+" received: "+message);
    }
}
