package day2.lab08;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomScopeTest extends TestCase {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    TimeScopeImpl mTimeScope;

    @Test
    public void testScope() throws Exception {
        BeanEl bean = applicationContext.getBean(BeanEl.class);

        Assert.assertEquals(bean, applicationContext.getBean(BeanEl.class));

        Thread.sleep(mTimeScope.getLiveTime() + 1000);
        Assert.assertNotEquals(bean, applicationContext.getBean(BeanEl.class));

        bean = applicationContext.getBean(BeanEl.class);
        Assert.assertEquals(bean, applicationContext.getBean(BeanEl.class));
    }
}