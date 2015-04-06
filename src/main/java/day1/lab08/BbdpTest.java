package day1.lab08;

import day1.lab06.Subject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BbdpTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        context.getBean(Subject.class).longMethod();
    }
}
