package day2.lab04;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class QuoterTest {
    @Test
    public void sayQuote() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("day2.lab04");
        Map<String, Quoter> beans = context.getBeansOfType(Quoter.class);
        Assert.assertEquals(2, beans.size());
        Assert.assertEquals("I'll be back!", beans.get("terminatorQuoter").sayQuote());
    }
}
