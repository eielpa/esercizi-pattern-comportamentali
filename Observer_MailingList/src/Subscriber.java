public class Subscriber {

    private String username;
    private String newMessage;

    Subscriber(String username) {
        this.username = username;
    }

    public void notifyMe(String message) {
        System.out.println("Hey "+username+" you have new messages");
        newMessage = message;
    }

}
