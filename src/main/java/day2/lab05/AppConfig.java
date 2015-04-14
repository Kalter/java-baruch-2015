package day2.lab05;

import day1.lab01.Robot;
import day2.lab02.StringBuilderFactoryBean;
import day2.lab04.Quoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:file.properties")
public class AppConfig {

    @Value("test.txt")
    private String fileName;

    @Autowired
    private StringBuilder mStringBuilder;

    @Bean
    @DependsOn("fileCreator")
    public FileConsumer fileConsumer() {
        return new FileConsumer(fileName);
    }

    @Bean
    public FileCreator fileCreator() {
        return new FileCreator();
    }

    @Bean
    public StringBuilderFactoryBean mStringBuilderFactoryBean() {
        StringBuilderFactoryBean stringBuilderFactoryBean = new StringBuilderFactoryBean();
        stringBuilderFactoryBean.setStart("Start");
        stringBuilderFactoryBean.setMiddle("Middle");
        stringBuilderFactoryBean.setFinish("Finish");
        return stringBuilderFactoryBean;
    }

    @Bean
    public Quoter customQuoter() {
        return new CustomQuoter(mStringBuilder);
    }

    public Robot robot() {
        return new Robot();
    }
}
