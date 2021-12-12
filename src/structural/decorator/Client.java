package structural.decorator;

public class Client {

    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier = new FacebookNotifier(notifier);
        notifier = new SlackNotifier(notifier);
        notifier = new SMSNotifier(notifier);
        notifier.send();
    }
}
