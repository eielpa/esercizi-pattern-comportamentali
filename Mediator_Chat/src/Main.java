public class Main {
    public static void main(String[] args) {

        ChatMediator mediator= new ChatRoom();

        User user1= new ConcreteUser("Alice", mediator);
        User user2= new ConcreteUser("Bob", mediator);
        User user3= new ConcreteUser("Charlie", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello World");
        user2.sendMessage("Hello World except Charlie, I hate you.");
        user3.sendMessage("What did I even do to you Bob?");

    }
}