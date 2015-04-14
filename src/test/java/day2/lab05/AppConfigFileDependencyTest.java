package day2.lab05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppConfigFileDependencyTest {


    @Autowired
    FileCreator fileWriter;

    @Autowired
    FileConsumer fileReader;

    @Test
    public void test() {
        org.junit.Assert.assertEquals(fileReader.getFileSize(), fileWriter.getFileSize());
    }
}

