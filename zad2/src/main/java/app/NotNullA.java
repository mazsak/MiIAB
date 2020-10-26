package app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.reflect.FieldSignature;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class NotNullA {

    @Around("@annotation(NotNull)")
    public void notNull(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        for (int i=0; i < args.length; i ++) {
            if (args[i] == null) {
                FieldSignature methodSignature = (FieldSignature) joinPoint.getSignature();
                throw new NullPointerException("Field is null: " + methodSignature.getName() + ", type field: " + methodSignature.getDeclaringTypeName());
            }
        }
    }
}
