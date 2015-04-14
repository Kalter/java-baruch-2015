package day2.lab01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class DeprecatedReplacementBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        try {


        String[] definitionNames = beanFactory.getBeanDefinitionNames();
        for (String name : definitionNames) {
            GenericBeanDefinition genericBeanDefinition= ((GenericBeanDefinition) beanFactory.getBeanDefinition(name));
            DepecatedOnSteroids depecatedOnSteroids = Class.forName(genericBeanDefinition.getBeanClassName()).getAnnotation(DepecatedOnSteroids.class);
            if (depecatedOnSteroids != null) {
                genericBeanDefinition.setBeanClass(depecatedOnSteroids.replacedWith());

            }
        }
        } catch (ClassNotFoundException e) {
            throw  new BeanInitializationException("Failed to load class name", e);
        }
    }
}
