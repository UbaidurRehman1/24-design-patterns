package structural.facade;

public class Client {

    public static void main(String[] args) {
        DefaultEmailSender defaultEmailSender = new DefaultEmailSenderImpl();
        defaultEmailSender.sendToAllContacts();
    }
}
