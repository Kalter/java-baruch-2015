package day2.lab03;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpeakingRobotTest {

    @Test
    public void testRandomQuotes() {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("contextD2.xml");
        SpeakingRobot speakingRobot = context.getBean(SpeakingRobot.class);
        Assert.assertNotEquals(speakingRobot.speak(), speakingRobot.speak());
    }
}
