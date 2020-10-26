package app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
public class PublicLoggerA {

    private Logger logger;

    @Pointcut(value = "execution(public * *(..)) && within(@PublicLogger *)")
    public void logging(){}

    @Before("logging()")
    public void loggingBefore(JoinPoint joinPoint){
        logger = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
        logger.finest(joinPoint.getSignature().toLongString());
    }

    @AfterThrowing(pointcut = "logging()", throwing = "ex")
    public void loggingThrowing(JoinPoint joinPoint, Exception ex){
        logger = Logger.getLogger(joinPoint.getSignature().getDeclaringTypeName());
        logger.severe(ex.getClass().getName());
    }

}
