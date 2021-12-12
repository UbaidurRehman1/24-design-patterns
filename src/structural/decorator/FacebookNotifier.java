package structural.decorator;

public class FacebookNotifier extends NotifierDecorator {

    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending Facebook notification");
    }
}
