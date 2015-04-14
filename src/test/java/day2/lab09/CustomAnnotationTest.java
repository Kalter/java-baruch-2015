package day2.lab09;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomAnnotationTest extends TestCase {

    @Autowired
    @Derby
    DAO derbyDAO;

    @Autowired
    @Oracle
    DAO oracleDAO;


    @Test
    public void testAnnotation() throws Exception {
        Assert.assertNotEquals(derbyDAO.getClass(), oracleDAO.getClass());
    }
}