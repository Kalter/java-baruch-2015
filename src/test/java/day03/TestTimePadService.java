package foo.bar.day03;

import day3.tp.AppConfig;
import day3.tp.domain.Guest;
import day3.tp.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestTimePadService {

    @Autowired
    UserService userService;

    @Test
    public void testSaveUser() {
        Guest register = userService.register(new Guest());
        Assert.assertNotNull(register.getId());
        Guest byId = userService.findById(register.getId());
        Assert.assertNotNull(byId);
    }
}
