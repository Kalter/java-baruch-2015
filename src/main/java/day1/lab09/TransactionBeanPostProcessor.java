package day1.lab09;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TransactionBeanPostProcessor implements BeanPostProcessor{

    private Map<String, Class> initialClassesToPostProcess = new HashMap<String, Class>();

    @Override
    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        if (o.getClass().getAnnotation(Transaction.class) != null){
            initialClassesToPostProcess.put(s, o.getClass());
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        Class clazz = initialClassesToPostProcess.get(s);
        if (clazz != null) {
            return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("Transaction start");
                    Object invoke = method.invoke(o, args);
                    System.out.println("Transaction end");
                    return invoke;
                }
            });
        }
        return o;
    }
}
