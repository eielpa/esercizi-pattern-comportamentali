public class Main {
    public static void main(String[] args) {

        MailingList mailingList=new MailingList();

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        mailingList.addSubscriber(alice);
        mailingList.addSubscriber(bob);

        mailingList.publishMessage("Welcome to our newsletter!");

        mailingList.addSubscriber(charlie);
        mailingList.publishMessage("New article published on our website!");

        mailingList.removeSubscriber(alice);
        mailingList.publishMessage("Exclusive promotion for our subscribers!");

    }
}