package day2.lab05;

import javax.annotation.PostConstruct;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    private long fileSize;
    String text = "vvv";

    @PostConstruct
    public void writeFile() throws IOException {
        try (FileWriter fileWriter = new FileWriter("test.txt")) {
            fileWriter.write(text);
        }
        fileSize = text.length();
    }

    public long getFileSize() {
        return fileSize;
    }
}
