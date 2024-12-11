import java.util.ArrayList;
import java.util.List;

public class MailingList implements Publisher {

    List<Subscriber> subscriberList= new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyUsers(String message) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.notifyMe(message);
        }
    }

    public void publishMessage(String message) {
        notifyUsers(message);
        System.out.println(message);
    }

}
