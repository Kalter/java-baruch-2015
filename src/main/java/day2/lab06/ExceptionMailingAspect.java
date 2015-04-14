package day2.lab06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

@Component
@Aspect
public class ExceptionMailingAspect {

    @Resource(name = "mailToList")
    private List<String> mailToList;

    public List<String> getMailToList() {
        return mailToList;
    }

    @Around("execution(* day2.lab06.Repository+.*(..))")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            joinPoint.proceed();
        } catch (DataBaseException e) {
            e.printStackTrace();
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
        }
    }
}