package structural.decorator;

public class EmailNotifier extends Notifier {

    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
