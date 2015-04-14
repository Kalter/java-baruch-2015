package day2.lab10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class ReplaceImplAspect {

    @Around("@annotation(day2.lab10.CustomDeprecated)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        CustomDeprecated annotation = method.getAnnotation(CustomDeprecated.class);
        if (annotation != null) {
            return annotation.replaceWith().getConstructor(int.class).newInstance(joinPoint.proceed());
        }
        return joinPoint.proceed();
    }
}