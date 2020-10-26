package app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PubliusLoggerA {

    @Around(value = "@annotation(PubliusLogger)")
    public void publicLogger(ProceedingJoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName());
    }
}
