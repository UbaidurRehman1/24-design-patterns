package structural.facade;

import java.nio.file.Path;
import java.util.List;

public interface FileReader {
    List<String> readAllLines(Path filePath);
}
