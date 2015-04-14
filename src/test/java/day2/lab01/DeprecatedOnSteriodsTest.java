package day2.lab01;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeprecatedOnSteriodsTest {
    @Test
    public void testDeprecatedOnSteroids(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("contextD2.xml");
        Object replaceBean = context.getBean("deprecatedOldShit");
        Assert.assertEquals(AwesomeNewStuff.class, replaceBean.getClass());
    }
}
