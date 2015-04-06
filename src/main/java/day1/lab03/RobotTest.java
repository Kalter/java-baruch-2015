package day1.lab03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Robot talkingRobot = context.getBean(Robot.class);
        talkingRobot.talk();
    }
}
