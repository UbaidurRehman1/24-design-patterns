package structural.decorator;

public abstract class NotifierDecorator extends Notifier {
    
    protected Notifier notifier;
    
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
