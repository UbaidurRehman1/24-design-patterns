package structural.decorator;

public class SlackNotifier extends NotifierDecorator {

    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending Slack Notification");
    }
}
