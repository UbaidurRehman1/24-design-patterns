package structural.facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> readAllLines(Path filePath) {
        System.out.printf("[%s]: Reading all contacts from %s\n", getClass().getSimpleName(), filePath);
        try {
            List<String> allContacts = Files.readAllLines(filePath);
            System.out.printf("[%s]: All contacts: %s\n", getClass().getSimpleName(), allContacts);
            return allContacts;
        } catch (IOException e) {
            e.printStackTrace();
            System.err.printf("[%s]: Exception happens while reading %s. Returning empty list\n", getClass().getSimpleName(), filePath);
            return Collections.emptyList();
        }
    }
}
