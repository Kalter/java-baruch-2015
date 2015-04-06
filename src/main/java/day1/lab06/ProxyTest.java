package day1.lab06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Subject subject = (Subject) context.getBean("subject");
        subject.longMethod();
    }
}
