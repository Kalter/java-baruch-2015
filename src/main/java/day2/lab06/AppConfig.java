package day2.lab06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("day2.lab06")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public List<String> mailToList() {
        ArrayList<String> mailToList = new ArrayList<>();
        mailToList.add("qqq");
        mailToList.add("aaa");
        mailToList.add("ccc");
        return mailToList;
    }

}
