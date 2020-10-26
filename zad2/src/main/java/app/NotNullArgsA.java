package app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class NotNullArgsA {

    @Around("@annotation(NotNullArgs)")
    public void notNullArgs(ProceedingJoinPoint joinPoint) throws IllegalArgumentException {
        Object[] args = joinPoint.getArgs();
        for (int i = 0; i < args.length; i++){
            if (args[i] == null){
                MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
                throw new IllegalArgumentException("Arg is null: method: " + methodSignature.getName() + ", type arg: " + methodSignature.getParameterTypes()[i] + ", name arg: " + methodSignature.getParameterNames()[i]);
            }
        }
    }

}
