package day2.lab08;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("day2.lab08")
public class AppConfig {

    @Bean
    public CustomScopeConfigurer scopeConfigurer(TimeScopeImpl timeScopeImpl) {
        CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
        Map<String, Object> map = new HashMap<>();
        map.put("scope", timeScopeImpl);
        customScopeConfigurer.setScopes(map);
        return customScopeConfigurer;
    }
}