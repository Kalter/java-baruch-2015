package day1.lab04;

import day1.lab01.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;

public class RunWithThisMethodPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        try {
            for (Method method : o.getClass().getMethods()) {
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    for (int j = 0; j < annotation.repeat(); j++) {
                        method.invoke(o);
                    }
                }
            }
            return o;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(o);
        System.out.println(s);
        return o;
    }
}