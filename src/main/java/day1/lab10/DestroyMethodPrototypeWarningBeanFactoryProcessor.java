package day1.lab10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class DestroyMethodPrototypeWarningBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionBeanNames = beanFactory.getBeanDefinitionNames();
        for (String name: beanDefinitionBeanNames){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            if (beanDefinition.isPrototype() && ((GenericBeanDefinition)beanDefinition).getDestroyMethodName() != null) {
                System.out.println("Prototype Bean will not be destroyed");
            }
        }
    }
}