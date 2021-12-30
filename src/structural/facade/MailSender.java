package structural.facade;

public interface MailSender {
    void send(String to, String subject, String content);
}
