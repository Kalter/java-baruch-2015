package day2.lab05;

import javax.annotation.PostConstruct;
import java.io.File;

public class FileConsumer {

    private String fileName;
    private long fileSize;

    public FileConsumer(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void consumeFile() {
        System.out.println(fileSize = new File(fileName).length());
    }

    public long getFileSize() {
        return fileSize;
    }
}
