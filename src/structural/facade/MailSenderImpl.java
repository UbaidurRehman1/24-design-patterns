package structural.facade;

public class MailSenderImpl implements MailSender {

    @Override
    public void send(String to, String subject, String content) {
        System.out.printf("[%s]: Sending email {\nsubject=%s,\ncontent=%s\n} to %s\n", getClass().getSimpleName(), subject, content, to);
    }
}
