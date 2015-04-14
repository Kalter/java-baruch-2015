package day3.remote;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerStarter {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerAppConfig.class);
    }
}
