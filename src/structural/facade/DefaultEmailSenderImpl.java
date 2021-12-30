package structural.facade;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class DefaultEmailSenderImpl implements DefaultEmailSender {

    private static final String ALL_MAIL_CONTACTS_PATH = "allMailContacts.txt";
    private static final String DEFAULT_SUBJECT = "Good Morning";
    private static final String DEFAULT_MESSAGE = "Hello All, Good Morning";
    private final FileReader fileReader = new FileReaderImpl();
    private final MailSender mailSender = new MailSenderImpl();
    
    @Override
    public void sendToAllContacts() {
        Path allMailContactsPath = Paths.get(
            Objects.requireNonNull(getClass().getResource(ALL_MAIL_CONTACTS_PATH)).getPath());
        List<String> allMailContacts = fileReader.readAllLines(allMailContactsPath);
        allMailContacts.forEach(contact -> mailSender.send(contact, DEFAULT_SUBJECT, DEFAULT_MESSAGE));
    }
}
