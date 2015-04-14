package day2.lab02;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringBuilderFactoryBeanTest {
    @Test
    public void  testFactoryBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextD2.xml");
        StringBuilder stringBuilder = context.getBean(StringBuilder.class);
        Assert.assertEquals("Start Middle Finish", stringBuilder.toString());
    }
}
